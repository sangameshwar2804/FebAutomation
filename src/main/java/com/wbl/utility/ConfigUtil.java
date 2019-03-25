package com.wbl.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConfigUtil {

	public static final Properties prop = new Properties();
	
	static Logger log = LogManager.getLogger(ConfigUtil.class);
	
	public ConfigUtil(String fileName){	
		try {
			prop.load(new FileInputStream(fileName));			
		} catch (IOException e) {
			log.error(e.getMessage());
		}		
	}
	
	public String getProperty(String key){
		return prop.getProperty(key);
	}
}
/*
Singleton

public class ConfigUtil {

   private static ConfigUtil instance=null;

	private static final Properties prop = new Properties();
	
	static Logger log = LogManager.getLogger(ConfigUtil.class);
	
	private ConfigUtil(){
	}
	
	
	
	public void load(String fileName){	
		try {
			prop.load(new FileInputStream(fileName));			
		} catch (IOException e) {
			log.error(e.getMessage());
		}		
	}
	
	public String getProperty(String key){
		return prop.getProperty(key);
	}
	
	
	public static ConfigUtil getInstance() {
	    if(instance == null)
	        instance = new ConfigUtil();
	        
	    return instance;
	}
}

======how to use singleton=================
ConfigUtil config = ConfigUtil.getInstance();
config.load("path of config.properties");

String url = config.getProperty("url");


*/