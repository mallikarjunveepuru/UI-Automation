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
	public class Singletier implements ITestListener{public static class __CLR4_1_14r4risihn5k2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_1();if(20151207095404243L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.1#20151207095404243,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0054\u0072\u006f\u0076\u0053\u0061\u0069\u005c\u005c\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u005c\u005c\u0047\u006f\u0070\u0061\u0064\u0064\u006c\u0065\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1472622883817L,8589935092L,393,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

		
	Utility utility = new Utility();
	String workspace=System.getProperty("user.dir");
	Properties prop = new Properties();
	ExtentReports report=Suite.report;
	ExtentTest test=Suite.test;
	
	
	@Parameters({"suiteName","cloud","clust"})
	@BeforeMethod
	 public void createreport(ITestContext arg0,@Optional String suiteName,@Optional String cloud,@Optional String clust){try{__CLR4_1_14r4risihn5k2.R.inc(171);
		__CLR4_1_14r4risihn5k2.R.inc(172);try{
			__CLR4_1_14r4risihn5k2.R.inc(173);test = report.startTest(arg0.getName());
	    __CLR4_1_14r4risihn5k2.R.inc(174);test.assignCategory(cloud+"-"+suiteName);
		}
		catch(Exception e){
		__CLR4_1_14r4risihn5k2.R.inc(175);e.printStackTrace();
		}
	 }finally{__CLR4_1_14r4risihn5k2.R.flushNeeded();}}
	
	@Parameters({"param","param1","param2","cloud","clust"})
	@Test
	public void Addsourcecontrol(@Optional String param,@Optional String param1,@Optional String param2,@Optional String cloud,@Optional String clust) throws  IOException, AWTException, InterruptedException{try{__CLR4_1_14r4risihn5k2.R.inc(176);
		__CLR4_1_14r4risihn5k2.R.inc(177);if((((param2.equals("gitlab"))&&(__CLR4_1_14r4risihn5k2.R.iget(178)!=0|true))||(__CLR4_1_14r4risihn5k2.R.iget(179)==0&false))){{
			__CLR4_1_14r4risihn5k2.R.inc(180);utility.Addsourcecontrolgitlab(param, param1);
		}
		}else{{
		__CLR4_1_14r4risihn5k2.R.inc(181);utility.Addsourcecontrol(param, param1);
		}
	
	}}finally{__CLR4_1_14r4risihn5k2.R.flushNeeded();}}
	@Parameters({"param","param1", "Depends","suiteName","cloud","clust"})
	@Test
	public void Addsourcecontrolvalidation(@Optional String param,@Optional String param1,@Optional String Depends,@Optional String suiteName,@Optional String cloud,@Optional String clust) throws  IOException, AWTException, InterruptedException{try{__CLR4_1_14r4risihn5k2.R.inc(182);
		__CLR4_1_14r4risihn5k2.R.inc(183);FileInputStream skip = new FileInputStream(workspace + "/src/file.Properties");
		  __CLR4_1_14r4risihn5k2.R.inc(184);prop.load(skip);
		  __CLR4_1_14r4risihn5k2.R.inc(185);if ((((prop.getProperty(cloud+suiteName+Depends).equals("FAIL"))&&(__CLR4_1_14r4risihn5k2.R.iget(186)!=0|true))||(__CLR4_1_14r4risihn5k2.R.iget(187)==0&false))) {{__CLR4_1_14r4risihn5k2.R.inc(188);throw new SkipException("Skip");}
		}__CLR4_1_14r4risihn5k2.R.inc(189);if((((param1.equals("gitlab"))&&(__CLR4_1_14r4risihn5k2.R.iget(190)!=0|true))||(__CLR4_1_14r4risihn5k2.R.iget(191)==0&false))){{
			__CLR4_1_14r4risihn5k2.R.inc(192);utility.Addsourcecontrolgitlabvalidation(param);
		}}else{{
		  __CLR4_1_14r4risihn5k2.R.inc(193);utility.Addsourcecontrolvalidation(param);
		}	
	}}finally{__CLR4_1_14r4risihn5k2.R.flushNeeded();}}
	@Parameters({"param","param1","param2","param3","param4","param5","param6","param7","param8","param9","param10","cloud","clust"})
	@Test
	public void createSingletierDesign(@Optional String param,@Optional String param1,@Optional String param2,@Optional String param3,@Optional String param4,@Optional String param5,@Optional String param6,@Optional String param7,@Optional String param8,@Optional String param9,@Optional String param10,@Optional String cloud,@Optional String clust) throws InterruptedException, IOException, AWTException {try{__CLR4_1_14r4risihn5k2.R.inc(194);
		__CLR4_1_14r4risihn5k2.R.inc(195);utility.createSingletierDesign(param, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10);
		
	}finally{__CLR4_1_14r4risihn5k2.R.flushNeeded();}}
	@Parameters({"param","param1", "Depends","suiteName","cloud","clust"})
	@Test
	public void linkComponent(@Optional String param,@Optional String param1,@Optional String Depends,@Optional String suiteName,@Optional String cloud,@Optional String clust) throws  IOException, AWTException, InterruptedException{try{__CLR4_1_14r4risihn5k2.R.inc(196);
		__CLR4_1_14r4risihn5k2.R.inc(197);FileInputStream skip = new FileInputStream(workspace + "/src/file.Properties");
		  __CLR4_1_14r4risihn5k2.R.inc(198);prop.load(skip);
		  __CLR4_1_14r4risihn5k2.R.inc(199);if ((((prop.getProperty(cloud+suiteName+Depends).equals("FAIL"))&&(__CLR4_1_14r4risihn5k2.R.iget(200)!=0|true))||(__CLR4_1_14r4risihn5k2.R.iget(201)==0&false))) {{__CLR4_1_14r4risihn5k2.R.inc(202);throw new SkipException("Skip");}
		}__CLR4_1_14r4risihn5k2.R.inc(203);utility.linkComponent(param, param1);
	
	}finally{__CLR4_1_14r4risihn5k2.R.flushNeeded();}}
	@Parameters({"param","cloud","clust"})
	@Test
	public void sourceControlDeletion(@Optional String param,@Optional String cloud,@Optional String clust) throws InterruptedException, IOException {try{__CLR4_1_14r4risihn5k2.R.inc(204);
		  __CLR4_1_14r4risihn5k2.R.inc(205);utility.sourceControlDeletion(param);
	}finally{__CLR4_1_14r4risihn5k2.R.flushNeeded();}}
	@Parameters({"param", "Depends","suiteName","cloud","clust"})
	@Test
	public void sourceControlDeletionValidation(@Optional String param,@Optional String Depends,@Optional String suiteName,@Optional String cloud,@Optional String clust) throws InterruptedException, IOException {try{__CLR4_1_14r4risihn5k2.R.inc(206);
		__CLR4_1_14r4risihn5k2.R.inc(207);FileInputStream skip = new FileInputStream(workspace + "/src/file.Properties");
		  __CLR4_1_14r4risihn5k2.R.inc(208);prop.load(skip);
		  __CLR4_1_14r4risihn5k2.R.inc(209);if ((((prop.getProperty(cloud+suiteName+Depends).equals("FAIL") )&&(__CLR4_1_14r4risihn5k2.R.iget(210)!=0|true))||(__CLR4_1_14r4risihn5k2.R.iget(211)==0&false))) {{__CLR4_1_14r4risihn5k2.R.inc(212);throw new SkipException("Skip");}
		  }__CLR4_1_14r4risihn5k2.R.inc(213);utility.sourceControlDeletionValidation(param);
	}finally{__CLR4_1_14r4risihn5k2.R.flushNeeded();}}
	@Parameters({"param", "Depends","suiteName","cloud","clust"})
	@Test
	public void publish(@Optional String param,@Optional String Depends,@Optional String suiteName,@Optional String cloud,@Optional String clust) throws  AWTException, IOException, InterruptedException{try{__CLR4_1_14r4risihn5k2.R.inc(214);
		__CLR4_1_14r4risihn5k2.R.inc(215);FileInputStream skip = new FileInputStream(workspace + "/src/file.Properties");
		  __CLR4_1_14r4risihn5k2.R.inc(216);prop.load(skip);
		  __CLR4_1_14r4risihn5k2.R.inc(217);if ((((prop.getProperty(cloud+suiteName+Depends).equals("FAIL") || prop.getProperty(cloud+suiteName+Depends).equals("SKIP") )&&(__CLR4_1_14r4risihn5k2.R.iget(218)!=0|true))||(__CLR4_1_14r4risihn5k2.R.iget(219)==0&false))) {{__CLR4_1_14r4risihn5k2.R.inc(220);throw new SkipException("Skip");}
		}__CLR4_1_14r4risihn5k2.R.inc(221);utility.publish(param);
	
	}finally{__CLR4_1_14r4risihn5k2.R.flushNeeded();}}
	@Parameters({"param", "Depends","suiteName","cloud","clust"})
	@Test
	public void designValidation(@Optional String param,@Optional String Depends,@Optional String suiteName,@Optional String cloud,@Optional String clust) throws  InterruptedException, IOException{try{__CLR4_1_14r4risihn5k2.R.inc(222);
		__CLR4_1_14r4risihn5k2.R.inc(223);FileInputStream skip = new FileInputStream(workspace + "/src/file.Properties");
		  __CLR4_1_14r4risihn5k2.R.inc(224);prop.load(skip);
		  __CLR4_1_14r4risihn5k2.R.inc(225);if ((((prop.getProperty(cloud+suiteName+Depends).equals("FAIL") || prop.getProperty(cloud+suiteName+Depends).equals("SKIP") )&&(__CLR4_1_14r4risihn5k2.R.iget(226)!=0|true))||(__CLR4_1_14r4risihn5k2.R.iget(227)==0&false))) {{__CLR4_1_14r4risihn5k2.R.inc(228);throw new SkipException("Skip");}
		}__CLR4_1_14r4risihn5k2.R.inc(229);utility.designValidation(param);
	
	}finally{__CLR4_1_14r4risihn5k2.R.flushNeeded();}}
	@Parameters({"param","cloud","clust"})
	@Test
	public void createCluster(@Optional String param,@Optional String cloud,@Optional String clust) throws InterruptedException, IOException {try{__CLR4_1_14r4risihn5k2.R.inc(230);
		__CLR4_1_14r4risihn5k2.R.inc(231);if((((cloud.equals("Google") && clust.equals("kub"))&&(__CLR4_1_14r4risihn5k2.R.iget(232)!=0|true))||(__CLR4_1_14r4risihn5k2.R.iget(233)==0&false))){{
			__CLR4_1_14r4risihn5k2.R.inc(234);System.out.println("Google");
		__CLR4_1_14r4risihn5k2.R.inc(235);utility.createCluster(param);
		}
		}else {__CLR4_1_14r4risihn5k2.R.inc(236);if((((cloud.equals("Azure") && clust.equals("swarm"))&&(__CLR4_1_14r4risihn5k2.R.iget(237)!=0|true))||(__CLR4_1_14r4risihn5k2.R.iget(238)==0&false))){{
			__CLR4_1_14r4risihn5k2.R.inc(239);System.out.println("Azuresw");
			__CLR4_1_14r4risihn5k2.R.inc(240);utility.swarmCreation(param);
		}
		}else {__CLR4_1_14r4risihn5k2.R.inc(241);if((((cloud.equals("Azure") && clust.equals("kub"))&&(__CLR4_1_14r4risihn5k2.R.iget(242)!=0|true))||(__CLR4_1_14r4risihn5k2.R.iget(243)==0&false))){{
			__CLR4_1_14r4risihn5k2.R.inc(244);System.out.println("Azureku");
			__CLR4_1_14r4risihn5k2.R.inc(245);utility.createAzureCluster(param);
		}
		}else {__CLR4_1_14r4risihn5k2.R.inc(246);if((((cloud.equals("Direct") && clust.equals("kub"))&&(__CLR4_1_14r4risihn5k2.R.iget(247)!=0|true))||(__CLR4_1_14r4risihn5k2.R.iget(248)==0&false)))
		{{
			__CLR4_1_14r4risihn5k2.R.inc(249);System.out.println("Google");
			__CLR4_1_14r4risihn5k2.R.inc(250);utility.createdirectCluster(param);
		}
	}}}}}finally{__CLR4_1_14r4risihn5k2.R.flushNeeded();}}
	@Parameters({"param", "Depends","suiteName","cloud","clust"})
	@Test
	public void clusterValidation(@Optional String param, @Optional String Depends,@Optional String suiteName,@Optional String cloud,@Optional String clust) throws InterruptedException, IOException {try{__CLR4_1_14r4risihn5k2.R.inc(251);
		__CLR4_1_14r4risihn5k2.R.inc(252);FileInputStream skip = new FileInputStream(workspace + "/src/file.Properties");
		  __CLR4_1_14r4risihn5k2.R.inc(253);prop.load(skip);
		  __CLR4_1_14r4risihn5k2.R.inc(254);if ((((prop.getProperty(cloud+suiteName+Depends).equals("FAIL"))&&(__CLR4_1_14r4risihn5k2.R.iget(255)!=0|true))||(__CLR4_1_14r4risihn5k2.R.iget(256)==0&false))) {{__CLR4_1_14r4risihn5k2.R.inc(257);throw new SkipException("Skip");}
		  }__CLR4_1_14r4risihn5k2.R.inc(258);if((((cloud.equals("Google") || cloud.equals("Azure"))&&(__CLR4_1_14r4risihn5k2.R.iget(259)!=0|true))||(__CLR4_1_14r4risihn5k2.R.iget(260)==0&false))){{
		  __CLR4_1_14r4risihn5k2.R.inc(261);utility.clusterValidation(param);
		  }
		  }else{{
			  __CLR4_1_14r4risihn5k2.R.inc(262);utility.clusterRegistration(param);
		  }
	}}finally{__CLR4_1_14r4risihn5k2.R.flushNeeded();}}
	@Parameters({"param","cloud","clust"})
	@Test
	public void clusterDeletion(@Optional String param,@Optional String cloud,@Optional String clust) throws InterruptedException, IOException {try{__CLR4_1_14r4risihn5k2.R.inc(263);
		  __CLR4_1_14r4risihn5k2.R.inc(264);if((((cloud.equals("Google"))&&(__CLR4_1_14r4risihn5k2.R.iget(265)!=0|true))||(__CLR4_1_14r4risihn5k2.R.iget(266)==0&false))){{
			  
		__CLR4_1_14r4risihn5k2.R.inc(267);utility.clusterDeletion(param);
		}
		  }else {__CLR4_1_14r4risihn5k2.R.inc(268);if((((cloud.equals("Azure"))&&(__CLR4_1_14r4risihn5k2.R.iget(269)!=0|true))||(__CLR4_1_14r4risihn5k2.R.iget(270)==0&false)))
		  {{
			  __CLR4_1_14r4risihn5k2.R.inc(271);utility.azurClusterDeletion(param);
		  }
		  }else
		  {{
			  __CLR4_1_14r4risihn5k2.R.inc(272);utility.directClusterDeletion(param);
			  __CLR4_1_14r4risihn5k2.R.inc(273);utility.clusterDeletion(param);
		  }
	}}}finally{__CLR4_1_14r4risihn5k2.R.flushNeeded();}}
	@Parameters({"param","cloud","clust", "Depends","suiteName"})
	@Test
	public void clusterDeletionvalidation(@Optional String param,@Optional String cloud,@Optional String clust, @Optional String Depends,@Optional String suiteName) throws InterruptedException, IOException {try{__CLR4_1_14r4risihn5k2.R.inc(274);
		__CLR4_1_14r4risihn5k2.R.inc(275);FileInputStream skip = new FileInputStream(workspace + "/src/file.Properties");
		  __CLR4_1_14r4risihn5k2.R.inc(276);prop.load(skip);
		  __CLR4_1_14r4risihn5k2.R.inc(277);if ((((prop.getProperty(cloud+suiteName+Depends).equals("FAIL") || prop.getProperty(cloud+suiteName+Depends).equals("SKIP") )&&(__CLR4_1_14r4risihn5k2.R.iget(278)!=0|true))||(__CLR4_1_14r4risihn5k2.R.iget(279)==0&false))) {{__CLR4_1_14r4risihn5k2.R.inc(280);throw new SkipException("Skip");}
		 }__CLR4_1_14r4risihn5k2.R.inc(281);if((((cloud.equals("Google") || cloud.equals("Direct"))&&(__CLR4_1_14r4risihn5k2.R.iget(282)!=0|true))||(__CLR4_1_14r4risihn5k2.R.iget(283)==0&false))){{
		  __CLR4_1_14r4risihn5k2.R.inc(284);utility.clusterDeletionvalidation(param);
		 }
		 }else{{
			 __CLR4_1_14r4risihn5k2.R.inc(285);utility.deleteAzureValidation(param);
		 }
	}}finally{__CLR4_1_14r4risihn5k2.R.flushNeeded();}}
	@Parameters({"param","param1","param2","param3","cloud","clust"})
	@Test
	public void launchApp(@Optional String param,@Optional String param1,@Optional String param2,@Optional String param3,@Optional String cloud,@Optional String clust) throws InterruptedException, IOException {try{__CLR4_1_14r4risihn5k2.R.inc(286);
		__CLR4_1_14r4risihn5k2.R.inc(287);utility.launchApp(clust,param, param1, param2, param3);
	}finally{__CLR4_1_14r4risihn5k2.R.flushNeeded();}}
	@Parameters({"param","Depends","suiteName","cloud","clust"})
	@Test
	public void launchValidation(@Optional String param,@Optional String Depends,@Optional String suiteName,@Optional String cloud,@Optional String clust) throws InterruptedException, IOException {try{__CLR4_1_14r4risihn5k2.R.inc(288);
		__CLR4_1_14r4risihn5k2.R.inc(289);FileInputStream skip = new FileInputStream(workspace + "/src/file.Properties");
		  __CLR4_1_14r4risihn5k2.R.inc(290);prop.load(skip);
		  __CLR4_1_14r4risihn5k2.R.inc(291);if ((((prop.getProperty(cloud+suiteName+Depends).equals("FAIL"))&&(__CLR4_1_14r4risihn5k2.R.iget(292)!=0|true))||(__CLR4_1_14r4risihn5k2.R.iget(293)==0&false))) {{__CLR4_1_14r4risihn5k2.R.inc(294);throw new SkipException("Skip");}
		  }__CLR4_1_14r4risihn5k2.R.inc(295);utility.launchValidation(param);
	}finally{__CLR4_1_14r4risihn5k2.R.flushNeeded();}}
	@Parameters({"param","param1","param2","Depends","suiteName","cloud","clust"})
	@Test
	public void accessValidation(@Optional String param,@Optional String param1,@Optional String param2,@Optional String Depends,@Optional String suiteName,@Optional String cloud,@Optional String clust) throws InterruptedException, IOException {try{__CLR4_1_14r4risihn5k2.R.inc(296);
		__CLR4_1_14r4risihn5k2.R.inc(297);FileInputStream skip = new FileInputStream(workspace + "/src/file.Properties");
		  __CLR4_1_14r4risihn5k2.R.inc(298);prop.load(skip);
		  __CLR4_1_14r4risihn5k2.R.inc(299);if ((((prop.getProperty(cloud+suiteName+Depends).equals("FAIL") || prop.getProperty(cloud+suiteName+Depends).equals("SKIP") )&&(__CLR4_1_14r4risihn5k2.R.iget(300)!=0|true))||(__CLR4_1_14r4risihn5k2.R.iget(301)==0&false))) {{__CLR4_1_14r4risihn5k2.R.inc(302);throw new SkipException("Skip");}
		  }__CLR4_1_14r4risihn5k2.R.inc(303);utility.accessValidation(param,param1,param2);
	}finally{__CLR4_1_14r4risihn5k2.R.flushNeeded();}}
	@Parameters({"param","param1","cloud","clust"})
	@Test
	public void stopAction(@Optional String param,@Optional String param1,@Optional String cloud,@Optional String clust) throws InterruptedException, IOException {try{__CLR4_1_14r4risihn5k2.R.inc(304);
		
		  __CLR4_1_14r4risihn5k2.R.inc(305);utility.stopAction(param,param1);
	}finally{__CLR4_1_14r4risihn5k2.R.flushNeeded();}}
	@Parameters({"param","param1","param2","Depends","suiteName","cloud","clust"})
	@Test
	public void startAction(@Optional String param,@Optional String param1,@Optional String param2,@Optional String Depends,@Optional String suiteName,@Optional String cloud,@Optional String clust) throws InterruptedException, IOException, AWTException {try{__CLR4_1_14r4risihn5k2.R.inc(306);
		__CLR4_1_14r4risihn5k2.R.inc(307);FileInputStream skip = new FileInputStream(workspace + "/src/file.Properties");
		  __CLR4_1_14r4risihn5k2.R.inc(308);prop.load(skip);
		  __CLR4_1_14r4risihn5k2.R.inc(309);if ((((prop.getProperty(cloud+suiteName+Depends).equals("FAIL") || prop.getProperty(cloud+suiteName+Depends).equals("SKIP") )&&(__CLR4_1_14r4risihn5k2.R.iget(310)!=0|true))||(__CLR4_1_14r4risihn5k2.R.iget(311)==0&false))) {{__CLR4_1_14r4risihn5k2.R.inc(312);throw new SkipException("Skip");}
		  }__CLR4_1_14r4risihn5k2.R.inc(313);utility.startAction(param,param1,param2);
	}finally{__CLR4_1_14r4risihn5k2.R.flushNeeded();}}
	@Parameters({"param","param1","param2","param3","Depends","suiteName","cloud","clust"})
	@Test
	public void cdeliveryOn(@Optional String param,@Optional String param1,@Optional String param2,@Optional String param3,@Optional String Depends,@Optional String suiteName,@Optional String cloud,@Optional String clust) throws InterruptedException, IOException, AWTException {try{__CLR4_1_14r4risihn5k2.R.inc(314);
		/*FileInputStream skip = new FileInputStream(workspace + "/src/file.Properties");
		  prop.load(skip);
		  if (prop.getProperty(cloud+suiteName+Depends).equals("FAIL") || prop.getProperty(cloud+suiteName+Depends).equals("SKIP") ) {throw new SkipException("Skip");}
		 */ __CLR4_1_14r4risihn5k2.R.inc(315);utility.cdeliveryOnsingletier(param,param1,param2,param3);
	}finally{__CLR4_1_14r4risihn5k2.R.flushNeeded();}}
	@Parameters({"param","param1","param2","param3","Depends","suiteName","cloud","clust"})
	@Test
	public void cdeliveryOff(@Optional String param,@Optional String param1,@Optional String param2,@Optional String param3,@Optional String Depends,@Optional String suiteName,@Optional String cloud,@Optional String clust) throws InterruptedException, AWTException, IOException {try{__CLR4_1_14r4risihn5k2.R.inc(316);
		__CLR4_1_14r4risihn5k2.R.inc(317);FileInputStream skip = new FileInputStream(workspace + "/src/file.Properties");
		  __CLR4_1_14r4risihn5k2.R.inc(318);prop.load(skip);
		  __CLR4_1_14r4risihn5k2.R.inc(319);if ((((prop.getProperty(cloud+suiteName+Depends).equals("FAIL") || prop.getProperty(cloud+suiteName+Depends).equals("SKIP") )&&(__CLR4_1_14r4risihn5k2.R.iget(320)!=0|true))||(__CLR4_1_14r4risihn5k2.R.iget(321)==0&false))) {{__CLR4_1_14r4risihn5k2.R.inc(322);throw new SkipException("Skip");}
		  }__CLR4_1_14r4risihn5k2.R.inc(323);utility.cdeliveryOff(param, param1, param2,param3);
	}finally{__CLR4_1_14r4risihn5k2.R.flushNeeded();}}
	@Parameters({"param","cloud","clust"})
	@Test
	public void deleteDesign(@Optional String param,@Optional String cloud,@Optional String clust) throws InterruptedException, IOException {try{__CLR4_1_14r4risihn5k2.R.inc(324);
		  __CLR4_1_14r4risihn5k2.R.inc(325);utility.deleteDesign(param);
	}finally{__CLR4_1_14r4risihn5k2.R.flushNeeded();}}
	@Parameters({"param","suiteName","Depends","cloud","clust"})
	@Test
	public void deleteApp(@Optional String param,@Optional String suiteName,@Optional String Depends,@Optional String cloud,@Optional String clust) throws InterruptedException, IOException {try{__CLR4_1_14r4risihn5k2.R.inc(326);
		__CLR4_1_14r4risihn5k2.R.inc(327);FileInputStream skip = new FileInputStream(workspace + "/src/file.Properties");
		  __CLR4_1_14r4risihn5k2.R.inc(328);prop.load(skip);
		  __CLR4_1_14r4risihn5k2.R.inc(329);if ((((prop.getProperty(cloud+suiteName+Depends).equals("FAIL") || prop.getProperty(cloud+suiteName+Depends).equals("SKIP") )&&(__CLR4_1_14r4risihn5k2.R.iget(330)!=0|true))||(__CLR4_1_14r4risihn5k2.R.iget(331)==0&false))) {{__CLR4_1_14r4risihn5k2.R.inc(332);throw new SkipException("Skip");}
		  }__CLR4_1_14r4risihn5k2.R.inc(333);utility.deleteApp(param);
	}finally{__CLR4_1_14r4risihn5k2.R.flushNeeded();}}
	@Parameters({"param","Depends","suiteName","cloud","clust"})
	@Test
	public void deleteDesignValidation(@Optional String param,@Optional String Depends,@Optional String suiteName,@Optional String cloud,@Optional String clust) throws InterruptedException, IOException {try{__CLR4_1_14r4risihn5k2.R.inc(334);
		__CLR4_1_14r4risihn5k2.R.inc(335);FileInputStream skip = new FileInputStream(workspace + "/src/file.Properties");
		  __CLR4_1_14r4risihn5k2.R.inc(336);prop.load(skip);
		  __CLR4_1_14r4risihn5k2.R.inc(337);if ((((prop.getProperty(cloud+suiteName+Depends).equals("FAIL") )&&(__CLR4_1_14r4risihn5k2.R.iget(338)!=0|true))||(__CLR4_1_14r4risihn5k2.R.iget(339)==0&false))) {{__CLR4_1_14r4risihn5k2.R.inc(340);throw new SkipException("Skip");}
		  }__CLR4_1_14r4risihn5k2.R.inc(341);utility.deleteDesignValidation(param);
	}finally{__CLR4_1_14r4risihn5k2.R.flushNeeded();}}
	@Parameters({"param","Depends","suiteName","cloud","clust"})
	@Test
	public void deleteValidation(@Optional String param,@Optional String Depends,@Optional String suiteName,@Optional String cloud,@Optional String clust) throws InterruptedException, IOException {try{__CLR4_1_14r4risihn5k2.R.inc(342);
		__CLR4_1_14r4risihn5k2.R.inc(343);FileInputStream skip = new FileInputStream(workspace + "/src/file.Properties");
		  __CLR4_1_14r4risihn5k2.R.inc(344);prop.load(skip);
		  __CLR4_1_14r4risihn5k2.R.inc(345);if ((((prop.getProperty(cloud+suiteName+Depends).equals("FAIL") )&&(__CLR4_1_14r4risihn5k2.R.iget(346)!=0|true))||(__CLR4_1_14r4risihn5k2.R.iget(347)==0&false))) {{__CLR4_1_14r4risihn5k2.R.inc(348);throw new SkipException("Skip");}
		  }__CLR4_1_14r4risihn5k2.R.inc(349);utility.deleteValidation(param);
	}finally{__CLR4_1_14r4risihn5k2.R.flushNeeded();}}	
	@Parameters({"suiteName","cloud","clust"})
	@AfterMethod
		public void screenshot(ITestResult arg0,@Optional String suiteName,@Optional String cloud,@Optional String clust) {try{__CLR4_1_14r4risihn5k2.R.inc(350);
		__CLR4_1_14r4risihn5k2.R.inc(351);String screenshotname =cloud+suiteName+arg0.getName().toString(); 
		__CLR4_1_14r4risihn5k2.R.inc(352);try {
		     __CLR4_1_14r4risihn5k2.R.inc(353);String screenshot =  utility.screenshot(screenshotname,cloud,clust);
			 __CLR4_1_14r4risihn5k2.R.inc(354);System.setProperty("org.uncommons.reportng.escape-output", "false");
			   __CLR4_1_14r4risihn5k2.R.inc(355);Reporter.setCurrentTestResult(arg0); //// output gets lost without this entry
				  __CLR4_1_14r4risihn5k2.R.inc(356);Reporter.log(
				  "<a title= \"title\" href=\"" + screenshot + "\">" +
				 "<img width=\"700\" height=\"550\" src=\"" + screenshot +
				  "\"></a>");
		} catch (IOException e) {
			__CLR4_1_14r4risihn5k2.R.inc(357);e.printStackTrace();
		}
			__CLR4_1_14r4risihn5k2.R.inc(358);int result=arg0.getStatus();
		      __CLR4_1_14r4risihn5k2.R.inc(359);String testcase =cloud+suiteName+arg0.getName().toString(); 
		     __CLR4_1_14r4risihn5k2.R.inc(360);Properties prop = new Properties();
		     __CLR4_1_14r4risihn5k2.R.inc(361);if((((result ==1)&&(__CLR4_1_14r4risihn5k2.R.iget(362)!=0|true))||(__CLR4_1_14r4risihn5k2.R.iget(363)==0&false))){{
		      __CLR4_1_14r4risihn5k2.R.inc(364);prop.put(testcase, "PASS");
		      __CLR4_1_14r4risihn5k2.R.inc(365);test.log(LogStatus.PASS, arg0.getName()+"Screencast below:" + test.addScreenCapture("./html/"+screenshotname+".png"),suiteName+arg0.getName());
		     }}else {__CLR4_1_14r4risihn5k2.R.inc(366);if((((result ==2)&&(__CLR4_1_14r4risihn5k2.R.iget(367)!=0|true))||(__CLR4_1_14r4risihn5k2.R.iget(368)==0&false))){{
		      __CLR4_1_14r4risihn5k2.R.inc(369);prop.put(testcase, "FAIL"); 
		      __CLR4_1_14r4risihn5k2.R.inc(370);test.log(LogStatus.FAIL, arg0.getName()+"Screencast below:" + test.addScreenCapture("./html/"+screenshotname+".png"),arg0.getThrowable());
		     }}else {__CLR4_1_14r4risihn5k2.R.inc(371);if((((result ==3)&&(__CLR4_1_14r4risihn5k2.R.iget(372)!=0|true))||(__CLR4_1_14r4risihn5k2.R.iget(373)==0&false))){{
		      __CLR4_1_14r4risihn5k2.R.inc(374);prop.put(testcase, "SKIP"); 
		      __CLR4_1_14r4risihn5k2.R.inc(375);test.log(LogStatus.SKIP, arg0.getName()+"Screencast below:" + test.addScreenCapture("./html/"+screenshotname+".png"),arg0.getThrowable());
		     }
		     }}}__CLR4_1_14r4risihn5k2.R.inc(376);try {
		      __CLR4_1_14r4risihn5k2.R.inc(377);FileInputStream fs = new FileInputStream(workspace + "/src/file.Properties");
		      __CLR4_1_14r4risihn5k2.R.inc(378);prop.load(fs);
		      __CLR4_1_14r4risihn5k2.R.inc(379);fs.close();
		      __CLR4_1_14r4risihn5k2.R.inc(380);FileOutputStream fos = new FileOutputStream(workspace + "/src/file.Properties");
		      __CLR4_1_14r4risihn5k2.R.inc(381);prop.store(fos, "Test Result");
	
		      __CLR4_1_14r4risihn5k2.R.inc(382);fos.flush();
		     } catch (IOException e) { 
		      __CLR4_1_14r4risihn5k2.R.inc(383);e.printStackTrace();
		     }
			
			__CLR4_1_14r4risihn5k2.R.inc(384);report.endTest(test);
			__CLR4_1_14r4risihn5k2.R.inc(385);report.flush();
		}finally{__CLR4_1_14r4risihn5k2.R.flushNeeded();}}
		

		@Override
		public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {try{__CLR4_1_14r4risihn5k2.R.inc(386);
			// TODO Auto-generated method stub
			
		}finally{__CLR4_1_14r4risihn5k2.R.flushNeeded();}}

		@Override
		public void onTestFailure(ITestResult arg0) {try{__CLR4_1_14r4risihn5k2.R.inc(387);
			// TODO Auto-generated method stub
			
		}finally{__CLR4_1_14r4risihn5k2.R.flushNeeded();}}

		@Override
		public void onTestSkipped(ITestResult arg0) {try{__CLR4_1_14r4risihn5k2.R.inc(388);
			// TODO Auto-generated method stub
			
		}finally{__CLR4_1_14r4risihn5k2.R.flushNeeded();}}

		@Override
		public void onTestStart(ITestResult arg0) {try{__CLR4_1_14r4risihn5k2.R.inc(389);
			// TODO Auto-generated method stub
			
		}finally{__CLR4_1_14r4risihn5k2.R.flushNeeded();}}

		@Override
		public void onTestSuccess(ITestResult arg0) {try{__CLR4_1_14r4risihn5k2.R.inc(390);
			// TODO Auto-generated method stub
			
		}finally{__CLR4_1_14r4risihn5k2.R.flushNeeded();}}
		@Override
		public void onStart(ITestContext context) {try{__CLR4_1_14r4risihn5k2.R.inc(391);
			// TODO Auto-generated method stub
			
		}finally{__CLR4_1_14r4risihn5k2.R.flushNeeded();}}
		@Override
		public void onFinish(ITestContext context) {try{__CLR4_1_14r4risihn5k2.R.inc(392);
			// TODO Auto-generated method stub
			
		}finally{__CLR4_1_14r4risihn5k2.R.flushNeeded();}}

}
	