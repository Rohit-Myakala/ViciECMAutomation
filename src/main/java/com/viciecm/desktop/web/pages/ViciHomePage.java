package com.viciecm.desktop.web.pages;

import org.openqa.selenium.By;
import org.testng.Assert;
import com.frameworksupport.setup.AutomationBaseActionDriver;
import com.frameworksupport.setup.BaseActionDriver;
import com.frameworksupport.util.general.CommonUtil;
import com.frameworksupport.util.general.ExcelReader;
import com.viciecm.desktop.web.config.Resources;


public class ViciHomePage {
	BaseActionDriver actionDriver;
	CommonUtil commonUtil;

	public ViciHomePage() {
		actionDriver = AutomationBaseActionDriver.getBaseActionDriver();
		commonUtil = AutomationBaseActionDriver.getCommonUtil();
	}
	
    
	private By admin_button_name = By.xpath("//a[@id='MnAdmin']");
	
	
	public void checkAdminButton() {
		
		actionDriver.waitForElementToBeVisible(admin_button_name);
		System.out.println(actionDriver.getText(admin_button_name));
		
		
	}


	

}
