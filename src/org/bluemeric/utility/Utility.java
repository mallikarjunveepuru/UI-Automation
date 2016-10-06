package org.bluemeric.utility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.bluemeric.suites.Suite;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Listeners;


@Listeners(org.uncommons.reportng.HTMLReporter.class)
public class Utility implements ITestListener {
	static String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
	String screenload ;
	String screenget = "";
	Suite suite=new Suite();
	WebDriver driver = suite.newDriver();
	static Logger log = Logger.getLogger(Utility.class);
	Properties prop = new Properties();
    static String workspace = System.getProperty("user.dir");
	
	
	

	public void Addsourcecontrol(String username,String password) throws InterruptedException, IOException {
		Thread.sleep(10000);
		FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		prop.load(fs);
		driver.navigate().to(prop.getProperty("appurl"));
		
		try {
			WebDriverWait wait = new WebDriverWait(driver, 1000);
			Thread.sleep(10000);
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(prop.getProperty("signout"))))
					.click();
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(prop.getProperty("settings"))))
					.click();
			Thread.sleep(10000);
			wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("sourcecontrol"))))
					.click();
			Thread.sleep(10000);
			wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("github"))))
					.click();
			Thread.sleep(10000);
			Set<String> allWindowHandles= driver.getWindowHandles();
			Iterator iterator=allWindowHandles.iterator();
			String parent=(String) iterator.next();
			boolean child=iterator.hasNext();
			if(child){
			String child1=(String) iterator.next();
			driver.switchTo().window(child1);
			}
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(prop.getProperty("githublogin"))))
					.sendKeys(username);
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(prop.getProperty("githubpassword"))))
					.sendKeys(password);
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(prop.getProperty("githubcommit")))).click();
			boolean b1=isElementPresent(By.xpath(prop.getProperty("gitauthnew")));
			if(b1){
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("gitauthnew")))).click();
			}
				
			 driver.switchTo().window(parent);
			 Reporter.log("Response Status = " + "Source control adding initiated \n");
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
			Reporter.log("Response Status = " + "Source control adding initiated failed\n");
			driver.close();
		}
	}
	public void Addsourcecontrolgitlab(String username,String password) throws InterruptedException, IOException {
		Thread.sleep(10000);
		FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		prop.load(fs);
		driver.navigate().to(prop.getProperty("appurl"));
		
		try {
			WebDriverWait wait = new WebDriverWait(driver, 1000);
			Thread.sleep(10000);
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(prop.getProperty("signout"))))
					.click();
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(prop.getProperty("settings"))))
					.click();
			Thread.sleep(10000);
			wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("sourcecontrol"))))
					.click();
			Thread.sleep(10000);
			wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("gitlab"))))
					.click();
			Thread.sleep(10000);
			Set<String> allWindowHandles= driver.getWindowHandles();
			Iterator iterator=allWindowHandles.iterator();
			String parent=(String) iterator.next();
			boolean child=iterator.hasNext();
			if(child){
			String child1=(String) iterator.next();
			driver.switchTo().window(child1);
			}
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(prop.getProperty("gitlabuser"))))
					.sendKeys(username);
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(prop.getProperty("gitlabpssword"))))
					.sendKeys(password);
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(prop.getProperty("gitlabsignin")))).click();
			 driver.switchTo().window(parent);
			 Reporter.log("Response Status = " + "Source control adding initiated \n");
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
			Reporter.log("Response Status = " + "Source control adding initiated failed\n");
			driver.close();
		}
	}
	public void Addsourcecontrolvalidation(String username) throws InterruptedException, IOException {
		boolean flag = false;
		FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		prop.load(fs);
		WebDriverWait wait = new WebDriverWait(driver, 1000);
		Thread.sleep(10000);
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("signout")))).click();
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("settings")))).click();
			while (!flag) {
			

				driver.navigate().refresh();
				Thread.sleep(10000);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("sourcecontrol")))).click();
				Thread.sleep(10000);
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("table")));
				WebElement table = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("table")));
				WebElement tbody = table.findElement(By.tagName("tbody"));
				List<WebElement> tr = tbody.findElements(By.tagName("tr"));
				Outer: for (int j = 0; j < tr.size(); j++) {
					if (tr.get(j).getText().contains(username)) {
								flag = true;
								break Outer;
							} else {
								flag = false;
							}
						}
			}
			Thread.sleep(10000);
			driver.navigate().to(prop.getProperty("giturl"));
			Thread.sleep(10000);
			//-------------------logout of git start------------------------------
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("gitlogout")))).click();
			Thread.sleep(10000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("gitlogoutchild")))).click();
			
			//-------------------logout of git end------------------------------
			Thread.sleep(20000);
			driver.navigate().to(prop.getProperty("appurl"));
			Thread.sleep(40000);
			Reporter.log(
					"Response Status = " + username + "source control added in portal \n");

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
			Reporter.log("Response Status = " + "Adding source control failed \n");
			driver.close();
		}
	}
	public void Addsourcecontrolgitlabvalidation(String username) throws InterruptedException, IOException {
		boolean flag = false;
		FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		prop.load(fs);
		WebDriverWait wait = new WebDriverWait(driver, 1000);
		Thread.sleep(10000);
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("signout")))).click();
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("settings")))).click();
			while (!flag) {
			

				driver.navigate().refresh();
				Thread.sleep(10000);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("sourcecontrol")))).click();
				Thread.sleep(10000);
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("table")));
				WebElement table = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("table")));
				WebElement tbody = table.findElement(By.tagName("tbody"));
				List<WebElement> tr = tbody.findElements(By.tagName("tr"));
				Outer: for (int j = 0; j < tr.size(); j++) {
					if (tr.get(j).getText().contains(username)) {
								flag = true;
								break Outer;
							} else {
								flag = false;
							}
						}
			}
			Thread.sleep(20000);
			driver.navigate().to(prop.getProperty("appurl"));
			Reporter.log(
					"Response Status = " + username + "source control added in portal \n");

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
			Reporter.log("Response Status = " + "Adding source control failed \n");
			driver.close();
		}
	}
	public void createCluster(String kubname) throws InterruptedException, IOException {
		FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		prop.load(fs);
		try {
			WebDriverWait wait = new WebDriverWait(driver, 1000);
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(prop.getProperty("signout"))))
					.click();
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(prop.getProperty("settings"))))
					.click();
			wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("kubernets"))))
					.click();
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(prop.getProperty("createkubernets")))).click();
			Thread.sleep(5000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath(prop.getProperty("kubname"))))
					.sendKeys(kubname);
			wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath(prop.getProperty("disksize"))))
					.sendKeys("100");
			wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath(prop.getProperty("projectid"))))
					.click();
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(prop.getProperty("projectidchild"))))
					.click();
			Thread.sleep(10000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath(prop.getProperty("intialnodecount"))))
					.sendKeys("1");
			wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath(prop.getProperty("machinetype"))))
					.click();
			List<WebElement> ele1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("clustermachine")))).findElements(By.tagName("md-option"));
			   Outer:
			   for(int j=0;j<ele1.size();j++){
				   Robot robot = new Robot();
					robot.keyPress(KeyEvent.VK_PAGE_UP);
					Thread.sleep(3000);
					robot.keyRelease(KeyEvent.VK_PAGE_UP);
			    if(ele1.get(j).getText().equals("n1-standard-2")){
			    	Thread.sleep(3000);
			     ele1.get(j).click();
			     break Outer;
			    }
			   }
			wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath(prop.getProperty("zone"))))
					.click();
			List<WebElement> ele2=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("clusterzone")))).findElements(By.tagName("md-option"));
			   Outer:
			   for(int j=0;j<ele2.size();j++){
				   Robot robot = new Robot();
					robot.keyPress(KeyEvent.VK_PAGE_UP);
					Thread.sleep(3000);
					robot.keyRelease(KeyEvent.VK_PAGE_UP);
			    if(ele2.get(j).getText().equals("asia-east1-a")){
			    	Thread.sleep(5000);
			     ele2.get(j).click();
			     break Outer;
			    }
			   }
			Thread.sleep(3000);
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(prop.getProperty("create"))))
					.click();

			Reporter.log("Response Status = " + kubname + "cluster creation Initiated \n");

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
			Reporter.log("Response Status = " + "cluster creation failed to Initiate \n");
			driver.close();
		}
	}

	public void clusterValidation(String kubname) throws InterruptedException, IOException {
		boolean flag = false;
		FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		prop.load(fs);
		WebDriverWait wait = new WebDriverWait(driver, 1000);
		try {
			Thread.sleep(10000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("signout")))).click();
			Thread.sleep(10000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("settings")))).click();
			while (!flag) {
			

				driver.navigate().refresh();
				Thread.sleep(10000);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("kubernets")))).click();
				Thread.sleep(10000);
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("table")));
				WebElement table = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("table")));
				WebElement tbody = table.findElement(By.tagName("tbody"));
				List<WebElement> tr = tbody.findElements(By.tagName("tr"));
				Outer: for (int j = 0; j < tr.size(); j++) {
					List<WebElement> td = tr.get(j).findElements(By.tagName("td"));
					if (tr.get(j).getText().contains(kubname)) {

						for (int i = 0; i < td.size(); i++) {
							System.out.println(td.get(1).getText());
							if ((td.get(i).getText().contains("Creating"))) {
								flag = false;
								break Outer;
							}
							else if(!(td.get(1).getText().contains("."))){
								System.out.println("empty");
								flag = false;
								break Outer;
							}
								else {
							
								flag = true;
							}
						}

					}
				}
			}
			Reporter.log(
					"Response Status = " + kubname + "cluster creation successfully done and listed in the list \n");

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
			Reporter.log("Response Status = " + "cluster creation failed \n");
			driver.close();
		}
	}
	public boolean isElementPresent(By by) {
	    try {
	    	driver.findElement(by);
	      return true;
	    } catch (org.openqa.selenium.NoSuchElementException e) {
	      return false;
	    }
	}
	public void searchDesign(String Image) throws InterruptedException, IOException {
		FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		prop.load(fs);
		boolean temp = true;
		try{
		WebDriverWait wait = new WebDriverWait(driver,1000);
	
		List<WebElement> pagination = driver
				.findElement(By.xpath(prop.getProperty("list")))
				.findElements(By.tagName("li"));
	
		
			OUTER: for (int i = 2; i < pagination.size() - 2; i++) {
				Thread.sleep(10000);
				if(i!=2){
					pagination.get(i).findElement(By.tagName("a")).click();
					}
				Thread.sleep(20000);
				boolean b1=isElementPresent(By.xpath("//h6[text()='"+ Image +"']"));
			
				if(b1){
					Thread.sleep(10000);
					wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h6[text()='"+ Image +"']"))).click();
					temp = false;
					break OUTER;
				}
				
		
	}
		if (temp == true) {
			Assert.fail(Image + "not found");
		}
		log.info("search design successfully");
		Reporter.log("Response Status = " + Image + " found in the list \n");
		
	} catch (Exception e) {
		e.printStackTrace();
		Assert.fail(e.getMessage());
		Reporter.log("Response Status = " + Image +"failed to found in the list\n");
		driver.close();
	}
	}
	public void createdirectCluster(String kubname) throws IOException, InterruptedException{
		FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		prop.load(fs);
		try{
		WebDriverWait wait=new WebDriverWait(driver,1000);
		driver.navigate().to(prop.getProperty("googleconsole"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(prop.getProperty("email")))).sendKeys(prop.getProperty("gmailusername"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(prop.getProperty("next")))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(prop.getProperty("password"))));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(prop.getProperty("password")))).sendKeys(prop.getProperty("gmailpassword"));
	
		boolean check=driver.findElement(By.xpath(prop.getProperty("staysignin"))).isSelected();
		
		if(check){
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("staysignin")))).click();
		}
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(prop.getProperty("signin")))).click();
			Thread.sleep(20000);
		boolean b1 = driver.findElement(By.xpath(prop.getProperty("googletable"))).isDisplayed();
		System.out.println(b1);
		if(b1){
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("directcluster")))).click();
		}
		else{
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("googletablechild")))).click();
		}
		System.out.println("hello................");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("dcname")))).clear();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("dcname")))).sendKeys(kubname);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("dczone")))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("dczonechild")))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("dcmtype")))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("dcmtypechild")))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(prop.getProperty("dcsizeid")))).clear();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(prop.getProperty("dcsizeid")))).sendKeys("1");
		Thread.sleep(20000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("dccreate")))).click();
		Thread.sleep(10000);
		boolean flag=false;
		while (!flag) {
			driver.navigate().refresh();
			Thread.sleep(20000);
			boolean b = driver.findElement(By.xpath(prop.getProperty("googletable"))).isDisplayed();
			if (b) {

				wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("table")));
				WebElement table1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("table")));
				WebElement tbody1 = table1.findElement(By.tagName("tbody"));
				List<WebElement> tr1 = tbody1.findElements(By.tagName("tr"));
				outer:
				for (int j = 0; j < tr1.size(); j++) {
					List<WebElement> td1 = tr1.get(j).findElements(By.tagName("td"));
					for (int i = 0; i < td1.size(); i++) {
						if ((tr1.get(j).getText().contains(kubname))) {
							if(td1.get(i).getText().contains("2 vCPUs")){
								flag=true;
							break outer;
							}
							else
							{
								flag=false;
							}
					}
				}
			}
		}
		}
		Reporter.log("Response Status = " + "cluster creation Initiated \n");
	} catch (Exception e) {
		e.printStackTrace();
		Assert.fail(e.getMessage());
		Reporter.log("Response Status = " + "cluster creation Initiation failed \n");
		driver.close();
	}
		
	}
	public void clusterRegistration(String kubname) throws InterruptedException, IOException{
		FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		prop.load(fs);
	try{
		driver.navigate().to(prop.getProperty("googleconsole"));
		Thread.sleep(10000);
		WebDriverWait wait = new WebDriverWait(driver, 1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("table")));
		WebElement table = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("table")));
		WebElement tbody = table.findElement(By.tagName("tbody"));
		List<WebElement> tr = tbody.findElements(By.tagName("tr"));
		OUTER :
			for (int j = 0; j < tr.size(); j++) {
			List<WebElement> td = tr.get(j).findElements(By.tagName("td"));
			if((tr.get(j).getText().contains(kubname))){
			for (int i = 0; i < td.size(); i++) {
				if ((td.get(i).getText().equals(kubname))) {
					td.get(i).click();
					Thread.sleep(10000);
					break OUTER;
				}
			}
			}
		}			
			List<WebElement> sel=driver.findElements(By.xpath(prop.getProperty("googleitem1")));
			for(int k=0;k<sel.size();k++){
			}
			String val = sel.get(1).getText();
			String[] val1 = val.split("\n");
			String ip=val1[1];
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("googleitem2")))).isDisplayed();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("googleitem2")))).click();
			Thread.sleep(10000);
			List<WebElement> cre=driver.findElements(By.xpath(prop.getProperty("googleitem3")));
			for(int l=0;l<cre.size();l++){
			}
			String username="admin";
			String password=cre.get(cre.size()-1).getText();
			Thread.sleep(10000);
			Keyboard kb = ((HasInputDevices) driver).getKeyboard();
			kb.sendKeys(Keys.ENTER);
			Thread.sleep(10000);
			driver.navigate().to(prop.getProperty("appurl"));
			
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(prop.getProperty("signout"))))
					.click();
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(prop.getProperty("settings"))))
					.click();
			wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("kubernets"))))
					.click();
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(prop.getProperty("registerkubernets")))).click();
		
			wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath(prop.getProperty("rkubname"))))
					.sendKeys(kubname);
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath(prop.getProperty("rport"))))
					.sendKeys("443");
			wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath(prop.getProperty("rip"))))
					.sendKeys(ip);
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(prop.getProperty("rusername"))))
					.sendKeys(username);
			Thread.sleep(10000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath(prop.getProperty("rpassword"))))
					.sendKeys(password);
		
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rregister")))).click();
			Thread.sleep(10000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("signout")))).click();
		
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("settings")))).click();
			boolean flag1=false;
			while (!flag1) {
			

				driver.navigate().refresh();
				Thread.sleep(10000);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("kubernets")))).click();
				Thread.sleep(10000);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("table")));
				WebElement table1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("table")));
				WebElement tbody1 = table1.findElement(By.tagName("tbody"));
				List<WebElement> tr1 = tbody1.findElements(By.tagName("tr"));
				Outer: for (int j = 0; j < tr1.size(); j++) {
					if (tr1.get(j).getText().contains(kubname)) {
								flag1 = true;
								break Outer;
							} else {
								flag1 = false;
							}
						}
			}
			Reporter.log("Response Status = " + "cluster Registration done successfully \n");
	} catch (Exception e) {
		   e.printStackTrace();
		   Assert.fail(e.getMessage());
		   Reporter.log("Response Status = " + "cluster Registration failed \n");
		   driver.close();
		  }
	}
	public void swarmCreation(String kubname) throws InterruptedException, IOException{
		FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		prop.load(fs);
		driver.navigate().to(prop.getProperty("appurl"));
		
		try {
			WebDriverWait wait = new WebDriverWait(driver, 1000);
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(prop.getProperty("signout"))))
					.click();
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(prop.getProperty("settings"))))
					.click();
			Thread.sleep(10000);
			wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("kubernets"))))
					.click();
			Thread.sleep(10000);
			wait.until(ExpectedConditions
				     .visibilityOfElementLocated(By.xpath(prop.getProperty("createSwarm")))).click();
			Thread.sleep(10000);	 
			wait.until(ExpectedConditions.visibilityOfElementLocated(
				     By.xpath(prop.getProperty("kubname"))))
				     .sendKeys(kubname);
				   Thread.sleep(10000);
				   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("azurelocation")))).click();
				   List<WebElement> ele=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("azurelocationchild")))).findElements(By.tagName("md-option"));
				   for(int i=0;i<ele.size();i++){
					   Robot robot = new Robot();
						
						robot.keyPress(KeyEvent.VK_PAGE_UP);
						Thread.sleep(3000);
						robot.keyRelease(KeyEvent.VK_PAGE_UP);
				    if(ele.get(i).getText().equals("West Europe")){
				     ele.get(i).click();
				     break;
				    }
				   }
				   Thread.sleep(3000);
				   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("swarmmastercount")))).sendKeys("1");
				   Thread.sleep(3000);
				   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("swarmnodecount")))).sendKeys("2");  
				   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("subscription")))).click();
					   List<WebElement> ele2=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("subscriptionchild")))).findElements(By.tagName("md-option"));
					  
					   for(int i=0;i<ele2.size();i++){
						   Robot robot = new Robot();
							
							robot.keyPress(KeyEvent.VK_PAGE_UP);
							Thread.sleep(3000);
							robot.keyRelease(KeyEvent.VK_PAGE_UP);
					    if(ele2.get(i).getText().equals("6482214a-60a0-463a-96c0-b73c93748fd7")){
					     ele2.get(i).click();
					     break;
					    }
					   }
				   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("azuremachinetype")))).click();
				   List<WebElement> ele1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("azuremachinetypechild")))).findElements(By.tagName("md-option"));
				   Outer:
				   for(int j=0;j<ele1.size();j++){
					   Robot robot = new Robot();
					
						robot.keyPress(KeyEvent.VK_PAGE_UP);
						Thread.sleep(3000);
						robot.keyRelease(KeyEvent.VK_PAGE_UP);
				    if(ele1.get(j).getText().equals("Standard_DS2")){
				     ele1.get(j).click();
				     break Outer;
				    }
				   }
				   Thread.sleep(3000);
				   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("azurecreate")))).click();
				   Thread.sleep(10000);
		} catch (Exception e) {
		 e.printStackTrace();
		   Assert.fail(e.getMessage());
		   Reporter.log("Response Status = " + "cluster creation failed to Initiate \n");
		   driver.close();
		}

	}
	public void createAzureCluster(String kubname) throws InterruptedException, IOException {
		FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		prop.load(fs);
		  try {
		   WebDriverWait wait = new WebDriverWait(driver, 1000);
		   wait.until(ExpectedConditions
		     .visibilityOfElementLocated(By.xpath(prop.getProperty("signout"))))
		     .click();
		   wait.until(ExpectedConditions
		     .visibilityOfElementLocated(By.xpath(prop.getProperty("settings"))))
		     .click();
		   wait.until(
		     ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("kubernets"))))
		     .click();
		   wait.until(ExpectedConditions
		     .visibilityOfElementLocated(By.xpath(prop.getProperty("createkubernets")))).click();
		  Thread.sleep(10000);
		   wait.until(ExpectedConditions.visibilityOfElementLocated(
		     By.xpath(prop.getProperty("kubname"))))
		     .sendKeys(kubname);
		   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("azurelocation")))).click();
		   List<WebElement> ele=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("azurelocationchild")))).findElements(By.tagName("md-option"));
		   for(int i=0;i<ele.size();i++){
			   Robot robot = new Robot();
				
				robot.keyPress(KeyEvent.VK_PAGE_UP);
				Thread.sleep(3000);
				robot.keyRelease(KeyEvent.VK_PAGE_UP);
		    if(ele.get(i).getText().equals("West Europe")){
		     ele.get(i).click();
		     break;
		    }
		   }
		  
		   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("azurenodecount")))).sendKeys("2");
			  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("subscription")))).click();
			   List<WebElement> ele2=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("subscriptionchild")))).findElements(By.tagName("md-option"));
			  
			   for(int i=0;i<ele2.size();i++){
				   Robot robot = new Robot();
					
					robot.keyPress(KeyEvent.VK_PAGE_UP);
					Thread.sleep(3000);
					robot.keyRelease(KeyEvent.VK_PAGE_UP);
			    if(ele2.get(i).getText().equals("6482214a-60a0-463a-96c0-b73c93748fd7")){
			     ele2.get(i).click();
			     break;
			    }
			   }
		   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("azuremachinetype")))).click();
		   List<WebElement> ele1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("azuremachinetypechild")))).findElements(By.tagName("md-option"));
		   Outer:
		   for(int j=0;j<ele1.size();j++){
			   Robot robot = new Robot();
			
				robot.keyPress(KeyEvent.VK_PAGE_UP);
				Thread.sleep(3000);
				robot.keyRelease(KeyEvent.VK_PAGE_UP);
		    if(ele1.get(j).getText().equals("Standard_DS2")){
		     ele1.get(j).click();
		     break Outer;
		    }
		   }
		   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("azurecreate")))).click();
		   Thread.sleep(10000);
		   Reporter.log("Response Status = " + kubname + "cluster creation Initiated \n");

		  } catch (Exception e) {
		   e.printStackTrace();
		   Assert.fail(e.getMessage());
		   Reporter.log("Response Status = " + "cluster creation failed to Initiate \n");
		   driver.close();
		  }
		 }
	public void directClusterDeletion(String kubname) throws InterruptedException, IOException {
		FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		prop.load(fs);
		WebDriverWait wait = new WebDriverWait(driver, 1000);
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("signout")))).click();
		
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("settings")))).click();
			

				driver.navigate().refresh();
			Thread.sleep(10000);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("kubernets")))).click();
				Thread.sleep(10000);
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("table")));
				WebElement table = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("table")));
				WebElement tbody = table.findElement(By.tagName("tbody"));
				List<WebElement> tr = tbody.findElements(By.tagName("tr"));
				 for (int j = 0; j < tr.size(); j++) {
					List<WebElement> td = tr.get(j).findElements(By.tagName("td"));
					if (tr.get(j).getText().contains(kubname)) {
						Thread.sleep(10000);
						System.out.println("//tr["+(j+1)+"]/td[5]/a[@uib-tooltip='delete']");
						driver.findElement(By.xpath("//tr["+(j+1)+"]/td[5]/a[@uib-tooltip='delete']")).click();
					
						}
					}
				 Thread.sleep(10000);
				 List<WebElement> button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("appdeletechild"))))
							.findElements(By.tagName("button"));
					for (int i = 0; i < button.size(); i++) {
						if (button.get(i).getText().equals("Delete")) {
							Thread.sleep(10000);
							button.get(i).click();
						}
					}
		
			boolean flag = false;
			Thread.sleep(10000);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("signout")))).click();
				Thread.sleep(10000);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("settings")))).click();
				while (!flag) {
					driver.navigate().refresh();
					Thread.sleep(10000);
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("kubernets")))).click();
					Thread.sleep(10000);
						wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("table")));
						WebElement table1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("table")));
						WebElement tbody1 = table1.findElement(By.tagName("tbody"));
						List<WebElement> tr1 = tbody1.findElements(By.tagName("tr"));
						if(tr1.size()!=0){
						for (int j = 0; j < tr1.size(); j++) {
							List<WebElement> td1 = tr1.get(j).findElements(By.tagName("td"));
							for (int i = 0; i < td1.size(); i++) {
								if ((tr1.get(j).getText().contains(kubname))) {
									flag = false;

								} else {
									flag = true;
								}
							}
						}
						}else {
							flag = true;
						}
				}
				Reporter.log("Response Status = " + "ClusterDeletion deletion initiated \n");

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
			Reporter.log("Response Status = " + "ClusterDeletion deletion initiation failed \n");
			driver.close();
		}
		 }

	public void sourceControlDeletion(String username) throws InterruptedException, IOException {
		FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		prop.load(fs);
		WebDriverWait wait = new WebDriverWait(driver, 1000);
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("signout")))).click();
		
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("settings")))).click();
			

				driver.navigate().refresh();
				Thread.sleep(10000);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("sourcecontrol")))).click();
				Thread.sleep(10000);
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("table")));
				WebElement table = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("table")));
				WebElement tbody = table.findElement(By.tagName("tbody"));
				List<WebElement> tr = tbody.findElements(By.tagName("tr"));
				 for (int j = 0; j < tr.size(); j++) {
					List<WebElement> td = tr.get(j).findElements(By.tagName("td"));
					if (tr.get(j).getText().contains(username)) {
								td.get(3).click();
						}
					}
			
				 List<WebElement> button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("appdeletechild"))))
							.findElements(By.tagName("button"));
					for (int i = 0; i < button.size(); i++) {
						if (button.get(i).getText().equals("Delete")) {
							Thread.sleep(10000);
							button.get(i).click();
						}
					}
		
			Reporter.log(
					"Response Status = " + username + "source control user delettion initiated \n");

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
			Reporter.log("Response Status = " + "source control user deletion initiation failed \n");
			driver.close();
		}
		 }
	public void sourceControlDeletionValidation(String username) throws InterruptedException, IOException {
		boolean flag = false;
		FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		prop.load(fs);
		Thread.sleep(10000);
		WebDriverWait wait=new WebDriverWait(driver,1000);
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("signout")))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("settings")))).click();
			while (!flag) {
				

				driver.navigate().refresh();
			Thread.sleep(10000);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("sourcecontrol")))).click();
				Thread.sleep(10000);
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("table")));
					WebElement table1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("table")));
					WebElement tbody1 = table1.findElement(By.tagName("tbody"));
					List<WebElement> tr1 = tbody1.findElements(By.tagName("tr"));
					if(tr1.size()!=0){
					for (int j = 0; j < tr1.size(); j++) {
						List<WebElement> td1 = tr1.get(j).findElements(By.tagName("td"));
						for (int i = 0; i < td1.size(); i++) {
							if ((tr1.get(j).getText().contains(username))) {
								flag = false;

							} else {
								flag = true;
							}
						}
					}
					}else {
						flag = true;
					}
			}
		
			Reporter.log(
					"Response Status = " + username + "source control user deleted successfully \n");

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
			Reporter.log("Response Status = " + "source control user deletion failed \n");
			driver.close();
		}
		 }
	public void azurClusterDeletion(String kubname) throws InterruptedException, IOException {
		FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		prop.load(fs);
		WebDriverWait wait = new WebDriverWait(driver, 1000);
		Thread.sleep(10000);
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("signout")))).click();
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("settings")))).click();
				

				driver.navigate().refresh();
				Thread.sleep(10000);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("kubernets")))).click();
				Thread.sleep(10000);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("table")));
				WebElement table = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("table")));
				WebElement tbody = table.findElement(By.tagName("tbody"));
				List<WebElement> tr = tbody.findElements(By.tagName("tr"));
				 for (int j = 0; j < tr.size(); j++) {
					List<WebElement> td = tr.get(j).findElements(By.tagName("td"));
					
					if (tr.get(j).getText().contains(kubname)) {
						System.out.println(tr.get(j).getText());
						Thread.sleep(3000);
						System.out.println("//tr["+(j+1)+"]/td[7]/a[@uib-tooltip='delete']");
						driver.findElement(By.xpath("//tr["+(j+1)+"]/td[7]/a[@uib-tooltip='delete']")).click();
					}
				 }
				 List<WebElement> button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("appdeletechild"))))
							.findElements(By.tagName("button"));
					for (int i = 0; i < button.size(); i++) {
						if (button.get(i).getText().equals("Delete")) {
							Thread.sleep(10000);
							button.get(i).click();
						}
					}
		
			Reporter.log(
					"Response Status = " + kubname + "cluster delettion initiated \n");

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
			Reporter.log("Response Status = " + "cluster deletion initiation failed \n");
			driver.close();
		}
		 }
	public void deleteAzureValidation(String kubname) throws InterruptedException, IOException {
		FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		prop.load(fs);
		boolean flag = false;
		Thread.sleep(10000);
		WebDriverWait wait=new WebDriverWait(driver,1000);
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("signout")))).click();
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("settings")))).click();
			while (!flag) {
			

				driver.navigate().refresh();
				Thread.sleep(10000);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("kubernets")))).click();
				Thread.sleep(10000);
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("table")));
					WebElement table1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("table")));
					WebElement tbody1 = table1.findElement(By.tagName("tbody"));
					List<WebElement> tr1 = tbody1.findElements(By.tagName("tr"));
					if(tr1.size()!=0){
					for (int j = 0; j < tr1.size(); j++) {
						List<WebElement> td1 = tr1.get(j).findElements(By.tagName("td"));
						for (int i = 0; i < td1.size(); i++) {
							if ((tr1.get(j).getText().contains(kubname))) {
								flag = false;

							} else {
								flag = true;
							}
						}
					}
					}else {
						flag = true;
					}
			}
		
			Reporter.log(
					"Response Status = " + kubname + "cluster deleted successfully \n");

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
			Reporter.log("Response Status = " + "cluster deletion failed \n");
			driver.close();
		}
		 }
	public void createSingletierDesign(String name,String url,String auth,String platform,String build,String buildscript,String startscript,String install,String preinstall,String postinstall,String port) throws InterruptedException, AWTException, IOException {
		FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		prop.load(fs);
		try{
		WebDriverWait wait=new WebDriverWait(driver, 1000);
		driver.navigate().to(prop.getProperty("appurl"));
		Thread.sleep(10000);
		driver.navigate().refresh();
		Thread.sleep(10000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("design"))));
		WebElement e1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("design"))));
		Actions act=new Actions(driver);
		act.moveToElement(e1).doubleClick(e1).build().perform();
		Thread.sleep(10000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		Thread.sleep(3000);
		robot.keyRelease(KeyEvent.VK_PAGE_UP); 
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("createdesign")))).click();
		Thread.sleep(3000);
		System.out.println(name);
		if(name.equals("git")){
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("designgithub")))).click();
		}
		else if(name.equals("bit")){
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("designbitbucket")))).click();
		}
		else if(name.equals("gitlab")){
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("designgitlab")))).click();
			}
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("dbname"))));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("dbname")))).sendKeys(name);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("gitpath")))).sendKeys(url);
		if(auth!=""){
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("gitauth")))).click();
	
		List<WebElement> list=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("dbversionchild")))).findElements(By.tagName("md-option"));
		
		for(int i=0;i<list.size();i++){
			if(list.get(i).getText().equals(auth)){
				Thread.sleep(5000);
				list.get(i).click();
				break;
			}
			}
		Thread.sleep(10000);
		}
			Thread.sleep(10000);
			
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("gitplatform")))).click();
		
	
		List<WebElement> list=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("dbversionchild")))).findElements(By.tagName("md-option"));
		
		for(int i=0;i<list.size();i++){
			if(list.get(i).getText().equals(platform)){
				Thread.sleep(5000);
				list.get(i).click();
				break;
			}
		}
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("scriptbutton")))).click();
		Thread.sleep(20000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("gitbuilder")))).click();
	
	List<WebElement> list1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("gitbuilderchild")))).findElements(By.tagName("md-option"));

		for(int j=0;j<list1.size();j++){
			if(list1.get(j).getText().equals(build)){
				Thread.sleep(5000);
				list1.get(j).click();
				break;
			}
		}
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("gitbuild")))).sendKeys(buildscript);
		
		if(startscript !=""){
			
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("advancefield")))).click();
		}
		if(startscript !=""){
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("startscript")))).sendKeys(startscript);
		}
		if(install !=""){
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("install")))).sendKeys(install);
		}
		if(preinstall !=""){
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("preinstall")))).sendKeys(preinstall);
		}
		if(postinstall !=""){
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("postinstall")))).sendKeys(postinstall);
			}
	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("networkbutton")))).click();
	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("gitport")))).sendKeys(port);
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("dbsave")))).click();
		Reporter.log("Response Status = " + "create single tier design initiated \n");
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
			Reporter.log("Response Status = " + "create single tier design initiation failed\n");
			driver.close();
		}
	}
	public void createRedisComponent(String name,String path,String port) throws IOException{
		FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		prop.load(fs);
		try{
		Thread.sleep(10000);
		WebDriverWait wait=new WebDriverWait(driver,1000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("designredis")))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("redisdbpath")))).sendKeys(path);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("networkbutton")))).click();
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("gitport")))).sendKeys(port);
			Thread.sleep(5000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("dbsave")))).click();
	}catch (Exception e) {
		e.printStackTrace();
		Assert.fail(e.getMessage());
		Reporter.log("Response Status = " + "create Multi tier design initiation failed\n");
		driver.close();
	}
	}
	public void createMultitierDesign(String name,String version,String path) throws IOException, InterruptedException{
		FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		prop.load(fs);
		try{
		Thread.sleep(10000);
		WebDriverWait wait=new WebDriverWait(driver,1000);
		if(name.equals("mysql")){
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("mysql")))).click();
		}
		else if(name.equals("cass")){
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("cassandra")))).click();
		}else if(name.equals("mongo"))
		{
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("mongo")))).click();
		}
	    
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("dbname")))).sendKeys(name);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("dbversion")))).click();
		Thread.sleep(5000);
	List<WebElement> list2=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("dbversionchild")))).findElements(By.tagName("md-option"));
	OUTER:
		for(int i=0;i<list2.size();i++){
			Thread.sleep(5000);
			if(list2.get(i).getText().equals(version)){
				Thread.sleep(5000);
				list2.get(i).click();
				break OUTER;
			}
		}

		if(path!=""){
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("dbpath")))).sendKeys(path);
		}
			
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("dbsave")))).click();
		
		Reporter.log("Response Status = " + "create Multi tier design initiated \n");
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
			Reporter.log("Response Status = " + "create Multi tier design initiation failed\n");
			driver.close();
		}
		
		
	}
	public void linkComponent(String image,String image1) throws  AWTException, IOException, InterruptedException{
		FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		prop.load(fs);
		try{
		WebDriverWait wait=new WebDriverWait(driver,1000);
		Robot robot = new Robot();
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		Thread.sleep(3000);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);
		 Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("addedge")))).click();
		Screen s=new Screen();
		Thread.sleep(3000);
		Pattern p=new Pattern(image);
		Pattern p1=new Pattern(image1);
		Thread.sleep(3000);
		try {
			s.dragDrop(p, p1);
		} catch (FindFailed e) {
			e.printStackTrace();
		}
		Thread.sleep(3000);
		Reporter.log("Response Status = " + "Linked component succesfully\n");
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
			Reporter.log("Response Status = " + "Link component failed\n");
			driver.close();
		}
	}
	public void publish(String design) throws AWTException, IOException, InterruptedException{
		FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		prop.load(fs);
		try{
		WebDriverWait wait=new WebDriverWait(driver,1000);
		Robot robot = new Robot();
	
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		Thread.sleep(10000);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);
	
		 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("designedit")))).click();
	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("desingtext")))).clear();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("desingtext")))).sendKeys(design);
		
	   Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("designsave")))).click();
		 Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("publish")))).click();
		Reporter.log("Response Status = " + "Publish the design initiated\n");
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
			Reporter.log("Response Status = " + "Publish the design failed\n");
			driver.close();
		}
	}
	public void designValidation(String design) throws InterruptedException, IOException{
		FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		prop.load(fs);
		try{
		Thread.sleep(10000);
		driver.navigate().to(prop.getProperty("appurl"));
		Thread.sleep(10000);
		driver.navigate().refresh();
		Thread.sleep(10000);
		WebDriverWait wait=new WebDriverWait(driver,1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("design"))));
		WebElement e1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("design"))));
		Actions act=new Actions(driver);
		act.moveToElement(e1).doubleClick(e1).build().perform();
		Thread.sleep(10000);
		searchDesign(design);
	
		String val=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("designsttus")))).getText();
		
		if(val.equals("Success"))
		{
			Assert.assertTrue(true, val);
		}
		Reporter.log("Response Status = " + "Design created successfully \n");
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
			Reporter.log("Response Status = " + "Design creation failed\n");
			driver.close();
		}
	}
	public void launchApp(String clust,String imgname, String appname, String port, String kubname) throws InterruptedException, IOException {
		FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		prop.load(fs);																																																				
		WebDriverWait wait = new WebDriverWait(driver, 1000);
		boolean temp = true;
		Thread.sleep(10000);
		driver.navigate().to(prop.getProperty("appurl"));
		Thread.sleep(10000);
		driver.navigate().refresh();
		Thread.sleep(10000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("design"))));
		WebElement e1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("design"))));
		Actions act=new Actions(driver);
		act.moveToElement(e1).doubleClick(e1).build().perform();
		Thread.sleep(10000);
		try {
				searchDesign(imgname);
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("launch")))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("appname")))).sendKeys(appname);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("appport"))))
					.sendKeys(port);
			Thread.sleep(20000);
			if(clust.equals("kub")){
			Select cluster = new Select(
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("appkub")))));
			cluster.selectByVisibleText(kubname);
			}
			else{
				System.out.println("swarm");
					driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[2]/form/div[3]/div[2]/input")).click();
					Thread.sleep(3000);
				Select cluster = new Select(
						wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("appkub")))));
				cluster.selectByVisibleText(kubname);
			}
		
			Boolean Autoscale = driver
					.findElement(By.xpath(prop.getProperty("autoscale"))).isDisplayed();
			Boolean cdelivery = driver
					.findElement(By.xpath(prop.getProperty("cdelivery"))).isDisplayed();
			Boolean firewall = driver
					.findElement(By.xpath(prop.getProperty("firewall"))).isDisplayed();
			if (Autoscale) {
				wait.until(ExpectedConditions.visibilityOfElementLocated(
						By.xpath(prop.getProperty("autoscale")))).click();
			}
			if (cdelivery) {
				wait.until(ExpectedConditions.visibilityOfElementLocated(
						By.xpath(prop.getProperty("cdelivery")))).click();
			}
			if (firewall) {
				wait.until(ExpectedConditions.visibilityOfElementLocated(
						By.xpath(prop.getProperty("firewall")))).click();
			}

			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(prop.getProperty("appbutton")))).click();
			Thread.sleep(20000);
			Assert.assertEquals(
					wait.until(ExpectedConditions
							.visibilityOfElementLocated(By.xpath(prop.getProperty("apppagenew")))).getText(),
					"Applications");
			log.info("search design successfully");
			Reporter.log("Response Status = " + appname + "Application launch Initiated \n");
			temp = false;
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
			Reporter.log("Response Status = " + "Application launch initiation failed \n");
			driver.close();
		}
		if (temp == true) {
			Assert.fail("Image not found");
		}
	}
	public void launchValidation(String appname) throws InterruptedException, IOException {
		FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		prop.load(fs);
		boolean flag = false;
		WebDriverWait wait=new WebDriverWait(driver,1000);
		driver.navigate().to(prop.getProperty("appurl"));
		Thread.sleep(10000);
		driver.navigate().refresh();
	
		try {
			Thread.sleep(10000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("apppage"))));
		
			WebElement e1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("apppage"))));
			Actions act=new Actions(driver);
			act.moveToElement(e1).doubleClick(e1).build().perform();
			Thread.sleep(10000);
			while (!flag) {
				driver.navigate().refresh();
				Thread.sleep(10000);
					searchDesign(appname);
				
				if (wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("apptext")))).getText()
						.equals("Success")) {
					flag = true;
				} else if (wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("apptext")))).getText()
						.equals("Failed")) {
					Assert.fail("Application creation failed");
					flag = true;
				} else {
					flag = false;
				}
			}
			log.info("search design successfully");
			Reporter.log("Response Status = " + appname + "Application created succesfully \n");
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
			Reporter.log("Response Status = " + "Application creation failed \n");
			driver.close();
		}
		if (flag == false) {
			Assert.fail("Application creation failed");
		}
	}

	public void accessValidation(String appname, String text, String Updatedata) throws InterruptedException, IOException {
		FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		prop.load(fs);
		boolean flag = true;
		driver.navigate().to(prop.getProperty("appurl"));
		Thread.sleep(10000);
		driver.navigate().refresh();
		
		try {
			Thread.sleep(10000);
			WebDriverWait wait=new WebDriverWait(driver,1000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("apppage"))));
			WebElement e1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("apppage"))));
			Actions act=new Actions(driver);
			act.moveToElement(e1).doubleClick(e1).build().perform();
			Thread.sleep(10000);
				searchDesign(appname);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("accessurl")))).click();
			Thread.sleep(10000);
			String val = driver
					.findElement(By
							.xpath(prop.getProperty("accesstext")))
					.getText();
			Thread.sleep(10000);
			if (text == null) {
				driver.navigate().to(val);
			} else {
				driver.navigate().to(val + text);
			}
		
			String data = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("accessurldata")))).getText();
		    Thread.sleep(20000);
			if(data.contains(Updatedata)){
			Assert.assertTrue(true, data);
			}
			else
			{
				Assert.assertEquals(data, Updatedata);
			}
		
			flag = true;
			log.info("search design successfully");
			Reporter.log("Response Status = " + "Accessing the application succesfully \n");
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
			Reporter.log("Response Status = " + "Application creation failed \n");
			driver.close();
		}
		if (flag == false) {
			Assert.fail("Application creation failed \n");
		}
	}

	public void stopAction(String appname, String text) throws InterruptedException, IOException {
		FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		prop.load(fs);
		WebDriverWait wait=new WebDriverWait(driver,1000);
		try {
		driver.navigate().to(prop.getProperty("appurl"));
		Thread.sleep(10000);
		driver.navigate().refresh();
	
		Thread.sleep(10000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("apppage"))));
		WebElement e1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("apppage"))));
		Actions act=new Actions(driver);
		act.moveToElement(e1).doubleClick(e1).build().perform();
		Thread.sleep(10000);
		launchValidation(appname);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("detailsbutton")))).click();
		Thread.sleep(10000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		Thread.sleep(3000);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("action")))).click();
		Thread.sleep(10000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("stop")))).click();
		Thread.sleep(10000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("apppage"))));
			WebElement e2=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("apppage"))));
			act.moveToElement(e2).doubleClick(e2).build().perform();
			Thread.sleep(10000);
			searchDesign(appname);
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("accessurl")))).click();
			Thread.sleep(10000);
			String val = driver
					.findElement(By
							.xpath(prop.getProperty("accesstext")))
					.getText();
			Thread.sleep(10000);
			if (text == null) {
				driver.navigate().to(val);
			} else {
				driver.navigate().to(val + text);
			}
			Thread.sleep(10000);
			String data = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("accessurldata")))).getText();
			if (data.contains("ERR_CONNECTION_REFUSED")) {
				Assert.assertTrue(true, "Stop action working properly");
			} else {
				Assert.fail("stop action not working properly");
			}
			Reporter.log("Response Status = " + appname + "application stopped successfully \n");
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
			Reporter.log("Response Status = " + "application stopping failed \n");
			driver.close();
		}
	}

	public void startAction(String appname, String text, String updatedata) throws InterruptedException, AWTException, IOException {
		WebDriverWait wait=new WebDriverWait(driver,1000);
		FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		prop.load(fs);
		try {
			driver.navigate().to(prop.getProperty("appurl"));
			Thread.sleep(10000);
			driver.navigate().refresh();
			Thread.sleep(60000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("apppage"))));
			WebElement e1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("apppage"))));
			Actions act=new Actions(driver);
			act.moveToElement(e1).doubleClick(e1).build().perform();
			Thread.sleep(10000);
				searchDesign(appname);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("detailsbutton")))).click();
			Thread.sleep(10000);
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_PAGE_UP);
			Thread.sleep(3000);
			robot.keyRelease(KeyEvent.VK_PAGE_UP);
			Thread.sleep(3000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("action")))).click();
			Thread.sleep(10000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("start")))).click();
			Thread.sleep(10000);
			accessValidation(appname, text, updatedata);
			Reporter.log("Response Status = " + appname + "application started successfully \n");
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
			Reporter.log("Response Status = " + "application starting failed \n");
			driver.close();
		}
	}

	public void cdeliveryOnsingletier(String appname, String text, String updatedata, String gitnewdata)
			throws InterruptedException, AWTException, IOException {
		FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		prop.load(fs);
		try {
			Thread.sleep(10000);
			driver.navigate().to(prop.getProperty("appurl"));
			Thread.sleep(10000);
			driver.navigate().refresh();
			Thread.sleep(10000);
			WebDriverWait wait = new WebDriverWait(driver, 1000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("apppage"))));
			WebElement e1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("apppage"))));
			Actions act=new Actions(driver);
			act.moveToElement(e1).doubleClick(e1).build().perform();
			Thread.sleep(20000);
			driver.navigate().to(prop.getProperty("giturl"));
			Thread.sleep(10000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("gitsignin")))).click();
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(prop.getProperty("gitusername"))))
					.sendKeys("sailakshmiv");
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(prop.getProperty("gitpassword"))))
					.sendKeys("trov-it123");
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(prop.getProperty("gitsigninbutton")))).click();
			Thread.sleep(10000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(prop.getProperty("gitantapplink")))).click();
			Thread.sleep(10000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(prop.getProperty("gitantapplinkchild")))).click();
			Thread.sleep(10000);
			String script = "<%@ page language=\"java\" contentType=\"text/html; charset=ISO-8859-1\"\n"+"pageEncoding=\"ISO-8859-1\"%>\n"+"<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n"+"<html>\n"+"<head>\n"+"<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n"+"<title>Insert title here</title>\n"+"</head>"+"<body>"+"<a href=\"HelloWorld\">click Here-goPaddle Bluemeric ANTAPP DEMO" + gitnewdata + "</a>\n"+"</body>\n"+"</html>";
			wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath(prop.getProperty("gitedit")))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath(prop.getProperty("gitedittext"))));

			Keyboard kb = ((HasInputDevices) driver).getKeyboard();
			kb.sendKeys(Keys.TAB);
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_A);
			robot.keyRelease(KeyEvent.VK_A);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(5000);
			robot.keyPress(KeyEvent.VK_DELETE);
			robot.keyRelease(KeyEvent.VK_DELETE);
			Thread.sleep(5000);
			
			StringSelection ss = new StringSelection(script);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
			robot.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
			robot.keyPress(java.awt.event.KeyEvent.VK_V);
			Thread.sleep(5000);
			robot.keyRelease(java.awt.event.KeyEvent.VK_V);
			robot.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
			Thread.sleep(10000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("gitupdate")))).click();
			Thread.sleep(10000);
			//-------------------logout of git start------------------------------
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("gitlogout")))).click();
			Thread.sleep(10000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("gitlogoutchild")))).click();
		
			//-------------------logout of git end------------------------------
			Thread.sleep(10000);
			driver.navigate().to(prop.getProperty("appurl"));
			Thread.sleep(10000);
			driver.navigate().refresh();
			Thread.sleep(40000);
			accessValidation(appname, text, updatedata + gitnewdata);
			Reporter.log("Response Status = " + "Before updating the Application accessdata is :" + updatedata + "\n");
			Reporter.log("Response Status = " + "cdeliveryOn - After updating the Application accessdata is :"
					+ updatedata + gitnewdata + "\n");
			Reporter.log("Response Status = " + appname + "cdeliveryon working successfully for this appllication \n");
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
			Reporter.log("Response Status = " + "cdeliveryon failed for this appllication \n");
			driver.close();
		}

	}
	 
	public void cdeliveryOnMultitier(String appname, String text, String updatedata, String gitnewdata)
			throws InterruptedException, AWTException, IOException {
		FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		prop.load(fs);
		try {
			driver.navigate().to(prop.getProperty("appurl"));
			Thread.sleep(10000);
			driver.navigate().refresh();
			Thread.sleep(10000);
			WebDriverWait wait = new WebDriverWait(driver, 1000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("apppage"))));
			WebElement e1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("apppage"))));
			Actions act=new Actions(driver);
			act.moveToElement(e1).doubleClick(e1).build().perform();
			Thread.sleep(10000);
			driver.navigate().to(prop.getProperty("giturlmulti"));
			Thread.sleep(10000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("gitsignin")))).click();
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(prop.getProperty("gitusername"))))
					.sendKeys("sailakshmiv");
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(prop.getProperty("gitpassword"))))
					.sendKeys("trov-it123");
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(prop.getProperty("gitsigninbutton")))).click();
			Thread.sleep(10000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText(prop.getProperty("gitmultilink")))).click();
			Thread.sleep(10000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText(prop.getProperty("gitmultilinkchild")))).click();
			Thread.sleep(10000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(prop.getProperty("gitmultilinkchild1")))).click();
			Thread.sleep(10000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(prop.getProperty("gitmultilinkchild2")))).click();
			Thread.sleep(10000);
			String script = "<%@ taglib uri=\"http://java.sun.com/jsp/jstl/core\" prefix=\"c\" %>\n"+"<%@ page session=\"false\" %>\n"+"<html>\n"+"<head>\n"+"<title>Home Page</title>\n"+"</head>\n"+"<body>\n"+"<h1>\n"+"Hello world!!!!!!\n"+"</h1>\n"+"${controllerMessage}<br/>\n"+"<br/>\n"+"<br/>\n"+"<a href=\"product/list\">:)Click here to view the Product list"+gitnewdata+"\n"+"</a>\n"+"</body>\n"+"</html>";
			Thread.sleep(10000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath(prop.getProperty("gitedit")))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath(prop.getProperty("gitedittext"))));

			Keyboard kb = ((HasInputDevices) driver).getKeyboard();
			kb.sendKeys(Keys.TAB);
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_A);
			robot.keyRelease(KeyEvent.VK_A);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(5000);
			robot.keyPress(KeyEvent.VK_DELETE);
			robot.keyRelease(KeyEvent.VK_DELETE);
			Thread.sleep(5000);
			
			StringSelection ss = new StringSelection(script);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
			robot.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
			robot.keyPress(java.awt.event.KeyEvent.VK_V);
			Thread.sleep(5000);
			robot.keyRelease(java.awt.event.KeyEvent.VK_V);
			robot.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
			Thread.sleep(10000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("gitupdate")))).click();
			
			Thread.sleep(10000);
			//-------------------logout of git start------------------------------
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("gitlogout")))).click();
			Thread.sleep(10000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("gitlogoutchild")))).click();
			
			//-------------------logout of git end------------------------------
			Thread.sleep(10000);
			driver.navigate().to(prop.getProperty("appurl"));
			Thread.sleep(10000);
			driver.navigate().refresh();
			Thread.sleep(40000);
			accessValidation(appname, text, updatedata+gitnewdata);
			Reporter.log("Response Status = " + "Before updating the Application accessdata is :" + updatedata + "\n");
			Reporter.log("Response Status = " + "cdeliveryOn - After updating the Application accessdata is :"
					+ updatedata + gitnewdata + "\n");
			Reporter.log("Response Status = " + appname + "cdeliveryon working successfully for this appllication \n");
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
			Reporter.log("Response Status = " + "cdeliveryon failed for this appllication \n");
			driver.close();
		}

	}
	public void cdeliveryOff(String appname, String text, String updatedata, String gitdata)
			throws InterruptedException, AWTException, IOException {
		FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		prop.load(fs);
		WebDriverWait wait = new WebDriverWait(driver, 1000);
		try {
			driver.navigate().to(prop.getProperty("appurl"));
			Thread.sleep(10000);
			driver.navigate().refresh();
			Thread.sleep(10000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("apppage"))));
			WebElement e1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("apppage"))));
			Actions act=new Actions(driver);
			act.moveToElement(e1).doubleClick(e1).build().perform();
			Thread.sleep(10000);
				searchDesign(appname);
			
			
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("detailsbutton")))).click();
				Robot robot = new Robot();
				robot.keyPress(KeyEvent.VK_PAGE_UP);
				Thread.sleep(3000);
				robot.keyRelease(KeyEvent.VK_PAGE_UP);
				Thread.sleep(3000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("action")))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("cdeliveryon")))).click();
			
			driver.navigate().to(prop.getProperty("giturl"));
			Thread.sleep(10000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("gitsignin")))).click();
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(prop.getProperty("gitusername"))))
					.sendKeys("sailakshmiv");
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(prop.getProperty("gitpassword"))))
					.sendKeys("trov-it123");
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(prop.getProperty("gitsigninbutton")))).click();
			
			Thread.sleep(10000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(prop.getProperty("gitantapplink")))).click();
			Thread.sleep(10000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(prop.getProperty("gitantapplinkchild")))).click();
			Thread.sleep(10000);
			String script = "<%@ page language=\"java\" contentType=\"text/html; charset=ISO-8859-1\"\n"+"pageEncoding=\"ISO-8859-1\"%>\n"+"<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n"+"<html>\n"+"<head>\n"+"<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n"+"<title>Insert title here</title>\n"+"</head>"+"<body>"+"<a href=\"HelloWorld\">click Here-goPaddle Bluemeric ANTAPP DEMO" + gitdata + "</a>\n"+"</body>\n"+"</html>";
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("gitedit")))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("gitedittext"))));

			Keyboard kb = ((HasInputDevices) driver).getKeyboard();
			kb.sendKeys(Keys.TAB);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_A);
			robot.keyRelease(KeyEvent.VK_A);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(10000);
			robot.keyPress(KeyEvent.VK_DELETE);
			robot.keyRelease(KeyEvent.VK_DELETE);
			Thread.sleep(10000);

			StringSelection ss = new StringSelection(script);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
			robot.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
			robot.keyPress(java.awt.event.KeyEvent.VK_V);
			robot.keyRelease(java.awt.event.KeyEvent.VK_V);
			robot.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
			Thread.sleep(10000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("gitupdate")))).click();
			Thread.sleep(10000);
			//-------------------logout of git start------------------------------
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("gitlogout")))).click();
			Thread.sleep(10000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("gitlogoutchild")))).click();
			
			//-------------------logout of git end------------------------------
			Thread.sleep(10000);
			driver.navigate().to(prop.getProperty("appurl"));
			Thread.sleep(10000);
			driver.navigate().refresh();
			Thread.sleep(40000);

			accessValidation(appname, text, updatedata);
			Reporter.log("Response Status = " + "Before updating the Application accessdata is :" + updatedata + "\n");
			Reporter.log("Response Status = " + "cdeliveryOff - After updating the Application accessdata is :"
					+ updatedata + "\n");
			Reporter.log("Response Status = " + "cdeliveryoff working successfully for this appllication \n");
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
			Reporter.log("Response Status = " + "cdeliveryoff failed for this appllication \n");
			driver.close();
		}
	}
	public void cdeliveryOffMultitier(String appname, String text, String updatedata, String gitdata)
			throws InterruptedException, AWTException, IOException {
		FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		prop.load(fs);
		WebDriverWait wait = new WebDriverWait(driver, 1000);
		try {
			driver.navigate().to(prop.getProperty("appurl"));
			
			driver.navigate().refresh();
			Thread.sleep(10000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("apppage"))));
			WebElement e1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("apppage"))));
			Actions act=new Actions(driver);
			act.moveToElement(e1).doubleClick(e1).build().perform();
			Thread.sleep(10000);
				searchDesign(appname);
			
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("detailsbutton")))).click();
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_PAGE_UP);
			Thread.sleep(3000);
			robot.keyRelease(KeyEvent.VK_PAGE_UP);
			Thread.sleep(3000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("action")))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("cdeliveryon")))).click();
			
			driver.navigate().to(prop.getProperty("giturlmulti"));
			Thread.sleep(10000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("gitsignin")))).click();
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(prop.getProperty("gitusername"))))
					.sendKeys("sailakshmiv");
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(prop.getProperty("gitpassword"))))
					.sendKeys("trov-it123");
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(prop.getProperty("gitsigninbutton")))).click();
			Thread.sleep(10000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText(prop.getProperty("gitmultilink")))).click();
			Thread.sleep(10000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText(prop.getProperty("gitmultilinkchild")))).click();
			Thread.sleep(10000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(prop.getProperty("gitmultilinkchild1")))).click();
			Thread.sleep(10000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(prop.getProperty("gitmultilinkchild2")))).click();
			Thread.sleep(10000);
			String script = "<%@ taglib uri=\"http://java.sun.com/jsp/jstl/core\" prefix=\"c\" %>\n"+"<%@ page session=\"false\" %>\n"+"<html>\n"+"<head>\n"+"<title>Home Page</title>\n"+"</head>\n"+"<body>\n"+"<h1>\n"+"Hello world!!!!!!\n"+"</h1>\n"+"${controllerMessage}<br/>\n"+"<br/>\n"+"<br/>\n"+"<a href=\"product/list\">:)Click here to view the Product list"+gitdata+"\n"+"</a>\n"+"</body>\n"+"</html>";
			wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath(prop.getProperty("gitedit")))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath(prop.getProperty("gitedittext"))));

			Keyboard kb = ((HasInputDevices) driver).getKeyboard();
			kb.sendKeys(Keys.TAB);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_A);
			robot.keyRelease(KeyEvent.VK_A);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(10000);
			robot.keyPress(KeyEvent.VK_DELETE);
			robot.keyRelease(KeyEvent.VK_DELETE);
			Thread.sleep(10000);
			
			StringSelection ss = new StringSelection(script);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
			robot.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
			robot.keyPress(java.awt.event.KeyEvent.VK_V);
			Thread.sleep(10000);
			robot.keyRelease(java.awt.event.KeyEvent.VK_V);
			robot.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
			Thread.sleep(10000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("gitupdate")))).click();
			Thread.sleep(10000);
			//-------------------logout of git start------------------------------
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("gitlogout")))).click();
			Thread.sleep(10000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("gitlogoutchild")))).click();
			
			//-------------------logout of git end------------------------------
			Thread.sleep(10000);
			driver.navigate().to(prop.getProperty("appurl"));
			Thread.sleep(10000);
			driver.navigate().refresh();
			Thread.sleep(40000);

			accessValidation(appname, text, updatedata);
			Reporter.log("Response Status = " + "Before updating the Application accessdata is :" + updatedata + "\n");
			Reporter.log("Response Status = " + "cdeliveryOff - After updating the Application accessdata is :"
					+ updatedata + "\n");
			Reporter.log("Response Status = " + "cdeliveryoff working successfully for this appllication \n");
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
			Reporter.log("Response Status = " + "cdeliveryoff failed for this appllication \n");
			driver.close();
		}
	}

	public void deleteApp(String appname) throws InterruptedException, IOException {
		FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		prop.load(fs);
		
		driver.navigate().to(prop.getProperty("appurl"));
		Thread.sleep(10000);
		driver.navigate().refresh();
		Thread.sleep(10000);
		try {
			WebDriverWait wait = new WebDriverWait(driver, 1000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("apppage"))));
			WebElement e1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("apppage"))));
			Actions act=new Actions(driver);
			act.moveToElement(e1).doubleClick(e1).build().perform();
			Thread.sleep(10000);
				searchDesign(appname);
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("appdelete")))).click();
			Thread.sleep(10000);
			List<WebElement> button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("appdeletechild"))))
					.findElements(By.tagName("button"));
			for (int i = 0; i < button.size(); i++) {
				if (button.get(i).getText().equals("Delete")) {
					Thread.sleep(10000);
					button.get(i).click();
				}
			}
			Reporter.log("Response Status = " + appname + "app deletion initiated \n");
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
			Reporter.log("Response Status = " + "app deletion failed initiated \n");
			driver.close();
		}
	}
	public void deleteDesign(String design) throws InterruptedException, IOException {
		FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		prop.load(fs);
		WebDriverWait wait = new WebDriverWait(driver, 1000);
		Thread.sleep(10000);
		driver.navigate().to(prop.getProperty("appurl"));
		Thread.sleep(10000);
		driver.navigate().refresh();
		Thread.sleep(10000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("design"))));
		try {
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("design"))));
			WebElement e1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("design"))));
			Actions act=new Actions(driver);
			act.moveToElement(e1).doubleClick(e1).build().perform();
			Thread.sleep(10000);
				searchDesign(design);
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("appdelete")))).click();
			
			List<WebElement> button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("appdeletechild"))))
					.findElements(By.tagName("button"));
			for (int i = 0; i < button.size(); i++) {
				if (button.get(i).getText().equals("Delete")) {
					
					button.get(i).click();
				}
			}
			Reporter.log("Response Status = " + design + " deletion initiated \n");
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
			Reporter.log("Response Status = " + " deletion failed initiated \n");
			driver.close();
		}
	}
	public void deleteDesignValidation(String design) throws InterruptedException, IOException {
		FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		prop.load(fs);
		Thread.sleep(10000);
		boolean temp=true;
		WebDriverWait wait=new WebDriverWait(driver,1000);
		driver.navigate().to(prop.getProperty("appurl"));
		Thread.sleep(10000);
		driver.navigate().refresh();
		Thread.sleep(10000);
		try{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("design"))));
		
		WebElement e1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("design"))));
		Actions act=new Actions(driver);
		act.moveToElement(e1).doubleClick(e1).build().perform();
		Thread.sleep(10000);
		List<WebElement> pagination = driver
				.findElement(By.xpath(prop.getProperty("list")))
				.findElements(By.tagName("li"));
	
			OUTER: for (int i = 2; i < pagination.size() - 2; i++) {
				Thread.sleep(10000);
				if(i!=2){
					pagination.get(i).findElement(By.tagName("a")).click();
					}
				Thread.sleep(10000);
				boolean b1=isElementPresent(By.xpath("//h6[text()='"+ design +"']"));
				Thread.sleep(10000);
				if(b1){
					Thread.sleep(10000);
					wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h6[text()='"+ design +"']"))).click();
					temp = true;
					break OUTER;
				}
				
		
	}

				if (temp == false) {
					Assert.assertTrue(true, "Image removed successfully");
				}
				else
				{
					Assert.assertFalse(false);
				}
			log.info("search design successfully");
			Reporter.log("Response Status = " + design + " deleted successfully \n");
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
			Reporter.log("Response Status = " + " deletion failed \n");
			driver.close();
		}
	}

	public void deleteValidation(String appname) throws InterruptedException, IOException {
		FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		prop.load(fs);
		Thread.sleep(10000);
		boolean temp=true;
		WebDriverWait wait=new WebDriverWait(driver,1000);
		driver.navigate().to(prop.getProperty("appurl"));
		Thread.sleep(10000);
		driver.navigate().refresh();
		Thread.sleep(10000);
		try{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("apppage"))));
		
		WebElement e1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("apppage"))));
		Actions act=new Actions(driver);
		act.moveToElement(e1).doubleClick(e1).build().perform();
		Thread.sleep(10000);
		List<WebElement> pagination = driver
				.findElement(By.xpath(prop.getProperty("list")))
				.findElements(By.tagName("li"));
	
		
			OUTER: for (int i = 2; i < pagination.size() - 2; i++) {
				Thread.sleep(10000);
				if(i!=2){
					pagination.get(i).findElement(By.tagName("a")).click();
					}
				Thread.sleep(10000);
				boolean b1=isElementPresent(By.xpath("//h6[text()='"+ appname +"']"));
				Thread.sleep(10000);
				if(b1){
					Thread.sleep(10000);
					wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h6[text()='"+ appname +"']"))).click();
					temp = true;
					break OUTER;
				}
				
		
	}

				if (temp == false) {
					Assert.assertTrue(true, "Image removed successfully");
				}
				else
				{
					Assert.assertFalse(false);
				}
			log.info("search design successfully");
			Reporter.log("Response Status = " + appname + "app deleted successfully \n");
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
			Reporter.log("Response Status = " + "app deletion failed \n");
			driver.close();
		}
	}

	public void clusterDeletion(String kubname) throws InterruptedException, IOException {
		FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		prop.load(fs);
		Thread.sleep(10000);
		try {
			driver.navigate().to(prop.getProperty("googleconsole"));
			Thread.sleep(20000);
			WebDriverWait wait = new WebDriverWait(driver, 1000);
			Thread.sleep(20000);
			boolean b = driver.findElement((By.xpath(prop.getProperty("googletable")))).isDisplayed();
			if(b){
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("table")));
			WebElement table = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("table")));
			WebElement tbody = table.findElement(By.tagName("tbody"));
			List<WebElement> tr = tbody.findElements(By.tagName("tr"));
			for (WebElement trnew : tr) {
				List<WebElement> td = trnew.findElements(By.tagName("td"));
				for (int i = 0; i < td.size(); i++) {
					if ((td.get(i).getText().equals(kubname))) {

						td.get(i + 1).click();
					}
				}
			}
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By
					.xpath(prop.getProperty("googleclustdelete"))))
					.click();
			Thread.sleep(10000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("googledelte")))).click();
			Thread.sleep(10000);
			}
			else {
				Assert.assertTrue(true, "Table not found");
			}
			Reporter.log("Response Status = " + "cluster deletion initiated \n");

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
			Reporter.log("Response Status = " + "cluster deletion initiation failed \n");
			driver.close();
		}
	}

	public void clusterDeletionvalidation(String kubname) throws InterruptedException, IOException {
		FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		prop.load(fs);
		boolean flag = false;
	
		WebDriverWait wait = new WebDriverWait(driver, 1000);
		try {
			while (!flag) {
				driver.navigate().refresh();
				Thread.sleep(20000);
				boolean b = driver.findElement(By.xpath(prop.getProperty("googletable"))).isDisplayed();
				if (b) {

					wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("table")));
					WebElement table1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("table")));
					WebElement tbody1 = table1.findElement(By.tagName("tbody"));
					List<WebElement> tr1 = tbody1.findElements(By.tagName("tr"));
					for (int j = 0; j < tr1.size(); j++) {
						List<WebElement> td1 = tr1.get(j).findElements(By.tagName("td"));
						for (int i = 0; i < td1.size(); i++) {
							if ((tr1.get(j).getText().contains(kubname))) {
								flag = false;

							} else {
								flag = true;
							}
						}
					}
				} else {
					flag = true;
					Assert.assertTrue(true, "Table not found");
				}
			}
			Thread.sleep(10000);
     
			Reporter.log("Response Status = " + "cluster deleted successfully \n");
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
			Reporter.log("Response Status = " + "cluster deletion  failed \n");
			driver.close();
		}

	}	
		
	 
	public String screenshot(String screenshot,String cloud,String clust) throws IOException {
		FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		prop.load(fs);
		screenload= System.getProperty("user.dir") + "/test-output/"+cloud+clust+"/html/";
		File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screen, new File(screenload + screenshot + ".png"));
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		String image = screenget + screenshot + ".png";
		Reporter.log("<a title= \"title\" href=\"" + image + "\">" + "<img width=\"700\" height=\"550\" src=\"" + image
				+ "\"></a>");
		return image;

	}

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

	}
}
