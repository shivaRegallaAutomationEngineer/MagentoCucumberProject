package com.magento.baseClass;

import com.magento.pages.LoginPageElements;

public class PageInitializer {
	public static LoginPageElements login;
	
	public static void intailizepage() {
		login= new LoginPageElements();
	}
}
