/* $$ This file has been instrumented by Clover 4.1.1#20151207095404243 $$ */package org.bluemeric.common;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.bluemeric.suites.Suite;
import org.bluemeric.utility.Utility;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

@Listeners(org.uncommons.reportng.HTMLReporter.class)
	public class Multitier implements ITestListener{public static class __CLR4_1_1jjisihn5ie{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_1();if(20151207095404243L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.1#20151207095404243,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0054\u0072\u006f\u0076\u0053\u0061\u0069\u005c\u005c\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u005c\u005c\u0047\u006f\u0070\u0061\u0064\u0064\u006c\u0065\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1472622883817L,8589935092L,171,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

		
	Utility utility = new Utility();
	String workspace=System.getProperty("user.dir");
	Properties prop = new Properties();
	ExtentReports report=Suite.report;
	ExtentTest test=Suite.test;
	
	@Parameters({"suiteName","cloud","clust"})
	@BeforeMethod
	 public void createreport(ITestContext arg0,@Optional String suiteName,@Optional String cloud,@Optional String clust){try{__CLR4_1_1jjisihn5ie.R.inc(19);
		__CLR4_1_1jjisihn5ie.R.inc(20);try{
			__CLR4_1_1jjisihn5ie.R.inc(21);test = report.startTest(arg0.getName());
	    __CLR4_1_1jjisihn5ie.R.inc(22);test.assignCategory(cloud+"-"+suiteName);
		}
		catch(Exception e){
		__CLR4_1_1jjisihn5ie.R.inc(23);e.printStackTrace();
		}
	 }finally{__CLR4_1_1jjisihn5ie.R.flushNeeded();}}
	@Parameters({"param","param1","param2","cloud","clust"})
	@Test
	public void createMultitierDesign(@Optional String param,@Optional String param1,@Optional String param2,@Optional String cloud,@Optional String clust) throws  IOException, InterruptedException{try{__CLR4_1_1jjisihn5ie.R.inc(24);
		__CLR4_1_1jjisihn5ie.R.inc(25);if((((param.equals("Redis"))&&(__CLR4_1_1jjisihn5ie.R.iget(26)!=0|true))||(__CLR4_1_1jjisihn5ie.R.iget(27)==0&false))){{
			__CLR4_1_1jjisihn5ie.R.inc(28);utility.createRedisComponent(param, param1,param2);
		}}else{{
		__CLR4_1_1jjisihn5ie.R.inc(29);utility.createMultitierDesign(param, param1,param2);
		}
	
	}}finally{__CLR4_1_1jjisihn5ie.R.flushNeeded();}}
	@Parameters({"param","param1", "Depends","suiteName","cloud","clust"})
	@Test
	public void multilinkComponent(@Optional String param,@Optional String param1,@Optional String Depends,@Optional String suiteName,@Optional String cloud,@Optional String clust) throws  IOException, AWTException, InterruptedException{try{__CLR4_1_1jjisihn5ie.R.inc(30);
		__CLR4_1_1jjisihn5ie.R.inc(31);FileInputStream skip = new FileInputStream(workspace + "/src/file.Properties");
		  __CLR4_1_1jjisihn5ie.R.inc(32);prop.load(skip);
		  __CLR4_1_1jjisihn5ie.R.inc(33);if ((((prop.getProperty(cloud+suiteName+Depends).equals("FAIL"))&&(__CLR4_1_1jjisihn5ie.R.iget(34)!=0|true))||(__CLR4_1_1jjisihn5ie.R.iget(35)==0&false))) {{__CLR4_1_1jjisihn5ie.R.inc(36);throw new SkipException("Skip");}
		}__CLR4_1_1jjisihn5ie.R.inc(37);utility.linkComponent(param, param1);
	
	}finally{__CLR4_1_1jjisihn5ie.R.flushNeeded();}}
	@Parameters({"param","param1","param2","param3","param4","param5","param6","param7","param8","param9","param10","cloud","clust"})
	@Test
	public void createSingletierDesign(@Optional String param,@Optional String param1,@Optional String param2,@Optional String param3,@Optional String param4,@Optional String param5,@Optional String param6,@Optional String param7,@Optional String param8,@Optional String param9,@Optional String param10,@Optional String cloud,@Optional String clust) throws InterruptedException, IOException, AWTException {try{__CLR4_1_1jjisihn5ie.R.inc(38);
		__CLR4_1_1jjisihn5ie.R.inc(39);utility.createSingletierDesign(param, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10);
		
	}finally{__CLR4_1_1jjisihn5ie.R.flushNeeded();}}
	@Parameters({"param","param1", "Depends","suiteName","cloud","clust"})
	@Test
	public void linkComponent(@Optional String param,@Optional String param1,@Optional String Depends,@Optional String suiteName,@Optional String cloud,@Optional String clust) throws  IOException, AWTException, InterruptedException{try{__CLR4_1_1jjisihn5ie.R.inc(40);
		__CLR4_1_1jjisihn5ie.R.inc(41);FileInputStream skip = new FileInputStream(workspace + "/src/file.Properties");
		  __CLR4_1_1jjisihn5ie.R.inc(42);prop.load(skip);
		  __CLR4_1_1jjisihn5ie.R.inc(43);if ((((prop.getProperty(cloud+suiteName+Depends).equals("FAIL"))&&(__CLR4_1_1jjisihn5ie.R.iget(44)!=0|true))||(__CLR4_1_1jjisihn5ie.R.iget(45)==0&false))) {{__CLR4_1_1jjisihn5ie.R.inc(46);throw new SkipException("Skip");}
		}__CLR4_1_1jjisihn5ie.R.inc(47);utility.linkComponent(param, param1);
	
	}finally{__CLR4_1_1jjisihn5ie.R.flushNeeded();}}
	
	@Parameters({"param", "Depends","suiteName","cloud","clust"})
	@Test
	public void publish(@Optional String param,@Optional String Depends,@Optional String suiteName,@Optional String cloud,@Optional String clust) throws AWTException, IOException, InterruptedException{try{__CLR4_1_1jjisihn5ie.R.inc(48);
		__CLR4_1_1jjisihn5ie.R.inc(49);FileInputStream skip = new FileInputStream(workspace + "/src/file.Properties");
		  __CLR4_1_1jjisihn5ie.R.inc(50);prop.load(skip);
		  __CLR4_1_1jjisihn5ie.R.inc(51);if ((((prop.getProperty(cloud+suiteName+Depends).equals("FAIL") || prop.getProperty(cloud+suiteName+Depends).equals("SKIP") )&&(__CLR4_1_1jjisihn5ie.R.iget(52)!=0|true))||(__CLR4_1_1jjisihn5ie.R.iget(53)==0&false))) {{__CLR4_1_1jjisihn5ie.R.inc(54);throw new SkipException("Skip");}
		}__CLR4_1_1jjisihn5ie.R.inc(55);utility.publish(param);
	
	}finally{__CLR4_1_1jjisihn5ie.R.flushNeeded();}}
	@Parameters({"param", "Depends","suiteName","cloud","clust"})
	@Test
	public void designValidation(@Optional String param,@Optional String Depends,@Optional String suiteName,@Optional String cloud,@Optional String clust) throws  InterruptedException, IOException{try{__CLR4_1_1jjisihn5ie.R.inc(56);
		__CLR4_1_1jjisihn5ie.R.inc(57);FileInputStream skip = new FileInputStream(workspace + "/src/file.Properties");
		  __CLR4_1_1jjisihn5ie.R.inc(58);prop.load(skip);
		  __CLR4_1_1jjisihn5ie.R.inc(59);if ((((prop.getProperty(cloud+suiteName+Depends).equals("FAIL") || prop.getProperty(cloud+suiteName+Depends).equals("SKIP") )&&(__CLR4_1_1jjisihn5ie.R.iget(60)!=0|true))||(__CLR4_1_1jjisihn5ie.R.iget(61)==0&false))) {{__CLR4_1_1jjisihn5ie.R.inc(62);throw new SkipException("Skip");}
		}__CLR4_1_1jjisihn5ie.R.inc(63);utility.designValidation(param);
	
	}finally{__CLR4_1_1jjisihn5ie.R.flushNeeded();}}
	@Parameters({"param","param1","param2","param3","cloud","clust"})
	@Test
	public void launchApp(@Optional String param,@Optional String param1,@Optional String param2,@Optional String param3,@Optional String cloud,@Optional String clust) throws InterruptedException, IOException {try{__CLR4_1_1jjisihn5ie.R.inc(64);
		
		__CLR4_1_1jjisihn5ie.R.inc(65);utility.launchApp(clust,param, param1, param2, param3);
	}finally{__CLR4_1_1jjisihn5ie.R.flushNeeded();}}
	@Parameters({"param","Depends","suiteName","cloud","clust"})
	@Test
	public void launchValidation(@Optional String param,@Optional String Depends,@Optional String suiteName,@Optional String cloud,@Optional String clust) throws InterruptedException, IOException {try{__CLR4_1_1jjisihn5ie.R.inc(66);
		__CLR4_1_1jjisihn5ie.R.inc(67);FileInputStream skip = new FileInputStream(workspace + "/src/file.Properties");
		  __CLR4_1_1jjisihn5ie.R.inc(68);prop.load(skip);
		  __CLR4_1_1jjisihn5ie.R.inc(69);if ((((prop.getProperty(cloud+suiteName+Depends).equals("FAIL"))&&(__CLR4_1_1jjisihn5ie.R.iget(70)!=0|true))||(__CLR4_1_1jjisihn5ie.R.iget(71)==0&false))) {{__CLR4_1_1jjisihn5ie.R.inc(72);throw new SkipException("Skip");}
		  }__CLR4_1_1jjisihn5ie.R.inc(73);utility.launchValidation(param);
	}finally{__CLR4_1_1jjisihn5ie.R.flushNeeded();}}
	@Parameters({"param","param1","param2","Depends","suiteName","cloud","clust"})
	@Test
	public void accessValidation(@Optional String param,@Optional String param1,@Optional String param2,@Optional String Depends,@Optional String suiteName,@Optional String cloud,@Optional String clust) throws InterruptedException, IOException {try{__CLR4_1_1jjisihn5ie.R.inc(74);
		__CLR4_1_1jjisihn5ie.R.inc(75);FileInputStream skip = new FileInputStream(workspace + "/src/file.Properties");
		  __CLR4_1_1jjisihn5ie.R.inc(76);prop.load(skip);
		  __CLR4_1_1jjisihn5ie.R.inc(77);if ((((prop.getProperty(cloud+suiteName+Depends).equals("FAIL") || prop.getProperty(cloud+suiteName+Depends).equals("SKIP") )&&(__CLR4_1_1jjisihn5ie.R.iget(78)!=0|true))||(__CLR4_1_1jjisihn5ie.R.iget(79)==0&false))) {{__CLR4_1_1jjisihn5ie.R.inc(80);throw new SkipException("Skip");}
		  }__CLR4_1_1jjisihn5ie.R.inc(81);utility.accessValidation(param,param1,param2);
	}finally{__CLR4_1_1jjisihn5ie.R.flushNeeded();}}
	@Parameters({"param","param1","cloud","clust"})
	@Test
	public void stopAction(@Optional String param,@Optional String param1) throws InterruptedException, IOException {try{__CLR4_1_1jjisihn5ie.R.inc(82);
		
		  __CLR4_1_1jjisihn5ie.R.inc(83);utility.stopAction(param,param1);
	}finally{__CLR4_1_1jjisihn5ie.R.flushNeeded();}}
	@Parameters({"param","param1","param2","Depends","suiteName","cloud","clust"})
	@Test
	public void startAction(@Optional String param,@Optional String param1,@Optional String param2,@Optional String Depends,@Optional String suiteName,@Optional String cloud,@Optional String clust) throws InterruptedException, IOException, AWTException {try{__CLR4_1_1jjisihn5ie.R.inc(84);
		__CLR4_1_1jjisihn5ie.R.inc(85);FileInputStream skip = new FileInputStream(workspace + "/src/file.Properties");
		  __CLR4_1_1jjisihn5ie.R.inc(86);prop.load(skip);
		  __CLR4_1_1jjisihn5ie.R.inc(87);if ((((prop.getProperty(cloud+suiteName+Depends).equals("FAIL") || prop.getProperty(cloud+suiteName+Depends).equals("SKIP") )&&(__CLR4_1_1jjisihn5ie.R.iget(88)!=0|true))||(__CLR4_1_1jjisihn5ie.R.iget(89)==0&false))) {{__CLR4_1_1jjisihn5ie.R.inc(90);throw new SkipException("Skip");}
		  }__CLR4_1_1jjisihn5ie.R.inc(91);utility.startAction(param,param1,param2);
	}finally{__CLR4_1_1jjisihn5ie.R.flushNeeded();}}
	@Parameters({"param","param1","param2","param3","Depends","suiteName","cloud","clust"})
	@Test
	public void cdeliveryOn(@Optional String param,@Optional String param1,@Optional String param2,@Optional String param3,@Optional String Depends,@Optional String suiteName,@Optional String cloud,@Optional String clust) throws InterruptedException, IOException, AWTException {try{__CLR4_1_1jjisihn5ie.R.inc(92);
		__CLR4_1_1jjisihn5ie.R.inc(93);FileInputStream skip = new FileInputStream(workspace + "/src/file.Properties");
		  __CLR4_1_1jjisihn5ie.R.inc(94);prop.load(skip);
		  __CLR4_1_1jjisihn5ie.R.inc(95);if ((((prop.getProperty(cloud+suiteName+Depends).equals("FAIL") || prop.getProperty(cloud+suiteName+Depends).equals("SKIP") )&&(__CLR4_1_1jjisihn5ie.R.iget(96)!=0|true))||(__CLR4_1_1jjisihn5ie.R.iget(97)==0&false))) {{__CLR4_1_1jjisihn5ie.R.inc(98);throw new SkipException("Skip");}
		  }__CLR4_1_1jjisihn5ie.R.inc(99);utility.cdeliveryOnMultitier(param,param1,param2,param3);
	}finally{__CLR4_1_1jjisihn5ie.R.flushNeeded();}}
	@Parameters({"param","param1","param2","param3","Depends","suiteName","cloud","clust"})
	@Test
	public void cdeliveryOff(@Optional String param,@Optional String param1,@Optional String param2,@Optional String param3,@Optional String Depends,@Optional String suiteName,@Optional String cloud,@Optional String clust) throws InterruptedException, AWTException, IOException {try{__CLR4_1_1jjisihn5ie.R.inc(100);
		__CLR4_1_1jjisihn5ie.R.inc(101);FileInputStream skip = new FileInputStream(workspace + "/src/file.Properties");
		  __CLR4_1_1jjisihn5ie.R.inc(102);prop.load(skip);
		  __CLR4_1_1jjisihn5ie.R.inc(103);if ((((prop.getProperty(cloud+suiteName+Depends).equals("FAIL") || prop.getProperty(cloud+suiteName+Depends).equals("SKIP") )&&(__CLR4_1_1jjisihn5ie.R.iget(104)!=0|true))||(__CLR4_1_1jjisihn5ie.R.iget(105)==0&false))) {{__CLR4_1_1jjisihn5ie.R.inc(106);throw new SkipException("Skip");}
		  }__CLR4_1_1jjisihn5ie.R.inc(107);utility.cdeliveryOffMultitier(param, param1, param2,param3);
	}finally{__CLR4_1_1jjisihn5ie.R.flushNeeded();}}
	@Parameters({"param","cloud","clust"})
	@Test
	public void deleteDesign(@Optional String param,@Optional String cloud,@Optional String clust) throws InterruptedException, IOException {try{__CLR4_1_1jjisihn5ie.R.inc(108);
		  __CLR4_1_1jjisihn5ie.R.inc(109);utility.deleteDesign(param);
	}finally{__CLR4_1_1jjisihn5ie.R.flushNeeded();}}
	@Parameters({"param","Depends","suiteName","cloud","clust"})
	@Test
	public void deleteDesignValidation(@Optional String param,@Optional String Depends,@Optional String suiteName,@Optional String cloud,@Optional String clust) throws InterruptedException, IOException {try{__CLR4_1_1jjisihn5ie.R.inc(110);
		__CLR4_1_1jjisihn5ie.R.inc(111);FileInputStream skip = new FileInputStream(workspace + "/src/file.Properties");
		  __CLR4_1_1jjisihn5ie.R.inc(112);prop.load(skip);
		  __CLR4_1_1jjisihn5ie.R.inc(113);if ((((prop.getProperty(cloud+suiteName+Depends).equals("FAIL") )&&(__CLR4_1_1jjisihn5ie.R.iget(114)!=0|true))||(__CLR4_1_1jjisihn5ie.R.iget(115)==0&false))) {{__CLR4_1_1jjisihn5ie.R.inc(116);throw new SkipException("Skip");}
		  }__CLR4_1_1jjisihn5ie.R.inc(117);utility.deleteDesignValidation(param);
	}finally{__CLR4_1_1jjisihn5ie.R.flushNeeded();}}
	@Parameters({"param","cloud","clust"})
	@Test
	public void deleteApp(@Optional String param,@Optional String cloud,@Optional String clust) throws InterruptedException, IOException {try{__CLR4_1_1jjisihn5ie.R.inc(118);
		  __CLR4_1_1jjisihn5ie.R.inc(119);utility.deleteApp(param);
	}finally{__CLR4_1_1jjisihn5ie.R.flushNeeded();}}
	@Parameters({"param","Depends","suiteName","cloud","clust"})
	@Test
	public void deleteValidation(@Optional String param,@Optional String Depends,@Optional String suiteName,@Optional String cloud,@Optional String clust) throws InterruptedException, IOException {try{__CLR4_1_1jjisihn5ie.R.inc(120);
		__CLR4_1_1jjisihn5ie.R.inc(121);FileInputStream skip = new FileInputStream(workspace + "/src/file.Properties");
		  __CLR4_1_1jjisihn5ie.R.inc(122);prop.load(skip);
		  __CLR4_1_1jjisihn5ie.R.inc(123);if ((((prop.getProperty(cloud+suiteName+Depends).equals("FAIL") )&&(__CLR4_1_1jjisihn5ie.R.iget(124)!=0|true))||(__CLR4_1_1jjisihn5ie.R.iget(125)==0&false))) {{__CLR4_1_1jjisihn5ie.R.inc(126);throw new SkipException("Skip");}
		  }__CLR4_1_1jjisihn5ie.R.inc(127);utility.deleteValidation(param);
	}finally{__CLR4_1_1jjisihn5ie.R.flushNeeded();}}
		
	@Parameters({"suiteName","cloud","clust"})
	@AfterMethod
		public void screenshot(ITestResult arg0,@Optional String suiteName,@Optional String cloud,@Optional String clust) {try{__CLR4_1_1jjisihn5ie.R.inc(128);
		__CLR4_1_1jjisihn5ie.R.inc(129);String screenshotname =cloud+suiteName+arg0.getName().toString(); 
		__CLR4_1_1jjisihn5ie.R.inc(130);try {
		     __CLR4_1_1jjisihn5ie.R.inc(131);String screenshot =  utility.screenshot(screenshotname,cloud,clust);
			 __CLR4_1_1jjisihn5ie.R.inc(132);System.setProperty("org.uncommons.reportng.escape-output", "false");
			   __CLR4_1_1jjisihn5ie.R.inc(133);Reporter.setCurrentTestResult(arg0); //// output gets lost without this entry
				  __CLR4_1_1jjisihn5ie.R.inc(134);Reporter.log(
				  "<a title= \"title\" href=\"" + screenshot + "\">" +
				 "<img width=\"700\" height=\"550\" src=\"" + screenshot +
				  "\"></a>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			__CLR4_1_1jjisihn5ie.R.inc(135);e.printStackTrace();
		}
			__CLR4_1_1jjisihn5ie.R.inc(136);int result=arg0.getStatus();
		      __CLR4_1_1jjisihn5ie.R.inc(137);String testcase =cloud+suiteName+arg0.getName().toString(); 
		     __CLR4_1_1jjisihn5ie.R.inc(138);Properties prop = new Properties();
		     __CLR4_1_1jjisihn5ie.R.inc(139);if((((result ==1)&&(__CLR4_1_1jjisihn5ie.R.iget(140)!=0|true))||(__CLR4_1_1jjisihn5ie.R.iget(141)==0&false))){{
		      __CLR4_1_1jjisihn5ie.R.inc(142);prop.put(testcase, "PASS");
		      __CLR4_1_1jjisihn5ie.R.inc(143);test.log(LogStatus.PASS, arg0.getName()+"Screencast below:" + test.addScreenCapture("./html/"+screenshotname+".png"),suiteName+arg0.getName());
		     }}else {__CLR4_1_1jjisihn5ie.R.inc(144);if((((result ==2)&&(__CLR4_1_1jjisihn5ie.R.iget(145)!=0|true))||(__CLR4_1_1jjisihn5ie.R.iget(146)==0&false))){{
		      __CLR4_1_1jjisihn5ie.R.inc(147);prop.put(testcase, "FAIL"); 
		      __CLR4_1_1jjisihn5ie.R.inc(148);test.log(LogStatus.FAIL, arg0.getName()+"Screencast below:" + test.addScreenCapture("./html/"+screenshotname+".png"),arg0.getThrowable());
		     }}else {__CLR4_1_1jjisihn5ie.R.inc(149);if((((result ==3)&&(__CLR4_1_1jjisihn5ie.R.iget(150)!=0|true))||(__CLR4_1_1jjisihn5ie.R.iget(151)==0&false))){{
		      __CLR4_1_1jjisihn5ie.R.inc(152);prop.put(testcase, "SKIP"); 
		      __CLR4_1_1jjisihn5ie.R.inc(153);test.log(LogStatus.SKIP, arg0.getName()+"Screencast below:" + test.addScreenCapture("./html/"+screenshotname+".png"),arg0.getThrowable());
		     }
		     }}}__CLR4_1_1jjisihn5ie.R.inc(154);try {
		      __CLR4_1_1jjisihn5ie.R.inc(155);FileInputStream fs = new FileInputStream(workspace + "/src/file.Properties");
		      __CLR4_1_1jjisihn5ie.R.inc(156);prop.load(fs);
		      __CLR4_1_1jjisihn5ie.R.inc(157);fs.close();
		      __CLR4_1_1jjisihn5ie.R.inc(158);FileOutputStream fos = new FileOutputStream(workspace + "/src/file.Properties");
		      __CLR4_1_1jjisihn5ie.R.inc(159);prop.store(fos, "Test Result");
	
		      __CLR4_1_1jjisihn5ie.R.inc(160);fos.flush();
		     } catch (IOException e) { 
		      // TODO Auto-generated catch block
		      __CLR4_1_1jjisihn5ie.R.inc(161);e.printStackTrace();
		     }
			
			__CLR4_1_1jjisihn5ie.R.inc(162);report.endTest(test);
			__CLR4_1_1jjisihn5ie.R.inc(163);report.flush();
		}finally{__CLR4_1_1jjisihn5ie.R.flushNeeded();}}
		@Override
		public void onFinish(ITestContext arg0) {try{__CLR4_1_1jjisihn5ie.R.inc(164);
			// TODO Auto-generated method stub
			
		}finally{__CLR4_1_1jjisihn5ie.R.flushNeeded();}}

		@Override
		public void onStart(ITestContext arg0) {try{__CLR4_1_1jjisihn5ie.R.inc(165);
			// TODO Auto-generated method stub
			
		}finally{__CLR4_1_1jjisihn5ie.R.flushNeeded();}}

		@Override
		public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {try{__CLR4_1_1jjisihn5ie.R.inc(166);
			// TODO Auto-generated method stub
			
		}finally{__CLR4_1_1jjisihn5ie.R.flushNeeded();}}

		@Override
		public void onTestFailure(ITestResult arg0) {try{__CLR4_1_1jjisihn5ie.R.inc(167);
			// TODO Auto-generated method stub
			
		}finally{__CLR4_1_1jjisihn5ie.R.flushNeeded();}}

		@Override
		public void onTestSkipped(ITestResult arg0) {try{__CLR4_1_1jjisihn5ie.R.inc(168);
			// TODO Auto-generated method stub
			
		}finally{__CLR4_1_1jjisihn5ie.R.flushNeeded();}}

		@Override
		public void onTestStart(ITestResult arg0) {try{__CLR4_1_1jjisihn5ie.R.inc(169);
			// TODO Auto-generated method stub
			
		}finally{__CLR4_1_1jjisihn5ie.R.flushNeeded();}}

		@Override
		public void onTestSuccess(ITestResult arg0) {try{__CLR4_1_1jjisihn5ie.R.inc(170);
			// TODO Auto-generated method stub
			
		}finally{__CLR4_1_1jjisihn5ie.R.flushNeeded();}}

}
	