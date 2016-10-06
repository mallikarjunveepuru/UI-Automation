package org.bluemeric.suites;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Directlogin {
	Suite suite=new Suite();
	WebDriver driver = suite.newDriver();
	Properties prop = new Properties();
    String workspace = System.getProperty("user.dir");
    
    public void login(String cloud) throws InterruptedException, IOException{
    	FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		prop.load(fs);
	driver.get(prop.getProperty("url"));
	driver.manage().window().maximize();
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
	WebDriverWait wait=new WebDriverWait(driver,1000);
	Thread.sleep(10000);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("gopddlesignup")))).click();
	Thread.sleep(20000);
	driver.findElement(By.xpath(prop.getProperty("directlogin"))).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("directemail")))).sendKeys("veepuruslakshmi@trov.co.in");
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("directpassword")))).sendKeys("trov-it123");
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("directsignin")))).click();
	Thread.sleep(10000);
    }
}
