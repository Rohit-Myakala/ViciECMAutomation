package com.viciecm.desktop.web.basetest;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;

import com.frameworksupport.setup.AutomationBaseActionDriver;
import com.frameworksupport.util.general.CommonUtil;
import com.frameworksupport.util.json.JsonUtil;
import com.viciecm.desktop.web.config.ConfigKeys;
import com.viciecm.desktop.web.config.Resources;
import com.viciecm.desktop.web.pages.ViciEcmLoginPage;

public class ViciDesktopBaseTest extends AutomationBaseActionDriver {
	
	protected String admin_user;
	protected String normal_user;
	protected String admin_pass;
	protected String normal_pass;
	private static boolean isSessionCleared = false;
	private static boolean isUserLoggedIn = false;
	protected String baseUrl;
	private ThreadLocal<JsonUtil> jsonUtilThread = new ThreadLocal<>();
	String loginJsonFile="\\data\\jsondata\\login.json";
	protected static ViciEcmLoginPage viciecmloginpage;
	
	public void initializeCredentials() throws IOException {
		
		jsonUtilThread.set(new JsonUtil());
		admin_user =jsonUtilThread.get().getJsonKeyValueFromJsonObject(loginJsonFile,Resources.USER, Resources.ADMINUSER);
		normal_user =jsonUtilThread.get().getJsonKeyValueFromJsonObject(loginJsonFile,Resources.USER, Resources.NORMALUSER);
		admin_pass =jsonUtilThread.get().getJsonKeyValueFromJsonObject(loginJsonFile,Resources.USER, Resources.ADMINPASSWORD);
		normal_pass =jsonUtilThread.get().getJsonKeyValueFromJsonObject(loginJsonFile,Resources.USER, Resources.NORMALPASSWORD);
		
	}
	
	@BeforeMethod(alwaysRun = true)
	public void launchUrl() throws IOException {
		baseUrl = CommonUtil.getConfigProperty(ConfigKeys.URL_VICI);
		viciecmloginpage = new ViciEcmLoginPage();
		if (Boolean.parseBoolean(CommonUtil.getConfigProperty(ConfigKeys.CLOSE_BROWSER_AFTER_TEST))) {
			getBaseActionDriver().get(baseUrl);
			getBaseActionDriver().deletecookies();
			if(!browserName.contains("mobile")) {
				getBaseActionDriver().manage().window().maximize();
			}
			
		} else {
			getBaseActionDriver().get(baseUrl);
			if(!browserName.contains("mobile")) {
				getBaseActionDriver().manage().window().maximize();
			}
			if (!isSessionCleared) {
				for (int i = 0; i < 9; i++) {
					getBaseActionDriver().deletecookies();
	
					if (getBaseActionDriver().isElementVisible(viciecmloginpage.getUserNameTextBox(), 1)) {
						isSessionCleared = true;
						break;
					}
					commonUtil.log("Cookies not cleared yet...");
					commonUtil.waitInSeconds(1);
					getBaseActionDriver().get(baseUrl);
				}
			}
		}
		initializeCredentials();
	}


	public void login(String username, String password) {
		ViciEcmLoginPage vcloginpage=new ViciEcmLoginPage();
		if (getBaseActionDriver().isElementVisible(vcloginpage.getUserNameTextBox(), 1)) {
	
			vcloginpage.loginIntoApplication(username, password);
		}
	}

	

	protected void clearCookies() {
		ViciEcmLoginPage vcloginpage=new ViciEcmLoginPage();
		for (int i = 0; i < 9; i++) {
			getBaseActionDriver().deletecookies();
			if (getBaseActionDriver().isElementVisible(vcloginpage.getUserNameTextBox(), 1)) {
				break;
			}
			commonUtil.log("Cookies not cleared yet...");
			commonUtil.waitInSeconds(1);
			getBaseActionDriver().get(baseUrl);
		}
	}
	
	
	
	@Override
	protected void cleanPageObjects() {
		// TODO Auto-generated method stub
		
	}

}
