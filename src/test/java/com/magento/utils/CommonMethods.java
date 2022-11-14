package com.magento.utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.magento.baseClass.BaseClass;


public class CommonMethods  {
	
	public static void sendText(WebElement ele,String textValue) {
		ele.clear();
		ele.sendKeys(textValue);
	}
	
	public static void click(WebElement ele) {
		waitForClickbility(ele);
		ele.click();
	}
	
	public static WebDriverWait getObject() {
		WebDriverWait wait= new WebDriverWait(BaseClass.driver,60);
		return wait;
	}
	public static void waitForClickbility(WebElement ele) {
		getObject().until(ExpectedConditions.elementToBeClickable(ele));
	}
	
	public static void waitForVisibilty(WebElement ele) {
		getObject().until(ExpectedConditions.visibilityOf(ele));
	}
	
	public static void selectDropdown(WebElement ele,String text) {
		Select se= new Select(ele);
		se.selectByVisibleText(text);
		
	}
	public static void selectDropdown(WebElement ele,int index) {
		Select se= new Select(ele);
		se.selectByIndex(index);
		
	}
	 public static byte[] takeScreenshot(String fileName){
	        TakesScreenshot ts = (TakesScreenshot) BaseClass.driver;
	        byte[] picBytes = ts.getScreenshotAs(OutputType.BYTES);
	        File sourceFile = ts.getScreenshotAs(OutputType.FILE);

	        try {
	            FileUtils.copyFile(sourceFile, new File(Constants.SCREENSHOT_FILEPATH + fileName
	            + " " + getTimeStamp("yyyy-MM-dd-HH-mm-ss")+".png"));
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	return picBytes;
	    }

	    public static String getTimeStamp(String pattern){
	        Date date = new Date();
	        //to format the date according to our choice we want to implement in this function
	        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
	        return sdf.format(date);
	    }

	

}
