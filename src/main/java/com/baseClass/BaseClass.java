package com.baseClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.HasFullPageScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public abstract class BaseClass {
	public static WebDriver driver;
	
	protected static void launchBrowser(String launchBrowser) {
		try {
			if(launchBrowser.equalsIgnoreCase("chrome")) {
				driver=new ChromeDriver();
				
			}else if(launchBrowser.equalsIgnoreCase("edge")) {
				driver=new EdgeDriver();
			}else if(launchBrowser.equalsIgnoreCase("fireFox")) {
			driver=new FirefoxDriver();

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Assert.fail("Error Occur on Browser Launch");
		}
	}
	protected static void  launchurl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Assert.fail("Error occur during launch url");
		}
	}
	protected static void passInput(WebElement element,String value) {
		try {
			element.sendKeys(value);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Assert.fail("Error occur during in passinput");
		}
	}
	protected static void click(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Assert.fail("Error occur  during click");
		}
	}
	protected static void quit() {
		try {
			driver.quit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
		Assert.fail("Error occur  during quit");
		}
	}
	protected static void close() {
		try {
			driver.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Assert.fail("Error Occur during close");
		}
	}
	protected static void navigateTo(String url) {
		try {
			driver.navigate().to(url);
		} catch (Exception e) {
			// TODO Auto-generated catch block
		Assert.fail("error occur");
		}}
		protected static void navigateMethod(String type) {
			if(type.equalsIgnoreCase("back")) {
				driver.navigate().back();
			}
			else if(type.equalsIgnoreCase("refresh")) {
				driver.navigate().refresh();
			}
			else if(type.equalsIgnoreCase("forward")) {
				driver.navigate().forward();
			}}
		protected static void implicityWait(int sec) {
			try {
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				Assert.fail("Error occur");
			}}
			protected static void  getText(WebElement element) {
				try {
					String text=element.getText();
					System.out.println(text);
				} catch (Exception e) {
					// TODO Auto-generated catch block
			Assert.fail("error occur");
				}}
		protected static void getcurrentUrl() {
			try {
				String currenturl=driver.getCurrentUrl();
				System.out.println(currenturl);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				Assert.fail("Error occur");
			}
		}
		protected static void getTitle() {
		try {
			String title=	driver.getTitle();
			System.out.println(title);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Assert.fail("error occur");
		}
		}
		protected static void dropDown(WebElement element,String type,String value) {
			try {
				Select s=new Select(element);
				if(type.equalsIgnoreCase("index")) {
				s.selectByIndex(Integer.parseInt(value));
}else if(type.equalsIgnoreCase("value")) {
				s.selectByValue(value);
}else if(type.equalsIgnoreCase("text")){
				s.selectByVisibleText(value);
}
			} catch (NumberFormatException e) {
				
				Assert.fail("error occur");
			}
				
		}	
		protected static void screenShot() throws IOException {
			try {
				TakesScreenshot ts=(TakesScreenshot)driver;
File src=ts.getScreenshotAs(OutputType.FILE);
File des=new File("C:\\Users\\DELL\\eclipse-workspace\\NaukriNewMaven\\src\\test\\resources\\screenshot\\homepage.png");
FileHandler.copy(src, des);
			} catch (WebDriverException e) {
				Assert.fail("error occur");
			} catch (IOException e) {
				Assert.fail("error occur");
			}
		}
		
		
		
		

}
