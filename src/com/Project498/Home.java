package com.Project498;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home {
	public void heading(WebDriver headingDriver){
		
		WebElement isHeadingDisplay = headingDriver.findElement(By
				.xpath("html/body/div[1]/div/div/h3"));
		
		if (isHeadingDisplay.isDisplayed() == true) {
			System.out.println("Login Successful");
		} else {
			System.out.println("Login Failed");
		}
		
		String data = isHeadingDisplay.getText();
		
		if (data == "Microtext Feed"){
			System.out.println("Heading: " + data + "PASS");
		}else{
			System.out.println("Heading: FAIL" );
		}
		
		
	}
	
	public void username(WebDriver userDriver){
		WebElement isUsernameDisplay = userDriver.findElement(By
				.xpath("html/body/div[1]/div/aside/section[1]/h1"));
		if (isUsernameDisplay.isDisplayed() == true) {
			System.out.println("Username displayed Successfully: PASS");
		} else {
			System.out.println("Username displayed: FAIL");
		}
	
	}
	
	public void viewMyProfile(WebDriver myProfileDriver){
		
		try{
			WebElement isUsernameDisplay = myProfileDriver.findElement(By
					.xpath("html/body/div[1]/div/aside/section[1]/span[1]/a"));
			String ViewMyProfileData = isUsernameDisplay.getText();
			if (ViewMyProfileData == "View my Profile"){
				System.out.println("Is view my profile text exist? : PASS");
			}
		}catch(Exception e){
			System.out.println("Is view my profile text exist? : FAIL");
		}
	}
	
	public void micropost(WebDriver micropostDriver){
		

				try{
					WebElement isMicropostDisplay = micropostDriver.findElement(By
							.xpath("html/body/div[1]/div/aside/section[1]/span[2]"));
					String numMicropost = isMicropostDisplay.getText();
					if (numMicropost == "100 Micropost"){
						System.out.println("Is total number of micropost showing? : PASS");
					}
				}catch(Exception e){
					System.out.println("Is total number of micropost showing? : FAIL");
				}
	}
	public void following(WebDriver followingDriver){
		try{
			WebElement isFollowingDisplay = followingDriver.findElement(By
					.xpath("html/body/div[1]/div/aside/section[2]/div/a[1]"));
			String following = isFollowingDisplay.getText();
			System.out.println("Tolat number of following: "+ following+ "-- PASS");
		}catch(Exception e){
			System.out.println("Tolat number of following : FAIL");
		}
	}
	public void followers(WebDriver followersDriver){
		
				try{
					WebElement isFollowerDisplay = followersDriver.findElement(By
							.xpath("html/body/div[1]/div/aside/section[2]/div/a[2]"));
					String follower = isFollowerDisplay.getText();
					System.out.println("Tolat number of followers: "+ follower + "-- PASS");
				}catch(Exception e){
					System.out.println("Tolat number of follower : NOT FOUND -- FAIL");
				}
	}
	public void newPost(WebDriver newPostDriver){
		
		WebElement newPostElement = newPostDriver.findElement(By
				.xpath(".//*[@id='micropost_content']"));
		newPostElement.click();
		newPostElement.sendKeys("This is post number one.");
		WebElement postBtn = newPostDriver.findElement(By.xpath(".//*[@id='new_micropost']/input"));
		postBtn.click();
	}
	public void showComment(WebDriver showCommentDriver){
		
		WebElement showCommentElement = showCommentDriver.findElement(By
				.xpath(".//*[@id='601']/a[2]"));
		showCommentElement.click();
		
		try{
			WebElement isCommented = showCommentDriver.findElement(By
							.xpath("html/body/div[1]/div/div/li[1]/ol/div/p[1]"));
			String commentString = isCommented.getText();
			String actualComment = "Rabib Ahmed said...";
			if (commentString == actualComment) {
					System.out.println("Successful Comment: PASS");
					}
				
		}catch(Exception e){
			System.out.println("Successful Comment: FAIL");
		}
		
		
	}
	
	

	

}
