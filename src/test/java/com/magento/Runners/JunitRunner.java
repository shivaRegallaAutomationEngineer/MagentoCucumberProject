package com.magento.Runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features=".\\src\\test\\resources\\Features\\Login.feature"
,glue="com.magento.steps"
,monochrome=true,
tags= "@testCase01",
//dryRun=true,
plugin= {"pretty","html:target/cucumber.html","json:target/cucumber.json"}
		)
public class JunitRunner {

}
