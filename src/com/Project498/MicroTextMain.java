package com.Project498;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MicroTextMain {
	
	static WebDriver driver;
	static Login signin = new Login();
	
	public static void main(String[] args) {
		driver = new FirefoxDriver();
		driver.get("http://localhost:3000");
		signin.signIn(driver);

	}

}
