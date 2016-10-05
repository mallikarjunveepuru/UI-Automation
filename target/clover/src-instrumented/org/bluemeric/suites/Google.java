/* $$ This file has been instrumented by Clover 4.1.1#20151207095404243 $$ */package org.bluemeric.suites;

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

public class Google {public static class __CLR4_1_1ezezisihn5na{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_1();if(20151207095404243L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.1#20151207095404243,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0054\u0072\u006f\u0076\u0053\u0061\u0069\u005c\u005c\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u005c\u005c\u0047\u006f\u0070\u0061\u0064\u0064\u006c\u0065\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1472622883817L,8589935092L,582,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
	Suite suite=new Suite();
	WebDriver driver = suite.newDriver();
	Properties prop = new Properties();
    String workspace = System.getProperty("user.dir");
	public void login(String cloud) throws IOException, InterruptedException {try{__CLR4_1_1ezezisihn5na.R.inc(539);
		__CLR4_1_1ezezisihn5na.R.inc(540);FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		__CLR4_1_1ezezisihn5na.R.inc(541);prop.load(fs);
	__CLR4_1_1ezezisihn5na.R.inc(542);try{
		//Google cloud login code
				//------------------------------start----------------------------
		__CLR4_1_1ezezisihn5na.R.inc(543);driver.get(prop.getProperty("url"));
		__CLR4_1_1ezezisihn5na.R.inc(544);driver.manage().window().maximize();
		 __CLR4_1_1ezezisihn5na.R.inc(545);WebDriverWait wait=new WebDriverWait(driver,200);
			//driver.get("http://stage.gopaddle.io/#/");
			
			//Handling the popup for gopaddle
			
			//------------------------------start----------------------------
			__CLR4_1_1ezezisihn5na.R.inc(546);Thread.sleep(40000);
			__CLR4_1_1ezezisihn5na.R.inc(547);Alert alert = driver.switchTo().alert();
			__CLR4_1_1ezezisihn5na.R.inc(548);System.out.println(alert.getText());
			__CLR4_1_1ezezisihn5na.R.inc(549);Thread.sleep(10000);
			__CLR4_1_1ezezisihn5na.R.inc(550);alert.sendKeys("redbulll***");
			__CLR4_1_1ezezisihn5na.R.inc(551);Thread.sleep(10000);
			__CLR4_1_1ezezisihn5na.R.inc(552);alert.accept();
			__CLR4_1_1ezezisihn5na.R.inc(553);Thread.sleep(10000);
			__CLR4_1_1ezezisihn5na.R.inc(554);alert.accept();
			//------------------------------end----------------------------
			__CLR4_1_1ezezisihn5na.R.inc(555);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("gopddlesignup")))).click();
			__CLR4_1_1ezezisihn5na.R.inc(556);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("connectwithgoogle")))).click();
			__CLR4_1_1ezezisihn5na.R.inc(557);Thread.sleep(10000);//mandatory time because it taking time to idetifying the child window
			__CLR4_1_1ezezisihn5na.R.inc(558);Set<String> allWindowHandles= driver.getWindowHandles();
			__CLR4_1_1ezezisihn5na.R.inc(559);Iterator iterator=allWindowHandles.iterator();
			__CLR4_1_1ezezisihn5na.R.inc(560);String parent=(String) iterator.next();
			__CLR4_1_1ezezisihn5na.R.inc(561);String child=(String) iterator.next();
			
			__CLR4_1_1ezezisihn5na.R.inc(562);driver.switchTo().window(child);
			__CLR4_1_1ezezisihn5na.R.inc(563);wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(prop.getProperty("email")))).sendKeys(prop.getProperty("gmailusername"));
			__CLR4_1_1ezezisihn5na.R.inc(564);wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(prop.getProperty("next")))).click();
			__CLR4_1_1ezezisihn5na.R.inc(565);wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(prop.getProperty("password"))));
			__CLR4_1_1ezezisihn5na.R.inc(566);wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(prop.getProperty("password")))).sendKeys(prop.getProperty("gmailpassword"));
			__CLR4_1_1ezezisihn5na.R.inc(567);boolean check=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("staysignin")))).isSelected();
			
			__CLR4_1_1ezezisihn5na.R.inc(568);if((((check)&&(__CLR4_1_1ezezisihn5na.R.iget(569)!=0|true))||(__CLR4_1_1ezezisihn5na.R.iget(570)==0&false))){{
				__CLR4_1_1ezezisihn5na.R.inc(571);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("staysignin")))).click();
			}
			}__CLR4_1_1ezezisihn5na.R.inc(572);wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(prop.getProperty("signin")))).click();
			__CLR4_1_1ezezisihn5na.R.inc(573);Thread.sleep(20000); //for identifying the allow button
			__CLR4_1_1ezezisihn5na.R.inc(574);wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(prop.getProperty("allow")))).click();
			//------------------------------end----------------------------
			__CLR4_1_1ezezisihn5na.R.inc(575);driver.switchTo().window(parent);
			__CLR4_1_1ezezisihn5na.R.inc(576);Thread.sleep(10000);
	} catch (Exception e) {
		__CLR4_1_1ezezisihn5na.R.inc(577);e.printStackTrace();
		__CLR4_1_1ezezisihn5na.R.inc(578);Assert.fail(e.getMessage());
		__CLR4_1_1ezezisihn5na.R.inc(579);Reporter.log("URL : " + prop.getProperty("url"));
		__CLR4_1_1ezezisihn5na.R.inc(580);Reporter.log("Response Status = " + "Login Failed due to invalid credentials");
		__CLR4_1_1ezezisihn5na.R.inc(581);driver.close();
	}
	}finally{__CLR4_1_1ezezisihn5na.R.flushNeeded();}}
}
