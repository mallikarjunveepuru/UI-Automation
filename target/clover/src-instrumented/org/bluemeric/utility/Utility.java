/* $$ This file has been instrumented by Clover 4.1.1#20151207095404243 $$ */package org.bluemeric.utility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
public class Utility implements ITestListener {public static class __CLR4_1_1k4k4isihn5wy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_1();if(20151207095404243L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.1#20151207095404243,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0054\u0072\u006f\u0076\u0053\u0061\u0069\u005c\u005c\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u005c\u005c\u0047\u006f\u0070\u0061\u0064\u0064\u006c\u0065\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1472622883817L,8589935092L,2528,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
	static String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
	String screenload ;
	String screenget = "";
	Suite suite=new Suite();
	WebDriver driver = suite.newDriver();
	static Logger log = Logger.getLogger(Utility.class);
	Properties prop = new Properties();
    static String workspace = System.getProperty("user.dir");
	
	
	

	public void Addsourcecontrol(String username,String password) throws InterruptedException, IOException {try{__CLR4_1_1k4k4isihn5wy.R.inc(724);
		__CLR4_1_1k4k4isihn5wy.R.inc(725);Thread.sleep(10000);
		__CLR4_1_1k4k4isihn5wy.R.inc(726);FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		__CLR4_1_1k4k4isihn5wy.R.inc(727);prop.load(fs);
		__CLR4_1_1k4k4isihn5wy.R.inc(728);driver.navigate().to(prop.getProperty("appurl"));
		
		__CLR4_1_1k4k4isihn5wy.R.inc(729);try {
			__CLR4_1_1k4k4isihn5wy.R.inc(730);WebDriverWait wait = new WebDriverWait(driver, 1000);
			__CLR4_1_1k4k4isihn5wy.R.inc(731);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(732);wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(prop.getProperty("signout"))))
					.click();
			__CLR4_1_1k4k4isihn5wy.R.inc(733);wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(prop.getProperty("settings"))))
					.click();
			__CLR4_1_1k4k4isihn5wy.R.inc(734);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(735);wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("sourcecontrol"))))
					.click();
			__CLR4_1_1k4k4isihn5wy.R.inc(736);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(737);wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("github"))))
					.click();
			__CLR4_1_1k4k4isihn5wy.R.inc(738);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(739);Set<String> allWindowHandles= driver.getWindowHandles();
			__CLR4_1_1k4k4isihn5wy.R.inc(740);Iterator iterator=allWindowHandles.iterator();
			__CLR4_1_1k4k4isihn5wy.R.inc(741);String parent=(String) iterator.next();
			__CLR4_1_1k4k4isihn5wy.R.inc(742);boolean child=iterator.hasNext();
			__CLR4_1_1k4k4isihn5wy.R.inc(743);if((((child)&&(__CLR4_1_1k4k4isihn5wy.R.iget(744)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(745)==0&false))){{
			__CLR4_1_1k4k4isihn5wy.R.inc(746);String child1=(String) iterator.next();
			__CLR4_1_1k4k4isihn5wy.R.inc(747);driver.switchTo().window(child1);
			}
			}__CLR4_1_1k4k4isihn5wy.R.inc(748);wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(prop.getProperty("githublogin"))))
					.sendKeys(username);
			__CLR4_1_1k4k4isihn5wy.R.inc(749);wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(prop.getProperty("githubpassword"))))
					.sendKeys(password);
			__CLR4_1_1k4k4isihn5wy.R.inc(750);wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(prop.getProperty("githubcommit")))).click();
			__CLR4_1_1k4k4isihn5wy.R.inc(751);boolean b1=isElementPresent(By.xpath(prop.getProperty("gitauthnew")));
			__CLR4_1_1k4k4isihn5wy.R.inc(752);if((((b1)&&(__CLR4_1_1k4k4isihn5wy.R.iget(753)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(754)==0&false))){{
			__CLR4_1_1k4k4isihn5wy.R.inc(755);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("gitauthnew")))).click();
			}
				
			 }__CLR4_1_1k4k4isihn5wy.R.inc(756);driver.switchTo().window(parent);
			 __CLR4_1_1k4k4isihn5wy.R.inc(757);Reporter.log("Response Status = " + "Source control adding initiated \n");
		} catch (Exception e) {
			__CLR4_1_1k4k4isihn5wy.R.inc(758);e.printStackTrace();
			__CLR4_1_1k4k4isihn5wy.R.inc(759);Assert.fail(e.getMessage());
			__CLR4_1_1k4k4isihn5wy.R.inc(760);Reporter.log("Response Status = " + "Source control adding initiated failed\n");
			__CLR4_1_1k4k4isihn5wy.R.inc(761);driver.close();
		}
	}finally{__CLR4_1_1k4k4isihn5wy.R.flushNeeded();}}
	public void Addsourcecontrolgitlab(String username,String password) throws InterruptedException, IOException {try{__CLR4_1_1k4k4isihn5wy.R.inc(762);
		__CLR4_1_1k4k4isihn5wy.R.inc(763);Thread.sleep(10000);
		__CLR4_1_1k4k4isihn5wy.R.inc(764);FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		__CLR4_1_1k4k4isihn5wy.R.inc(765);prop.load(fs);
		__CLR4_1_1k4k4isihn5wy.R.inc(766);driver.navigate().to(prop.getProperty("appurl"));
		
		__CLR4_1_1k4k4isihn5wy.R.inc(767);try {
			__CLR4_1_1k4k4isihn5wy.R.inc(768);WebDriverWait wait = new WebDriverWait(driver, 1000);
			__CLR4_1_1k4k4isihn5wy.R.inc(769);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(770);wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(prop.getProperty("signout"))))
					.click();
			__CLR4_1_1k4k4isihn5wy.R.inc(771);wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(prop.getProperty("settings"))))
					.click();
			__CLR4_1_1k4k4isihn5wy.R.inc(772);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(773);wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("sourcecontrol"))))
					.click();
			__CLR4_1_1k4k4isihn5wy.R.inc(774);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(775);wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("gitlab"))))
					.click();
			__CLR4_1_1k4k4isihn5wy.R.inc(776);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(777);Set<String> allWindowHandles= driver.getWindowHandles();
			__CLR4_1_1k4k4isihn5wy.R.inc(778);Iterator iterator=allWindowHandles.iterator();
			__CLR4_1_1k4k4isihn5wy.R.inc(779);String parent=(String) iterator.next();
			__CLR4_1_1k4k4isihn5wy.R.inc(780);boolean child=iterator.hasNext();
			__CLR4_1_1k4k4isihn5wy.R.inc(781);if((((child)&&(__CLR4_1_1k4k4isihn5wy.R.iget(782)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(783)==0&false))){{
			__CLR4_1_1k4k4isihn5wy.R.inc(784);String child1=(String) iterator.next();
			__CLR4_1_1k4k4isihn5wy.R.inc(785);driver.switchTo().window(child1);
			}
			}__CLR4_1_1k4k4isihn5wy.R.inc(786);wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(prop.getProperty("gitlabuser"))))
					.sendKeys(username);
			__CLR4_1_1k4k4isihn5wy.R.inc(787);wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(prop.getProperty("gitlabpssword"))))
					.sendKeys(password);
			__CLR4_1_1k4k4isihn5wy.R.inc(788);wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(prop.getProperty("gitlabsignin")))).click();
			 __CLR4_1_1k4k4isihn5wy.R.inc(789);driver.switchTo().window(parent);
			 __CLR4_1_1k4k4isihn5wy.R.inc(790);Reporter.log("Response Status = " + "Source control adding initiated \n");
		} catch (Exception e) {
			__CLR4_1_1k4k4isihn5wy.R.inc(791);e.printStackTrace();
			__CLR4_1_1k4k4isihn5wy.R.inc(792);Assert.fail(e.getMessage());
			__CLR4_1_1k4k4isihn5wy.R.inc(793);Reporter.log("Response Status = " + "Source control adding initiated failed\n");
			__CLR4_1_1k4k4isihn5wy.R.inc(794);driver.close();
		}
	}finally{__CLR4_1_1k4k4isihn5wy.R.flushNeeded();}}
	public void Addsourcecontrolvalidation(String username) throws InterruptedException, IOException {try{__CLR4_1_1k4k4isihn5wy.R.inc(795);
		__CLR4_1_1k4k4isihn5wy.R.inc(796);boolean flag = false;
		__CLR4_1_1k4k4isihn5wy.R.inc(797);FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		__CLR4_1_1k4k4isihn5wy.R.inc(798);prop.load(fs);
		__CLR4_1_1k4k4isihn5wy.R.inc(799);WebDriverWait wait = new WebDriverWait(driver, 1000);
		__CLR4_1_1k4k4isihn5wy.R.inc(800);Thread.sleep(10000);
		__CLR4_1_1k4k4isihn5wy.R.inc(801);try {
			__CLR4_1_1k4k4isihn5wy.R.inc(802);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("signout")))).click();
			
			__CLR4_1_1k4k4isihn5wy.R.inc(803);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("settings")))).click();
			__CLR4_1_1k4k4isihn5wy.R.inc(804);while ((((!flag)&&(__CLR4_1_1k4k4isihn5wy.R.iget(805)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(806)==0&false))) {{
			

				__CLR4_1_1k4k4isihn5wy.R.inc(807);driver.navigate().refresh();
				__CLR4_1_1k4k4isihn5wy.R.inc(808);Thread.sleep(10000);
				__CLR4_1_1k4k4isihn5wy.R.inc(809);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("sourcecontrol")))).click();
				__CLR4_1_1k4k4isihn5wy.R.inc(810);Thread.sleep(10000);
				
				__CLR4_1_1k4k4isihn5wy.R.inc(811);wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("table")));
				__CLR4_1_1k4k4isihn5wy.R.inc(812);WebElement table = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("table")));
				__CLR4_1_1k4k4isihn5wy.R.inc(813);WebElement tbody = table.findElement(By.tagName("tbody"));
				__CLR4_1_1k4k4isihn5wy.R.inc(814);List<WebElement> tr = tbody.findElements(By.tagName("tr"));
				__CLR4_1_1k4k4isihn5wy.R.inc(815);Outer: for (int j = 0; (((j < tr.size())&&(__CLR4_1_1k4k4isihn5wy.R.iget(816)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(817)==0&false)); j++) {{
					__CLR4_1_1k4k4isihn5wy.R.inc(818);if ((((tr.get(j).getText().contains(username))&&(__CLR4_1_1k4k4isihn5wy.R.iget(819)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(820)==0&false))) {{
								__CLR4_1_1k4k4isihn5wy.R.inc(821);flag = true;
								__CLR4_1_1k4k4isihn5wy.R.inc(822);break Outer;
							} }else {{
								__CLR4_1_1k4k4isihn5wy.R.inc(823);flag = false;
							}
						}}
			}}
			}__CLR4_1_1k4k4isihn5wy.R.inc(824);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(825);driver.navigate().to(prop.getProperty("giturl"));
			__CLR4_1_1k4k4isihn5wy.R.inc(826);Thread.sleep(10000);
			//-------------------logout of git start------------------------------
			__CLR4_1_1k4k4isihn5wy.R.inc(827);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("gitlogout")))).click();
			__CLR4_1_1k4k4isihn5wy.R.inc(828);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(829);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("gitlogoutchild")))).click();
			
			//-------------------logout of git end------------------------------
			__CLR4_1_1k4k4isihn5wy.R.inc(830);Thread.sleep(20000);
			__CLR4_1_1k4k4isihn5wy.R.inc(831);driver.navigate().to(prop.getProperty("appurl"));
			__CLR4_1_1k4k4isihn5wy.R.inc(832);Thread.sleep(40000);
			__CLR4_1_1k4k4isihn5wy.R.inc(833);Reporter.log(
					"Response Status = " + username + "source control added in portal \n");

		} catch (Exception e) {
			__CLR4_1_1k4k4isihn5wy.R.inc(834);e.printStackTrace();
			__CLR4_1_1k4k4isihn5wy.R.inc(835);Assert.fail(e.getMessage());
			__CLR4_1_1k4k4isihn5wy.R.inc(836);Reporter.log("Response Status = " + "Adding source control failed \n");
			__CLR4_1_1k4k4isihn5wy.R.inc(837);driver.close();
		}
	}finally{__CLR4_1_1k4k4isihn5wy.R.flushNeeded();}}
	public void Addsourcecontrolgitlabvalidation(String username) throws InterruptedException, IOException {try{__CLR4_1_1k4k4isihn5wy.R.inc(838);
		__CLR4_1_1k4k4isihn5wy.R.inc(839);boolean flag = false;
		__CLR4_1_1k4k4isihn5wy.R.inc(840);FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		__CLR4_1_1k4k4isihn5wy.R.inc(841);prop.load(fs);
		__CLR4_1_1k4k4isihn5wy.R.inc(842);WebDriverWait wait = new WebDriverWait(driver, 1000);
		__CLR4_1_1k4k4isihn5wy.R.inc(843);Thread.sleep(10000);
		__CLR4_1_1k4k4isihn5wy.R.inc(844);try {
			__CLR4_1_1k4k4isihn5wy.R.inc(845);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("signout")))).click();
			
			__CLR4_1_1k4k4isihn5wy.R.inc(846);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("settings")))).click();
			__CLR4_1_1k4k4isihn5wy.R.inc(847);while ((((!flag)&&(__CLR4_1_1k4k4isihn5wy.R.iget(848)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(849)==0&false))) {{
			

				__CLR4_1_1k4k4isihn5wy.R.inc(850);driver.navigate().refresh();
				__CLR4_1_1k4k4isihn5wy.R.inc(851);Thread.sleep(10000);
				__CLR4_1_1k4k4isihn5wy.R.inc(852);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("sourcecontrol")))).click();
				__CLR4_1_1k4k4isihn5wy.R.inc(853);Thread.sleep(10000);
				
				__CLR4_1_1k4k4isihn5wy.R.inc(854);wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("table")));
				__CLR4_1_1k4k4isihn5wy.R.inc(855);WebElement table = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("table")));
				__CLR4_1_1k4k4isihn5wy.R.inc(856);WebElement tbody = table.findElement(By.tagName("tbody"));
				__CLR4_1_1k4k4isihn5wy.R.inc(857);List<WebElement> tr = tbody.findElements(By.tagName("tr"));
				__CLR4_1_1k4k4isihn5wy.R.inc(858);Outer: for (int j = 0; (((j < tr.size())&&(__CLR4_1_1k4k4isihn5wy.R.iget(859)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(860)==0&false)); j++) {{
					__CLR4_1_1k4k4isihn5wy.R.inc(861);if ((((tr.get(j).getText().contains(username))&&(__CLR4_1_1k4k4isihn5wy.R.iget(862)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(863)==0&false))) {{
								__CLR4_1_1k4k4isihn5wy.R.inc(864);flag = true;
								__CLR4_1_1k4k4isihn5wy.R.inc(865);break Outer;
							} }else {{
								__CLR4_1_1k4k4isihn5wy.R.inc(866);flag = false;
							}
						}}
			}}
			}__CLR4_1_1k4k4isihn5wy.R.inc(867);Thread.sleep(20000);
			__CLR4_1_1k4k4isihn5wy.R.inc(868);driver.navigate().to(prop.getProperty("appurl"));
			__CLR4_1_1k4k4isihn5wy.R.inc(869);Reporter.log(
					"Response Status = " + username + "source control added in portal \n");

		} catch (Exception e) {
			__CLR4_1_1k4k4isihn5wy.R.inc(870);e.printStackTrace();
			__CLR4_1_1k4k4isihn5wy.R.inc(871);Assert.fail(e.getMessage());
			__CLR4_1_1k4k4isihn5wy.R.inc(872);Reporter.log("Response Status = " + "Adding source control failed \n");
			__CLR4_1_1k4k4isihn5wy.R.inc(873);driver.close();
		}
	}finally{__CLR4_1_1k4k4isihn5wy.R.flushNeeded();}}
	public void createCluster(String kubname) throws InterruptedException, IOException {try{__CLR4_1_1k4k4isihn5wy.R.inc(874);
		__CLR4_1_1k4k4isihn5wy.R.inc(875);FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		__CLR4_1_1k4k4isihn5wy.R.inc(876);prop.load(fs);
		__CLR4_1_1k4k4isihn5wy.R.inc(877);try {
			__CLR4_1_1k4k4isihn5wy.R.inc(878);WebDriverWait wait = new WebDriverWait(driver, 1000);
			__CLR4_1_1k4k4isihn5wy.R.inc(879);wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(prop.getProperty("signout"))))
					.click();
			__CLR4_1_1k4k4isihn5wy.R.inc(880);wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(prop.getProperty("settings"))))
					.click();
			__CLR4_1_1k4k4isihn5wy.R.inc(881);wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("kubernets"))))
					.click();
			__CLR4_1_1k4k4isihn5wy.R.inc(882);wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(prop.getProperty("createkubernets")))).click();
			__CLR4_1_1k4k4isihn5wy.R.inc(883);Thread.sleep(5000);
			__CLR4_1_1k4k4isihn5wy.R.inc(884);wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath(prop.getProperty("kubname"))))
					.sendKeys(kubname);
			__CLR4_1_1k4k4isihn5wy.R.inc(885);wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath(prop.getProperty("disksize"))))
					.sendKeys("100");
			__CLR4_1_1k4k4isihn5wy.R.inc(886);wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath(prop.getProperty("projectid"))))
					.click();
			__CLR4_1_1k4k4isihn5wy.R.inc(887);wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(prop.getProperty("projectidchild"))))
					.click();
			__CLR4_1_1k4k4isihn5wy.R.inc(888);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(889);wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath(prop.getProperty("intialnodecount"))))
					.sendKeys("1");
			__CLR4_1_1k4k4isihn5wy.R.inc(890);wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath(prop.getProperty("machinetype"))))
					.click();
			__CLR4_1_1k4k4isihn5wy.R.inc(891);List<WebElement> ele1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("clustermachine")))).findElements(By.tagName("md-option"));
			   __CLR4_1_1k4k4isihn5wy.R.inc(892);Outer:
			   for(int j=0;(((j<ele1.size())&&(__CLR4_1_1k4k4isihn5wy.R.iget(893)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(894)==0&false));j++){{
				   __CLR4_1_1k4k4isihn5wy.R.inc(895);Robot robot = new Robot();
					__CLR4_1_1k4k4isihn5wy.R.inc(896);robot.keyPress(KeyEvent.VK_PAGE_UP);
					__CLR4_1_1k4k4isihn5wy.R.inc(897);Thread.sleep(3000);
					__CLR4_1_1k4k4isihn5wy.R.inc(898);robot.keyRelease(KeyEvent.VK_PAGE_UP);
			    __CLR4_1_1k4k4isihn5wy.R.inc(899);if((((ele1.get(j).getText().equals("n1-standard-2"))&&(__CLR4_1_1k4k4isihn5wy.R.iget(900)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(901)==0&false))){{
			    	__CLR4_1_1k4k4isihn5wy.R.inc(902);Thread.sleep(3000);
			     __CLR4_1_1k4k4isihn5wy.R.inc(903);ele1.get(j).click();
			     __CLR4_1_1k4k4isihn5wy.R.inc(904);break Outer;
			    }
			   }}
			}__CLR4_1_1k4k4isihn5wy.R.inc(905);wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath(prop.getProperty("zone"))))
					.click();
			__CLR4_1_1k4k4isihn5wy.R.inc(906);List<WebElement> ele2=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("clusterzone")))).findElements(By.tagName("md-option"));
			   __CLR4_1_1k4k4isihn5wy.R.inc(907);Outer:
			   for(int j=0;(((j<ele2.size())&&(__CLR4_1_1k4k4isihn5wy.R.iget(908)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(909)==0&false));j++){{
				   __CLR4_1_1k4k4isihn5wy.R.inc(910);Robot robot = new Robot();
					__CLR4_1_1k4k4isihn5wy.R.inc(911);robot.keyPress(KeyEvent.VK_PAGE_UP);
					__CLR4_1_1k4k4isihn5wy.R.inc(912);Thread.sleep(3000);
					__CLR4_1_1k4k4isihn5wy.R.inc(913);robot.keyRelease(KeyEvent.VK_PAGE_UP);
			    __CLR4_1_1k4k4isihn5wy.R.inc(914);if((((ele2.get(j).getText().equals("asia-east1-a"))&&(__CLR4_1_1k4k4isihn5wy.R.iget(915)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(916)==0&false))){{
			    	__CLR4_1_1k4k4isihn5wy.R.inc(917);Thread.sleep(5000);
			     __CLR4_1_1k4k4isihn5wy.R.inc(918);ele2.get(j).click();
			     __CLR4_1_1k4k4isihn5wy.R.inc(919);break Outer;
			    }
			   }}
			}__CLR4_1_1k4k4isihn5wy.R.inc(920);Thread.sleep(3000);
			__CLR4_1_1k4k4isihn5wy.R.inc(921);wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(prop.getProperty("create"))))
					.click();

			__CLR4_1_1k4k4isihn5wy.R.inc(922);Reporter.log("Response Status = " + kubname + "cluster creation Initiated \n");

		} catch (Exception e) {
			__CLR4_1_1k4k4isihn5wy.R.inc(923);e.printStackTrace();
			__CLR4_1_1k4k4isihn5wy.R.inc(924);Assert.fail(e.getMessage());
			__CLR4_1_1k4k4isihn5wy.R.inc(925);Reporter.log("Response Status = " + "cluster creation failed to Initiate \n");
			__CLR4_1_1k4k4isihn5wy.R.inc(926);driver.close();
		}
	}finally{__CLR4_1_1k4k4isihn5wy.R.flushNeeded();}}

	public void clusterValidation(String kubname) throws InterruptedException, IOException {try{__CLR4_1_1k4k4isihn5wy.R.inc(927);
		__CLR4_1_1k4k4isihn5wy.R.inc(928);boolean flag = false;
		__CLR4_1_1k4k4isihn5wy.R.inc(929);FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		__CLR4_1_1k4k4isihn5wy.R.inc(930);prop.load(fs);
		__CLR4_1_1k4k4isihn5wy.R.inc(931);WebDriverWait wait = new WebDriverWait(driver, 1000);
		__CLR4_1_1k4k4isihn5wy.R.inc(932);try {
			__CLR4_1_1k4k4isihn5wy.R.inc(933);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(934);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("signout")))).click();
			__CLR4_1_1k4k4isihn5wy.R.inc(935);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(936);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("settings")))).click();
			__CLR4_1_1k4k4isihn5wy.R.inc(937);while ((((!flag)&&(__CLR4_1_1k4k4isihn5wy.R.iget(938)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(939)==0&false))) {{
			

				__CLR4_1_1k4k4isihn5wy.R.inc(940);driver.navigate().refresh();
				__CLR4_1_1k4k4isihn5wy.R.inc(941);Thread.sleep(10000);
				__CLR4_1_1k4k4isihn5wy.R.inc(942);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("kubernets")))).click();
				__CLR4_1_1k4k4isihn5wy.R.inc(943);Thread.sleep(10000);
				
				__CLR4_1_1k4k4isihn5wy.R.inc(944);wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("table")));
				__CLR4_1_1k4k4isihn5wy.R.inc(945);WebElement table = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("table")));
				__CLR4_1_1k4k4isihn5wy.R.inc(946);WebElement tbody = table.findElement(By.tagName("tbody"));
				__CLR4_1_1k4k4isihn5wy.R.inc(947);List<WebElement> tr = tbody.findElements(By.tagName("tr"));
				__CLR4_1_1k4k4isihn5wy.R.inc(948);Outer: for (int j = 0; (((j < tr.size())&&(__CLR4_1_1k4k4isihn5wy.R.iget(949)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(950)==0&false)); j++) {{
					__CLR4_1_1k4k4isihn5wy.R.inc(951);List<WebElement> td = tr.get(j).findElements(By.tagName("td"));
					__CLR4_1_1k4k4isihn5wy.R.inc(952);if ((((tr.get(j).getText().contains(kubname))&&(__CLR4_1_1k4k4isihn5wy.R.iget(953)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(954)==0&false))) {{

						__CLR4_1_1k4k4isihn5wy.R.inc(955);for (int i = 0; (((i < td.size())&&(__CLR4_1_1k4k4isihn5wy.R.iget(956)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(957)==0&false)); i++) {{
							__CLR4_1_1k4k4isihn5wy.R.inc(958);System.out.println(td.get(1).getText());
							__CLR4_1_1k4k4isihn5wy.R.inc(959);if (((((td.get(i).getText().contains("Creating")))&&(__CLR4_1_1k4k4isihn5wy.R.iget(960)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(961)==0&false))) {{
								__CLR4_1_1k4k4isihn5wy.R.inc(962);flag = false;
								__CLR4_1_1k4k4isihn5wy.R.inc(963);break Outer;
							}
							}else {__CLR4_1_1k4k4isihn5wy.R.inc(964);if((((!(td.get(1).getText().contains(".")))&&(__CLR4_1_1k4k4isihn5wy.R.iget(965)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(966)==0&false))){{
								__CLR4_1_1k4k4isihn5wy.R.inc(967);System.out.println("empty");
								__CLR4_1_1k4k4isihn5wy.R.inc(968);flag = false;
								__CLR4_1_1k4k4isihn5wy.R.inc(969);break Outer;
							}
								}else {{
							
								__CLR4_1_1k4k4isihn5wy.R.inc(970);flag = true;
							}
						}}}

					}}
				}}
			}}
			}__CLR4_1_1k4k4isihn5wy.R.inc(971);Reporter.log(
					"Response Status = " + kubname + "cluster creation successfully done and listed in the list \n");

		} catch (Exception e) {
			__CLR4_1_1k4k4isihn5wy.R.inc(972);e.printStackTrace();
			__CLR4_1_1k4k4isihn5wy.R.inc(973);Assert.fail(e.getMessage());
			__CLR4_1_1k4k4isihn5wy.R.inc(974);Reporter.log("Response Status = " + "cluster creation failed \n");
			__CLR4_1_1k4k4isihn5wy.R.inc(975);driver.close();
		}
	}finally{__CLR4_1_1k4k4isihn5wy.R.flushNeeded();}}
	public boolean isElementPresent(By by) {try{__CLR4_1_1k4k4isihn5wy.R.inc(976);
	    __CLR4_1_1k4k4isihn5wy.R.inc(977);try {
	    	__CLR4_1_1k4k4isihn5wy.R.inc(978);driver.findElement(by);
	      __CLR4_1_1k4k4isihn5wy.R.inc(979);return true;
	    } catch (org.openqa.selenium.NoSuchElementException e) {
	      __CLR4_1_1k4k4isihn5wy.R.inc(980);return false;
	    }
	}finally{__CLR4_1_1k4k4isihn5wy.R.flushNeeded();}}
	public void searchDesign(String Image) throws InterruptedException, IOException {try{__CLR4_1_1k4k4isihn5wy.R.inc(981);
		__CLR4_1_1k4k4isihn5wy.R.inc(982);FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		__CLR4_1_1k4k4isihn5wy.R.inc(983);prop.load(fs);
		__CLR4_1_1k4k4isihn5wy.R.inc(984);boolean temp = true;
		__CLR4_1_1k4k4isihn5wy.R.inc(985);try{
		__CLR4_1_1k4k4isihn5wy.R.inc(986);WebDriverWait wait = new WebDriverWait(driver,1000);
	
		__CLR4_1_1k4k4isihn5wy.R.inc(987);List<WebElement> pagination = driver
				.findElement(By.xpath(prop.getProperty("list")))
				.findElements(By.tagName("li"));
	
		
			__CLR4_1_1k4k4isihn5wy.R.inc(988);OUTER: for (int i = 2; (((i < pagination.size() - 2)&&(__CLR4_1_1k4k4isihn5wy.R.iget(989)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(990)==0&false)); i++) {{
				__CLR4_1_1k4k4isihn5wy.R.inc(991);Thread.sleep(10000);
				__CLR4_1_1k4k4isihn5wy.R.inc(992);if((((i!=2)&&(__CLR4_1_1k4k4isihn5wy.R.iget(993)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(994)==0&false))){{
					__CLR4_1_1k4k4isihn5wy.R.inc(995);pagination.get(i).findElement(By.tagName("a")).click();
					}
				}__CLR4_1_1k4k4isihn5wy.R.inc(996);Thread.sleep(20000);
				__CLR4_1_1k4k4isihn5wy.R.inc(997);boolean b1=isElementPresent(By.xpath("//h6[text()='"+ Image +"']"));
			
				__CLR4_1_1k4k4isihn5wy.R.inc(998);if((((b1)&&(__CLR4_1_1k4k4isihn5wy.R.iget(999)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1000)==0&false))){{
					__CLR4_1_1k4k4isihn5wy.R.inc(1001);Thread.sleep(10000);
					__CLR4_1_1k4k4isihn5wy.R.inc(1002);wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h6[text()='"+ Image +"']"))).click();
					__CLR4_1_1k4k4isihn5wy.R.inc(1003);temp = false;
					__CLR4_1_1k4k4isihn5wy.R.inc(1004);break OUTER;
				}
				
		
	}}
		}__CLR4_1_1k4k4isihn5wy.R.inc(1005);if ((((temp == true)&&(__CLR4_1_1k4k4isihn5wy.R.iget(1006)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1007)==0&false))) {{
			__CLR4_1_1k4k4isihn5wy.R.inc(1008);Assert.fail(Image + "not found");
		}
		}__CLR4_1_1k4k4isihn5wy.R.inc(1009);log.info("search design successfully");
		__CLR4_1_1k4k4isihn5wy.R.inc(1010);Reporter.log("Response Status = " + Image + " found in the list \n");
		
	} catch (Exception e) {
		__CLR4_1_1k4k4isihn5wy.R.inc(1011);e.printStackTrace();
		__CLR4_1_1k4k4isihn5wy.R.inc(1012);Assert.fail(e.getMessage());
		__CLR4_1_1k4k4isihn5wy.R.inc(1013);Reporter.log("Response Status = " + Image +"failed to found in the list\n");
		__CLR4_1_1k4k4isihn5wy.R.inc(1014);driver.close();
	}
	}finally{__CLR4_1_1k4k4isihn5wy.R.flushNeeded();}}
	public void createdirectCluster(String kubname) throws IOException, InterruptedException{try{__CLR4_1_1k4k4isihn5wy.R.inc(1015);
		__CLR4_1_1k4k4isihn5wy.R.inc(1016);FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		__CLR4_1_1k4k4isihn5wy.R.inc(1017);prop.load(fs);
		__CLR4_1_1k4k4isihn5wy.R.inc(1018);try{
		__CLR4_1_1k4k4isihn5wy.R.inc(1019);WebDriverWait wait=new WebDriverWait(driver,1000);
		__CLR4_1_1k4k4isihn5wy.R.inc(1020);driver.navigate().to(prop.getProperty("googleconsole"));
		__CLR4_1_1k4k4isihn5wy.R.inc(1021);wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(prop.getProperty("email")))).sendKeys(prop.getProperty("gmailusername"));
		__CLR4_1_1k4k4isihn5wy.R.inc(1022);wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(prop.getProperty("next")))).click();
		__CLR4_1_1k4k4isihn5wy.R.inc(1023);wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(prop.getProperty("password"))));
		__CLR4_1_1k4k4isihn5wy.R.inc(1024);wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(prop.getProperty("password")))).sendKeys(prop.getProperty("gmailpassword"));
	
		__CLR4_1_1k4k4isihn5wy.R.inc(1025);boolean check=driver.findElement(By.xpath(prop.getProperty("staysignin"))).isSelected();
		
		__CLR4_1_1k4k4isihn5wy.R.inc(1026);if((((check)&&(__CLR4_1_1k4k4isihn5wy.R.iget(1027)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1028)==0&false))){{
			__CLR4_1_1k4k4isihn5wy.R.inc(1029);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("staysignin")))).click();
		}
		}__CLR4_1_1k4k4isihn5wy.R.inc(1030);wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(prop.getProperty("signin")))).click();
			__CLR4_1_1k4k4isihn5wy.R.inc(1031);Thread.sleep(20000);
		__CLR4_1_1k4k4isihn5wy.R.inc(1032);boolean b1 = driver.findElement(By.xpath(prop.getProperty("googletable"))).isDisplayed();
		__CLR4_1_1k4k4isihn5wy.R.inc(1033);if((((!b1)&&(__CLR4_1_1k4k4isihn5wy.R.iget(1034)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1035)==0&false))){{
		__CLR4_1_1k4k4isihn5wy.R.inc(1036);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("directcluster")))).click();
		}
		}else{{
			__CLR4_1_1k4k4isihn5wy.R.inc(1037);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("googletablechild")))).click();
		}
		}__CLR4_1_1k4k4isihn5wy.R.inc(1038);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("dcname")))).clear();
		__CLR4_1_1k4k4isihn5wy.R.inc(1039);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("dcname")))).sendKeys(kubname);
		__CLR4_1_1k4k4isihn5wy.R.inc(1040);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("dczone")))).click();
		__CLR4_1_1k4k4isihn5wy.R.inc(1041);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("dczonechild")))).click();
		__CLR4_1_1k4k4isihn5wy.R.inc(1042);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("dcmtype")))).click();
		__CLR4_1_1k4k4isihn5wy.R.inc(1043);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("dcmtypechild")))).click();
		__CLR4_1_1k4k4isihn5wy.R.inc(1044);wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(prop.getProperty("dcsizeid")))).clear();
		__CLR4_1_1k4k4isihn5wy.R.inc(1045);wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(prop.getProperty("dcsizeid")))).sendKeys("1");
		__CLR4_1_1k4k4isihn5wy.R.inc(1046);Thread.sleep(20000);
		__CLR4_1_1k4k4isihn5wy.R.inc(1047);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("dccreate")))).click();
		__CLR4_1_1k4k4isihn5wy.R.inc(1048);Thread.sleep(10000);
		__CLR4_1_1k4k4isihn5wy.R.inc(1049);boolean flag=false;
		__CLR4_1_1k4k4isihn5wy.R.inc(1050);while ((((!flag)&&(__CLR4_1_1k4k4isihn5wy.R.iget(1051)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1052)==0&false))) {{
			__CLR4_1_1k4k4isihn5wy.R.inc(1053);driver.navigate().refresh();
			__CLR4_1_1k4k4isihn5wy.R.inc(1054);Thread.sleep(20000);
			__CLR4_1_1k4k4isihn5wy.R.inc(1055);boolean b = driver.findElement(By.xpath(prop.getProperty("googletable"))).isDisplayed();
			__CLR4_1_1k4k4isihn5wy.R.inc(1056);if ((((!b)&&(__CLR4_1_1k4k4isihn5wy.R.iget(1057)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1058)==0&false))) {{

				__CLR4_1_1k4k4isihn5wy.R.inc(1059);wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("table")));
				__CLR4_1_1k4k4isihn5wy.R.inc(1060);WebElement table1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("table")));
				__CLR4_1_1k4k4isihn5wy.R.inc(1061);WebElement tbody1 = table1.findElement(By.tagName("tbody"));
				__CLR4_1_1k4k4isihn5wy.R.inc(1062);List<WebElement> tr1 = tbody1.findElements(By.tagName("tr"));
				__CLR4_1_1k4k4isihn5wy.R.inc(1063);outer:
				for (int j = 0; (((j < tr1.size())&&(__CLR4_1_1k4k4isihn5wy.R.iget(1064)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1065)==0&false)); j++) {{
					__CLR4_1_1k4k4isihn5wy.R.inc(1066);List<WebElement> td1 = tr1.get(j).findElements(By.tagName("td"));
					__CLR4_1_1k4k4isihn5wy.R.inc(1067);for (int i = 0; (((i < td1.size())&&(__CLR4_1_1k4k4isihn5wy.R.iget(1068)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1069)==0&false)); i++) {{
						__CLR4_1_1k4k4isihn5wy.R.inc(1070);if (((((tr1.get(j).getText().contains(kubname)))&&(__CLR4_1_1k4k4isihn5wy.R.iget(1071)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1072)==0&false))) {{
							__CLR4_1_1k4k4isihn5wy.R.inc(1073);if((((td1.get(i).getText().contains("2 vCPUs"))&&(__CLR4_1_1k4k4isihn5wy.R.iget(1074)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1075)==0&false))){{
								__CLR4_1_1k4k4isihn5wy.R.inc(1076);flag=true;
							__CLR4_1_1k4k4isihn5wy.R.inc(1077);break outer;
							}
							}else
							{{
								__CLR4_1_1k4k4isihn5wy.R.inc(1078);flag=false;
							}
					}}
				}}
			}}
		}}
		}}
		}__CLR4_1_1k4k4isihn5wy.R.inc(1079);Reporter.log("Response Status = " + "cluster creation Initiated \n");
	} catch (Exception e) {
		__CLR4_1_1k4k4isihn5wy.R.inc(1080);e.printStackTrace();
		__CLR4_1_1k4k4isihn5wy.R.inc(1081);Assert.fail(e.getMessage());
		__CLR4_1_1k4k4isihn5wy.R.inc(1082);Reporter.log("Response Status = " + "cluster creation Initiation failed \n");
		__CLR4_1_1k4k4isihn5wy.R.inc(1083);driver.close();
	}
		
	}finally{__CLR4_1_1k4k4isihn5wy.R.flushNeeded();}}
	public void clusterRegistration(String kubname) throws InterruptedException, IOException{try{__CLR4_1_1k4k4isihn5wy.R.inc(1084);
		__CLR4_1_1k4k4isihn5wy.R.inc(1085);FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		__CLR4_1_1k4k4isihn5wy.R.inc(1086);prop.load(fs);
	__CLR4_1_1k4k4isihn5wy.R.inc(1087);try{
		__CLR4_1_1k4k4isihn5wy.R.inc(1088);driver.navigate().to(prop.getProperty("googleconsole"));
		__CLR4_1_1k4k4isihn5wy.R.inc(1089);Thread.sleep(10000);
		__CLR4_1_1k4k4isihn5wy.R.inc(1090);WebDriverWait wait = new WebDriverWait(driver, 1000);
		__CLR4_1_1k4k4isihn5wy.R.inc(1091);wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("table")));
		__CLR4_1_1k4k4isihn5wy.R.inc(1092);WebElement table = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("table")));
		__CLR4_1_1k4k4isihn5wy.R.inc(1093);WebElement tbody = table.findElement(By.tagName("tbody"));
		__CLR4_1_1k4k4isihn5wy.R.inc(1094);List<WebElement> tr = tbody.findElements(By.tagName("tr"));
		__CLR4_1_1k4k4isihn5wy.R.inc(1095);OUTER :
			for (int j = 0; (((j < tr.size())&&(__CLR4_1_1k4k4isihn5wy.R.iget(1096)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1097)==0&false)); j++) {{
			__CLR4_1_1k4k4isihn5wy.R.inc(1098);List<WebElement> td = tr.get(j).findElements(By.tagName("td"));
			__CLR4_1_1k4k4isihn5wy.R.inc(1099);if(((((tr.get(j).getText().contains(kubname)))&&(__CLR4_1_1k4k4isihn5wy.R.iget(1100)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1101)==0&false))){{
			__CLR4_1_1k4k4isihn5wy.R.inc(1102);for (int i = 0; (((i < td.size())&&(__CLR4_1_1k4k4isihn5wy.R.iget(1103)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1104)==0&false)); i++) {{
				__CLR4_1_1k4k4isihn5wy.R.inc(1105);if (((((td.get(i).getText().equals(kubname)))&&(__CLR4_1_1k4k4isihn5wy.R.iget(1106)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1107)==0&false))) {{
					__CLR4_1_1k4k4isihn5wy.R.inc(1108);td.get(i).click();
					__CLR4_1_1k4k4isihn5wy.R.inc(1109);Thread.sleep(10000);
					__CLR4_1_1k4k4isihn5wy.R.inc(1110);break OUTER;
				}
			}}
			}}
		}}			
			}__CLR4_1_1k4k4isihn5wy.R.inc(1111);List<WebElement> sel=driver.findElements(By.xpath(prop.getProperty("googleitem1")));
			__CLR4_1_1k4k4isihn5wy.R.inc(1112);for(int k=0;(((k<sel.size())&&(__CLR4_1_1k4k4isihn5wy.R.iget(1113)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1114)==0&false));k++){{
			}
			}__CLR4_1_1k4k4isihn5wy.R.inc(1115);String val = sel.get(1).getText();
			__CLR4_1_1k4k4isihn5wy.R.inc(1116);String[] val1 = val.split("\n");
			__CLR4_1_1k4k4isihn5wy.R.inc(1117);String ip=val1[1];
			__CLR4_1_1k4k4isihn5wy.R.inc(1118);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("googleitem2")))).isDisplayed();
			__CLR4_1_1k4k4isihn5wy.R.inc(1119);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("googleitem2")))).click();
			__CLR4_1_1k4k4isihn5wy.R.inc(1120);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(1121);List<WebElement> cre=driver.findElements(By.xpath(prop.getProperty("googleitem3")));
			__CLR4_1_1k4k4isihn5wy.R.inc(1122);for(int l=0;(((l<cre.size())&&(__CLR4_1_1k4k4isihn5wy.R.iget(1123)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1124)==0&false));l++){{
			}
			}__CLR4_1_1k4k4isihn5wy.R.inc(1125);String username="admin";
			__CLR4_1_1k4k4isihn5wy.R.inc(1126);String password=cre.get(cre.size()-1).getText();
			__CLR4_1_1k4k4isihn5wy.R.inc(1127);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(1128);Keyboard kb = ((HasInputDevices) driver).getKeyboard();
			__CLR4_1_1k4k4isihn5wy.R.inc(1129);kb.sendKeys(Keys.ENTER);
			__CLR4_1_1k4k4isihn5wy.R.inc(1130);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(1131);driver.navigate().to(prop.getProperty("appurl"));
			
			__CLR4_1_1k4k4isihn5wy.R.inc(1132);wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(prop.getProperty("signout"))))
					.click();
			__CLR4_1_1k4k4isihn5wy.R.inc(1133);wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(prop.getProperty("settings"))))
					.click();
			__CLR4_1_1k4k4isihn5wy.R.inc(1134);wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("kubernets"))))
					.click();
			__CLR4_1_1k4k4isihn5wy.R.inc(1135);wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(prop.getProperty("registerkubernets")))).click();
		
			__CLR4_1_1k4k4isihn5wy.R.inc(1136);wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath(prop.getProperty("rkubname"))))
					.sendKeys(kubname);
			
			__CLR4_1_1k4k4isihn5wy.R.inc(1137);wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath(prop.getProperty("rport"))))
					.sendKeys("443");
			__CLR4_1_1k4k4isihn5wy.R.inc(1138);wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath(prop.getProperty("rip"))))
					.sendKeys(ip);
			__CLR4_1_1k4k4isihn5wy.R.inc(1139);wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(prop.getProperty("rusername"))))
					.sendKeys(username);
			__CLR4_1_1k4k4isihn5wy.R.inc(1140);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(1141);wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath(prop.getProperty("rpassword"))))
					.sendKeys(password);
		
			__CLR4_1_1k4k4isihn5wy.R.inc(1142);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("rregister")))).click();
			__CLR4_1_1k4k4isihn5wy.R.inc(1143);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(1144);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("signout")))).click();
		
			__CLR4_1_1k4k4isihn5wy.R.inc(1145);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("settings")))).click();
			__CLR4_1_1k4k4isihn5wy.R.inc(1146);boolean flag1=false;
			__CLR4_1_1k4k4isihn5wy.R.inc(1147);while ((((!flag1)&&(__CLR4_1_1k4k4isihn5wy.R.iget(1148)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1149)==0&false))) {{
			

				__CLR4_1_1k4k4isihn5wy.R.inc(1150);driver.navigate().refresh();
				__CLR4_1_1k4k4isihn5wy.R.inc(1151);Thread.sleep(10000);
				__CLR4_1_1k4k4isihn5wy.R.inc(1152);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("kubernets")))).click();
				__CLR4_1_1k4k4isihn5wy.R.inc(1153);Thread.sleep(10000);
				__CLR4_1_1k4k4isihn5wy.R.inc(1154);wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("table")));
				__CLR4_1_1k4k4isihn5wy.R.inc(1155);WebElement table1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("table")));
				__CLR4_1_1k4k4isihn5wy.R.inc(1156);WebElement tbody1 = table1.findElement(By.tagName("tbody"));
				__CLR4_1_1k4k4isihn5wy.R.inc(1157);List<WebElement> tr1 = tbody1.findElements(By.tagName("tr"));
				__CLR4_1_1k4k4isihn5wy.R.inc(1158);Outer: for (int j = 0; (((j < tr1.size())&&(__CLR4_1_1k4k4isihn5wy.R.iget(1159)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1160)==0&false)); j++) {{
					__CLR4_1_1k4k4isihn5wy.R.inc(1161);if ((((tr1.get(j).getText().contains(kubname))&&(__CLR4_1_1k4k4isihn5wy.R.iget(1162)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1163)==0&false))) {{
								__CLR4_1_1k4k4isihn5wy.R.inc(1164);flag1 = true;
								__CLR4_1_1k4k4isihn5wy.R.inc(1165);break Outer;
							} }else {{
								__CLR4_1_1k4k4isihn5wy.R.inc(1166);flag1 = false;
							}
						}}
			}}
			}__CLR4_1_1k4k4isihn5wy.R.inc(1167);Reporter.log("Response Status = " + "cluster Registration done successfully \n");
	} catch (Exception e) {
		   __CLR4_1_1k4k4isihn5wy.R.inc(1168);e.printStackTrace();
		   __CLR4_1_1k4k4isihn5wy.R.inc(1169);Assert.fail(e.getMessage());
		   __CLR4_1_1k4k4isihn5wy.R.inc(1170);Reporter.log("Response Status = " + "cluster Registration failed \n");
		   __CLR4_1_1k4k4isihn5wy.R.inc(1171);driver.close();
		  }
	}finally{__CLR4_1_1k4k4isihn5wy.R.flushNeeded();}}
	public void swarmCreation(String kubname) throws InterruptedException, IOException{try{__CLR4_1_1k4k4isihn5wy.R.inc(1172);
		__CLR4_1_1k4k4isihn5wy.R.inc(1173);FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		__CLR4_1_1k4k4isihn5wy.R.inc(1174);prop.load(fs);
		__CLR4_1_1k4k4isihn5wy.R.inc(1175);driver.navigate().to(prop.getProperty("appurl"));
		
		__CLR4_1_1k4k4isihn5wy.R.inc(1176);try {
			__CLR4_1_1k4k4isihn5wy.R.inc(1177);WebDriverWait wait = new WebDriverWait(driver, 1000);
			__CLR4_1_1k4k4isihn5wy.R.inc(1178);wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(prop.getProperty("signout"))))
					.click();
			__CLR4_1_1k4k4isihn5wy.R.inc(1179);wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(prop.getProperty("settings"))))
					.click();
			__CLR4_1_1k4k4isihn5wy.R.inc(1180);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(1181);wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("kubernets"))))
					.click();
			__CLR4_1_1k4k4isihn5wy.R.inc(1182);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(1183);wait.until(ExpectedConditions
				     .visibilityOfElementLocated(By.xpath(prop.getProperty("createSwarm")))).click();
			__CLR4_1_1k4k4isihn5wy.R.inc(1184);Thread.sleep(10000);	 
			__CLR4_1_1k4k4isihn5wy.R.inc(1185);wait.until(ExpectedConditions.visibilityOfElementLocated(
				     By.xpath(prop.getProperty("kubname"))))
				     .sendKeys(kubname);
				   __CLR4_1_1k4k4isihn5wy.R.inc(1186);Thread.sleep(10000);
				   __CLR4_1_1k4k4isihn5wy.R.inc(1187);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("azurelocation")))).click();
				   __CLR4_1_1k4k4isihn5wy.R.inc(1188);List<WebElement> ele=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("azurelocationchild")))).findElements(By.tagName("md-option"));
				   __CLR4_1_1k4k4isihn5wy.R.inc(1189);for(int i=0;(((i<ele.size())&&(__CLR4_1_1k4k4isihn5wy.R.iget(1190)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1191)==0&false));i++){{
					   __CLR4_1_1k4k4isihn5wy.R.inc(1192);Robot robot = new Robot();
						
						__CLR4_1_1k4k4isihn5wy.R.inc(1193);robot.keyPress(KeyEvent.VK_PAGE_UP);
						__CLR4_1_1k4k4isihn5wy.R.inc(1194);Thread.sleep(3000);
						__CLR4_1_1k4k4isihn5wy.R.inc(1195);robot.keyRelease(KeyEvent.VK_PAGE_UP);
				    __CLR4_1_1k4k4isihn5wy.R.inc(1196);if((((ele.get(i).getText().equals("West Europe"))&&(__CLR4_1_1k4k4isihn5wy.R.iget(1197)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1198)==0&false))){{
				     __CLR4_1_1k4k4isihn5wy.R.inc(1199);ele.get(i).click();
				     __CLR4_1_1k4k4isihn5wy.R.inc(1200);break;
				    }
				   }}
				   }__CLR4_1_1k4k4isihn5wy.R.inc(1201);Thread.sleep(3000);
				   __CLR4_1_1k4k4isihn5wy.R.inc(1202);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("swarmmastercount")))).sendKeys("1");
				   __CLR4_1_1k4k4isihn5wy.R.inc(1203);Thread.sleep(3000);
				   __CLR4_1_1k4k4isihn5wy.R.inc(1204);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("swarmnodecount")))).sendKeys("2");  
				   __CLR4_1_1k4k4isihn5wy.R.inc(1205);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("subscription")))).click();
					   __CLR4_1_1k4k4isihn5wy.R.inc(1206);List<WebElement> ele2=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("subscriptionchild")))).findElements(By.tagName("md-option"));
					  
					   __CLR4_1_1k4k4isihn5wy.R.inc(1207);for(int i=0;(((i<ele2.size())&&(__CLR4_1_1k4k4isihn5wy.R.iget(1208)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1209)==0&false));i++){{
						   __CLR4_1_1k4k4isihn5wy.R.inc(1210);Robot robot = new Robot();
							
							__CLR4_1_1k4k4isihn5wy.R.inc(1211);robot.keyPress(KeyEvent.VK_PAGE_UP);
							__CLR4_1_1k4k4isihn5wy.R.inc(1212);Thread.sleep(3000);
							__CLR4_1_1k4k4isihn5wy.R.inc(1213);robot.keyRelease(KeyEvent.VK_PAGE_UP);
					    __CLR4_1_1k4k4isihn5wy.R.inc(1214);if((((ele2.get(i).getText().equals("6482214a-60a0-463a-96c0-b73c93748fd7"))&&(__CLR4_1_1k4k4isihn5wy.R.iget(1215)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1216)==0&false))){{
					     __CLR4_1_1k4k4isihn5wy.R.inc(1217);ele2.get(i).click();
					     __CLR4_1_1k4k4isihn5wy.R.inc(1218);break;
					    }
					   }}
				   }__CLR4_1_1k4k4isihn5wy.R.inc(1219);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("azuremachinetype")))).click();
				   __CLR4_1_1k4k4isihn5wy.R.inc(1220);List<WebElement> ele1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("azuremachinetypechild")))).findElements(By.tagName("md-option"));
				   __CLR4_1_1k4k4isihn5wy.R.inc(1221);Outer:
				   for(int j=0;(((j<ele1.size())&&(__CLR4_1_1k4k4isihn5wy.R.iget(1222)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1223)==0&false));j++){{
					   __CLR4_1_1k4k4isihn5wy.R.inc(1224);Robot robot = new Robot();
					
						__CLR4_1_1k4k4isihn5wy.R.inc(1225);robot.keyPress(KeyEvent.VK_PAGE_UP);
						__CLR4_1_1k4k4isihn5wy.R.inc(1226);Thread.sleep(3000);
						__CLR4_1_1k4k4isihn5wy.R.inc(1227);robot.keyRelease(KeyEvent.VK_PAGE_UP);
				    __CLR4_1_1k4k4isihn5wy.R.inc(1228);if((((ele1.get(j).getText().equals("Standard_DS2"))&&(__CLR4_1_1k4k4isihn5wy.R.iget(1229)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1230)==0&false))){{
				     __CLR4_1_1k4k4isihn5wy.R.inc(1231);ele1.get(j).click();
				     __CLR4_1_1k4k4isihn5wy.R.inc(1232);break Outer;
				    }
				   }}
				   }__CLR4_1_1k4k4isihn5wy.R.inc(1233);Thread.sleep(3000);
				   __CLR4_1_1k4k4isihn5wy.R.inc(1234);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("azurecreate")))).click();
				   __CLR4_1_1k4k4isihn5wy.R.inc(1235);Thread.sleep(10000);
		} catch (Exception e) {
		 __CLR4_1_1k4k4isihn5wy.R.inc(1236);e.printStackTrace();
		   __CLR4_1_1k4k4isihn5wy.R.inc(1237);Assert.fail(e.getMessage());
		   __CLR4_1_1k4k4isihn5wy.R.inc(1238);Reporter.log("Response Status = " + "cluster creation failed to Initiate \n");
		   __CLR4_1_1k4k4isihn5wy.R.inc(1239);driver.close();
		}

	}finally{__CLR4_1_1k4k4isihn5wy.R.flushNeeded();}}
	public void createAzureCluster(String kubname) throws InterruptedException, IOException {try{__CLR4_1_1k4k4isihn5wy.R.inc(1240);
		__CLR4_1_1k4k4isihn5wy.R.inc(1241);FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		__CLR4_1_1k4k4isihn5wy.R.inc(1242);prop.load(fs);
		  __CLR4_1_1k4k4isihn5wy.R.inc(1243);try {
		   __CLR4_1_1k4k4isihn5wy.R.inc(1244);WebDriverWait wait = new WebDriverWait(driver, 1000);
		   __CLR4_1_1k4k4isihn5wy.R.inc(1245);wait.until(ExpectedConditions
		     .visibilityOfElementLocated(By.xpath(prop.getProperty("signout"))))
		     .click();
		   __CLR4_1_1k4k4isihn5wy.R.inc(1246);wait.until(ExpectedConditions
		     .visibilityOfElementLocated(By.xpath(prop.getProperty("settings"))))
		     .click();
		   __CLR4_1_1k4k4isihn5wy.R.inc(1247);wait.until(
		     ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("kubernets"))))
		     .click();
		   __CLR4_1_1k4k4isihn5wy.R.inc(1248);wait.until(ExpectedConditions
		     .visibilityOfElementLocated(By.xpath(prop.getProperty("createkubernets")))).click();
		  __CLR4_1_1k4k4isihn5wy.R.inc(1249);Thread.sleep(10000);
		   __CLR4_1_1k4k4isihn5wy.R.inc(1250);wait.until(ExpectedConditions.visibilityOfElementLocated(
		     By.xpath(prop.getProperty("kubname"))))
		     .sendKeys(kubname);
		   __CLR4_1_1k4k4isihn5wy.R.inc(1251);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("azurelocation")))).click();
		   __CLR4_1_1k4k4isihn5wy.R.inc(1252);List<WebElement> ele=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("azurelocationchild")))).findElements(By.tagName("md-option"));
		   __CLR4_1_1k4k4isihn5wy.R.inc(1253);for(int i=0;(((i<ele.size())&&(__CLR4_1_1k4k4isihn5wy.R.iget(1254)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1255)==0&false));i++){{
			   __CLR4_1_1k4k4isihn5wy.R.inc(1256);Robot robot = new Robot();
				
				__CLR4_1_1k4k4isihn5wy.R.inc(1257);robot.keyPress(KeyEvent.VK_PAGE_UP);
				__CLR4_1_1k4k4isihn5wy.R.inc(1258);Thread.sleep(3000);
				__CLR4_1_1k4k4isihn5wy.R.inc(1259);robot.keyRelease(KeyEvent.VK_PAGE_UP);
		    __CLR4_1_1k4k4isihn5wy.R.inc(1260);if((((ele.get(i).getText().equals("West Europe"))&&(__CLR4_1_1k4k4isihn5wy.R.iget(1261)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1262)==0&false))){{
		     __CLR4_1_1k4k4isihn5wy.R.inc(1263);ele.get(i).click();
		     __CLR4_1_1k4k4isihn5wy.R.inc(1264);break;
		    }
		   }}
		  
		   }__CLR4_1_1k4k4isihn5wy.R.inc(1265);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("azurenodecount")))).sendKeys("2");
			  __CLR4_1_1k4k4isihn5wy.R.inc(1266);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("subscription")))).click();
			   __CLR4_1_1k4k4isihn5wy.R.inc(1267);List<WebElement> ele2=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("subscriptionchild")))).findElements(By.tagName("md-option"));
			  
			   __CLR4_1_1k4k4isihn5wy.R.inc(1268);for(int i=0;(((i<ele2.size())&&(__CLR4_1_1k4k4isihn5wy.R.iget(1269)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1270)==0&false));i++){{
				   __CLR4_1_1k4k4isihn5wy.R.inc(1271);Robot robot = new Robot();
					
					__CLR4_1_1k4k4isihn5wy.R.inc(1272);robot.keyPress(KeyEvent.VK_PAGE_UP);
					__CLR4_1_1k4k4isihn5wy.R.inc(1273);Thread.sleep(3000);
					__CLR4_1_1k4k4isihn5wy.R.inc(1274);robot.keyRelease(KeyEvent.VK_PAGE_UP);
			    __CLR4_1_1k4k4isihn5wy.R.inc(1275);if((((ele2.get(i).getText().equals("6482214a-60a0-463a-96c0-b73c93748fd7"))&&(__CLR4_1_1k4k4isihn5wy.R.iget(1276)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1277)==0&false))){{
			     __CLR4_1_1k4k4isihn5wy.R.inc(1278);ele2.get(i).click();
			     __CLR4_1_1k4k4isihn5wy.R.inc(1279);break;
			    }
			   }}
		   }__CLR4_1_1k4k4isihn5wy.R.inc(1280);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("azuremachinetype")))).click();
		   __CLR4_1_1k4k4isihn5wy.R.inc(1281);List<WebElement> ele1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("azuremachinetypechild")))).findElements(By.tagName("md-option"));
		   __CLR4_1_1k4k4isihn5wy.R.inc(1282);Outer:
		   for(int j=0;(((j<ele1.size())&&(__CLR4_1_1k4k4isihn5wy.R.iget(1283)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1284)==0&false));j++){{
			   __CLR4_1_1k4k4isihn5wy.R.inc(1285);Robot robot = new Robot();
			
				__CLR4_1_1k4k4isihn5wy.R.inc(1286);robot.keyPress(KeyEvent.VK_PAGE_UP);
				__CLR4_1_1k4k4isihn5wy.R.inc(1287);Thread.sleep(3000);
				__CLR4_1_1k4k4isihn5wy.R.inc(1288);robot.keyRelease(KeyEvent.VK_PAGE_UP);
		    __CLR4_1_1k4k4isihn5wy.R.inc(1289);if((((ele1.get(j).getText().equals("Standard_DS2"))&&(__CLR4_1_1k4k4isihn5wy.R.iget(1290)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1291)==0&false))){{
		     __CLR4_1_1k4k4isihn5wy.R.inc(1292);ele1.get(j).click();
		     __CLR4_1_1k4k4isihn5wy.R.inc(1293);break Outer;
		    }
		   }}
		   }__CLR4_1_1k4k4isihn5wy.R.inc(1294);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("azurecreate")))).click();
		   __CLR4_1_1k4k4isihn5wy.R.inc(1295);Thread.sleep(10000);
		   __CLR4_1_1k4k4isihn5wy.R.inc(1296);Reporter.log("Response Status = " + kubname + "cluster creation Initiated \n");

		  } catch (Exception e) {
		   __CLR4_1_1k4k4isihn5wy.R.inc(1297);e.printStackTrace();
		   __CLR4_1_1k4k4isihn5wy.R.inc(1298);Assert.fail(e.getMessage());
		   __CLR4_1_1k4k4isihn5wy.R.inc(1299);Reporter.log("Response Status = " + "cluster creation failed to Initiate \n");
		   __CLR4_1_1k4k4isihn5wy.R.inc(1300);driver.close();
		  }
		 }finally{__CLR4_1_1k4k4isihn5wy.R.flushNeeded();}}
	public void directClusterDeletion(String kubname) throws InterruptedException, IOException {try{__CLR4_1_1k4k4isihn5wy.R.inc(1301);
		__CLR4_1_1k4k4isihn5wy.R.inc(1302);FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		__CLR4_1_1k4k4isihn5wy.R.inc(1303);prop.load(fs);
		__CLR4_1_1k4k4isihn5wy.R.inc(1304);WebDriverWait wait = new WebDriverWait(driver, 1000);
		__CLR4_1_1k4k4isihn5wy.R.inc(1305);try {
			__CLR4_1_1k4k4isihn5wy.R.inc(1306);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("signout")))).click();
		
			__CLR4_1_1k4k4isihn5wy.R.inc(1307);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("settings")))).click();
			

				__CLR4_1_1k4k4isihn5wy.R.inc(1308);driver.navigate().refresh();
			__CLR4_1_1k4k4isihn5wy.R.inc(1309);Thread.sleep(10000);
				__CLR4_1_1k4k4isihn5wy.R.inc(1310);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("kubernets")))).click();
				__CLR4_1_1k4k4isihn5wy.R.inc(1311);Thread.sleep(10000);
				
				__CLR4_1_1k4k4isihn5wy.R.inc(1312);wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("table")));
				__CLR4_1_1k4k4isihn5wy.R.inc(1313);WebElement table = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("table")));
				__CLR4_1_1k4k4isihn5wy.R.inc(1314);WebElement tbody = table.findElement(By.tagName("tbody"));
				__CLR4_1_1k4k4isihn5wy.R.inc(1315);List<WebElement> tr = tbody.findElements(By.tagName("tr"));
				 __CLR4_1_1k4k4isihn5wy.R.inc(1316);for (int j = 0; (((j < tr.size())&&(__CLR4_1_1k4k4isihn5wy.R.iget(1317)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1318)==0&false)); j++) {{
					__CLR4_1_1k4k4isihn5wy.R.inc(1319);List<WebElement> td = tr.get(j).findElements(By.tagName("td"));
					__CLR4_1_1k4k4isihn5wy.R.inc(1320);if ((((tr.get(j).getText().contains(kubname))&&(__CLR4_1_1k4k4isihn5wy.R.iget(1321)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1322)==0&false))) {{
						__CLR4_1_1k4k4isihn5wy.R.inc(1323);Thread.sleep(10000);
						__CLR4_1_1k4k4isihn5wy.R.inc(1324);System.out.println("//tr["+(j+1)+"]/td[5]/a[@uib-tooltip='delete']");
						__CLR4_1_1k4k4isihn5wy.R.inc(1325);driver.findElement(By.xpath("//tr["+(j+1)+"]/td[5]/a[@uib-tooltip='delete']")).click();
					
						}
					}}
				 }__CLR4_1_1k4k4isihn5wy.R.inc(1326);Thread.sleep(10000);
				 __CLR4_1_1k4k4isihn5wy.R.inc(1327);List<WebElement> button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("appdeletechild"))))
							.findElements(By.tagName("button"));
					__CLR4_1_1k4k4isihn5wy.R.inc(1328);for (int i = 0; (((i < button.size())&&(__CLR4_1_1k4k4isihn5wy.R.iget(1329)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1330)==0&false)); i++) {{
						__CLR4_1_1k4k4isihn5wy.R.inc(1331);if ((((button.get(i).getText().equals("Delete"))&&(__CLR4_1_1k4k4isihn5wy.R.iget(1332)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1333)==0&false))) {{
							__CLR4_1_1k4k4isihn5wy.R.inc(1334);Thread.sleep(10000);
							__CLR4_1_1k4k4isihn5wy.R.inc(1335);button.get(i).click();
						}
					}}
		
			}__CLR4_1_1k4k4isihn5wy.R.inc(1336);boolean flag = false;
			__CLR4_1_1k4k4isihn5wy.R.inc(1337);Thread.sleep(10000);
				__CLR4_1_1k4k4isihn5wy.R.inc(1338);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("signout")))).click();
				__CLR4_1_1k4k4isihn5wy.R.inc(1339);Thread.sleep(10000);
				__CLR4_1_1k4k4isihn5wy.R.inc(1340);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("settings")))).click();
				__CLR4_1_1k4k4isihn5wy.R.inc(1341);while ((((!flag)&&(__CLR4_1_1k4k4isihn5wy.R.iget(1342)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1343)==0&false))) {{
					__CLR4_1_1k4k4isihn5wy.R.inc(1344);driver.navigate().refresh();
					__CLR4_1_1k4k4isihn5wy.R.inc(1345);Thread.sleep(10000);
					__CLR4_1_1k4k4isihn5wy.R.inc(1346);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("kubernets")))).click();
					__CLR4_1_1k4k4isihn5wy.R.inc(1347);Thread.sleep(10000);
						__CLR4_1_1k4k4isihn5wy.R.inc(1348);wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("table")));
						__CLR4_1_1k4k4isihn5wy.R.inc(1349);WebElement table1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("table")));
						__CLR4_1_1k4k4isihn5wy.R.inc(1350);WebElement tbody1 = table1.findElement(By.tagName("tbody"));
						__CLR4_1_1k4k4isihn5wy.R.inc(1351);List<WebElement> tr1 = tbody1.findElements(By.tagName("tr"));
						__CLR4_1_1k4k4isihn5wy.R.inc(1352);if((((tr1.size()!=0)&&(__CLR4_1_1k4k4isihn5wy.R.iget(1353)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1354)==0&false))){{
						__CLR4_1_1k4k4isihn5wy.R.inc(1355);for (int j = 0; (((j < tr1.size())&&(__CLR4_1_1k4k4isihn5wy.R.iget(1356)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1357)==0&false)); j++) {{
							__CLR4_1_1k4k4isihn5wy.R.inc(1358);List<WebElement> td1 = tr1.get(j).findElements(By.tagName("td"));
							__CLR4_1_1k4k4isihn5wy.R.inc(1359);for (int i = 0; (((i < td1.size())&&(__CLR4_1_1k4k4isihn5wy.R.iget(1360)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1361)==0&false)); i++) {{
								__CLR4_1_1k4k4isihn5wy.R.inc(1362);if (((((tr1.get(j).getText().contains(kubname)))&&(__CLR4_1_1k4k4isihn5wy.R.iget(1363)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1364)==0&false))) {{
									__CLR4_1_1k4k4isihn5wy.R.inc(1365);flag = false;

								} }else {{
									__CLR4_1_1k4k4isihn5wy.R.inc(1366);flag = true;
								}
							}}
						}}
						}}}else {{
							__CLR4_1_1k4k4isihn5wy.R.inc(1367);flag = true;
						}
				}}
				}__CLR4_1_1k4k4isihn5wy.R.inc(1368);Reporter.log("Response Status = " + "ClusterDeletion deletion initiated \n");

		} catch (Exception e) {
			__CLR4_1_1k4k4isihn5wy.R.inc(1369);e.printStackTrace();
			__CLR4_1_1k4k4isihn5wy.R.inc(1370);Assert.fail(e.getMessage());
			__CLR4_1_1k4k4isihn5wy.R.inc(1371);Reporter.log("Response Status = " + "ClusterDeletion deletion initiation failed \n");
			__CLR4_1_1k4k4isihn5wy.R.inc(1372);driver.close();
		}
		 }finally{__CLR4_1_1k4k4isihn5wy.R.flushNeeded();}}

	public void sourceControlDeletion(String username) throws InterruptedException, IOException {try{__CLR4_1_1k4k4isihn5wy.R.inc(1373);
		__CLR4_1_1k4k4isihn5wy.R.inc(1374);FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		__CLR4_1_1k4k4isihn5wy.R.inc(1375);prop.load(fs);
		__CLR4_1_1k4k4isihn5wy.R.inc(1376);WebDriverWait wait = new WebDriverWait(driver, 1000);
		__CLR4_1_1k4k4isihn5wy.R.inc(1377);try {
			__CLR4_1_1k4k4isihn5wy.R.inc(1378);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("signout")))).click();
		
			__CLR4_1_1k4k4isihn5wy.R.inc(1379);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("settings")))).click();
			

				__CLR4_1_1k4k4isihn5wy.R.inc(1380);driver.navigate().refresh();
				__CLR4_1_1k4k4isihn5wy.R.inc(1381);Thread.sleep(10000);
				__CLR4_1_1k4k4isihn5wy.R.inc(1382);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("sourcecontrol")))).click();
				__CLR4_1_1k4k4isihn5wy.R.inc(1383);Thread.sleep(10000);
				
				__CLR4_1_1k4k4isihn5wy.R.inc(1384);wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("table")));
				__CLR4_1_1k4k4isihn5wy.R.inc(1385);WebElement table = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("table")));
				__CLR4_1_1k4k4isihn5wy.R.inc(1386);WebElement tbody = table.findElement(By.tagName("tbody"));
				__CLR4_1_1k4k4isihn5wy.R.inc(1387);List<WebElement> tr = tbody.findElements(By.tagName("tr"));
				 __CLR4_1_1k4k4isihn5wy.R.inc(1388);for (int j = 0; (((j < tr.size())&&(__CLR4_1_1k4k4isihn5wy.R.iget(1389)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1390)==0&false)); j++) {{
					__CLR4_1_1k4k4isihn5wy.R.inc(1391);List<WebElement> td = tr.get(j).findElements(By.tagName("td"));
					__CLR4_1_1k4k4isihn5wy.R.inc(1392);if ((((tr.get(j).getText().contains(username))&&(__CLR4_1_1k4k4isihn5wy.R.iget(1393)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1394)==0&false))) {{
								__CLR4_1_1k4k4isihn5wy.R.inc(1395);td.get(3).click();
						}
					}}
			
				 }__CLR4_1_1k4k4isihn5wy.R.inc(1396);List<WebElement> button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("appdeletechild"))))
							.findElements(By.tagName("button"));
					__CLR4_1_1k4k4isihn5wy.R.inc(1397);for (int i = 0; (((i < button.size())&&(__CLR4_1_1k4k4isihn5wy.R.iget(1398)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1399)==0&false)); i++) {{
						__CLR4_1_1k4k4isihn5wy.R.inc(1400);if ((((button.get(i).getText().equals("Delete"))&&(__CLR4_1_1k4k4isihn5wy.R.iget(1401)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1402)==0&false))) {{
							__CLR4_1_1k4k4isihn5wy.R.inc(1403);Thread.sleep(10000);
							__CLR4_1_1k4k4isihn5wy.R.inc(1404);button.get(i).click();
						}
					}}
		
			}__CLR4_1_1k4k4isihn5wy.R.inc(1405);Reporter.log(
					"Response Status = " + username + "source control user delettion initiated \n");

		} catch (Exception e) {
			__CLR4_1_1k4k4isihn5wy.R.inc(1406);e.printStackTrace();
			__CLR4_1_1k4k4isihn5wy.R.inc(1407);Assert.fail(e.getMessage());
			__CLR4_1_1k4k4isihn5wy.R.inc(1408);Reporter.log("Response Status = " + "source control user deletion initiation failed \n");
			__CLR4_1_1k4k4isihn5wy.R.inc(1409);driver.close();
		}
		 }finally{__CLR4_1_1k4k4isihn5wy.R.flushNeeded();}}
	public void sourceControlDeletionValidation(String username) throws InterruptedException, IOException {try{__CLR4_1_1k4k4isihn5wy.R.inc(1410);
		__CLR4_1_1k4k4isihn5wy.R.inc(1411);boolean flag = false;
		__CLR4_1_1k4k4isihn5wy.R.inc(1412);FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		__CLR4_1_1k4k4isihn5wy.R.inc(1413);prop.load(fs);
		__CLR4_1_1k4k4isihn5wy.R.inc(1414);Thread.sleep(10000);
		__CLR4_1_1k4k4isihn5wy.R.inc(1415);WebDriverWait wait=new WebDriverWait(driver,1000);
		__CLR4_1_1k4k4isihn5wy.R.inc(1416);try {
			__CLR4_1_1k4k4isihn5wy.R.inc(1417);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("signout")))).click();
			__CLR4_1_1k4k4isihn5wy.R.inc(1418);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("settings")))).click();
			__CLR4_1_1k4k4isihn5wy.R.inc(1419);while ((((!flag)&&(__CLR4_1_1k4k4isihn5wy.R.iget(1420)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1421)==0&false))) {{
				

				__CLR4_1_1k4k4isihn5wy.R.inc(1422);driver.navigate().refresh();
			__CLR4_1_1k4k4isihn5wy.R.inc(1423);Thread.sleep(10000);
				__CLR4_1_1k4k4isihn5wy.R.inc(1424);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("sourcecontrol")))).click();
				__CLR4_1_1k4k4isihn5wy.R.inc(1425);Thread.sleep(10000);
					__CLR4_1_1k4k4isihn5wy.R.inc(1426);wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("table")));
					__CLR4_1_1k4k4isihn5wy.R.inc(1427);WebElement table1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("table")));
					__CLR4_1_1k4k4isihn5wy.R.inc(1428);WebElement tbody1 = table1.findElement(By.tagName("tbody"));
					__CLR4_1_1k4k4isihn5wy.R.inc(1429);List<WebElement> tr1 = tbody1.findElements(By.tagName("tr"));
					__CLR4_1_1k4k4isihn5wy.R.inc(1430);if((((tr1.size()!=0)&&(__CLR4_1_1k4k4isihn5wy.R.iget(1431)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1432)==0&false))){{
					__CLR4_1_1k4k4isihn5wy.R.inc(1433);for (int j = 0; (((j < tr1.size())&&(__CLR4_1_1k4k4isihn5wy.R.iget(1434)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1435)==0&false)); j++) {{
						__CLR4_1_1k4k4isihn5wy.R.inc(1436);List<WebElement> td1 = tr1.get(j).findElements(By.tagName("td"));
						__CLR4_1_1k4k4isihn5wy.R.inc(1437);for (int i = 0; (((i < td1.size())&&(__CLR4_1_1k4k4isihn5wy.R.iget(1438)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1439)==0&false)); i++) {{
							__CLR4_1_1k4k4isihn5wy.R.inc(1440);if (((((tr1.get(j).getText().contains(username)))&&(__CLR4_1_1k4k4isihn5wy.R.iget(1441)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1442)==0&false))) {{
								__CLR4_1_1k4k4isihn5wy.R.inc(1443);flag = false;

							} }else {{
								__CLR4_1_1k4k4isihn5wy.R.inc(1444);flag = true;
							}
						}}
					}}
					}}}else {{
						__CLR4_1_1k4k4isihn5wy.R.inc(1445);flag = true;
					}
			}}
		
			}__CLR4_1_1k4k4isihn5wy.R.inc(1446);Reporter.log(
					"Response Status = " + username + "source control user deleted successfully \n");

		} catch (Exception e) {
			__CLR4_1_1k4k4isihn5wy.R.inc(1447);e.printStackTrace();
			__CLR4_1_1k4k4isihn5wy.R.inc(1448);Assert.fail(e.getMessage());
			__CLR4_1_1k4k4isihn5wy.R.inc(1449);Reporter.log("Response Status = " + "source control user deletion failed \n");
			__CLR4_1_1k4k4isihn5wy.R.inc(1450);driver.close();
		}
		 }finally{__CLR4_1_1k4k4isihn5wy.R.flushNeeded();}}
	public void azurClusterDeletion(String kubname) throws InterruptedException, IOException {try{__CLR4_1_1k4k4isihn5wy.R.inc(1451);
		__CLR4_1_1k4k4isihn5wy.R.inc(1452);FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		__CLR4_1_1k4k4isihn5wy.R.inc(1453);prop.load(fs);
		__CLR4_1_1k4k4isihn5wy.R.inc(1454);WebDriverWait wait = new WebDriverWait(driver, 1000);
		__CLR4_1_1k4k4isihn5wy.R.inc(1455);Thread.sleep(10000);
		__CLR4_1_1k4k4isihn5wy.R.inc(1456);try {
			__CLR4_1_1k4k4isihn5wy.R.inc(1457);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("signout")))).click();
			
			__CLR4_1_1k4k4isihn5wy.R.inc(1458);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("settings")))).click();
				

				__CLR4_1_1k4k4isihn5wy.R.inc(1459);driver.navigate().refresh();
				__CLR4_1_1k4k4isihn5wy.R.inc(1460);Thread.sleep(10000);
				__CLR4_1_1k4k4isihn5wy.R.inc(1461);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("kubernets")))).click();
				__CLR4_1_1k4k4isihn5wy.R.inc(1462);Thread.sleep(10000);
				__CLR4_1_1k4k4isihn5wy.R.inc(1463);wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("table")));
				__CLR4_1_1k4k4isihn5wy.R.inc(1464);WebElement table = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("table")));
				__CLR4_1_1k4k4isihn5wy.R.inc(1465);WebElement tbody = table.findElement(By.tagName("tbody"));
				__CLR4_1_1k4k4isihn5wy.R.inc(1466);List<WebElement> tr = tbody.findElements(By.tagName("tr"));
				 __CLR4_1_1k4k4isihn5wy.R.inc(1467);for (int j = 0; (((j < tr.size())&&(__CLR4_1_1k4k4isihn5wy.R.iget(1468)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1469)==0&false)); j++) {{
					__CLR4_1_1k4k4isihn5wy.R.inc(1470);List<WebElement> td = tr.get(j).findElements(By.tagName("td"));
					
					__CLR4_1_1k4k4isihn5wy.R.inc(1471);if ((((tr.get(j).getText().contains(kubname))&&(__CLR4_1_1k4k4isihn5wy.R.iget(1472)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1473)==0&false))) {{
						__CLR4_1_1k4k4isihn5wy.R.inc(1474);System.out.println(tr.get(j).getText());
						__CLR4_1_1k4k4isihn5wy.R.inc(1475);Thread.sleep(3000);
						__CLR4_1_1k4k4isihn5wy.R.inc(1476);System.out.println("//tr["+(j+1)+"]/td[7]/a[@uib-tooltip='delete']");
						__CLR4_1_1k4k4isihn5wy.R.inc(1477);driver.findElement(By.xpath("//tr["+(j+1)+"]/td[7]/a[@uib-tooltip='delete']")).click();
					}
				 }}
				 }__CLR4_1_1k4k4isihn5wy.R.inc(1478);List<WebElement> button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("appdeletechild"))))
							.findElements(By.tagName("button"));
					__CLR4_1_1k4k4isihn5wy.R.inc(1479);for (int i = 0; (((i < button.size())&&(__CLR4_1_1k4k4isihn5wy.R.iget(1480)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1481)==0&false)); i++) {{
						__CLR4_1_1k4k4isihn5wy.R.inc(1482);if ((((button.get(i).getText().equals("Delete"))&&(__CLR4_1_1k4k4isihn5wy.R.iget(1483)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1484)==0&false))) {{
							__CLR4_1_1k4k4isihn5wy.R.inc(1485);Thread.sleep(10000);
							__CLR4_1_1k4k4isihn5wy.R.inc(1486);button.get(i).click();
						}
					}}
		
			}__CLR4_1_1k4k4isihn5wy.R.inc(1487);Reporter.log(
					"Response Status = " + kubname + "cluster delettion initiated \n");

		} catch (Exception e) {
			__CLR4_1_1k4k4isihn5wy.R.inc(1488);e.printStackTrace();
			__CLR4_1_1k4k4isihn5wy.R.inc(1489);Assert.fail(e.getMessage());
			__CLR4_1_1k4k4isihn5wy.R.inc(1490);Reporter.log("Response Status = " + "cluster deletion initiation failed \n");
			__CLR4_1_1k4k4isihn5wy.R.inc(1491);driver.close();
		}
		 }finally{__CLR4_1_1k4k4isihn5wy.R.flushNeeded();}}
	public void deleteAzureValidation(String kubname) throws InterruptedException, IOException {try{__CLR4_1_1k4k4isihn5wy.R.inc(1492);
		__CLR4_1_1k4k4isihn5wy.R.inc(1493);FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		__CLR4_1_1k4k4isihn5wy.R.inc(1494);prop.load(fs);
		__CLR4_1_1k4k4isihn5wy.R.inc(1495);boolean flag = false;
		__CLR4_1_1k4k4isihn5wy.R.inc(1496);Thread.sleep(10000);
		__CLR4_1_1k4k4isihn5wy.R.inc(1497);WebDriverWait wait=new WebDriverWait(driver,1000);
		__CLR4_1_1k4k4isihn5wy.R.inc(1498);try {
			__CLR4_1_1k4k4isihn5wy.R.inc(1499);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("signout")))).click();
			
			__CLR4_1_1k4k4isihn5wy.R.inc(1500);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("settings")))).click();
			__CLR4_1_1k4k4isihn5wy.R.inc(1501);while ((((!flag)&&(__CLR4_1_1k4k4isihn5wy.R.iget(1502)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1503)==0&false))) {{
			

				__CLR4_1_1k4k4isihn5wy.R.inc(1504);driver.navigate().refresh();
				__CLR4_1_1k4k4isihn5wy.R.inc(1505);Thread.sleep(10000);
				__CLR4_1_1k4k4isihn5wy.R.inc(1506);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("kubernets")))).click();
				__CLR4_1_1k4k4isihn5wy.R.inc(1507);Thread.sleep(10000);
					__CLR4_1_1k4k4isihn5wy.R.inc(1508);wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("table")));
					__CLR4_1_1k4k4isihn5wy.R.inc(1509);WebElement table1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("table")));
					__CLR4_1_1k4k4isihn5wy.R.inc(1510);WebElement tbody1 = table1.findElement(By.tagName("tbody"));
					__CLR4_1_1k4k4isihn5wy.R.inc(1511);List<WebElement> tr1 = tbody1.findElements(By.tagName("tr"));
					__CLR4_1_1k4k4isihn5wy.R.inc(1512);if((((tr1.size()!=0)&&(__CLR4_1_1k4k4isihn5wy.R.iget(1513)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1514)==0&false))){{
					__CLR4_1_1k4k4isihn5wy.R.inc(1515);for (int j = 0; (((j < tr1.size())&&(__CLR4_1_1k4k4isihn5wy.R.iget(1516)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1517)==0&false)); j++) {{
						__CLR4_1_1k4k4isihn5wy.R.inc(1518);List<WebElement> td1 = tr1.get(j).findElements(By.tagName("td"));
						__CLR4_1_1k4k4isihn5wy.R.inc(1519);for (int i = 0; (((i < td1.size())&&(__CLR4_1_1k4k4isihn5wy.R.iget(1520)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1521)==0&false)); i++) {{
							__CLR4_1_1k4k4isihn5wy.R.inc(1522);if (((((tr1.get(j).getText().contains(kubname)))&&(__CLR4_1_1k4k4isihn5wy.R.iget(1523)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1524)==0&false))) {{
								__CLR4_1_1k4k4isihn5wy.R.inc(1525);flag = false;

							} }else {{
								__CLR4_1_1k4k4isihn5wy.R.inc(1526);flag = true;
							}
						}}
					}}
					}}}else {{
						__CLR4_1_1k4k4isihn5wy.R.inc(1527);flag = true;
					}
			}}
		
			}__CLR4_1_1k4k4isihn5wy.R.inc(1528);Reporter.log(
					"Response Status = " + kubname + "cluster deleted successfully \n");

		} catch (Exception e) {
			__CLR4_1_1k4k4isihn5wy.R.inc(1529);e.printStackTrace();
			__CLR4_1_1k4k4isihn5wy.R.inc(1530);Assert.fail(e.getMessage());
			__CLR4_1_1k4k4isihn5wy.R.inc(1531);Reporter.log("Response Status = " + "cluster deletion failed \n");
			__CLR4_1_1k4k4isihn5wy.R.inc(1532);driver.close();
		}
		 }finally{__CLR4_1_1k4k4isihn5wy.R.flushNeeded();}}
	public void createSingletierDesign(String name,String url,String auth,String platform,String build,String buildscript,String startscript,String install,String preinstall,String postinstall,String port) throws InterruptedException, AWTException, IOException {try{__CLR4_1_1k4k4isihn5wy.R.inc(1533);
		__CLR4_1_1k4k4isihn5wy.R.inc(1534);FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		__CLR4_1_1k4k4isihn5wy.R.inc(1535);prop.load(fs);
		__CLR4_1_1k4k4isihn5wy.R.inc(1536);try{
		__CLR4_1_1k4k4isihn5wy.R.inc(1537);WebDriverWait wait=new WebDriverWait(driver, 1000);
		__CLR4_1_1k4k4isihn5wy.R.inc(1538);driver.navigate().to(prop.getProperty("appurl"));
		__CLR4_1_1k4k4isihn5wy.R.inc(1539);Thread.sleep(10000);
		__CLR4_1_1k4k4isihn5wy.R.inc(1540);driver.navigate().refresh();
		__CLR4_1_1k4k4isihn5wy.R.inc(1541);Thread.sleep(10000);
		__CLR4_1_1k4k4isihn5wy.R.inc(1542);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("design"))));
		__CLR4_1_1k4k4isihn5wy.R.inc(1543);WebElement e1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("design"))));
		__CLR4_1_1k4k4isihn5wy.R.inc(1544);Actions act=new Actions(driver);
		__CLR4_1_1k4k4isihn5wy.R.inc(1545);act.moveToElement(e1).doubleClick(e1).build().perform();
		__CLR4_1_1k4k4isihn5wy.R.inc(1546);Thread.sleep(10000);
		__CLR4_1_1k4k4isihn5wy.R.inc(1547);Robot robot = new Robot();
		__CLR4_1_1k4k4isihn5wy.R.inc(1548);robot.keyPress(KeyEvent.VK_PAGE_UP);
		__CLR4_1_1k4k4isihn5wy.R.inc(1549);Thread.sleep(3000);
		__CLR4_1_1k4k4isihn5wy.R.inc(1550);robot.keyRelease(KeyEvent.VK_PAGE_UP); 
		__CLR4_1_1k4k4isihn5wy.R.inc(1551);Thread.sleep(3000);
		__CLR4_1_1k4k4isihn5wy.R.inc(1552);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("createdesign")))).click();
		__CLR4_1_1k4k4isihn5wy.R.inc(1553);Thread.sleep(3000);
		__CLR4_1_1k4k4isihn5wy.R.inc(1554);System.out.println(name);
		__CLR4_1_1k4k4isihn5wy.R.inc(1555);if((((name.equals("git"))&&(__CLR4_1_1k4k4isihn5wy.R.iget(1556)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1557)==0&false))){{
		__CLR4_1_1k4k4isihn5wy.R.inc(1558);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("designgithub")))).click();
		}
		}else {__CLR4_1_1k4k4isihn5wy.R.inc(1559);if((((name.equals("bit"))&&(__CLR4_1_1k4k4isihn5wy.R.iget(1560)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1561)==0&false))){{
		__CLR4_1_1k4k4isihn5wy.R.inc(1562);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("designbitbucket")))).click();
		}
		}else {__CLR4_1_1k4k4isihn5wy.R.inc(1563);if((((name.equals("gitlab"))&&(__CLR4_1_1k4k4isihn5wy.R.iget(1564)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1565)==0&false))){{
			__CLR4_1_1k4k4isihn5wy.R.inc(1566);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("designgitlab")))).click();
			}
		}}}__CLR4_1_1k4k4isihn5wy.R.inc(1567);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("dbname"))));
		__CLR4_1_1k4k4isihn5wy.R.inc(1568);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("dbname")))).sendKeys(name);
		__CLR4_1_1k4k4isihn5wy.R.inc(1569);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("gitpath")))).sendKeys(url);
		__CLR4_1_1k4k4isihn5wy.R.inc(1570);if((((auth!="")&&(__CLR4_1_1k4k4isihn5wy.R.iget(1571)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1572)==0&false))){{
			__CLR4_1_1k4k4isihn5wy.R.inc(1573);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("gitauth")))).click();
	
		
		__CLR4_1_1k4k4isihn5wy.R.inc(1574);List<WebElement> list=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("dbversionchild")))).findElements(By.tagName("md-option"));
		
		__CLR4_1_1k4k4isihn5wy.R.inc(1575);for(int i=0;(((i<list.size())&&(__CLR4_1_1k4k4isihn5wy.R.iget(1576)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1577)==0&false));i++){{
			__CLR4_1_1k4k4isihn5wy.R.inc(1578);if((((list.get(i).getText().equals(auth))&&(__CLR4_1_1k4k4isihn5wy.R.iget(1579)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1580)==0&false))){{
				__CLR4_1_1k4k4isihn5wy.R.inc(1581);Thread.sleep(5000);
				__CLR4_1_1k4k4isihn5wy.R.inc(1582);list.get(i).click();
				__CLR4_1_1k4k4isihn5wy.R.inc(1583);break;
			}
			}}
		}}
			}__CLR4_1_1k4k4isihn5wy.R.inc(1584);Thread.sleep(10000);
			
		__CLR4_1_1k4k4isihn5wy.R.inc(1585);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("gitplatform")))).click();
		
	
		__CLR4_1_1k4k4isihn5wy.R.inc(1586);List<WebElement> list=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("dbversionchild")))).findElements(By.tagName("md-option"));
		
		__CLR4_1_1k4k4isihn5wy.R.inc(1587);for(int i=0;(((i<list.size())&&(__CLR4_1_1k4k4isihn5wy.R.iget(1588)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1589)==0&false));i++){{
			__CLR4_1_1k4k4isihn5wy.R.inc(1590);if((((list.get(i).getText().equals(platform))&&(__CLR4_1_1k4k4isihn5wy.R.iget(1591)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1592)==0&false))){{
				__CLR4_1_1k4k4isihn5wy.R.inc(1593);Thread.sleep(5000);
				__CLR4_1_1k4k4isihn5wy.R.inc(1594);list.get(i).click();
				__CLR4_1_1k4k4isihn5wy.R.inc(1595);break;
			}
		}}
		
		}__CLR4_1_1k4k4isihn5wy.R.inc(1596);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("scriptbutton")))).click();
		__CLR4_1_1k4k4isihn5wy.R.inc(1597);Thread.sleep(20000);
		__CLR4_1_1k4k4isihn5wy.R.inc(1598);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("gitbuilder")))).click();
	
	__CLR4_1_1k4k4isihn5wy.R.inc(1599);List<WebElement> list1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("gitbuilderchild")))).findElements(By.tagName("md-option"));

		__CLR4_1_1k4k4isihn5wy.R.inc(1600);for(int j=0;(((j<list1.size())&&(__CLR4_1_1k4k4isihn5wy.R.iget(1601)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1602)==0&false));j++){{
			__CLR4_1_1k4k4isihn5wy.R.inc(1603);if((((list1.get(j).getText().equals(build))&&(__CLR4_1_1k4k4isihn5wy.R.iget(1604)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1605)==0&false))){{
				__CLR4_1_1k4k4isihn5wy.R.inc(1606);Thread.sleep(5000);
				__CLR4_1_1k4k4isihn5wy.R.inc(1607);list1.get(j).click();
				__CLR4_1_1k4k4isihn5wy.R.inc(1608);break;
			}
		}}
		
		
		}__CLR4_1_1k4k4isihn5wy.R.inc(1609);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("gitbuild")))).sendKeys(buildscript);
		
		__CLR4_1_1k4k4isihn5wy.R.inc(1610);if((((startscript !="")&&(__CLR4_1_1k4k4isihn5wy.R.iget(1611)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1612)==0&false))){{
			
		__CLR4_1_1k4k4isihn5wy.R.inc(1613);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("advancefield")))).click();
		}
		}__CLR4_1_1k4k4isihn5wy.R.inc(1614);if((((startscript !="")&&(__CLR4_1_1k4k4isihn5wy.R.iget(1615)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1616)==0&false))){{
		__CLR4_1_1k4k4isihn5wy.R.inc(1617);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("startscript")))).sendKeys(startscript);
		}
		}__CLR4_1_1k4k4isihn5wy.R.inc(1618);if((((install !="")&&(__CLR4_1_1k4k4isihn5wy.R.iget(1619)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1620)==0&false))){{
		__CLR4_1_1k4k4isihn5wy.R.inc(1621);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("install")))).sendKeys(install);
		}
		}__CLR4_1_1k4k4isihn5wy.R.inc(1622);if((((preinstall !="")&&(__CLR4_1_1k4k4isihn5wy.R.iget(1623)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1624)==0&false))){{
		__CLR4_1_1k4k4isihn5wy.R.inc(1625);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("preinstall")))).sendKeys(preinstall);
		}
		}__CLR4_1_1k4k4isihn5wy.R.inc(1626);if((((postinstall !="")&&(__CLR4_1_1k4k4isihn5wy.R.iget(1627)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1628)==0&false))){{
			__CLR4_1_1k4k4isihn5wy.R.inc(1629);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("postinstall")))).sendKeys(postinstall);
			}
	
		}__CLR4_1_1k4k4isihn5wy.R.inc(1630);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("networkbutton")))).click();
	
		__CLR4_1_1k4k4isihn5wy.R.inc(1631);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("gitport")))).sendKeys(port);
		__CLR4_1_1k4k4isihn5wy.R.inc(1632);Thread.sleep(5000);
		__CLR4_1_1k4k4isihn5wy.R.inc(1633);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("dbsave")))).click();
		__CLR4_1_1k4k4isihn5wy.R.inc(1634);Reporter.log("Response Status = " + "create single tier design initiated \n");
		} catch (Exception e) {
			__CLR4_1_1k4k4isihn5wy.R.inc(1635);e.printStackTrace();
			__CLR4_1_1k4k4isihn5wy.R.inc(1636);Assert.fail(e.getMessage());
			__CLR4_1_1k4k4isihn5wy.R.inc(1637);Reporter.log("Response Status = " + "create single tier design initiation failed\n");
			__CLR4_1_1k4k4isihn5wy.R.inc(1638);driver.close();
		}
	}finally{__CLR4_1_1k4k4isihn5wy.R.flushNeeded();}}
	public void createRedisComponent(String name,String path,String port) throws IOException{try{__CLR4_1_1k4k4isihn5wy.R.inc(1639);
		__CLR4_1_1k4k4isihn5wy.R.inc(1640);FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		__CLR4_1_1k4k4isihn5wy.R.inc(1641);prop.load(fs);
		__CLR4_1_1k4k4isihn5wy.R.inc(1642);try{
		__CLR4_1_1k4k4isihn5wy.R.inc(1643);Thread.sleep(10000);
		__CLR4_1_1k4k4isihn5wy.R.inc(1644);WebDriverWait wait=new WebDriverWait(driver,1000);
			__CLR4_1_1k4k4isihn5wy.R.inc(1645);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("designredis")))).click();
			__CLR4_1_1k4k4isihn5wy.R.inc(1646);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("redisdbpath")))).sendKeys(path);
			__CLR4_1_1k4k4isihn5wy.R.inc(1647);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("networkbutton")))).click();
			
			__CLR4_1_1k4k4isihn5wy.R.inc(1648);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("gitport")))).sendKeys(port);
			__CLR4_1_1k4k4isihn5wy.R.inc(1649);Thread.sleep(5000);
			__CLR4_1_1k4k4isihn5wy.R.inc(1650);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("dbsave")))).click();
	}catch (Exception e) {
		__CLR4_1_1k4k4isihn5wy.R.inc(1651);e.printStackTrace();
		__CLR4_1_1k4k4isihn5wy.R.inc(1652);Assert.fail(e.getMessage());
		__CLR4_1_1k4k4isihn5wy.R.inc(1653);Reporter.log("Response Status = " + "create Multi tier design initiation failed\n");
		__CLR4_1_1k4k4isihn5wy.R.inc(1654);driver.close();
	}
	}finally{__CLR4_1_1k4k4isihn5wy.R.flushNeeded();}}
	public void createMultitierDesign(String name,String version,String path) throws IOException, InterruptedException{try{__CLR4_1_1k4k4isihn5wy.R.inc(1655);
		__CLR4_1_1k4k4isihn5wy.R.inc(1656);FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		__CLR4_1_1k4k4isihn5wy.R.inc(1657);prop.load(fs);
		__CLR4_1_1k4k4isihn5wy.R.inc(1658);try{
		__CLR4_1_1k4k4isihn5wy.R.inc(1659);Thread.sleep(10000);
		__CLR4_1_1k4k4isihn5wy.R.inc(1660);WebDriverWait wait=new WebDriverWait(driver,1000);
		__CLR4_1_1k4k4isihn5wy.R.inc(1661);if((((name.equals("mysql"))&&(__CLR4_1_1k4k4isihn5wy.R.iget(1662)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1663)==0&false))){{
		__CLR4_1_1k4k4isihn5wy.R.inc(1664);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("mysql")))).click();
		}
		}else {__CLR4_1_1k4k4isihn5wy.R.inc(1665);if((((name.equals("cass"))&&(__CLR4_1_1k4k4isihn5wy.R.iget(1666)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1667)==0&false))){{
			__CLR4_1_1k4k4isihn5wy.R.inc(1668);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("cassandra")))).click();
		}}else {__CLR4_1_1k4k4isihn5wy.R.inc(1669);if((((name.equals("mongo"))&&(__CLR4_1_1k4k4isihn5wy.R.iget(1670)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1671)==0&false)))
		{{
			__CLR4_1_1k4k4isihn5wy.R.inc(1672);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("mongo")))).click();
		}
	    
		}}}__CLR4_1_1k4k4isihn5wy.R.inc(1673);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("dbname")))).sendKeys(name);
		__CLR4_1_1k4k4isihn5wy.R.inc(1674);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("dbversion")))).click();
		__CLR4_1_1k4k4isihn5wy.R.inc(1675);Thread.sleep(5000);
	__CLR4_1_1k4k4isihn5wy.R.inc(1676);List<WebElement> list2=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("dbversionchild")))).findElements(By.tagName("md-option"));
	__CLR4_1_1k4k4isihn5wy.R.inc(1677);OUTER:
		for(int i=0;(((i<list2.size())&&(__CLR4_1_1k4k4isihn5wy.R.iget(1678)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1679)==0&false));i++){{
			__CLR4_1_1k4k4isihn5wy.R.inc(1680);Thread.sleep(5000);
			__CLR4_1_1k4k4isihn5wy.R.inc(1681);if((((list2.get(i).getText().equals(version))&&(__CLR4_1_1k4k4isihn5wy.R.iget(1682)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1683)==0&false))){{
				__CLR4_1_1k4k4isihn5wy.R.inc(1684);Thread.sleep(5000);
				__CLR4_1_1k4k4isihn5wy.R.inc(1685);list2.get(i).click();
				__CLR4_1_1k4k4isihn5wy.R.inc(1686);break OUTER;
			}
		}}

		}__CLR4_1_1k4k4isihn5wy.R.inc(1687);if((((path!="")&&(__CLR4_1_1k4k4isihn5wy.R.iget(1688)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1689)==0&false))){{
		__CLR4_1_1k4k4isihn5wy.R.inc(1690);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("dbpath")))).sendKeys(path);
		}
			
		}__CLR4_1_1k4k4isihn5wy.R.inc(1691);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("dbsave")))).click();
		
		__CLR4_1_1k4k4isihn5wy.R.inc(1692);Reporter.log("Response Status = " + "create Multi tier design initiated \n");
		} catch (Exception e) {
			__CLR4_1_1k4k4isihn5wy.R.inc(1693);e.printStackTrace();
			__CLR4_1_1k4k4isihn5wy.R.inc(1694);Assert.fail(e.getMessage());
			__CLR4_1_1k4k4isihn5wy.R.inc(1695);Reporter.log("Response Status = " + "create Multi tier design initiation failed\n");
			__CLR4_1_1k4k4isihn5wy.R.inc(1696);driver.close();
		}
		
		
	}finally{__CLR4_1_1k4k4isihn5wy.R.flushNeeded();}}
	public void linkComponent(String image,String image1) throws  AWTException, IOException, InterruptedException{try{__CLR4_1_1k4k4isihn5wy.R.inc(1697);
		__CLR4_1_1k4k4isihn5wy.R.inc(1698);FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		__CLR4_1_1k4k4isihn5wy.R.inc(1699);prop.load(fs);
		__CLR4_1_1k4k4isihn5wy.R.inc(1700);try{
		__CLR4_1_1k4k4isihn5wy.R.inc(1701);WebDriverWait wait=new WebDriverWait(driver,1000);
		__CLR4_1_1k4k4isihn5wy.R.inc(1702);Robot robot = new Robot();
		__CLR4_1_1k4k4isihn5wy.R.inc(1703);Thread.sleep(3000);
		__CLR4_1_1k4k4isihn5wy.R.inc(1704);robot.keyPress(KeyEvent.VK_PAGE_UP);
		__CLR4_1_1k4k4isihn5wy.R.inc(1705);Thread.sleep(3000);
		__CLR4_1_1k4k4isihn5wy.R.inc(1706);robot.keyRelease(KeyEvent.VK_PAGE_UP);
		 __CLR4_1_1k4k4isihn5wy.R.inc(1707);Thread.sleep(3000);
		__CLR4_1_1k4k4isihn5wy.R.inc(1708);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("addedge")))).click();
		__CLR4_1_1k4k4isihn5wy.R.inc(1709);Screen s=new Screen();
		__CLR4_1_1k4k4isihn5wy.R.inc(1710);Thread.sleep(3000);
		__CLR4_1_1k4k4isihn5wy.R.inc(1711);Pattern p=new Pattern(image);
		__CLR4_1_1k4k4isihn5wy.R.inc(1712);Pattern p1=new Pattern(image1);
		__CLR4_1_1k4k4isihn5wy.R.inc(1713);Thread.sleep(3000);
		__CLR4_1_1k4k4isihn5wy.R.inc(1714);try {
			__CLR4_1_1k4k4isihn5wy.R.inc(1715);s.dragDrop(p, p1);
		} catch (FindFailed e) {
			__CLR4_1_1k4k4isihn5wy.R.inc(1716);e.printStackTrace();
		}
		__CLR4_1_1k4k4isihn5wy.R.inc(1717);Thread.sleep(3000);
		__CLR4_1_1k4k4isihn5wy.R.inc(1718);Reporter.log("Response Status = " + "Linked component succesfully\n");
		} catch (Exception e) {
			__CLR4_1_1k4k4isihn5wy.R.inc(1719);e.printStackTrace();
			__CLR4_1_1k4k4isihn5wy.R.inc(1720);Assert.fail(e.getMessage());
			__CLR4_1_1k4k4isihn5wy.R.inc(1721);Reporter.log("Response Status = " + "Link component failed\n");
			__CLR4_1_1k4k4isihn5wy.R.inc(1722);driver.close();
		}
	}finally{__CLR4_1_1k4k4isihn5wy.R.flushNeeded();}}
	public void publish(String design) throws AWTException, IOException, InterruptedException{try{__CLR4_1_1k4k4isihn5wy.R.inc(1723);
		__CLR4_1_1k4k4isihn5wy.R.inc(1724);FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		__CLR4_1_1k4k4isihn5wy.R.inc(1725);prop.load(fs);
		__CLR4_1_1k4k4isihn5wy.R.inc(1726);try{
		__CLR4_1_1k4k4isihn5wy.R.inc(1727);WebDriverWait wait=new WebDriverWait(driver,1000);
		__CLR4_1_1k4k4isihn5wy.R.inc(1728);Robot robot = new Robot();
	
		__CLR4_1_1k4k4isihn5wy.R.inc(1729);robot.keyPress(KeyEvent.VK_PAGE_UP);
		__CLR4_1_1k4k4isihn5wy.R.inc(1730);Thread.sleep(10000);
		__CLR4_1_1k4k4isihn5wy.R.inc(1731);robot.keyRelease(KeyEvent.VK_PAGE_UP);
	
		 
		__CLR4_1_1k4k4isihn5wy.R.inc(1732);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("designedit")))).click();
	
		__CLR4_1_1k4k4isihn5wy.R.inc(1733);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("desingtext")))).clear();
		__CLR4_1_1k4k4isihn5wy.R.inc(1734);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("desingtext")))).sendKeys(design);
		
	   __CLR4_1_1k4k4isihn5wy.R.inc(1735);Thread.sleep(3000);
		__CLR4_1_1k4k4isihn5wy.R.inc(1736);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("designsave")))).click();
		 __CLR4_1_1k4k4isihn5wy.R.inc(1737);Thread.sleep(3000);
		__CLR4_1_1k4k4isihn5wy.R.inc(1738);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("publish")))).click();
		__CLR4_1_1k4k4isihn5wy.R.inc(1739);Reporter.log("Response Status = " + "Publish the design initiated\n");
		} catch (Exception e) {
			__CLR4_1_1k4k4isihn5wy.R.inc(1740);e.printStackTrace();
			__CLR4_1_1k4k4isihn5wy.R.inc(1741);Assert.fail(e.getMessage());
			__CLR4_1_1k4k4isihn5wy.R.inc(1742);Reporter.log("Response Status = " + "Publish the design failed\n");
			__CLR4_1_1k4k4isihn5wy.R.inc(1743);driver.close();
		}
	}finally{__CLR4_1_1k4k4isihn5wy.R.flushNeeded();}}
	public void designValidation(String design) throws InterruptedException, IOException{try{__CLR4_1_1k4k4isihn5wy.R.inc(1744);
		__CLR4_1_1k4k4isihn5wy.R.inc(1745);FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		__CLR4_1_1k4k4isihn5wy.R.inc(1746);prop.load(fs);
		__CLR4_1_1k4k4isihn5wy.R.inc(1747);try{
		__CLR4_1_1k4k4isihn5wy.R.inc(1748);Thread.sleep(10000);
		__CLR4_1_1k4k4isihn5wy.R.inc(1749);driver.navigate().to(prop.getProperty("appurl"));
		__CLR4_1_1k4k4isihn5wy.R.inc(1750);Thread.sleep(10000);
		__CLR4_1_1k4k4isihn5wy.R.inc(1751);driver.navigate().refresh();
		__CLR4_1_1k4k4isihn5wy.R.inc(1752);Thread.sleep(10000);
		__CLR4_1_1k4k4isihn5wy.R.inc(1753);WebDriverWait wait=new WebDriverWait(driver,1000);
		__CLR4_1_1k4k4isihn5wy.R.inc(1754);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("design"))));
		__CLR4_1_1k4k4isihn5wy.R.inc(1755);WebElement e1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("design"))));
		__CLR4_1_1k4k4isihn5wy.R.inc(1756);Actions act=new Actions(driver);
		__CLR4_1_1k4k4isihn5wy.R.inc(1757);act.moveToElement(e1).doubleClick(e1).build().perform();
		__CLR4_1_1k4k4isihn5wy.R.inc(1758);Thread.sleep(10000);
		__CLR4_1_1k4k4isihn5wy.R.inc(1759);searchDesign(design);
	
		__CLR4_1_1k4k4isihn5wy.R.inc(1760);String val=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("designsttus")))).getText();
		
		__CLR4_1_1k4k4isihn5wy.R.inc(1761);if((((val.equals("Success"))&&(__CLR4_1_1k4k4isihn5wy.R.iget(1762)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1763)==0&false)))
		{{
			__CLR4_1_1k4k4isihn5wy.R.inc(1764);Assert.assertTrue(true, val);
		}
		}__CLR4_1_1k4k4isihn5wy.R.inc(1765);Reporter.log("Response Status = " + "Design created successfully \n");
		} catch (Exception e) {
			__CLR4_1_1k4k4isihn5wy.R.inc(1766);e.printStackTrace();
			__CLR4_1_1k4k4isihn5wy.R.inc(1767);Assert.fail(e.getMessage());
			__CLR4_1_1k4k4isihn5wy.R.inc(1768);Reporter.log("Response Status = " + "Design creation failed\n");
			__CLR4_1_1k4k4isihn5wy.R.inc(1769);driver.close();
		}
	}finally{__CLR4_1_1k4k4isihn5wy.R.flushNeeded();}}
	public void launchApp(String clust,String imgname, String appname, String port, String kubname) throws InterruptedException, IOException {try{__CLR4_1_1k4k4isihn5wy.R.inc(1770);
		__CLR4_1_1k4k4isihn5wy.R.inc(1771);FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		__CLR4_1_1k4k4isihn5wy.R.inc(1772);prop.load(fs);																																																				
		__CLR4_1_1k4k4isihn5wy.R.inc(1773);WebDriverWait wait = new WebDriverWait(driver, 1000);
		__CLR4_1_1k4k4isihn5wy.R.inc(1774);boolean temp = true;
		__CLR4_1_1k4k4isihn5wy.R.inc(1775);Thread.sleep(10000);
		__CLR4_1_1k4k4isihn5wy.R.inc(1776);driver.navigate().to(prop.getProperty("appurl"));
		__CLR4_1_1k4k4isihn5wy.R.inc(1777);Thread.sleep(10000);
		__CLR4_1_1k4k4isihn5wy.R.inc(1778);driver.navigate().refresh();
		__CLR4_1_1k4k4isihn5wy.R.inc(1779);Thread.sleep(10000);
		__CLR4_1_1k4k4isihn5wy.R.inc(1780);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("design"))));
		__CLR4_1_1k4k4isihn5wy.R.inc(1781);WebElement e1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("design"))));
		__CLR4_1_1k4k4isihn5wy.R.inc(1782);Actions act=new Actions(driver);
		__CLR4_1_1k4k4isihn5wy.R.inc(1783);act.moveToElement(e1).doubleClick(e1).build().perform();
		__CLR4_1_1k4k4isihn5wy.R.inc(1784);Thread.sleep(10000);
		__CLR4_1_1k4k4isihn5wy.R.inc(1785);try {
				__CLR4_1_1k4k4isihn5wy.R.inc(1786);searchDesign(imgname);
			
			__CLR4_1_1k4k4isihn5wy.R.inc(1787);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("launch")))).click();
			__CLR4_1_1k4k4isihn5wy.R.inc(1788);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("appname")))).sendKeys(appname);
			__CLR4_1_1k4k4isihn5wy.R.inc(1789);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("appport"))))
					.sendKeys(port);
			__CLR4_1_1k4k4isihn5wy.R.inc(1790);Thread.sleep(20000);
			__CLR4_1_1k4k4isihn5wy.R.inc(1791);if((((clust.equals("kub"))&&(__CLR4_1_1k4k4isihn5wy.R.iget(1792)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1793)==0&false))){{
			__CLR4_1_1k4k4isihn5wy.R.inc(1794);Select cluster = new Select(
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("appkub")))));
			__CLR4_1_1k4k4isihn5wy.R.inc(1795);cluster.selectByVisibleText(kubname);
			}
			}else{{
				__CLR4_1_1k4k4isihn5wy.R.inc(1796);System.out.println("swarm");
					__CLR4_1_1k4k4isihn5wy.R.inc(1797);driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[2]/form/div[3]/div[2]/input")).click();
					__CLR4_1_1k4k4isihn5wy.R.inc(1798);Thread.sleep(3000);
				__CLR4_1_1k4k4isihn5wy.R.inc(1799);Select cluster = new Select(
						wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("appkub")))));
				__CLR4_1_1k4k4isihn5wy.R.inc(1800);cluster.selectByVisibleText(kubname);
			}
		
			}__CLR4_1_1k4k4isihn5wy.R.inc(1801);Boolean Autoscale = driver
					.findElement(By.xpath(prop.getProperty("autoscale"))).isDisplayed();
			__CLR4_1_1k4k4isihn5wy.R.inc(1802);Boolean cdelivery = driver
					.findElement(By.xpath(prop.getProperty("cdelivery"))).isDisplayed();
			__CLR4_1_1k4k4isihn5wy.R.inc(1803);Boolean firewall = driver
					.findElement(By.xpath(prop.getProperty("firewall"))).isDisplayed();
			__CLR4_1_1k4k4isihn5wy.R.inc(1804);if ((((Autoscale)&&(__CLR4_1_1k4k4isihn5wy.R.iget(1805)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1806)==0&false))) {{
				__CLR4_1_1k4k4isihn5wy.R.inc(1807);wait.until(ExpectedConditions.visibilityOfElementLocated(
						By.xpath(prop.getProperty("autoscale")))).click();
			}
			}__CLR4_1_1k4k4isihn5wy.R.inc(1808);if ((((cdelivery)&&(__CLR4_1_1k4k4isihn5wy.R.iget(1809)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1810)==0&false))) {{
				__CLR4_1_1k4k4isihn5wy.R.inc(1811);wait.until(ExpectedConditions.visibilityOfElementLocated(
						By.xpath(prop.getProperty("cdelivery")))).click();
			}
			}__CLR4_1_1k4k4isihn5wy.R.inc(1812);if ((((firewall)&&(__CLR4_1_1k4k4isihn5wy.R.iget(1813)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1814)==0&false))) {{
				__CLR4_1_1k4k4isihn5wy.R.inc(1815);wait.until(ExpectedConditions.visibilityOfElementLocated(
						By.xpath(prop.getProperty("firewall")))).click();
			}

			}__CLR4_1_1k4k4isihn5wy.R.inc(1816);wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(prop.getProperty("appbutton")))).click();
			__CLR4_1_1k4k4isihn5wy.R.inc(1817);Thread.sleep(20000);
			__CLR4_1_1k4k4isihn5wy.R.inc(1818);Assert.assertEquals(
					wait.until(ExpectedConditions
							.visibilityOfElementLocated(By.xpath(prop.getProperty("apppagenew")))).getText(),
					"Applications");
			__CLR4_1_1k4k4isihn5wy.R.inc(1819);log.info("search design successfully");
			__CLR4_1_1k4k4isihn5wy.R.inc(1820);Reporter.log("Response Status = " + appname + "Application launch Initiated \n");
			__CLR4_1_1k4k4isihn5wy.R.inc(1821);temp = false;
		} catch (Exception e) {
			__CLR4_1_1k4k4isihn5wy.R.inc(1822);e.printStackTrace();
			__CLR4_1_1k4k4isihn5wy.R.inc(1823);Assert.fail(e.getMessage());
			__CLR4_1_1k4k4isihn5wy.R.inc(1824);Reporter.log("Response Status = " + "Application launch initiation failed \n");
			__CLR4_1_1k4k4isihn5wy.R.inc(1825);driver.close();
		}
		__CLR4_1_1k4k4isihn5wy.R.inc(1826);if ((((temp == true)&&(__CLR4_1_1k4k4isihn5wy.R.iget(1827)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1828)==0&false))) {{
			__CLR4_1_1k4k4isihn5wy.R.inc(1829);Assert.fail("Image not found");
		}
	}}finally{__CLR4_1_1k4k4isihn5wy.R.flushNeeded();}}
	public void launchValidation(String appname) throws InterruptedException, IOException {try{__CLR4_1_1k4k4isihn5wy.R.inc(1830);
		__CLR4_1_1k4k4isihn5wy.R.inc(1831);FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		__CLR4_1_1k4k4isihn5wy.R.inc(1832);prop.load(fs);
		__CLR4_1_1k4k4isihn5wy.R.inc(1833);boolean flag = false;
		__CLR4_1_1k4k4isihn5wy.R.inc(1834);WebDriverWait wait=new WebDriverWait(driver,1000);
		__CLR4_1_1k4k4isihn5wy.R.inc(1835);driver.navigate().to(prop.getProperty("appurl"));
		__CLR4_1_1k4k4isihn5wy.R.inc(1836);Thread.sleep(10000);
		__CLR4_1_1k4k4isihn5wy.R.inc(1837);driver.navigate().refresh();
	
		__CLR4_1_1k4k4isihn5wy.R.inc(1838);try {
			__CLR4_1_1k4k4isihn5wy.R.inc(1839);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(1840);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("apppage"))));
		
			__CLR4_1_1k4k4isihn5wy.R.inc(1841);WebElement e1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("apppage"))));
			__CLR4_1_1k4k4isihn5wy.R.inc(1842);Actions act=new Actions(driver);
			__CLR4_1_1k4k4isihn5wy.R.inc(1843);act.moveToElement(e1).doubleClick(e1).build().perform();
			__CLR4_1_1k4k4isihn5wy.R.inc(1844);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(1845);while ((((!flag)&&(__CLR4_1_1k4k4isihn5wy.R.iget(1846)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1847)==0&false))) {{
				__CLR4_1_1k4k4isihn5wy.R.inc(1848);driver.navigate().refresh();
				__CLR4_1_1k4k4isihn5wy.R.inc(1849);Thread.sleep(10000);
					__CLR4_1_1k4k4isihn5wy.R.inc(1850);searchDesign(appname);
				
				__CLR4_1_1k4k4isihn5wy.R.inc(1851);if ((((wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("apptext")))).getText()
						.equals("Success"))&&(__CLR4_1_1k4k4isihn5wy.R.iget(1852)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1853)==0&false))) {{
					__CLR4_1_1k4k4isihn5wy.R.inc(1854);flag = true;
				} }else {__CLR4_1_1k4k4isihn5wy.R.inc(1855);if ((((wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("apptext")))).getText()
						.equals("Failed"))&&(__CLR4_1_1k4k4isihn5wy.R.iget(1856)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1857)==0&false))) {{
					__CLR4_1_1k4k4isihn5wy.R.inc(1858);Assert.fail("Application creation failed");
					__CLR4_1_1k4k4isihn5wy.R.inc(1859);flag = true;
				} }else {{
					__CLR4_1_1k4k4isihn5wy.R.inc(1860);flag = false;
				}
			}}}
			}__CLR4_1_1k4k4isihn5wy.R.inc(1861);log.info("search design successfully");
			__CLR4_1_1k4k4isihn5wy.R.inc(1862);Reporter.log("Response Status = " + appname + "Application created succesfully \n");
		} catch (Exception e) {
			__CLR4_1_1k4k4isihn5wy.R.inc(1863);e.printStackTrace();
			__CLR4_1_1k4k4isihn5wy.R.inc(1864);Assert.fail(e.getMessage());
			__CLR4_1_1k4k4isihn5wy.R.inc(1865);Reporter.log("Response Status = " + "Application creation failed \n");
			__CLR4_1_1k4k4isihn5wy.R.inc(1866);driver.close();
		}
		__CLR4_1_1k4k4isihn5wy.R.inc(1867);if ((((flag == false)&&(__CLR4_1_1k4k4isihn5wy.R.iget(1868)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1869)==0&false))) {{
			__CLR4_1_1k4k4isihn5wy.R.inc(1870);Assert.fail("Application creation failed");
		}
	}}finally{__CLR4_1_1k4k4isihn5wy.R.flushNeeded();}}

	public void accessValidation(String appname, String text, String Updatedata) throws InterruptedException, IOException {try{__CLR4_1_1k4k4isihn5wy.R.inc(1871);
		__CLR4_1_1k4k4isihn5wy.R.inc(1872);FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		__CLR4_1_1k4k4isihn5wy.R.inc(1873);prop.load(fs);
		__CLR4_1_1k4k4isihn5wy.R.inc(1874);boolean flag = true;
		__CLR4_1_1k4k4isihn5wy.R.inc(1875);driver.navigate().to(prop.getProperty("appurl"));
		__CLR4_1_1k4k4isihn5wy.R.inc(1876);Thread.sleep(10000);
		__CLR4_1_1k4k4isihn5wy.R.inc(1877);driver.navigate().refresh();
		
		__CLR4_1_1k4k4isihn5wy.R.inc(1878);try {
			__CLR4_1_1k4k4isihn5wy.R.inc(1879);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(1880);WebDriverWait wait=new WebDriverWait(driver,1000);
			__CLR4_1_1k4k4isihn5wy.R.inc(1881);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("apppage"))));
			__CLR4_1_1k4k4isihn5wy.R.inc(1882);WebElement e1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("apppage"))));
			__CLR4_1_1k4k4isihn5wy.R.inc(1883);Actions act=new Actions(driver);
			__CLR4_1_1k4k4isihn5wy.R.inc(1884);act.moveToElement(e1).doubleClick(e1).build().perform();
			__CLR4_1_1k4k4isihn5wy.R.inc(1885);Thread.sleep(10000);
				__CLR4_1_1k4k4isihn5wy.R.inc(1886);searchDesign(appname);
			__CLR4_1_1k4k4isihn5wy.R.inc(1887);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("accessurl")))).click();
			__CLR4_1_1k4k4isihn5wy.R.inc(1888);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(1889);String val = driver
					.findElement(By
							.xpath(prop.getProperty("accesstext")))
					.getText();
			__CLR4_1_1k4k4isihn5wy.R.inc(1890);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(1891);if ((((text == null)&&(__CLR4_1_1k4k4isihn5wy.R.iget(1892)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1893)==0&false))) {{
				__CLR4_1_1k4k4isihn5wy.R.inc(1894);driver.navigate().to(val);
			} }else {{
				__CLR4_1_1k4k4isihn5wy.R.inc(1895);driver.navigate().to(val + text);
			}
		
			}__CLR4_1_1k4k4isihn5wy.R.inc(1896);String data = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("accessurldata")))).getText();
		    __CLR4_1_1k4k4isihn5wy.R.inc(1897);Thread.sleep(20000);
			__CLR4_1_1k4k4isihn5wy.R.inc(1898);if((((data.contains(Updatedata))&&(__CLR4_1_1k4k4isihn5wy.R.iget(1899)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1900)==0&false))){{
			__CLR4_1_1k4k4isihn5wy.R.inc(1901);Assert.assertTrue(true, data);
			}
			}else
			{{
				__CLR4_1_1k4k4isihn5wy.R.inc(1902);Assert.assertEquals(data, Updatedata);
			}
		
			}__CLR4_1_1k4k4isihn5wy.R.inc(1903);flag = true;
			__CLR4_1_1k4k4isihn5wy.R.inc(1904);log.info("search design successfully");
			__CLR4_1_1k4k4isihn5wy.R.inc(1905);Reporter.log("Response Status = " + "Accessing the application succesfully \n");
		} catch (Exception e) {
			__CLR4_1_1k4k4isihn5wy.R.inc(1906);e.printStackTrace();
			__CLR4_1_1k4k4isihn5wy.R.inc(1907);Assert.fail(e.getMessage());
			__CLR4_1_1k4k4isihn5wy.R.inc(1908);Reporter.log("Response Status = " + "Application creation failed \n");
			__CLR4_1_1k4k4isihn5wy.R.inc(1909);driver.close();
		}
		__CLR4_1_1k4k4isihn5wy.R.inc(1910);if ((((flag == false)&&(__CLR4_1_1k4k4isihn5wy.R.iget(1911)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1912)==0&false))) {{
			__CLR4_1_1k4k4isihn5wy.R.inc(1913);Assert.fail("Application creation failed \n");
		}
	}}finally{__CLR4_1_1k4k4isihn5wy.R.flushNeeded();}}

	public void stopAction(String appname, String text) throws InterruptedException, IOException {try{__CLR4_1_1k4k4isihn5wy.R.inc(1914);
		__CLR4_1_1k4k4isihn5wy.R.inc(1915);FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		__CLR4_1_1k4k4isihn5wy.R.inc(1916);prop.load(fs);
		__CLR4_1_1k4k4isihn5wy.R.inc(1917);WebDriverWait wait=new WebDriverWait(driver,1000);
		__CLR4_1_1k4k4isihn5wy.R.inc(1918);try {
		__CLR4_1_1k4k4isihn5wy.R.inc(1919);driver.navigate().to(prop.getProperty("appurl"));
		__CLR4_1_1k4k4isihn5wy.R.inc(1920);Thread.sleep(10000);
		__CLR4_1_1k4k4isihn5wy.R.inc(1921);driver.navigate().refresh();
	
		__CLR4_1_1k4k4isihn5wy.R.inc(1922);Thread.sleep(10000);
		__CLR4_1_1k4k4isihn5wy.R.inc(1923);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("apppage"))));
		__CLR4_1_1k4k4isihn5wy.R.inc(1924);WebElement e1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("apppage"))));
		__CLR4_1_1k4k4isihn5wy.R.inc(1925);Actions act=new Actions(driver);
		__CLR4_1_1k4k4isihn5wy.R.inc(1926);act.moveToElement(e1).doubleClick(e1).build().perform();
		__CLR4_1_1k4k4isihn5wy.R.inc(1927);Thread.sleep(10000);
		__CLR4_1_1k4k4isihn5wy.R.inc(1928);launchValidation(appname);
		__CLR4_1_1k4k4isihn5wy.R.inc(1929);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("detailsbutton")))).click();
		__CLR4_1_1k4k4isihn5wy.R.inc(1930);Thread.sleep(10000);
		__CLR4_1_1k4k4isihn5wy.R.inc(1931);Robot robot = new Robot();
		__CLR4_1_1k4k4isihn5wy.R.inc(1932);robot.keyPress(KeyEvent.VK_PAGE_UP);
		__CLR4_1_1k4k4isihn5wy.R.inc(1933);Thread.sleep(3000);
		__CLR4_1_1k4k4isihn5wy.R.inc(1934);robot.keyRelease(KeyEvent.VK_PAGE_UP);
		__CLR4_1_1k4k4isihn5wy.R.inc(1935);Thread.sleep(3000);
		__CLR4_1_1k4k4isihn5wy.R.inc(1936);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("action")))).click();
		__CLR4_1_1k4k4isihn5wy.R.inc(1937);Thread.sleep(10000);
		__CLR4_1_1k4k4isihn5wy.R.inc(1938);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("stop")))).click();
		__CLR4_1_1k4k4isihn5wy.R.inc(1939);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(1940);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("apppage"))));
			__CLR4_1_1k4k4isihn5wy.R.inc(1941);WebElement e2=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("apppage"))));
			__CLR4_1_1k4k4isihn5wy.R.inc(1942);act.moveToElement(e2).doubleClick(e2).build().perform();
			__CLR4_1_1k4k4isihn5wy.R.inc(1943);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(1944);searchDesign(appname);
			
			__CLR4_1_1k4k4isihn5wy.R.inc(1945);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("accessurl")))).click();
			__CLR4_1_1k4k4isihn5wy.R.inc(1946);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(1947);String val = driver
					.findElement(By
							.xpath(prop.getProperty("accesstext")))
					.getText();
			__CLR4_1_1k4k4isihn5wy.R.inc(1948);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(1949);if ((((text == null)&&(__CLR4_1_1k4k4isihn5wy.R.iget(1950)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1951)==0&false))) {{
				__CLR4_1_1k4k4isihn5wy.R.inc(1952);driver.navigate().to(val);
			} }else {{
				__CLR4_1_1k4k4isihn5wy.R.inc(1953);driver.navigate().to(val + text);
			}
			}__CLR4_1_1k4k4isihn5wy.R.inc(1954);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(1955);String data = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("accessurldata")))).getText();
			__CLR4_1_1k4k4isihn5wy.R.inc(1956);if ((((data.contains("ERR_CONNECTION_REFUSED"))&&(__CLR4_1_1k4k4isihn5wy.R.iget(1957)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(1958)==0&false))) {{
				__CLR4_1_1k4k4isihn5wy.R.inc(1959);Assert.assertTrue(true, "Stop action working properly");
			} }else {{
				__CLR4_1_1k4k4isihn5wy.R.inc(1960);Assert.fail("stop action not working properly");
			}
			}__CLR4_1_1k4k4isihn5wy.R.inc(1961);Reporter.log("Response Status = " + appname + "application stopped successfully \n");
		} catch (Exception e) {
			__CLR4_1_1k4k4isihn5wy.R.inc(1962);e.printStackTrace();
			__CLR4_1_1k4k4isihn5wy.R.inc(1963);Assert.fail(e.getMessage());
			__CLR4_1_1k4k4isihn5wy.R.inc(1964);Reporter.log("Response Status = " + "application stopping failed \n");
			__CLR4_1_1k4k4isihn5wy.R.inc(1965);driver.close();
		}
	}finally{__CLR4_1_1k4k4isihn5wy.R.flushNeeded();}}

	public void startAction(String appname, String text, String updatedata) throws InterruptedException, AWTException, IOException {try{__CLR4_1_1k4k4isihn5wy.R.inc(1966);
		__CLR4_1_1k4k4isihn5wy.R.inc(1967);WebDriverWait wait=new WebDriverWait(driver,1000);
		__CLR4_1_1k4k4isihn5wy.R.inc(1968);FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		__CLR4_1_1k4k4isihn5wy.R.inc(1969);prop.load(fs);
		__CLR4_1_1k4k4isihn5wy.R.inc(1970);try {
			__CLR4_1_1k4k4isihn5wy.R.inc(1971);driver.navigate().to(prop.getProperty("appurl"));
			__CLR4_1_1k4k4isihn5wy.R.inc(1972);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(1973);driver.navigate().refresh();
			__CLR4_1_1k4k4isihn5wy.R.inc(1974);Thread.sleep(60000);
			__CLR4_1_1k4k4isihn5wy.R.inc(1975);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("apppage"))));
			__CLR4_1_1k4k4isihn5wy.R.inc(1976);WebElement e1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("apppage"))));
			__CLR4_1_1k4k4isihn5wy.R.inc(1977);Actions act=new Actions(driver);
			__CLR4_1_1k4k4isihn5wy.R.inc(1978);act.moveToElement(e1).doubleClick(e1).build().perform();
			__CLR4_1_1k4k4isihn5wy.R.inc(1979);Thread.sleep(10000);
				__CLR4_1_1k4k4isihn5wy.R.inc(1980);searchDesign(appname);
			__CLR4_1_1k4k4isihn5wy.R.inc(1981);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("detailsbutton")))).click();
			__CLR4_1_1k4k4isihn5wy.R.inc(1982);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(1983);Robot robot = new Robot();
			__CLR4_1_1k4k4isihn5wy.R.inc(1984);robot.keyPress(KeyEvent.VK_PAGE_UP);
			__CLR4_1_1k4k4isihn5wy.R.inc(1985);Thread.sleep(3000);
			__CLR4_1_1k4k4isihn5wy.R.inc(1986);robot.keyRelease(KeyEvent.VK_PAGE_UP);
			__CLR4_1_1k4k4isihn5wy.R.inc(1987);Thread.sleep(3000);
			__CLR4_1_1k4k4isihn5wy.R.inc(1988);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("action")))).click();
			__CLR4_1_1k4k4isihn5wy.R.inc(1989);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(1990);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("start")))).click();
			__CLR4_1_1k4k4isihn5wy.R.inc(1991);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(1992);accessValidation(appname, text, updatedata);
			__CLR4_1_1k4k4isihn5wy.R.inc(1993);Reporter.log("Response Status = " + appname + "application started successfully \n");
		} catch (Exception e) {
			__CLR4_1_1k4k4isihn5wy.R.inc(1994);e.printStackTrace();
			__CLR4_1_1k4k4isihn5wy.R.inc(1995);Assert.fail(e.getMessage());
			__CLR4_1_1k4k4isihn5wy.R.inc(1996);Reporter.log("Response Status = " + "application starting failed \n");
			__CLR4_1_1k4k4isihn5wy.R.inc(1997);driver.close();
		}
	}finally{__CLR4_1_1k4k4isihn5wy.R.flushNeeded();}}

	public void cdeliveryOnsingletier(String appname, String text, String updatedata, String gitnewdata)
			throws InterruptedException, AWTException, IOException {try{__CLR4_1_1k4k4isihn5wy.R.inc(1998);
		__CLR4_1_1k4k4isihn5wy.R.inc(1999);FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		__CLR4_1_1k4k4isihn5wy.R.inc(2000);prop.load(fs);
		__CLR4_1_1k4k4isihn5wy.R.inc(2001);try {
			__CLR4_1_1k4k4isihn5wy.R.inc(2002);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(2003);driver.navigate().to(prop.getProperty("appurl"));
			__CLR4_1_1k4k4isihn5wy.R.inc(2004);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(2005);driver.navigate().refresh();
			__CLR4_1_1k4k4isihn5wy.R.inc(2006);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(2007);WebDriverWait wait = new WebDriverWait(driver, 1000);
			__CLR4_1_1k4k4isihn5wy.R.inc(2008);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("apppage"))));
			__CLR4_1_1k4k4isihn5wy.R.inc(2009);WebElement e1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("apppage"))));
			__CLR4_1_1k4k4isihn5wy.R.inc(2010);Actions act=new Actions(driver);
			__CLR4_1_1k4k4isihn5wy.R.inc(2011);act.moveToElement(e1).doubleClick(e1).build().perform();
			__CLR4_1_1k4k4isihn5wy.R.inc(2012);Thread.sleep(20000);
			__CLR4_1_1k4k4isihn5wy.R.inc(2013);driver.navigate().to(prop.getProperty("giturl"));
			__CLR4_1_1k4k4isihn5wy.R.inc(2014);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(2015);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("gitsignin")))).click();
			__CLR4_1_1k4k4isihn5wy.R.inc(2016);wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(prop.getProperty("gitusername"))))
					.sendKeys("sailakshmiv");
			__CLR4_1_1k4k4isihn5wy.R.inc(2017);wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(prop.getProperty("gitpassword"))))
					.sendKeys("trov-it123");
			__CLR4_1_1k4k4isihn5wy.R.inc(2018);wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(prop.getProperty("gitsigninbutton")))).click();
			__CLR4_1_1k4k4isihn5wy.R.inc(2019);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(2020);wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(prop.getProperty("gitantapplink")))).click();
			__CLR4_1_1k4k4isihn5wy.R.inc(2021);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(2022);wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(prop.getProperty("gitantapplinkchild")))).click();
			__CLR4_1_1k4k4isihn5wy.R.inc(2023);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(2024);String script = "<%@ page language=\"java\" contentType=\"text/html; charset=ISO-8859-1\"\n"+"pageEncoding=\"ISO-8859-1\"%>\n"+"<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n"+"<html>\n"+"<head>\n"+"<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n"+"<title>Insert title here</title>\n"+"</head>"+"<body>"+"<a href=\"HelloWorld\">click Here-goPaddle Bluemeric ANTAPP DEMO" + gitnewdata + "</a>\n"+"</body>\n"+"</html>";
			__CLR4_1_1k4k4isihn5wy.R.inc(2025);wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath(prop.getProperty("gitedit")))).click();
			__CLR4_1_1k4k4isihn5wy.R.inc(2026);wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath(prop.getProperty("gitedittext"))));

			__CLR4_1_1k4k4isihn5wy.R.inc(2027);Keyboard kb = ((HasInputDevices) driver).getKeyboard();
			__CLR4_1_1k4k4isihn5wy.R.inc(2028);kb.sendKeys(Keys.TAB);
			__CLR4_1_1k4k4isihn5wy.R.inc(2029);Robot robot = new Robot();
			__CLR4_1_1k4k4isihn5wy.R.inc(2030);robot.keyPress(KeyEvent.VK_CONTROL);
			__CLR4_1_1k4k4isihn5wy.R.inc(2031);robot.keyPress(KeyEvent.VK_A);
			__CLR4_1_1k4k4isihn5wy.R.inc(2032);robot.keyRelease(KeyEvent.VK_A);
			__CLR4_1_1k4k4isihn5wy.R.inc(2033);robot.keyRelease(KeyEvent.VK_CONTROL);
			__CLR4_1_1k4k4isihn5wy.R.inc(2034);Thread.sleep(5000);
			__CLR4_1_1k4k4isihn5wy.R.inc(2035);robot.keyPress(KeyEvent.VK_DELETE);
			__CLR4_1_1k4k4isihn5wy.R.inc(2036);robot.keyRelease(KeyEvent.VK_DELETE);
			__CLR4_1_1k4k4isihn5wy.R.inc(2037);Thread.sleep(5000);
			
			__CLR4_1_1k4k4isihn5wy.R.inc(2038);StringSelection ss = new StringSelection(script);
			__CLR4_1_1k4k4isihn5wy.R.inc(2039);Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
			__CLR4_1_1k4k4isihn5wy.R.inc(2040);robot.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
			__CLR4_1_1k4k4isihn5wy.R.inc(2041);robot.keyPress(java.awt.event.KeyEvent.VK_V);
			__CLR4_1_1k4k4isihn5wy.R.inc(2042);Thread.sleep(5000);
			__CLR4_1_1k4k4isihn5wy.R.inc(2043);robot.keyRelease(java.awt.event.KeyEvent.VK_V);
			__CLR4_1_1k4k4isihn5wy.R.inc(2044);robot.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
			__CLR4_1_1k4k4isihn5wy.R.inc(2045);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(2046);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("gitupdate")))).click();
			__CLR4_1_1k4k4isihn5wy.R.inc(2047);Thread.sleep(10000);
			//-------------------logout of git start------------------------------
			__CLR4_1_1k4k4isihn5wy.R.inc(2048);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("gitlogout")))).click();
			__CLR4_1_1k4k4isihn5wy.R.inc(2049);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(2050);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("gitlogoutchild")))).click();
		
			//-------------------logout of git end------------------------------
			__CLR4_1_1k4k4isihn5wy.R.inc(2051);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(2052);driver.navigate().to(prop.getProperty("appurl"));
			__CLR4_1_1k4k4isihn5wy.R.inc(2053);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(2054);driver.navigate().refresh();
			__CLR4_1_1k4k4isihn5wy.R.inc(2055);Thread.sleep(40000);
			__CLR4_1_1k4k4isihn5wy.R.inc(2056);accessValidation(appname, text, updatedata + gitnewdata);
			__CLR4_1_1k4k4isihn5wy.R.inc(2057);Reporter.log("Response Status = " + "Before updating the Application accessdata is :" + updatedata + "\n");
			__CLR4_1_1k4k4isihn5wy.R.inc(2058);Reporter.log("Response Status = " + "cdeliveryOn - After updating the Application accessdata is :"
					+ updatedata + gitnewdata + "\n");
			__CLR4_1_1k4k4isihn5wy.R.inc(2059);Reporter.log("Response Status = " + appname + "cdeliveryon working successfully for this appllication \n");
		} catch (Exception e) {
			__CLR4_1_1k4k4isihn5wy.R.inc(2060);e.printStackTrace();
			__CLR4_1_1k4k4isihn5wy.R.inc(2061);Assert.fail(e.getMessage());
			__CLR4_1_1k4k4isihn5wy.R.inc(2062);Reporter.log("Response Status = " + "cdeliveryon failed for this appllication \n");
			__CLR4_1_1k4k4isihn5wy.R.inc(2063);driver.close();
		}

	}finally{__CLR4_1_1k4k4isihn5wy.R.flushNeeded();}}
	 
	public void cdeliveryOnMultitier(String appname, String text, String updatedata, String gitnewdata)
			throws InterruptedException, AWTException, IOException {try{__CLR4_1_1k4k4isihn5wy.R.inc(2064);
		__CLR4_1_1k4k4isihn5wy.R.inc(2065);FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		__CLR4_1_1k4k4isihn5wy.R.inc(2066);prop.load(fs);
		__CLR4_1_1k4k4isihn5wy.R.inc(2067);try {
			__CLR4_1_1k4k4isihn5wy.R.inc(2068);driver.navigate().to(prop.getProperty("appurl"));
			__CLR4_1_1k4k4isihn5wy.R.inc(2069);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(2070);driver.navigate().refresh();
			__CLR4_1_1k4k4isihn5wy.R.inc(2071);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(2072);WebDriverWait wait = new WebDriverWait(driver, 1000);
			__CLR4_1_1k4k4isihn5wy.R.inc(2073);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("apppage"))));
			__CLR4_1_1k4k4isihn5wy.R.inc(2074);WebElement e1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("apppage"))));
			__CLR4_1_1k4k4isihn5wy.R.inc(2075);Actions act=new Actions(driver);
			__CLR4_1_1k4k4isihn5wy.R.inc(2076);act.moveToElement(e1).doubleClick(e1).build().perform();
			__CLR4_1_1k4k4isihn5wy.R.inc(2077);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(2078);driver.navigate().to(prop.getProperty("giturlmulti"));
			__CLR4_1_1k4k4isihn5wy.R.inc(2079);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(2080);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("gitsignin")))).click();
			__CLR4_1_1k4k4isihn5wy.R.inc(2081);wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(prop.getProperty("gitusername"))))
					.sendKeys("sailakshmiv");
			__CLR4_1_1k4k4isihn5wy.R.inc(2082);wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(prop.getProperty("gitpassword"))))
					.sendKeys("trov-it123");
			__CLR4_1_1k4k4isihn5wy.R.inc(2083);wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(prop.getProperty("gitsigninbutton")))).click();
			__CLR4_1_1k4k4isihn5wy.R.inc(2084);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(2085);wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText(prop.getProperty("gitmultilink")))).click();
			__CLR4_1_1k4k4isihn5wy.R.inc(2086);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(2087);wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText(prop.getProperty("gitmultilinkchild")))).click();
			__CLR4_1_1k4k4isihn5wy.R.inc(2088);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(2089);wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(prop.getProperty("gitmultilinkchild1")))).click();
			__CLR4_1_1k4k4isihn5wy.R.inc(2090);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(2091);wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(prop.getProperty("gitmultilinkchild2")))).click();
			__CLR4_1_1k4k4isihn5wy.R.inc(2092);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(2093);String script = "<%@ taglib uri=\"http://java.sun.com/jsp/jstl/core\" prefix=\"c\" %>\n"+"<%@ page session=\"false\" %>\n"+"<html>\n"+"<head>\n"+"<title>Home Page</title>\n"+"</head>\n"+"<body>\n"+"<h1>\n"+"Hello world!!!!!!\n"+"</h1>\n"+"${controllerMessage}<br/>\n"+"<br/>\n"+"<br/>\n"+"<a href=\"product/list\">:)Click here to view the Product list"+gitnewdata+"\n"+"</a>\n"+"</body>\n"+"</html>";
			__CLR4_1_1k4k4isihn5wy.R.inc(2094);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(2095);wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath(prop.getProperty("gitedit")))).click();
			__CLR4_1_1k4k4isihn5wy.R.inc(2096);wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath(prop.getProperty("gitedittext"))));

			__CLR4_1_1k4k4isihn5wy.R.inc(2097);Keyboard kb = ((HasInputDevices) driver).getKeyboard();
			__CLR4_1_1k4k4isihn5wy.R.inc(2098);kb.sendKeys(Keys.TAB);
			__CLR4_1_1k4k4isihn5wy.R.inc(2099);Robot robot = new Robot();
			__CLR4_1_1k4k4isihn5wy.R.inc(2100);robot.keyPress(KeyEvent.VK_CONTROL);
			__CLR4_1_1k4k4isihn5wy.R.inc(2101);robot.keyPress(KeyEvent.VK_A);
			__CLR4_1_1k4k4isihn5wy.R.inc(2102);robot.keyRelease(KeyEvent.VK_A);
			__CLR4_1_1k4k4isihn5wy.R.inc(2103);robot.keyRelease(KeyEvent.VK_CONTROL);
			__CLR4_1_1k4k4isihn5wy.R.inc(2104);Thread.sleep(5000);
			__CLR4_1_1k4k4isihn5wy.R.inc(2105);robot.keyPress(KeyEvent.VK_DELETE);
			__CLR4_1_1k4k4isihn5wy.R.inc(2106);robot.keyRelease(KeyEvent.VK_DELETE);
			__CLR4_1_1k4k4isihn5wy.R.inc(2107);Thread.sleep(5000);
			
			__CLR4_1_1k4k4isihn5wy.R.inc(2108);StringSelection ss = new StringSelection(script);
			__CLR4_1_1k4k4isihn5wy.R.inc(2109);Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
			__CLR4_1_1k4k4isihn5wy.R.inc(2110);robot.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
			__CLR4_1_1k4k4isihn5wy.R.inc(2111);robot.keyPress(java.awt.event.KeyEvent.VK_V);
			__CLR4_1_1k4k4isihn5wy.R.inc(2112);Thread.sleep(5000);
			__CLR4_1_1k4k4isihn5wy.R.inc(2113);robot.keyRelease(java.awt.event.KeyEvent.VK_V);
			__CLR4_1_1k4k4isihn5wy.R.inc(2114);robot.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
			__CLR4_1_1k4k4isihn5wy.R.inc(2115);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(2116);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("gitupdate")))).click();
			
			__CLR4_1_1k4k4isihn5wy.R.inc(2117);Thread.sleep(10000);
			//-------------------logout of git start------------------------------
			__CLR4_1_1k4k4isihn5wy.R.inc(2118);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("gitlogout")))).click();
			__CLR4_1_1k4k4isihn5wy.R.inc(2119);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(2120);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("gitlogoutchild")))).click();
			
			//-------------------logout of git end------------------------------
			__CLR4_1_1k4k4isihn5wy.R.inc(2121);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(2122);driver.navigate().to(prop.getProperty("appurl"));
			__CLR4_1_1k4k4isihn5wy.R.inc(2123);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(2124);driver.navigate().refresh();
			__CLR4_1_1k4k4isihn5wy.R.inc(2125);Thread.sleep(40000);
			__CLR4_1_1k4k4isihn5wy.R.inc(2126);accessValidation(appname, text, updatedata+gitnewdata);
			__CLR4_1_1k4k4isihn5wy.R.inc(2127);Reporter.log("Response Status = " + "Before updating the Application accessdata is :" + updatedata + "\n");
			__CLR4_1_1k4k4isihn5wy.R.inc(2128);Reporter.log("Response Status = " + "cdeliveryOn - After updating the Application accessdata is :"
					+ updatedata + gitnewdata + "\n");
			__CLR4_1_1k4k4isihn5wy.R.inc(2129);Reporter.log("Response Status = " + appname + "cdeliveryon working successfully for this appllication \n");
		} catch (Exception e) {
			__CLR4_1_1k4k4isihn5wy.R.inc(2130);e.printStackTrace();
			__CLR4_1_1k4k4isihn5wy.R.inc(2131);Assert.fail(e.getMessage());
			__CLR4_1_1k4k4isihn5wy.R.inc(2132);Reporter.log("Response Status = " + "cdeliveryon failed for this appllication \n");
			__CLR4_1_1k4k4isihn5wy.R.inc(2133);driver.close();
		}

	}finally{__CLR4_1_1k4k4isihn5wy.R.flushNeeded();}}
	public void cdeliveryOff(String appname, String text, String updatedata, String gitdata)
			throws InterruptedException, AWTException, IOException {try{__CLR4_1_1k4k4isihn5wy.R.inc(2134);
		__CLR4_1_1k4k4isihn5wy.R.inc(2135);FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		__CLR4_1_1k4k4isihn5wy.R.inc(2136);prop.load(fs);
		__CLR4_1_1k4k4isihn5wy.R.inc(2137);WebDriverWait wait = new WebDriverWait(driver, 1000);
		__CLR4_1_1k4k4isihn5wy.R.inc(2138);try {
			__CLR4_1_1k4k4isihn5wy.R.inc(2139);driver.navigate().to(prop.getProperty("appurl"));
			__CLR4_1_1k4k4isihn5wy.R.inc(2140);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(2141);driver.navigate().refresh();
			__CLR4_1_1k4k4isihn5wy.R.inc(2142);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(2143);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("apppage"))));
			__CLR4_1_1k4k4isihn5wy.R.inc(2144);WebElement e1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("apppage"))));
			__CLR4_1_1k4k4isihn5wy.R.inc(2145);Actions act=new Actions(driver);
			__CLR4_1_1k4k4isihn5wy.R.inc(2146);act.moveToElement(e1).doubleClick(e1).build().perform();
			__CLR4_1_1k4k4isihn5wy.R.inc(2147);Thread.sleep(10000);
				__CLR4_1_1k4k4isihn5wy.R.inc(2148);searchDesign(appname);
			
			
				__CLR4_1_1k4k4isihn5wy.R.inc(2149);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("detailsbutton")))).click();
				__CLR4_1_1k4k4isihn5wy.R.inc(2150);Robot robot = new Robot();
				__CLR4_1_1k4k4isihn5wy.R.inc(2151);robot.keyPress(KeyEvent.VK_PAGE_UP);
				__CLR4_1_1k4k4isihn5wy.R.inc(2152);Thread.sleep(3000);
				__CLR4_1_1k4k4isihn5wy.R.inc(2153);robot.keyRelease(KeyEvent.VK_PAGE_UP);
				__CLR4_1_1k4k4isihn5wy.R.inc(2154);Thread.sleep(3000);
			__CLR4_1_1k4k4isihn5wy.R.inc(2155);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("action")))).click();
			__CLR4_1_1k4k4isihn5wy.R.inc(2156);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("cdeliveryon")))).click();
			
			__CLR4_1_1k4k4isihn5wy.R.inc(2157);driver.navigate().to(prop.getProperty("giturl"));
			__CLR4_1_1k4k4isihn5wy.R.inc(2158);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(2159);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("gitsignin")))).click();
			__CLR4_1_1k4k4isihn5wy.R.inc(2160);wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(prop.getProperty("gitusername"))))
					.sendKeys("sailakshmiv");
			__CLR4_1_1k4k4isihn5wy.R.inc(2161);wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(prop.getProperty("gitpassword"))))
					.sendKeys("trov-it123");
			__CLR4_1_1k4k4isihn5wy.R.inc(2162);wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(prop.getProperty("gitsigninbutton")))).click();
			
			__CLR4_1_1k4k4isihn5wy.R.inc(2163);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(2164);wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(prop.getProperty("gitantapplink")))).click();
			__CLR4_1_1k4k4isihn5wy.R.inc(2165);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(2166);wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(prop.getProperty("gitantapplinkchild")))).click();
			__CLR4_1_1k4k4isihn5wy.R.inc(2167);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(2168);String script = "<%@ page language=\"java\" contentType=\"text/html; charset=ISO-8859-1\"\n"+"pageEncoding=\"ISO-8859-1\"%>\n"+"<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n"+"<html>\n"+"<head>\n"+"<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n"+"<title>Insert title here</title>\n"+"</head>"+"<body>"+"<a href=\"HelloWorld\">click Here-goPaddle Bluemeric ANTAPP DEMO" + gitdata + "</a>\n"+"</body>\n"+"</html>";
			__CLR4_1_1k4k4isihn5wy.R.inc(2169);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("gitedit")))).click();
			__CLR4_1_1k4k4isihn5wy.R.inc(2170);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("gitedittext"))));

			__CLR4_1_1k4k4isihn5wy.R.inc(2171);Keyboard kb = ((HasInputDevices) driver).getKeyboard();
			__CLR4_1_1k4k4isihn5wy.R.inc(2172);kb.sendKeys(Keys.TAB);
			__CLR4_1_1k4k4isihn5wy.R.inc(2173);robot.keyPress(KeyEvent.VK_CONTROL);
			__CLR4_1_1k4k4isihn5wy.R.inc(2174);robot.keyPress(KeyEvent.VK_A);
			__CLR4_1_1k4k4isihn5wy.R.inc(2175);robot.keyRelease(KeyEvent.VK_A);
			__CLR4_1_1k4k4isihn5wy.R.inc(2176);robot.keyRelease(KeyEvent.VK_CONTROL);
			__CLR4_1_1k4k4isihn5wy.R.inc(2177);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(2178);robot.keyPress(KeyEvent.VK_DELETE);
			__CLR4_1_1k4k4isihn5wy.R.inc(2179);robot.keyRelease(KeyEvent.VK_DELETE);
			__CLR4_1_1k4k4isihn5wy.R.inc(2180);Thread.sleep(10000);

			__CLR4_1_1k4k4isihn5wy.R.inc(2181);StringSelection ss = new StringSelection(script);
			__CLR4_1_1k4k4isihn5wy.R.inc(2182);Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
			__CLR4_1_1k4k4isihn5wy.R.inc(2183);robot.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
			__CLR4_1_1k4k4isihn5wy.R.inc(2184);robot.keyPress(java.awt.event.KeyEvent.VK_V);
			__CLR4_1_1k4k4isihn5wy.R.inc(2185);robot.keyRelease(java.awt.event.KeyEvent.VK_V);
			__CLR4_1_1k4k4isihn5wy.R.inc(2186);robot.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
			__CLR4_1_1k4k4isihn5wy.R.inc(2187);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(2188);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("gitupdate")))).click();
			__CLR4_1_1k4k4isihn5wy.R.inc(2189);Thread.sleep(10000);
			//-------------------logout of git start------------------------------
			__CLR4_1_1k4k4isihn5wy.R.inc(2190);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("gitlogout")))).click();
			__CLR4_1_1k4k4isihn5wy.R.inc(2191);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(2192);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("gitlogoutchild")))).click();
			
			//-------------------logout of git end------------------------------
			__CLR4_1_1k4k4isihn5wy.R.inc(2193);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(2194);driver.navigate().to(prop.getProperty("appurl"));
			__CLR4_1_1k4k4isihn5wy.R.inc(2195);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(2196);driver.navigate().refresh();
			__CLR4_1_1k4k4isihn5wy.R.inc(2197);Thread.sleep(40000);

			__CLR4_1_1k4k4isihn5wy.R.inc(2198);accessValidation(appname, text, updatedata);
			__CLR4_1_1k4k4isihn5wy.R.inc(2199);Reporter.log("Response Status = " + "Before updating the Application accessdata is :" + updatedata + "\n");
			__CLR4_1_1k4k4isihn5wy.R.inc(2200);Reporter.log("Response Status = " + "cdeliveryOff - After updating the Application accessdata is :"
					+ updatedata + "\n");
			__CLR4_1_1k4k4isihn5wy.R.inc(2201);Reporter.log("Response Status = " + "cdeliveryoff working successfully for this appllication \n");
		} catch (Exception e) {
			__CLR4_1_1k4k4isihn5wy.R.inc(2202);e.printStackTrace();
			__CLR4_1_1k4k4isihn5wy.R.inc(2203);Assert.fail(e.getMessage());
			__CLR4_1_1k4k4isihn5wy.R.inc(2204);Reporter.log("Response Status = " + "cdeliveryoff failed for this appllication \n");
			__CLR4_1_1k4k4isihn5wy.R.inc(2205);driver.close();
		}
	}finally{__CLR4_1_1k4k4isihn5wy.R.flushNeeded();}}
	public void cdeliveryOffMultitier(String appname, String text, String updatedata, String gitdata)
			throws InterruptedException, AWTException, IOException {try{__CLR4_1_1k4k4isihn5wy.R.inc(2206);
		__CLR4_1_1k4k4isihn5wy.R.inc(2207);FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		__CLR4_1_1k4k4isihn5wy.R.inc(2208);prop.load(fs);
		__CLR4_1_1k4k4isihn5wy.R.inc(2209);WebDriverWait wait = new WebDriverWait(driver, 1000);
		__CLR4_1_1k4k4isihn5wy.R.inc(2210);try {
			__CLR4_1_1k4k4isihn5wy.R.inc(2211);driver.navigate().to(prop.getProperty("appurl"));
			
			__CLR4_1_1k4k4isihn5wy.R.inc(2212);driver.navigate().refresh();
			__CLR4_1_1k4k4isihn5wy.R.inc(2213);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(2214);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("apppage"))));
			__CLR4_1_1k4k4isihn5wy.R.inc(2215);WebElement e1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("apppage"))));
			__CLR4_1_1k4k4isihn5wy.R.inc(2216);Actions act=new Actions(driver);
			__CLR4_1_1k4k4isihn5wy.R.inc(2217);act.moveToElement(e1).doubleClick(e1).build().perform();
			__CLR4_1_1k4k4isihn5wy.R.inc(2218);Thread.sleep(10000);
				__CLR4_1_1k4k4isihn5wy.R.inc(2219);searchDesign(appname);
			
			
			__CLR4_1_1k4k4isihn5wy.R.inc(2220);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("detailsbutton")))).click();
			__CLR4_1_1k4k4isihn5wy.R.inc(2221);Robot robot = new Robot();
			__CLR4_1_1k4k4isihn5wy.R.inc(2222);robot.keyPress(KeyEvent.VK_PAGE_UP);
			__CLR4_1_1k4k4isihn5wy.R.inc(2223);Thread.sleep(3000);
			__CLR4_1_1k4k4isihn5wy.R.inc(2224);robot.keyRelease(KeyEvent.VK_PAGE_UP);
			__CLR4_1_1k4k4isihn5wy.R.inc(2225);Thread.sleep(3000);
			__CLR4_1_1k4k4isihn5wy.R.inc(2226);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("action")))).click();
			__CLR4_1_1k4k4isihn5wy.R.inc(2227);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("cdeliveryon")))).click();
			
			__CLR4_1_1k4k4isihn5wy.R.inc(2228);driver.navigate().to(prop.getProperty("giturlmulti"));
			__CLR4_1_1k4k4isihn5wy.R.inc(2229);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(2230);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("gitsignin")))).click();
			__CLR4_1_1k4k4isihn5wy.R.inc(2231);wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(prop.getProperty("gitusername"))))
					.sendKeys("sailakshmiv");
			__CLR4_1_1k4k4isihn5wy.R.inc(2232);wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(prop.getProperty("gitpassword"))))
					.sendKeys("trov-it123");
			__CLR4_1_1k4k4isihn5wy.R.inc(2233);wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(prop.getProperty("gitsigninbutton")))).click();
			__CLR4_1_1k4k4isihn5wy.R.inc(2234);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(2235);wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText(prop.getProperty("gitmultilink")))).click();
			__CLR4_1_1k4k4isihn5wy.R.inc(2236);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(2237);wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText(prop.getProperty("gitmultilinkchild")))).click();
			__CLR4_1_1k4k4isihn5wy.R.inc(2238);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(2239);wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(prop.getProperty("gitmultilinkchild1")))).click();
			__CLR4_1_1k4k4isihn5wy.R.inc(2240);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(2241);wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(prop.getProperty("gitmultilinkchild2")))).click();
			__CLR4_1_1k4k4isihn5wy.R.inc(2242);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(2243);String script = "<%@ taglib uri=\"http://java.sun.com/jsp/jstl/core\" prefix=\"c\" %>\n"+"<%@ page session=\"false\" %>\n"+"<html>\n"+"<head>\n"+"<title>Home Page</title>\n"+"</head>\n"+"<body>\n"+"<h1>\n"+"Hello world!!!!!!\n"+"</h1>\n"+"${controllerMessage}<br/>\n"+"<br/>\n"+"<br/>\n"+"<a href=\"product/list\">:)Click here to view the Product list"+gitdata+"\n"+"</a>\n"+"</body>\n"+"</html>";
			__CLR4_1_1k4k4isihn5wy.R.inc(2244);wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath(prop.getProperty("gitedit")))).click();
			__CLR4_1_1k4k4isihn5wy.R.inc(2245);wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath(prop.getProperty("gitedittext"))));

			__CLR4_1_1k4k4isihn5wy.R.inc(2246);Keyboard kb = ((HasInputDevices) driver).getKeyboard();
			__CLR4_1_1k4k4isihn5wy.R.inc(2247);kb.sendKeys(Keys.TAB);
			__CLR4_1_1k4k4isihn5wy.R.inc(2248);robot.keyPress(KeyEvent.VK_CONTROL);
			__CLR4_1_1k4k4isihn5wy.R.inc(2249);robot.keyPress(KeyEvent.VK_A);
			__CLR4_1_1k4k4isihn5wy.R.inc(2250);robot.keyRelease(KeyEvent.VK_A);
			__CLR4_1_1k4k4isihn5wy.R.inc(2251);robot.keyRelease(KeyEvent.VK_CONTROL);
			__CLR4_1_1k4k4isihn5wy.R.inc(2252);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(2253);robot.keyPress(KeyEvent.VK_DELETE);
			__CLR4_1_1k4k4isihn5wy.R.inc(2254);robot.keyRelease(KeyEvent.VK_DELETE);
			__CLR4_1_1k4k4isihn5wy.R.inc(2255);Thread.sleep(10000);
			
			__CLR4_1_1k4k4isihn5wy.R.inc(2256);StringSelection ss = new StringSelection(script);
			__CLR4_1_1k4k4isihn5wy.R.inc(2257);Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
			__CLR4_1_1k4k4isihn5wy.R.inc(2258);robot.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
			__CLR4_1_1k4k4isihn5wy.R.inc(2259);robot.keyPress(java.awt.event.KeyEvent.VK_V);
			__CLR4_1_1k4k4isihn5wy.R.inc(2260);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(2261);robot.keyRelease(java.awt.event.KeyEvent.VK_V);
			__CLR4_1_1k4k4isihn5wy.R.inc(2262);robot.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
			__CLR4_1_1k4k4isihn5wy.R.inc(2263);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(2264);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("gitupdate")))).click();
			__CLR4_1_1k4k4isihn5wy.R.inc(2265);Thread.sleep(10000);
			//-------------------logout of git start------------------------------
			__CLR4_1_1k4k4isihn5wy.R.inc(2266);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("gitlogout")))).click();
			__CLR4_1_1k4k4isihn5wy.R.inc(2267);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(2268);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("gitlogoutchild")))).click();
			
			//-------------------logout of git end------------------------------
			__CLR4_1_1k4k4isihn5wy.R.inc(2269);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(2270);driver.navigate().to(prop.getProperty("appurl"));
			__CLR4_1_1k4k4isihn5wy.R.inc(2271);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(2272);driver.navigate().refresh();
			__CLR4_1_1k4k4isihn5wy.R.inc(2273);Thread.sleep(40000);

			__CLR4_1_1k4k4isihn5wy.R.inc(2274);accessValidation(appname, text, updatedata);
			__CLR4_1_1k4k4isihn5wy.R.inc(2275);Reporter.log("Response Status = " + "Before updating the Application accessdata is :" + updatedata + "\n");
			__CLR4_1_1k4k4isihn5wy.R.inc(2276);Reporter.log("Response Status = " + "cdeliveryOff - After updating the Application accessdata is :"
					+ updatedata + "\n");
			__CLR4_1_1k4k4isihn5wy.R.inc(2277);Reporter.log("Response Status = " + "cdeliveryoff working successfully for this appllication \n");
		} catch (Exception e) {
			__CLR4_1_1k4k4isihn5wy.R.inc(2278);e.printStackTrace();
			__CLR4_1_1k4k4isihn5wy.R.inc(2279);Assert.fail(e.getMessage());
			__CLR4_1_1k4k4isihn5wy.R.inc(2280);Reporter.log("Response Status = " + "cdeliveryoff failed for this appllication \n");
			__CLR4_1_1k4k4isihn5wy.R.inc(2281);driver.close();
		}
	}finally{__CLR4_1_1k4k4isihn5wy.R.flushNeeded();}}

	public void deleteApp(String appname) throws InterruptedException, IOException {try{__CLR4_1_1k4k4isihn5wy.R.inc(2282);
		__CLR4_1_1k4k4isihn5wy.R.inc(2283);FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		__CLR4_1_1k4k4isihn5wy.R.inc(2284);prop.load(fs);
		
		__CLR4_1_1k4k4isihn5wy.R.inc(2285);driver.navigate().to(prop.getProperty("appurl"));
		__CLR4_1_1k4k4isihn5wy.R.inc(2286);Thread.sleep(10000);
		__CLR4_1_1k4k4isihn5wy.R.inc(2287);driver.navigate().refresh();
		__CLR4_1_1k4k4isihn5wy.R.inc(2288);Thread.sleep(10000);
		__CLR4_1_1k4k4isihn5wy.R.inc(2289);try {
			__CLR4_1_1k4k4isihn5wy.R.inc(2290);WebDriverWait wait = new WebDriverWait(driver, 1000);
			__CLR4_1_1k4k4isihn5wy.R.inc(2291);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("apppage"))));
			__CLR4_1_1k4k4isihn5wy.R.inc(2292);WebElement e1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("apppage"))));
			__CLR4_1_1k4k4isihn5wy.R.inc(2293);Actions act=new Actions(driver);
			__CLR4_1_1k4k4isihn5wy.R.inc(2294);act.moveToElement(e1).doubleClick(e1).build().perform();
			__CLR4_1_1k4k4isihn5wy.R.inc(2295);Thread.sleep(10000);
				__CLR4_1_1k4k4isihn5wy.R.inc(2296);searchDesign(appname);
			
			__CLR4_1_1k4k4isihn5wy.R.inc(2297);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("appdelete")))).click();
			__CLR4_1_1k4k4isihn5wy.R.inc(2298);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(2299);List<WebElement> button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("appdeletechild"))))
					.findElements(By.tagName("button"));
			__CLR4_1_1k4k4isihn5wy.R.inc(2300);for (int i = 0; (((i < button.size())&&(__CLR4_1_1k4k4isihn5wy.R.iget(2301)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(2302)==0&false)); i++) {{
				__CLR4_1_1k4k4isihn5wy.R.inc(2303);if ((((button.get(i).getText().equals("Delete"))&&(__CLR4_1_1k4k4isihn5wy.R.iget(2304)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(2305)==0&false))) {{
					__CLR4_1_1k4k4isihn5wy.R.inc(2306);Thread.sleep(10000);
					__CLR4_1_1k4k4isihn5wy.R.inc(2307);button.get(i).click();
				}
			}}
			}__CLR4_1_1k4k4isihn5wy.R.inc(2308);Reporter.log("Response Status = " + appname + "app deletion initiated \n");
		} catch (Exception e) {
			__CLR4_1_1k4k4isihn5wy.R.inc(2309);e.printStackTrace();
			__CLR4_1_1k4k4isihn5wy.R.inc(2310);Assert.fail(e.getMessage());
			__CLR4_1_1k4k4isihn5wy.R.inc(2311);Reporter.log("Response Status = " + "app deletion failed initiated \n");
			__CLR4_1_1k4k4isihn5wy.R.inc(2312);driver.close();
		}
	}finally{__CLR4_1_1k4k4isihn5wy.R.flushNeeded();}}
	public void deleteDesign(String design) throws InterruptedException, IOException {try{__CLR4_1_1k4k4isihn5wy.R.inc(2313);
		__CLR4_1_1k4k4isihn5wy.R.inc(2314);FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		__CLR4_1_1k4k4isihn5wy.R.inc(2315);prop.load(fs);
		__CLR4_1_1k4k4isihn5wy.R.inc(2316);WebDriverWait wait = new WebDriverWait(driver, 1000);
		__CLR4_1_1k4k4isihn5wy.R.inc(2317);Thread.sleep(10000);
		__CLR4_1_1k4k4isihn5wy.R.inc(2318);driver.navigate().to(prop.getProperty("appurl"));
		__CLR4_1_1k4k4isihn5wy.R.inc(2319);Thread.sleep(10000);
		__CLR4_1_1k4k4isihn5wy.R.inc(2320);driver.navigate().refresh();
		__CLR4_1_1k4k4isihn5wy.R.inc(2321);Thread.sleep(10000);
		__CLR4_1_1k4k4isihn5wy.R.inc(2322);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("design"))));
		__CLR4_1_1k4k4isihn5wy.R.inc(2323);try {
			
			__CLR4_1_1k4k4isihn5wy.R.inc(2324);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("design"))));
			__CLR4_1_1k4k4isihn5wy.R.inc(2325);WebElement e1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("design"))));
			__CLR4_1_1k4k4isihn5wy.R.inc(2326);Actions act=new Actions(driver);
			__CLR4_1_1k4k4isihn5wy.R.inc(2327);act.moveToElement(e1).doubleClick(e1).build().perform();
			__CLR4_1_1k4k4isihn5wy.R.inc(2328);Thread.sleep(10000);
				__CLR4_1_1k4k4isihn5wy.R.inc(2329);searchDesign(design);
			
			__CLR4_1_1k4k4isihn5wy.R.inc(2330);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("appdelete")))).click();
			
			__CLR4_1_1k4k4isihn5wy.R.inc(2331);List<WebElement> button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("appdeletechild"))))
					.findElements(By.tagName("button"));
			__CLR4_1_1k4k4isihn5wy.R.inc(2332);for (int i = 0; (((i < button.size())&&(__CLR4_1_1k4k4isihn5wy.R.iget(2333)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(2334)==0&false)); i++) {{
				__CLR4_1_1k4k4isihn5wy.R.inc(2335);if ((((button.get(i).getText().equals("Delete"))&&(__CLR4_1_1k4k4isihn5wy.R.iget(2336)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(2337)==0&false))) {{
					
					__CLR4_1_1k4k4isihn5wy.R.inc(2338);button.get(i).click();
				}
			}}
			}__CLR4_1_1k4k4isihn5wy.R.inc(2339);Reporter.log("Response Status = " + design + " deletion initiated \n");
		} catch (Exception e) {
			__CLR4_1_1k4k4isihn5wy.R.inc(2340);e.printStackTrace();
			__CLR4_1_1k4k4isihn5wy.R.inc(2341);Assert.fail(e.getMessage());
			__CLR4_1_1k4k4isihn5wy.R.inc(2342);Reporter.log("Response Status = " + " deletion failed initiated \n");
			__CLR4_1_1k4k4isihn5wy.R.inc(2343);driver.close();
		}
	}finally{__CLR4_1_1k4k4isihn5wy.R.flushNeeded();}}
	public void deleteDesignValidation(String design) throws InterruptedException, IOException {try{__CLR4_1_1k4k4isihn5wy.R.inc(2344);
		__CLR4_1_1k4k4isihn5wy.R.inc(2345);FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		__CLR4_1_1k4k4isihn5wy.R.inc(2346);prop.load(fs);
		__CLR4_1_1k4k4isihn5wy.R.inc(2347);Thread.sleep(10000);
		__CLR4_1_1k4k4isihn5wy.R.inc(2348);boolean temp=true;
		__CLR4_1_1k4k4isihn5wy.R.inc(2349);WebDriverWait wait=new WebDriverWait(driver,1000);
		__CLR4_1_1k4k4isihn5wy.R.inc(2350);driver.navigate().to(prop.getProperty("appurl"));
		__CLR4_1_1k4k4isihn5wy.R.inc(2351);Thread.sleep(10000);
		__CLR4_1_1k4k4isihn5wy.R.inc(2352);driver.navigate().refresh();
		__CLR4_1_1k4k4isihn5wy.R.inc(2353);Thread.sleep(10000);
		__CLR4_1_1k4k4isihn5wy.R.inc(2354);try{
		__CLR4_1_1k4k4isihn5wy.R.inc(2355);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("design"))));
		
		__CLR4_1_1k4k4isihn5wy.R.inc(2356);WebElement e1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("design"))));
		__CLR4_1_1k4k4isihn5wy.R.inc(2357);Actions act=new Actions(driver);
		__CLR4_1_1k4k4isihn5wy.R.inc(2358);act.moveToElement(e1).doubleClick(e1).build().perform();
		__CLR4_1_1k4k4isihn5wy.R.inc(2359);Thread.sleep(10000);
		__CLR4_1_1k4k4isihn5wy.R.inc(2360);List<WebElement> pagination = driver
				.findElement(By.xpath(prop.getProperty("list")))
				.findElements(By.tagName("li"));
	
			__CLR4_1_1k4k4isihn5wy.R.inc(2361);OUTER: for (int i = 2; (((i < pagination.size() - 2)&&(__CLR4_1_1k4k4isihn5wy.R.iget(2362)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(2363)==0&false)); i++) {{
				__CLR4_1_1k4k4isihn5wy.R.inc(2364);Thread.sleep(10000);
				__CLR4_1_1k4k4isihn5wy.R.inc(2365);if((((i!=2)&&(__CLR4_1_1k4k4isihn5wy.R.iget(2366)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(2367)==0&false))){{
					__CLR4_1_1k4k4isihn5wy.R.inc(2368);pagination.get(i).findElement(By.tagName("a")).click();
					}
				}__CLR4_1_1k4k4isihn5wy.R.inc(2369);Thread.sleep(10000);
				__CLR4_1_1k4k4isihn5wy.R.inc(2370);boolean b1=isElementPresent(By.xpath("//h6[text()='"+ design +"']"));
				__CLR4_1_1k4k4isihn5wy.R.inc(2371);Thread.sleep(10000);
				__CLR4_1_1k4k4isihn5wy.R.inc(2372);if((((b1)&&(__CLR4_1_1k4k4isihn5wy.R.iget(2373)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(2374)==0&false))){{
					__CLR4_1_1k4k4isihn5wy.R.inc(2375);Thread.sleep(10000);
					__CLR4_1_1k4k4isihn5wy.R.inc(2376);wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h6[text()='"+ design +"']"))).click();
					__CLR4_1_1k4k4isihn5wy.R.inc(2377);temp = true;
					__CLR4_1_1k4k4isihn5wy.R.inc(2378);break OUTER;
				}
				
		
	}}

				}__CLR4_1_1k4k4isihn5wy.R.inc(2379);if ((((temp == false)&&(__CLR4_1_1k4k4isihn5wy.R.iget(2380)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(2381)==0&false))) {{
					__CLR4_1_1k4k4isihn5wy.R.inc(2382);Assert.assertTrue(true, "Image removed successfully");
				}
				}else
				{{
					__CLR4_1_1k4k4isihn5wy.R.inc(2383);Assert.assertFalse(false);
				}
			}__CLR4_1_1k4k4isihn5wy.R.inc(2384);log.info("search design successfully");
			__CLR4_1_1k4k4isihn5wy.R.inc(2385);Reporter.log("Response Status = " + design + " deleted successfully \n");
		} catch (Exception e) {
			__CLR4_1_1k4k4isihn5wy.R.inc(2386);e.printStackTrace();
			__CLR4_1_1k4k4isihn5wy.R.inc(2387);Assert.fail(e.getMessage());
			__CLR4_1_1k4k4isihn5wy.R.inc(2388);Reporter.log("Response Status = " + " deletion failed \n");
			__CLR4_1_1k4k4isihn5wy.R.inc(2389);driver.close();
		}
	}finally{__CLR4_1_1k4k4isihn5wy.R.flushNeeded();}}

	public void deleteValidation(String appname) throws InterruptedException, IOException {try{__CLR4_1_1k4k4isihn5wy.R.inc(2390);
		__CLR4_1_1k4k4isihn5wy.R.inc(2391);FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		__CLR4_1_1k4k4isihn5wy.R.inc(2392);prop.load(fs);
		__CLR4_1_1k4k4isihn5wy.R.inc(2393);Thread.sleep(10000);
		__CLR4_1_1k4k4isihn5wy.R.inc(2394);boolean temp=true;
		__CLR4_1_1k4k4isihn5wy.R.inc(2395);WebDriverWait wait=new WebDriverWait(driver,1000);
		__CLR4_1_1k4k4isihn5wy.R.inc(2396);driver.navigate().to(prop.getProperty("appurl"));
		__CLR4_1_1k4k4isihn5wy.R.inc(2397);Thread.sleep(10000);
		__CLR4_1_1k4k4isihn5wy.R.inc(2398);driver.navigate().refresh();
		__CLR4_1_1k4k4isihn5wy.R.inc(2399);Thread.sleep(10000);
		__CLR4_1_1k4k4isihn5wy.R.inc(2400);try{
		__CLR4_1_1k4k4isihn5wy.R.inc(2401);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("apppage"))));
		
		__CLR4_1_1k4k4isihn5wy.R.inc(2402);WebElement e1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("apppage"))));
		__CLR4_1_1k4k4isihn5wy.R.inc(2403);Actions act=new Actions(driver);
		__CLR4_1_1k4k4isihn5wy.R.inc(2404);act.moveToElement(e1).doubleClick(e1).build().perform();
		__CLR4_1_1k4k4isihn5wy.R.inc(2405);Thread.sleep(10000);
		__CLR4_1_1k4k4isihn5wy.R.inc(2406);List<WebElement> pagination = driver
				.findElement(By.xpath(prop.getProperty("list")))
				.findElements(By.tagName("li"));
	
		
			__CLR4_1_1k4k4isihn5wy.R.inc(2407);OUTER: for (int i = 2; (((i < pagination.size() - 2)&&(__CLR4_1_1k4k4isihn5wy.R.iget(2408)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(2409)==0&false)); i++) {{
				__CLR4_1_1k4k4isihn5wy.R.inc(2410);Thread.sleep(10000);
				__CLR4_1_1k4k4isihn5wy.R.inc(2411);if((((i!=2)&&(__CLR4_1_1k4k4isihn5wy.R.iget(2412)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(2413)==0&false))){{
					__CLR4_1_1k4k4isihn5wy.R.inc(2414);pagination.get(i).findElement(By.tagName("a")).click();
					}
				}__CLR4_1_1k4k4isihn5wy.R.inc(2415);Thread.sleep(10000);
				__CLR4_1_1k4k4isihn5wy.R.inc(2416);boolean b1=isElementPresent(By.xpath("//h6[text()='"+ appname +"']"));
				__CLR4_1_1k4k4isihn5wy.R.inc(2417);Thread.sleep(10000);
				__CLR4_1_1k4k4isihn5wy.R.inc(2418);if((((b1)&&(__CLR4_1_1k4k4isihn5wy.R.iget(2419)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(2420)==0&false))){{
					__CLR4_1_1k4k4isihn5wy.R.inc(2421);Thread.sleep(10000);
					__CLR4_1_1k4k4isihn5wy.R.inc(2422);wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h6[text()='"+ appname +"']"))).click();
					__CLR4_1_1k4k4isihn5wy.R.inc(2423);temp = true;
					__CLR4_1_1k4k4isihn5wy.R.inc(2424);break OUTER;
				}
				
		
	}}

				}__CLR4_1_1k4k4isihn5wy.R.inc(2425);if ((((temp == false)&&(__CLR4_1_1k4k4isihn5wy.R.iget(2426)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(2427)==0&false))) {{
					__CLR4_1_1k4k4isihn5wy.R.inc(2428);Assert.assertTrue(true, "Image removed successfully");
				}
				}else
				{{
					__CLR4_1_1k4k4isihn5wy.R.inc(2429);Assert.assertFalse(false);
				}
			}__CLR4_1_1k4k4isihn5wy.R.inc(2430);log.info("search design successfully");
			__CLR4_1_1k4k4isihn5wy.R.inc(2431);Reporter.log("Response Status = " + appname + "app deleted successfully \n");
		} catch (Exception e) {
			__CLR4_1_1k4k4isihn5wy.R.inc(2432);e.printStackTrace();
			__CLR4_1_1k4k4isihn5wy.R.inc(2433);Assert.fail(e.getMessage());
			__CLR4_1_1k4k4isihn5wy.R.inc(2434);Reporter.log("Response Status = " + "app deletion failed \n");
			__CLR4_1_1k4k4isihn5wy.R.inc(2435);driver.close();
		}
	}finally{__CLR4_1_1k4k4isihn5wy.R.flushNeeded();}}

	public void clusterDeletion(String kubname) throws InterruptedException, IOException {try{__CLR4_1_1k4k4isihn5wy.R.inc(2436);
		__CLR4_1_1k4k4isihn5wy.R.inc(2437);FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		__CLR4_1_1k4k4isihn5wy.R.inc(2438);prop.load(fs);
		__CLR4_1_1k4k4isihn5wy.R.inc(2439);Thread.sleep(10000);
		__CLR4_1_1k4k4isihn5wy.R.inc(2440);try {
			__CLR4_1_1k4k4isihn5wy.R.inc(2441);driver.navigate().to(prop.getProperty("googleconsole"));
			__CLR4_1_1k4k4isihn5wy.R.inc(2442);Thread.sleep(20000);
			__CLR4_1_1k4k4isihn5wy.R.inc(2443);WebDriverWait wait = new WebDriverWait(driver, 1000);
			__CLR4_1_1k4k4isihn5wy.R.inc(2444);Thread.sleep(20000);
			__CLR4_1_1k4k4isihn5wy.R.inc(2445);boolean b = driver.findElement((By.xpath(prop.getProperty("googletable")))).isDisplayed();
			__CLR4_1_1k4k4isihn5wy.R.inc(2446);if((((!b)&&(__CLR4_1_1k4k4isihn5wy.R.iget(2447)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(2448)==0&false))){{
			__CLR4_1_1k4k4isihn5wy.R.inc(2449);wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("table")));
			__CLR4_1_1k4k4isihn5wy.R.inc(2450);WebElement table = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("table")));
			__CLR4_1_1k4k4isihn5wy.R.inc(2451);WebElement tbody = table.findElement(By.tagName("tbody"));
			__CLR4_1_1k4k4isihn5wy.R.inc(2452);List<WebElement> tr = tbody.findElements(By.tagName("tr"));
			__CLR4_1_1k4k4isihn5wy.R.inc(2453);for (WebElement trnew : tr) {{
				__CLR4_1_1k4k4isihn5wy.R.inc(2454);List<WebElement> td = trnew.findElements(By.tagName("td"));
				__CLR4_1_1k4k4isihn5wy.R.inc(2455);for (int i = 0; (((i < td.size())&&(__CLR4_1_1k4k4isihn5wy.R.iget(2456)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(2457)==0&false)); i++) {{
					__CLR4_1_1k4k4isihn5wy.R.inc(2458);if (((((td.get(i).getText().equals(kubname)))&&(__CLR4_1_1k4k4isihn5wy.R.iget(2459)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(2460)==0&false))) {{

						__CLR4_1_1k4k4isihn5wy.R.inc(2461);td.get(i + 1).click();
					}
				}}
			}}
			
			}__CLR4_1_1k4k4isihn5wy.R.inc(2462);wait.until(ExpectedConditions.visibilityOfElementLocated(By
					.xpath(prop.getProperty("googleclustdelete"))))
					.click();
			__CLR4_1_1k4k4isihn5wy.R.inc(2463);Thread.sleep(10000);
			__CLR4_1_1k4k4isihn5wy.R.inc(2464);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("googledelte")))).click();
			__CLR4_1_1k4k4isihn5wy.R.inc(2465);Thread.sleep(10000);
			}
			}else {{
				__CLR4_1_1k4k4isihn5wy.R.inc(2466);Assert.assertTrue(true, "Table not found");
			}
			}__CLR4_1_1k4k4isihn5wy.R.inc(2467);Reporter.log("Response Status = " + "cluster deletion initiated \n");

		} catch (Exception e) {
			__CLR4_1_1k4k4isihn5wy.R.inc(2468);e.printStackTrace();
			__CLR4_1_1k4k4isihn5wy.R.inc(2469);Assert.fail(e.getMessage());
			__CLR4_1_1k4k4isihn5wy.R.inc(2470);Reporter.log("Response Status = " + "cluster deletion initiation failed \n");
			__CLR4_1_1k4k4isihn5wy.R.inc(2471);driver.close();
		}
	}finally{__CLR4_1_1k4k4isihn5wy.R.flushNeeded();}}

	public void clusterDeletionvalidation(String kubname) throws InterruptedException, IOException {try{__CLR4_1_1k4k4isihn5wy.R.inc(2472);
		__CLR4_1_1k4k4isihn5wy.R.inc(2473);FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		__CLR4_1_1k4k4isihn5wy.R.inc(2474);prop.load(fs);
		__CLR4_1_1k4k4isihn5wy.R.inc(2475);boolean flag = false;
	
		__CLR4_1_1k4k4isihn5wy.R.inc(2476);WebDriverWait wait = new WebDriverWait(driver, 1000);
		__CLR4_1_1k4k4isihn5wy.R.inc(2477);try {
			__CLR4_1_1k4k4isihn5wy.R.inc(2478);while ((((!flag)&&(__CLR4_1_1k4k4isihn5wy.R.iget(2479)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(2480)==0&false))) {{
				__CLR4_1_1k4k4isihn5wy.R.inc(2481);driver.navigate().refresh();
				__CLR4_1_1k4k4isihn5wy.R.inc(2482);Thread.sleep(20000);
				__CLR4_1_1k4k4isihn5wy.R.inc(2483);boolean b = driver.findElement(By.xpath(prop.getProperty("googletable"))).isDisplayed();
				__CLR4_1_1k4k4isihn5wy.R.inc(2484);if ((((!b)&&(__CLR4_1_1k4k4isihn5wy.R.iget(2485)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(2486)==0&false))) {{

					__CLR4_1_1k4k4isihn5wy.R.inc(2487);wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("table")));
					__CLR4_1_1k4k4isihn5wy.R.inc(2488);WebElement table1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("table")));
					__CLR4_1_1k4k4isihn5wy.R.inc(2489);WebElement tbody1 = table1.findElement(By.tagName("tbody"));
					__CLR4_1_1k4k4isihn5wy.R.inc(2490);List<WebElement> tr1 = tbody1.findElements(By.tagName("tr"));
					__CLR4_1_1k4k4isihn5wy.R.inc(2491);for (int j = 0; (((j < tr1.size())&&(__CLR4_1_1k4k4isihn5wy.R.iget(2492)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(2493)==0&false)); j++) {{
						__CLR4_1_1k4k4isihn5wy.R.inc(2494);List<WebElement> td1 = tr1.get(j).findElements(By.tagName("td"));
						__CLR4_1_1k4k4isihn5wy.R.inc(2495);for (int i = 0; (((i < td1.size())&&(__CLR4_1_1k4k4isihn5wy.R.iget(2496)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(2497)==0&false)); i++) {{
							__CLR4_1_1k4k4isihn5wy.R.inc(2498);if (((((tr1.get(j).getText().contains(kubname)))&&(__CLR4_1_1k4k4isihn5wy.R.iget(2499)!=0|true))||(__CLR4_1_1k4k4isihn5wy.R.iget(2500)==0&false))) {{
								__CLR4_1_1k4k4isihn5wy.R.inc(2501);flag = false;

							} }else {{
								__CLR4_1_1k4k4isihn5wy.R.inc(2502);flag = true;
							}
						}}
					}}
				}} }else {{
					__CLR4_1_1k4k4isihn5wy.R.inc(2503);flag = true;
					__CLR4_1_1k4k4isihn5wy.R.inc(2504);Assert.assertTrue(true, "Table not found");
				}
			}}
			}__CLR4_1_1k4k4isihn5wy.R.inc(2505);Thread.sleep(10000);
     
			__CLR4_1_1k4k4isihn5wy.R.inc(2506);Reporter.log("Response Status = " + "cluster deleted successfully \n");
		} catch (Exception e) {
			__CLR4_1_1k4k4isihn5wy.R.inc(2507);e.printStackTrace();
			__CLR4_1_1k4k4isihn5wy.R.inc(2508);Assert.fail(e.getMessage());
			__CLR4_1_1k4k4isihn5wy.R.inc(2509);Reporter.log("Response Status = " + "cluster deletion  failed \n");
			__CLR4_1_1k4k4isihn5wy.R.inc(2510);driver.close();
		}

	}finally{__CLR4_1_1k4k4isihn5wy.R.flushNeeded();}}	
		
	 
	public String screenshot(String screenshot,String cloud,String clust) throws IOException {try{__CLR4_1_1k4k4isihn5wy.R.inc(2511);
		__CLR4_1_1k4k4isihn5wy.R.inc(2512);FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		__CLR4_1_1k4k4isihn5wy.R.inc(2513);prop.load(fs);
		__CLR4_1_1k4k4isihn5wy.R.inc(2514);screenload= System.getProperty("user.dir") + "/test-output/"+cloud+clust+"/html/";
		__CLR4_1_1k4k4isihn5wy.R.inc(2515);File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		__CLR4_1_1k4k4isihn5wy.R.inc(2516);FileUtils.copyFile(screen, new File(screenload + screenshot + ".png"));
		__CLR4_1_1k4k4isihn5wy.R.inc(2517);System.setProperty("org.uncommons.reportng.escape-output", "false");
		__CLR4_1_1k4k4isihn5wy.R.inc(2518);String image = screenget + screenshot + ".png";
		__CLR4_1_1k4k4isihn5wy.R.inc(2519);Reporter.log("<a title= \"title\" href=\"" + image + "\">" + "<img width=\"700\" height=\"550\" src=\"" + image
				+ "\"></a>");
		__CLR4_1_1k4k4isihn5wy.R.inc(2520);return image;

	}finally{__CLR4_1_1k4k4isihn5wy.R.flushNeeded();}}

	@Override
	public void onTestStart(ITestResult result) {try{__CLR4_1_1k4k4isihn5wy.R.inc(2521);
		// TODO Auto-generated method stub

	}finally{__CLR4_1_1k4k4isihn5wy.R.flushNeeded();}}

	@Override
	public void onTestSuccess(ITestResult result) {try{__CLR4_1_1k4k4isihn5wy.R.inc(2522);
		// TODO Auto-generated method stub

	}finally{__CLR4_1_1k4k4isihn5wy.R.flushNeeded();}}

	@Override
	public void onTestFailure(ITestResult result) {try{__CLR4_1_1k4k4isihn5wy.R.inc(2523);
		// TODO Auto-generated method stub

	}finally{__CLR4_1_1k4k4isihn5wy.R.flushNeeded();}}

	@Override
	public void onTestSkipped(ITestResult result) {try{__CLR4_1_1k4k4isihn5wy.R.inc(2524);
		// TODO Auto-generated method stub

	}finally{__CLR4_1_1k4k4isihn5wy.R.flushNeeded();}}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {try{__CLR4_1_1k4k4isihn5wy.R.inc(2525);
		// TODO Auto-generated method stub

	}finally{__CLR4_1_1k4k4isihn5wy.R.flushNeeded();}}

	@Override
	public void onStart(ITestContext context) {try{__CLR4_1_1k4k4isihn5wy.R.inc(2526);
		// TODO Auto-generated method stub

	}finally{__CLR4_1_1k4k4isihn5wy.R.flushNeeded();}}

	@Override
	public void onFinish(ITestContext context) {try{__CLR4_1_1k4k4isihn5wy.R.inc(2527);
		// TODO Auto-generated method stub

	}finally{__CLR4_1_1k4k4isihn5wy.R.flushNeeded();}}
}
