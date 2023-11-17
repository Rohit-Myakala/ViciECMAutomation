package com.viciecm.desktop.web.pages;

import org.openqa.selenium.By;

import com.frameworksupport.setup.AutomationBaseActionDriver;
import com.frameworksupport.setup.BaseActionDriver;
import com.frameworksupport.util.general.CommonUtil;
import com.frameworksupport.util.general.ExcelReader;
import com.viciecm.desktop.web.config.Resources;

public class ViciEcmLoginPage {
	
	BaseActionDriver actionDriver;
	CommonUtil commonUtil;
	String PageTitle = "Login";
	
	private By usernameTextbox = By.id("txtUserName");
	private By passwordTextbox = By.id("txtPassword");
	private By loginButton = By.id("btnLogin");
	


public ViciEcmLoginPage() {
	actionDriver = AutomationBaseActionDriver.getBaseActionDriver();
	commonUtil = AutomationBaseActionDriver.getCommonUtil();
}


public By getUserNameTextBox() {		
	return usernameTextbox;
} 

public void loginIntoApplication(String username, String password) {

    actionDriver.verifyPageTitle(PageTitle);
	actionDriver.click(usernameTextbox);
	commonUtil.waitInSeconds(2);
	actionDriver.enterTestData(usernameTextbox, username);
	actionDriver.type(passwordTextbox, password);
	actionDriver.click(loginButton);
	commonUtil.waitInSeconds(3);
}




}