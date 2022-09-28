package com.orangehrm.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;
	
	public ReadConfig() {
		
		File src=new File("C:\\Users\\Official\\Desktop\\hydridFrameWork\\Configuration\\congig.properties");
		
		try {
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
			
		}catch(Exception e) {
			System.out.println("file not found " + e.getMessage());
		}
	}
	
	public String getApplicationUrl() {
		String mainURL=pro.getProperty("URL");
		return mainURL;
	}
	
	public String getUserName() {
		String userName=pro.getProperty("username");
		return userName;
	}
	
	public String getPassword() {
		String passWord=pro.getProperty("password");
		return passWord;
	}
	
	public String getChromePath() {
		String chromePath=pro.getProperty("chromepath");
		return chromePath;
	}
	
	public String getFirefoxPath() {
		String firefoxPath=pro.getProperty("firefoxpath");
		return firefoxPath;
	}
	
	public String getEdgePath() {
		String edgePath=pro.getProperty("edgepath");
		return edgePath;
	}
}
