package com.Project498;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	Home home = new Home();
	
	public void signIn(WebDriver signInDriver){
		WebElement signIn = signInDriver.findElement(By.xpath("html/body/div[1]/div/a[2]"));
		signIn.click();
		
		WebElement email = signInDriver.findElement(By.xpath(".//*[@id='session_email']"));
		email.sendKeys("shathee@yahoo.com");
		
		WebElement pass = signInDriver.findElement(By.xpath(".//*[@id='session_password']"));
		pass.sendKeys("123123123");
		
		WebElement signInBtn = signInDriver.findElement(By.xpath("html/body/div[1]/div/div/form/input[3]"));
		signInBtn.click();
		
		
		home.heading(signInDriver);
		
	}
	
}
