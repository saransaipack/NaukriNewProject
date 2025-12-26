package com.runner;

import org.junit.platform.suite.api.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.baseClass.BaseClass;
import com.pageObjectManager.PageObjectManager;

public class Runner extends BaseClass {
	public static void main(String[]args) throws Exception {
	//launchBrowser("chrome");
//	launchurl("https://www.naukri.com/nlogin/login");
//	//driver.findElement(By.id("login_Layer")).click();
//	WebElement email=driver.findElement(By.id("usernameField"));
//	passInput(email, "saransaipacksol26@gmail.com");
//	WebElement pass=driver.findElement(By.id("passwordField"));
//	passInput(pass,"Saran@123");
//	WebElement loginBtn=driver.findElement(By.xpath("//button[text()='Login']"));
//	click(loginBtn);
//	
//quit();
//navigateTo("https://www.amazon.in/");
//navigateMethod("refresh");
//WebElement dropDown=driver.findElement(By.id("twotabsearchtextbox"));
//Thread.sleep(3000);
//dropDown(dropDown, "index", "10");
//quit();
launchBrowser(PageObjectManager.getpageObjectManager().getfileReaderManager().getDataProperty("browser"));
launchurl(PageObjectManager.getpageObjectManager().getfileReaderManager().getDataProperty("url"));
PageObjectManager.getpageObjectManager().getLoginPage().validLogin();
screenShot();
quit();
		
		
		
}

	
		
	}
