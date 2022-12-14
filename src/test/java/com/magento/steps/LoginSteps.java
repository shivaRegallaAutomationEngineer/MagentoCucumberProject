package com.magento.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.magento.baseClass.PageInitializer;
import com.magento.pages.LoginPageElements;
import com.magento.utils.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps extends PageInitializer{
	static WebDriver driver;

	@Given("User navigates to the application")
	public void user_navigates_to_the_application() {
    

	}

	@When("User enters the valid username and valid password")
	public void user_enters_the_valid_username_and_valid_password() {
		//LoginPageElements lpe= new LoginPageElements();
		//lpe.setUsername("shiva1@gmail.com");
		login.setUsername("shiva1@gmail.com");
	}

	@When("User clicks on the login button")
	public void user_clicks_on_the_login_button() {
//		driver.findElement(By.id("send2")).click();
	//	LoginPageElements lpe= new LoginPageElements();
		//lpe.setLoginClick();
		login.setLoginClick();
	}

	@Then("User Succesfully login into the application")
	public void user_succesfully_login_into_the_application() {
		System.out.println("login successfully");

	}

	@When("User enters the valid {string} and valid {string}")
	public void user_enters_the_valid_and_valid(String username, String password) {
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);

	}

	@Then("User should be able to see the {string}")
	public void user_should_be_able_to_see_the(String errorMessage) throws InterruptedException {

		String actualErrorMessage = driver.findElement(By.xpath("//*[@class='messages']//li//span")).getText();
		System.out.println(actualErrorMessage);
		Assert.assertEquals(actualErrorMessage, errorMessage,
				"error message not macthing are not matching");
		Thread.sleep(5000);
		driver.close();

	}

}
