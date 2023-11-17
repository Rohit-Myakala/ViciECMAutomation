package com.viciemctests;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.frameworksupport.setup.TestInfo;
import com.viciecm.desktop.web.basetest.ViciDesktopBaseTest;
import com.viciecm.desktop.web.config.Author;
import com.viciecm.desktop.web.pages.ViciHomePage;

public class BasicViciTests extends ViciDesktopBaseTest{
	
	ViciHomePage vici_home;
	
	
	@BeforeClass(alwaysRun = true)
	public void initialSetUp() throws Exception {
		initializeTest(getClassName());
	
	}

	 
	  @TestInfo(author=Author.ROHIT)                         
	  @Test()
	  public void viciLoginTest_adminuser() throws Exception {
		  
	   login(admin_user, admin_pass);
	  }
	  
	 
	 @TestInfo(author=Author.ROHIT)
	  @Test()
	  public void loginTest_normaluser() throws Exception {
		 
	   login(normal_user, normal_pass);
	   
	  }
	 
	 
	 @TestInfo(author=Author.ROHIT)
	  @Test()
	  public void checkAdminFeatures() throws Exception {
		 
		 vici_home = new ViciHomePage();
		 login(admin_user, admin_pass);
		 vici_home.checkAdminButton();
		 
	   
	  }
	 
	 
	 
	 
	 

}
