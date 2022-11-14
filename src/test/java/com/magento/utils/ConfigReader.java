package com.magento.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
public static Properties prop;
	
	public static void readProperties(String filepath) {
		
		FileInputStream fis;
		try {
			fis = new FileInputStream(filepath);
			 prop= new Properties();
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static String getProperty(String key) {
		return prop.getProperty(key);
	}
}
