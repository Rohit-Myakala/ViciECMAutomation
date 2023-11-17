package com.viciecm.desktop.web.config;

public enum FeatureName {

	WEBACTIONSTEST("web actions test"),
	SWAGLABSlOGIN("swaglabslogin"),
	API("api");
	

	private String name;
	
	public String toString() {
		return name;
	}

	FeatureName(String name) {
		this.name = name;

	}
}
