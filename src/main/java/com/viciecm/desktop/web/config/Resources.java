package com.viciecm.desktop.web.config;

public class Resources {

	public static final String TEST_RESOURCES_DIR = "src/test/resources/";

	// Excel  file Paths
	public static final String TESTDATA_EXCEL_FILE_PATH = TEST_RESOURCES_DIR+ "/data/" + "/exceldata/"+"testdata.xlsx";
	
	//Excel sheet names
	public static final String SWAGLOGIN_TESTS_SHEET="swagloginTests";
	public static final String INVENTORYPAGE_TESTS_SHEET="InventoryPageTests";
	public static final String STATIC_EXPECTEDTEXTS_SHEET="staticexpectedtexts";
	public static final String PAGELOCATORS_SHEET="pagelocators";
	
	//Excel sheet  coloumn names
	public static final String LOCATORVALUE="LocatorValue";
	public static final String EXPECTEDTEXT="ExpectedText";
	public static final String EXPECTEDLOGOTITLE="ExpectedLogoTitle";
	public static final String ADDTOCARTID="AddToCartID";
	
	//Jsonfile and congig file keys names
	public static final String USER="user";
	public static final String ADMINUSER="adminuser";
	public static final String ADMINPASSWORD="adminpassword";
	public static final String NORMALUSER="normaluser";
	public static final String NORMALPASSWORD="normalpassword";
	
	
	
	
	//element names in excel sheet
	public static final String ERRORBUTTON="ErrorButton";
	
}
