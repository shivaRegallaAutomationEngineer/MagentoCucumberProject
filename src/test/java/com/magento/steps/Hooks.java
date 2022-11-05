package com.magento.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before
	public void beforeScenario() {
		System.out.println("before scenario");
	}
	
	@After
	public void afterScenario() {
		System.out.println("after scenario");
	}

}
