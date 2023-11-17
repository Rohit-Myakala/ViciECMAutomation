package com.viciecm.desktop.web.pages;

import org.openqa.selenium.By;

import com.frameworksupport.setup.AutomationBaseActionDriver;
import com.frameworksupport.setup.BaseActionDriver;
import com.frameworksupport.util.general.CommonUtil;

public class BrowsePage {
	
	BaseActionDriver actionDriver;
	CommonUtil commonUtil;

	public BrowsePage() {
		actionDriver = AutomationBaseActionDriver.getBaseActionDriver();
		commonUtil = AutomationBaseActionDriver.getCommonUtil();
	}
	
    
	private By browse_button_name = By.xpath("//a[@class='browse']");
	private By new_cabinet = By.xpath("//a[normalize-space()='New Cabinet']");
	private By new_folder = By.xpath("//span[@title='auto_test2']");
	private By import_docs = By.xpath("//a[normalize-space()='Import Document(s)']");
	private By cabinet_enter_text = By.xpath("//input[@id='_ctl0_phChild_txtCT']");
	private By create_cabinet = By.xpath("//input[@id='_ctl0_phChild_btnCTRep']");
	private By close_cabinet = By.xpath("//input[@id='_ctl0_phChild_btnRepClose']");
	private By cabinet_frame = By.xpath("//iframe[@title='New Cabinet']");
	
	
	
	
	
	public void checkBrowseSection() {
		
		actionDriver.click(browse_button_name);
		actionDriver.click(new_cabinet);
		actionDriver.sendkeys(cabinet_enter_text, "new_auto");
		actionDriver.click(create_cabinet);
		actionDriver.click(close_cabinet);
		
	
		
		
	}

}
