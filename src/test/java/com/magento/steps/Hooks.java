package com.magento.steps;

import com.magento.baseClass.BaseClass;
import com.magento.utils.CommonMethods;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	
	@Before
	public void beforeScenario() {
		BaseClass.intailizeBrowser("chrome");
	}
	@After
	public void end(Scenario scenario){
        byte[] pic;
        //scenario class from cucumber holds the complete information of our execution
        if(scenario.isFailed()){
            pic = CommonMethods.takeScreenshot("failed/" + scenario.getName());
        }else{
            pic = CommonMethods.takeScreenshot("passed/" + scenario.getName());
        }

        //it will attach the pic in report
        scenario.attach(pic, "image/png", scenario.getName());
        BaseClass.tearDown();
    }

}
