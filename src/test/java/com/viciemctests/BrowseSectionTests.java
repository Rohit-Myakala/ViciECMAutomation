package com.viciemctests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.frameworksupport.setup.TestInfo;
import com.viciecm.desktop.web.basetest.ViciDesktopBaseTest;
import com.viciecm.desktop.web.config.Author;
import com.viciecm.desktop.web.pages.BrowsePage;


public class BrowseSectionTests extends ViciDesktopBaseTest {
	
	BrowsePage browse_tests;
	
	@BeforeClass(alwaysRun = true)
	public void initialSetUp() throws Exception {
		initializeTest(getClassName());
	
	}
	
	@TestInfo(author=Author.ROHIT)
	  @Test()
	  public void checkAdminFeatures() throws Exception {
		 
		browse_tests = new BrowsePage();
		 login(admin_user, admin_pass);
		 browse_tests.checkBrowseSection();
		 
	   
	  }

}
