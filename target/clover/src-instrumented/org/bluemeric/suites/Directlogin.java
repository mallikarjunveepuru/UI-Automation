/* $$ This file has been instrumented by Clover 4.1.1#20151207095404243 $$ */package org.bluemeric.suites;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Directlogin {public static class __CLR4_1_1ececisihn5ma{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_1();if(20151207095404243L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.1#20151207095404243,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0054\u0072\u006f\u0076\u0053\u0061\u0069\u005c\u005c\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u005c\u005c\u0047\u006f\u0070\u0061\u0064\u0064\u006c\u0065\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1472622883817L,8589935092L,539,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
	Suite suite=new Suite();
	WebDriver driver = suite.newDriver();
	Properties prop = new Properties();
    String workspace = System.getProperty("user.dir");
    
    public void login(String cloud) throws InterruptedException, IOException{try{__CLR4_1_1ececisihn5ma.R.inc(516);
    	__CLR4_1_1ececisihn5ma.R.inc(517);FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		__CLR4_1_1ececisihn5ma.R.inc(518);prop.load(fs);
	__CLR4_1_1ececisihn5ma.R.inc(519);driver.get(prop.getProperty("url"));
	__CLR4_1_1ececisihn5ma.R.inc(520);driver.manage().window().maximize();
	//------------------------------start----------------------------
	__CLR4_1_1ececisihn5ma.R.inc(521);Thread.sleep(40000);
	__CLR4_1_1ececisihn5ma.R.inc(522);Alert alert = driver.switchTo().alert();
	__CLR4_1_1ececisihn5ma.R.inc(523);System.out.println(alert.getText());
	__CLR4_1_1ececisihn5ma.R.inc(524);Thread.sleep(10000);
	__CLR4_1_1ececisihn5ma.R.inc(525);alert.sendKeys("redbulll***");
	__CLR4_1_1ececisihn5ma.R.inc(526);Thread.sleep(10000);
	__CLR4_1_1ececisihn5ma.R.inc(527);alert.accept();
	__CLR4_1_1ececisihn5ma.R.inc(528);Thread.sleep(10000);
	__CLR4_1_1ececisihn5ma.R.inc(529);alert.accept();
	//------------------------------end----------------------------
	__CLR4_1_1ececisihn5ma.R.inc(530);WebDriverWait wait=new WebDriverWait(driver,1000);
	__CLR4_1_1ececisihn5ma.R.inc(531);Thread.sleep(10000);
	__CLR4_1_1ececisihn5ma.R.inc(532);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("gopddlesignup")))).click();
	__CLR4_1_1ececisihn5ma.R.inc(533);Thread.sleep(20000);
	__CLR4_1_1ececisihn5ma.R.inc(534);driver.findElement(By.xpath(prop.getProperty("directlogin"))).click();
	__CLR4_1_1ececisihn5ma.R.inc(535);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("directemail")))).sendKeys("sailakshmi.v@trov.co.in");
	__CLR4_1_1ececisihn5ma.R.inc(536);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("directpassword")))).sendKeys("trov-it123");
	__CLR4_1_1ececisihn5ma.R.inc(537);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("directsignin")))).click();
	__CLR4_1_1ececisihn5ma.R.inc(538);Thread.sleep(10000);
    }finally{__CLR4_1_1ececisihn5ma.R.flushNeeded();}}
}
