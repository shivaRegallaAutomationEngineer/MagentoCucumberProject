package com.magento.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.magento.baseClass.BaseClass;
import com.magento.utils.CommonMethods;

public class LoginPageElements extends BaseClass {

	@FindBy(id = "email")
	private WebElement usernameTextBox;

	@FindBy(id = "pass")
	private  WebElement passwrodTextBox;

	@FindBy(id = "send2")
	private WebElement loginButton;
	
	public LoginPageElements() {
		PageFactory.initElements(driver,this);
	}
	
    public WebElement getUsername() {
    	return usernameTextBox;
    }
    
    public void setUsername(String username) {
    	CommonMethods.sendText(usernameTextBox, username);
    }
    
    public WebElement getLoginClick() {
    	return usernameTextBox;
    }
    
    public void setLoginClick() {
    	CommonMethods.click(loginButton);
    }
	
}
