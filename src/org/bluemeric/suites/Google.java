package org.bluemeric.suites;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.bluemeric.utility.Utility;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class Google {
	Suite suite=new Suite();
	WebDriver driver = suite.newDriver();
	Properties prop = new Properties();
    String workspace = System.getProperty("user.dir");
	public void login(String cloud) throws IOException, InterruptedException {
		FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		prop.load(fs);
	try{
		//Google cloud login code
				//------------------------------start----------------------------
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		 WebDriverWait wait=new WebDriverWait(driver,200);
			//driver.get("http://stage.gopaddle.io/#/");
			
			//Handling the popup for gopaddle
			
			//------------------------------start----------------------------
			Thread.sleep(40000);
			Alert alert = driver.switchTo().alert();
			System.out.println(alert.getText());
			Thread.sleep(10000);
			alert.sendKeys("redbulll***");
			Thread.sleep(10000);
			alert.accept();
			Thread.sleep(10000);
			alert.accept();
			//------------------------------end----------------------------
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("gopddlesignup")))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("connectwithgoogle")))).click();
			Thread.sleep(10000);//mandatory time because it taking time to idetifying the child window
			Set<String> allWindowHandles= driver.getWindowHandles();
			Iterator iterator=allWindowHandles.iterator();
			String parent=(String) iterator.next();
			String child=(String) iterator.next();
			
			driver.switchTo().window(child);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(prop.getProperty("email")))).sendKeys(prop.getProperty("gmailusername"));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(prop.getProperty("next")))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(prop.getProperty("password"))));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(prop.getProperty("password")))).sendKeys(prop.getProperty("gmailpassword"));
			boolean check=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("staysignin")))).isSelected();
			
			if(check){
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("staysignin")))).click();
			}
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(prop.getProperty("signin")))).click();
			Thread.sleep(20000); //for identifying the allow button
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(prop.getProperty("allow")))).click();
			//------------------------------end----------------------------
			driver.switchTo().window(parent);
			Thread.sleep(10000);
	} catch (Exception e) {
		e.printStackTrace();
		Assert.fail(e.getMessage());
		Reporter.log("URL : " + prop.getProperty("url"));
		Reporter.log("Response Status = " + "Login Failed due to invalid credentials");
		driver.close();
	}
	}
}
