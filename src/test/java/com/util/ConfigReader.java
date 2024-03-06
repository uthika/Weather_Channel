package com.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class ConfigReader {
	public Properties prop;
	
		public ConfigReader() {
		this.prop = new Properties();
		
		try {
			
			FileInputStream fis = new FileInputStream("src/test/resources/config/config.properties");
			this.prop.load(fis);
			System.out.println("Property: " + this.prop.toString());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//get url from config.propeties
	public String getApplicationURL() {
		String url = this.prop.getProperty("url");
		return url;
	}
	//get browser from config.propeties
	public String getbrowser() {
		//ConfigReader.inital_prop();
		String browser = this.prop.getProperty("browser");
		return browser;
	}

}
