/* $$ This file has been instrumented by Clover 4.1.1#20151207095404243 $$ */package org.bluemeric.suites;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.xml.bind.JAXBException;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.bluemeric.common.XmltoJava;
import org.bluemeric.utility.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlInclude;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Suite implements ITestListener {public static class __CLR4_1_1g6g6isihn5nq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_1();if(20151207095404243L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.1#20151207095404243,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0054\u0072\u006f\u0076\u0053\u0061\u0069\u005c\u005c\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u005c\u005c\u0047\u006f\u0070\u0061\u0064\u0064\u006c\u0065\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1472622883817L,8589935092L,724,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	static WebDriver driver;
	//static ChromeDriver driver;
	static boolean status = true;
	static String projectHome = System.getProperty("user.dir");
	static Logger log = Logger.getLogger(Utility.class);
	public static ExtentReports report;
	public static ExtentTest test;
	static String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
	List<XmlSuite> xmlSuites;
	static String workspace = System.getProperty("user.dir");
	public static final String USERNAME = "v_m_k_r";
	 public static final String ACCESS_KEY = "b2379be9-08d0-41fa-b821-d99437e63d7d";
	 public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
	//static String cloud;
	public Suite() {try{__CLR4_1_1g6g6isihn5nq.R.inc(582);
		__CLR4_1_1g6g6isihn5nq.R.inc(583);xmlSuites = new ArrayList<XmlSuite>();
	}finally{__CLR4_1_1g6g6isihn5nq.R.flushNeeded();}}

	public WebDriver newDriver() {try{__CLR4_1_1g6g6isihn5nq.R.inc(584);
		__CLR4_1_1g6g6isihn5nq.R.inc(585);if ((((driver == null)&&(__CLR4_1_1g6g6isihn5nq.R.iget(586)!=0|true))||(__CLR4_1_1g6g6isihn5nq.R.iget(587)==0&false))) {{
			__CLR4_1_1g6g6isihn5nq.R.inc(588);return new ChromeDriver();
		}
		}__CLR4_1_1g6g6isihn5nq.R.inc(589);return driver;
	}finally{__CLR4_1_1g6g6isihn5nq.R.flushNeeded();}}
	public void method(boolean stat) {try{__CLR4_1_1g6g6isihn5nq.R.inc(590);
		__CLR4_1_1g6g6isihn5nq.R.inc(591);status = stat;
	}finally{__CLR4_1_1g6g6isihn5nq.R.flushNeeded();}}

	public static void login(String cloud) throws IOException {try{__CLR4_1_1g6g6isihn5nq.R.inc(592);
		__CLR4_1_1g6g6isihn5nq.R.inc(593);try {
			__CLR4_1_1g6g6isihn5nq.R.inc(594);File file = new File(workspace + "/src/file.Properties");

			__CLR4_1_1g6g6isihn5nq.R.inc(595);if ((((file.delete())&&(__CLR4_1_1g6g6isihn5nq.R.iget(596)!=0|true))||(__CLR4_1_1g6g6isihn5nq.R.iget(597)==0&false))) {{
			} }else {{
			}
			}__CLR4_1_1g6g6isihn5nq.R.inc(598);file.createNewFile();
			__CLR4_1_1g6g6isihn5nq.R.inc(599);Thread.sleep(10000);

		} catch (Exception e) {
			__CLR4_1_1g6g6isihn5nq.R.inc(600);e.printStackTrace();
		}
	
	}finally{__CLR4_1_1g6g6isihn5nq.R.flushNeeded();}}
	public static void logout() throws IOException {try{__CLR4_1_1g6g6isihn5nq.R.inc(601);
		__CLR4_1_1g6g6isihn5nq.R.inc(602);driver.close();
		}finally{__CLR4_1_1g6g6isihn5nq.R.flushNeeded();}}

	private void runTests(TestNG tng, String cloud,String clust) throws JAXBException, Exception {try{__CLR4_1_1g6g6isihn5nq.R.inc(603);
		__CLR4_1_1g6g6isihn5nq.R.inc(604);XmltoJava xmltojava;

		__CLR4_1_1g6g6isihn5nq.R.inc(605);xmltojava = (XmltoJava) org.bluemeric.common.GenericClass
				.unmarshallClass(projectHome + "/src" + "/" + "config.xml", XmltoJava.class);
		__CLR4_1_1g6g6isihn5nq.R.inc(606);for (int k = 0; (((k < xmltojava.getSuite().length)&&(__CLR4_1_1g6g6isihn5nq.R.iget(607)!=0|true))||(__CLR4_1_1g6g6isihn5nq.R.iget(608)==0&false)); k++) {{

			__CLR4_1_1g6g6isihn5nq.R.inc(609);XmlSuite suite = new XmlSuite();

			__CLR4_1_1g6g6isihn5nq.R.inc(610);ArrayList<XmlTest> tests = new ArrayList<XmlTest>();

			__CLR4_1_1g6g6isihn5nq.R.inc(611);for (int l = 0; (((l < xmltojava.getSuite()[k].getParameter().length)&&(__CLR4_1_1g6g6isihn5nq.R.iget(612)!=0|true))||(__CLR4_1_1g6g6isihn5nq.R.iget(613)==0&false)); l++) {{

				__CLR4_1_1g6g6isihn5nq.R.inc(614);Map<String, String> parameters = new HashMap<String, String>();

				__CLR4_1_1g6g6isihn5nq.R.inc(615);suite.setName(xmltojava.getSuite()[k].getClassname() + " - "
						+ xmltojava.getSuite()[k].getSuitename());
				__CLR4_1_1g6g6isihn5nq.R.inc(616);List<XmlTest> xmlTest = new ArrayList<XmlTest>();
				__CLR4_1_1g6g6isihn5nq.R.inc(617);XmlTest test = new XmlTest(suite);
				__CLR4_1_1g6g6isihn5nq.R.inc(618);test.setName(cloud + xmltojava.getSuite()[k].getParameter()[l].getTestcase());

				__CLR4_1_1g6g6isihn5nq.R.inc(619);parameters.put("suiteName", xmltojava.getSuite()[k].getSuitename());
				__CLR4_1_1g6g6isihn5nq.R.inc(620);parameters.put("Testcase", xmltojava.getSuite()[k].getParameter()[l].getTestcase());
				__CLR4_1_1g6g6isihn5nq.R.inc(621);parameters.put("param", xmltojava.getSuite()[k].getParameter()[l].getParam());
				__CLR4_1_1g6g6isihn5nq.R.inc(622);parameters.put("cloud", cloud);
				__CLR4_1_1g6g6isihn5nq.R.inc(623);parameters.put("clust", clust);
				__CLR4_1_1g6g6isihn5nq.R.inc(624);parameters.put("param1", xmltojava.getSuite()[k].getParameter()[l].getParam1());
				__CLR4_1_1g6g6isihn5nq.R.inc(625);parameters.put("param2", xmltojava.getSuite()[k].getParameter()[l].getParam2());
				__CLR4_1_1g6g6isihn5nq.R.inc(626);parameters.put("param3", xmltojava.getSuite()[k].getParameter()[l].getParam3());
				__CLR4_1_1g6g6isihn5nq.R.inc(627);parameters.put("param4", xmltojava.getSuite()[k].getParameter()[l].getParam4());
				__CLR4_1_1g6g6isihn5nq.R.inc(628);parameters.put("param5", xmltojava.getSuite()[k].getParameter()[l].getParam5());
				__CLR4_1_1g6g6isihn5nq.R.inc(629);parameters.put("param6", xmltojava.getSuite()[k].getParameter()[l].getParam6());
				__CLR4_1_1g6g6isihn5nq.R.inc(630);parameters.put("param7", xmltojava.getSuite()[k].getParameter()[l].getParam7());
				__CLR4_1_1g6g6isihn5nq.R.inc(631);parameters.put("param8", xmltojava.getSuite()[k].getParameter()[l].getParam8());
				__CLR4_1_1g6g6isihn5nq.R.inc(632);parameters.put("param9", xmltojava.getSuite()[k].getParameter()[l].getParam9());
				__CLR4_1_1g6g6isihn5nq.R.inc(633);parameters.put("param10", xmltojava.getSuite()[k].getParameter()[l].getParam10());
				__CLR4_1_1g6g6isihn5nq.R.inc(634);parameters.put("Depends", xmltojava.getSuite()[k].getParameter()[l].getDependson());

				__CLR4_1_1g6g6isihn5nq.R.inc(635);test.setParameters(parameters);

				__CLR4_1_1g6g6isihn5nq.R.inc(636);ArrayList<XmlInclude> methodsToRun = new ArrayList<XmlInclude>();
				__CLR4_1_1g6g6isihn5nq.R.inc(637);ArrayList<XmlClass> classes1 = new ArrayList<XmlClass>();
				__CLR4_1_1g6g6isihn5nq.R.inc(638);XmlClass classes = new XmlClass();

				__CLR4_1_1g6g6isihn5nq.R.inc(639);classes.setName("org.bluemeric.common." + xmltojava.getSuite()[k].getClassname());

				__CLR4_1_1g6g6isihn5nq.R.inc(640);methodsToRun.add(new XmlInclude(xmltojava.getSuite()[k].getParameter()[l].getTestcase()));
				__CLR4_1_1g6g6isihn5nq.R.inc(641);classes.setIncludedMethods(methodsToRun);
				__CLR4_1_1g6g6isihn5nq.R.inc(642);classes1.add(classes);
				__CLR4_1_1g6g6isihn5nq.R.inc(643);test.setXmlClasses(classes1);
				__CLR4_1_1g6g6isihn5nq.R.inc(644);xmlTest.add(test);
				__CLR4_1_1g6g6isihn5nq.R.inc(645);tests.addAll(xmlTest);
			}
			}__CLR4_1_1g6g6isihn5nq.R.inc(646);suite.setTests(tests);

			__CLR4_1_1g6g6isihn5nq.R.inc(647);xmlSuites.add(suite);
		}
		}__CLR4_1_1g6g6isihn5nq.R.inc(648);tng.setXmlSuites(xmlSuites);
		
		__CLR4_1_1g6g6isihn5nq.R.inc(649);tng.run();
	}finally{__CLR4_1_1g6g6isihn5nq.R.flushNeeded();}}

	public static void main(String[] args) throws JAXBException, Exception {try{__CLR4_1_1g6g6isihn5nq.R.inc(650);
		__CLR4_1_1g6g6isihn5nq.R.inc(651);ChromeOptions options = new ChromeOptions();
		__CLR4_1_1g6g6isihn5nq.R.inc(652);options.addArguments("chrome.switches","--disable-extensions");
		__CLR4_1_1g6g6isihn5nq.R.inc(653);System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		__CLR4_1_1g6g6isihn5nq.R.inc(654);System.setProperty("file.log", "./log/log.log");
		__CLR4_1_1g6g6isihn5nq.R.inc(655);PropertyConfigurator.configure("./log4j.properties");
		__CLR4_1_1g6g6isihn5nq.R.inc(656);Suite rtest = new Suite();
		__CLR4_1_1g6g6isihn5nq.R.inc(657);TestNG tng = new TestNG();
		__CLR4_1_1g6g6isihn5nq.R.inc(658);Properties prop = new Properties();
		__CLR4_1_1g6g6isihn5nq.R.inc(659);FileInputStream fs = new FileInputStream(workspace + "/properties.properties");
		__CLR4_1_1g6g6isihn5nq.R.inc(660);prop.load(fs);
		__CLR4_1_1g6g6isihn5nq.R.inc(661);for (int i = 0; (((i < args.length)&&(__CLR4_1_1g6g6isihn5nq.R.iget(662)!=0|true))||(__CLR4_1_1g6g6isihn5nq.R.iget(663)==0&false)); i++) {{
			__CLR4_1_1g6g6isihn5nq.R.inc(664);String cloud = args[i];
			/*DesiredCapabilities caps = DesiredCapabilities.chrome();
			  caps.setCapability("platform", "Windows 7");
			  caps.setCapability("version", "51.0");
			  driver = new RemoteWebDriver(new java.net.URL(URL) , caps);*/
			__CLR4_1_1g6g6isihn5nq.R.inc(665);driver=new ChromeDriver(options);
			  
			  __CLR4_1_1g6g6isihn5nq.R.inc(666);Google google = new Google();
			__CLR4_1_1g6g6isihn5nq.R.inc(667);Azure azure = new Azure();
			__CLR4_1_1g6g6isihn5nq.R.inc(668);Directlogin dc=new Directlogin();
			__CLR4_1_1g6g6isihn5nq.R.inc(669);login(cloud);
			__CLR4_1_1g6g6isihn5nq.R.inc(670);if ((((cloud.equals("Google"))&&(__CLR4_1_1g6g6isihn5nq.R.iget(671)!=0|true))||(__CLR4_1_1g6g6isihn5nq.R.iget(672)==0&false))) {{
				__CLR4_1_1g6g6isihn5nq.R.inc(673);System.out.println("Google");
				__CLR4_1_1g6g6isihn5nq.R.inc(674);report = new ExtentReports(projectHome+"/test-output/"+cloud+"kub"+"/ExtendedReports"+timeStamp+".html");
				__CLR4_1_1g6g6isihn5nq.R.inc(675);report.loadConfig(new File("C:\\extentreports-java-v2.41.0\\extent-config.xml"));
				__CLR4_1_1g6g6isihn5nq.R.inc(676);rtest = new Suite();
				__CLR4_1_1g6g6isihn5nq.R.inc(677);google.login(cloud);
				__CLR4_1_1g6g6isihn5nq.R.inc(678);tng.setOutputDirectory("test-output/"+cloud+"kub"+"/");
				__CLR4_1_1g6g6isihn5nq.R.inc(679);tng.addListener(rtest);
				__CLR4_1_1g6g6isihn5nq.R.inc(680);rtest.runTests(tng, cloud,"kub");
				__CLR4_1_1g6g6isihn5nq.R.inc(681);logout();
			} 
			}else {__CLR4_1_1g6g6isihn5nq.R.inc(682);if((((cloud.equals("Azure"))&&(__CLR4_1_1g6g6isihn5nq.R.iget(683)!=0|true))||(__CLR4_1_1g6g6isihn5nq.R.iget(684)==0&false))) {{
				__CLR4_1_1g6g6isihn5nq.R.inc(685);String s[]={"swarm","kub"};
				__CLR4_1_1g6g6isihn5nq.R.inc(686);for(int j=0;(((j<s.length)&&(__CLR4_1_1g6g6isihn5nq.R.iget(687)!=0|true))||(__CLR4_1_1g6g6isihn5nq.R.iget(688)==0&false));j++){{
				__CLR4_1_1g6g6isihn5nq.R.inc(689);System.out.println("Azure");
				__CLR4_1_1g6g6isihn5nq.R.inc(690);System.out.println(s[j]);
				__CLR4_1_1g6g6isihn5nq.R.inc(691);login(cloud);
				__CLR4_1_1g6g6isihn5nq.R.inc(692);if((((s[j]=="swarm")&&(__CLR4_1_1g6g6isihn5nq.R.iget(693)!=0|true))||(__CLR4_1_1g6g6isihn5nq.R.iget(694)==0&false))){{
				__CLR4_1_1g6g6isihn5nq.R.inc(695);azure.login(cloud);
				}
				}__CLR4_1_1g6g6isihn5nq.R.inc(696);report = new ExtentReports(projectHome+"/test-output/"+cloud+s[j]+"/ExtendedReports"+timeStamp+".html");
				__CLR4_1_1g6g6isihn5nq.R.inc(697);report.loadConfig(new File("C:\\extentreports-java-v2.41.0\\extent-config.xml"));
				__CLR4_1_1g6g6isihn5nq.R.inc(698);System.out.println("hi");
				__CLR4_1_1g6g6isihn5nq.R.inc(699);rtest = new Suite();
				__CLR4_1_1g6g6isihn5nq.R.inc(700);tng.setOutputDirectory("test-output/"+cloud+s[j]+"/");
				__CLR4_1_1g6g6isihn5nq.R.inc(701);tng.addListener(rtest);
				__CLR4_1_1g6g6isihn5nq.R.inc(702);rtest.runTests(tng, cloud,s[j]);
				__CLR4_1_1g6g6isihn5nq.R.inc(703);driver.navigate().to(prop.getProperty("appurl"));
				
				}
				}__CLR4_1_1g6g6isihn5nq.R.inc(704);logout();
			}
			}else {__CLR4_1_1g6g6isihn5nq.R.inc(705);if((((cloud.equals("Direct"))&&(__CLR4_1_1g6g6isihn5nq.R.iget(706)!=0|true))||(__CLR4_1_1g6g6isihn5nq.R.iget(707)==0&false))){{
				__CLR4_1_1g6g6isihn5nq.R.inc(708);report = new ExtentReports(projectHome+"/test-output/"+cloud+"kub"+"/ExtendedReports"+timeStamp+".html");
				__CLR4_1_1g6g6isihn5nq.R.inc(709);report.loadConfig(new File("C:\\extentreports-java-v2.41.0\\extent-config.xml"));
				__CLR4_1_1g6g6isihn5nq.R.inc(710);System.out.println("Direct");
				__CLR4_1_1g6g6isihn5nq.R.inc(711);rtest = new Suite();
				__CLR4_1_1g6g6isihn5nq.R.inc(712);dc.login(cloud);
				__CLR4_1_1g6g6isihn5nq.R.inc(713);tng.setOutputDirectory("test-output/"+cloud+"kub"+"/");
				__CLR4_1_1g6g6isihn5nq.R.inc(714);tng.addListener(rtest);
				__CLR4_1_1g6g6isihn5nq.R.inc(715);rtest.runTests(tng, cloud,"kub");
				__CLR4_1_1g6g6isihn5nq.R.inc(716);logout();
			}
			}}}}
		}}finally{__CLR4_1_1g6g6isihn5nq.R.flushNeeded();}}	
	

	@Override
	public void onFinish(ITestContext arg0) {try{__CLR4_1_1g6g6isihn5nq.R.inc(717);
		// TODO Auto-generated method stub

	}finally{__CLR4_1_1g6g6isihn5nq.R.flushNeeded();}}

	@Override
	public void onStart(ITestContext arg0) {try{__CLR4_1_1g6g6isihn5nq.R.inc(718);
		// TODO Auto-generated method stub

	}finally{__CLR4_1_1g6g6isihn5nq.R.flushNeeded();}}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {try{__CLR4_1_1g6g6isihn5nq.R.inc(719);
		// TODO Auto-generated method stub

	}finally{__CLR4_1_1g6g6isihn5nq.R.flushNeeded();}}

	@Override
	public void onTestFailure(ITestResult arg0) {try{__CLR4_1_1g6g6isihn5nq.R.inc(720);
		// TODO Auto-generated method stub

	}finally{__CLR4_1_1g6g6isihn5nq.R.flushNeeded();}}

	@Override
	public void onTestSkipped(ITestResult arg0) {try{__CLR4_1_1g6g6isihn5nq.R.inc(721);
		// TODO Auto-generated method stub

	}finally{__CLR4_1_1g6g6isihn5nq.R.flushNeeded();}}

	@Override
	public void onTestStart(ITestResult arg0) {try{__CLR4_1_1g6g6isihn5nq.R.inc(722);
		// TODO Auto-generated method stub

	}finally{__CLR4_1_1g6g6isihn5nq.R.flushNeeded();}}

	@Override
	public void onTestSuccess(ITestResult arg0) {try{__CLR4_1_1g6g6isihn5nq.R.inc(723);
		// TODO Auto-generated method stub

	}finally{__CLR4_1_1g6g6isihn5nq.R.flushNeeded();}}

}
