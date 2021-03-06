package org.bluemeric.common;

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
	public class Multitier implements ITestListener{

		
	Utility utility = new Utility();
	String workspace=System.getProperty("user.dir");
	Properties prop = new Properties();
	ExtentReports report=Suite.report;
	ExtentTest test=Suite.test;
	
	@Parameters({"suiteName","cloud","clust"})
	@BeforeMethod
	 public void createreport(ITestContext arg0,@Optional String suiteName,@Optional String cloud,@Optional String clust){
		try{
			test = report.startTest(arg0.getName());
	    test.assignCategory(cloud+"-"+suiteName);
		}
		catch(Exception e){
		e.printStackTrace();
		}
	 }
	@Parameters({"param","param1","param2","cloud","clust"})
	@Test
	public void createMultitierDesign(@Optional String param,@Optional String param1,@Optional String param2,@Optional String cloud,@Optional String clust) throws  IOException, InterruptedException{
		if(param.equals("Redis")){
			utility.createRedisComponent(param, param1,param2);
		}else{
		utility.createMultitierDesign(param, param1,param2);
		}
	
	}
	@Parameters({"param","param1", "Depends","suiteName","cloud","clust"})
	@Test
	public void multilinkComponent(@Optional String param,@Optional String param1,@Optional String Depends,@Optional String suiteName,@Optional String cloud,@Optional String clust) throws  IOException, AWTException, InterruptedException{
		FileInputStream skip = new FileInputStream(workspace + "/src/file.Properties");
		  prop.load(skip);
		  if (prop.getProperty(cloud+suiteName+Depends).equals("FAIL")) {throw new SkipException("Skip");}
		utility.linkComponent(param, param1);
	
	}
	@Parameters({"param","param1","param2","param3","param4","param5","param6","param7","param8","param9","param10","cloud","clust"})
	@Test
	public void createSingletierDesign(@Optional String param,@Optional String param1,@Optional String param2,@Optional String param3,@Optional String param4,@Optional String param5,@Optional String param6,@Optional String param7,@Optional String param8,@Optional String param9,@Optional String param10,@Optional String cloud,@Optional String clust) throws InterruptedException, IOException, AWTException {
		utility.createSingletierDesign(param, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10);
		
	}
	@Parameters({"param","param1", "Depends","suiteName","cloud","clust"})
	@Test
	public void linkComponent(@Optional String param,@Optional String param1,@Optional String Depends,@Optional String suiteName,@Optional String cloud,@Optional String clust) throws  IOException, AWTException, InterruptedException{
		FileInputStream skip = new FileInputStream(workspace + "/src/file.Properties");
		  prop.load(skip);
		  if (prop.getProperty(cloud+suiteName+Depends).equals("FAIL")) {throw new SkipException("Skip");}
		utility.linkComponent(param, param1);
	
	}
	
	@Parameters({"param", "Depends","suiteName","cloud","clust"})
	@Test
	public void publish(@Optional String param,@Optional String Depends,@Optional String suiteName,@Optional String cloud,@Optional String clust) throws AWTException, IOException, InterruptedException{
		FileInputStream skip = new FileInputStream(workspace + "/src/file.Properties");
		  prop.load(skip);
		  if (prop.getProperty(cloud+suiteName+Depends).equals("FAIL") || prop.getProperty(cloud+suiteName+Depends).equals("SKIP") ) {throw new SkipException("Skip");}
		utility.publish(param);
	
	}
	@Parameters({"param", "Depends","suiteName","cloud","clust"})
	@Test
	public void designValidation(@Optional String param,@Optional String Depends,@Optional String suiteName,@Optional String cloud,@Optional String clust) throws  InterruptedException, IOException{
		FileInputStream skip = new FileInputStream(workspace + "/src/file.Properties");
		  prop.load(skip);
		  if (prop.getProperty(cloud+suiteName+Depends).equals("FAIL") || prop.getProperty(cloud+suiteName+Depends).equals("SKIP") ) {throw new SkipException("Skip");}
		utility.designValidation(param);
	
	}
	@Parameters({"param","param1","param2","param3","cloud","clust"})
	@Test
	public void launchApp(@Optional String param,@Optional String param1,@Optional String param2,@Optional String param3,@Optional String cloud,@Optional String clust) throws InterruptedException, IOException {
		
		utility.launchApp(clust,param, param1, param2, param3);
	}
	@Parameters({"param","Depends","suiteName","cloud","clust"})
	@Test
	public void launchValidation(@Optional String param,@Optional String Depends,@Optional String suiteName,@Optional String cloud,@Optional String clust) throws InterruptedException, IOException {
		FileInputStream skip = new FileInputStream(workspace + "/src/file.Properties");
		  prop.load(skip);
		  if (prop.getProperty(cloud+suiteName+Depends).equals("FAIL")) {throw new SkipException("Skip");}
		  utility.launchValidation(param);
	}
	@Parameters({"param","param1","param2","Depends","suiteName","cloud","clust"})
	@Test
	public void accessValidation(@Optional String param,@Optional String param1,@Optional String param2,@Optional String Depends,@Optional String suiteName,@Optional String cloud,@Optional String clust) throws InterruptedException, IOException {
		FileInputStream skip = new FileInputStream(workspace + "/src/file.Properties");
		  prop.load(skip);
		  if (prop.getProperty(cloud+suiteName+Depends).equals("FAIL") || prop.getProperty(cloud+suiteName+Depends).equals("SKIP") ) {throw new SkipException("Skip");}
		  utility.accessValidation(param,param1,param2);
	}
	@Parameters({"param","param1","cloud","clust"})
	@Test
	public void stopAction(@Optional String param,@Optional String param1) throws InterruptedException, IOException {
		
		  utility.stopAction(param,param1);
	}
	@Parameters({"param","param1","param2","Depends","suiteName","cloud","clust"})
	@Test
	public void startAction(@Optional String param,@Optional String param1,@Optional String param2,@Optional String Depends,@Optional String suiteName,@Optional String cloud,@Optional String clust) throws InterruptedException, IOException, AWTException {
		FileInputStream skip = new FileInputStream(workspace + "/src/file.Properties");
		  prop.load(skip);
		  if (prop.getProperty(cloud+suiteName+Depends).equals("FAIL") || prop.getProperty(cloud+suiteName+Depends).equals("SKIP") ) {throw new SkipException("Skip");}
		  utility.startAction(param,param1,param2);
	}
	@Parameters({"param","param1","param2","param3","Depends","suiteName","cloud","clust"})
	@Test
	public void cdeliveryOn(@Optional String param,@Optional String param1,@Optional String param2,@Optional String param3,@Optional String Depends,@Optional String suiteName,@Optional String cloud,@Optional String clust) throws InterruptedException, IOException, AWTException {
		FileInputStream skip = new FileInputStream(workspace + "/src/file.Properties");
		  prop.load(skip);
		  if (prop.getProperty(cloud+suiteName+Depends).equals("FAIL") || prop.getProperty(cloud+suiteName+Depends).equals("SKIP") ) {throw new SkipException("Skip");}
		  utility.cdeliveryOnMultitier(param,param1,param2,param3);
	}
	@Parameters({"param","param1","param2","param3","Depends","suiteName","cloud","clust"})
	@Test
	public void cdeliveryOff(@Optional String param,@Optional String param1,@Optional String param2,@Optional String param3,@Optional String Depends,@Optional String suiteName,@Optional String cloud,@Optional String clust) throws InterruptedException, AWTException, IOException {
		FileInputStream skip = new FileInputStream(workspace + "/src/file.Properties");
		  prop.load(skip);
		  if (prop.getProperty(cloud+suiteName+Depends).equals("FAIL") || prop.getProperty(cloud+suiteName+Depends).equals("SKIP") ) {throw new SkipException("Skip");}
		  utility.cdeliveryOffMultitier(param, param1, param2,param3);
	}
	@Parameters({"param","cloud","clust"})
	@Test
	public void deleteDesign(@Optional String param,@Optional String cloud,@Optional String clust) throws InterruptedException, IOException {
		  utility.deleteDesign(param);
	}
	@Parameters({"param","Depends","suiteName","cloud","clust"})
	@Test
	public void deleteDesignValidation(@Optional String param,@Optional String Depends,@Optional String suiteName,@Optional String cloud,@Optional String clust) throws InterruptedException, IOException {
		FileInputStream skip = new FileInputStream(workspace + "/src/file.Properties");
		  prop.load(skip);
		  if (prop.getProperty(cloud+suiteName+Depends).equals("FAIL") ) {throw new SkipException("Skip");}
		  utility.deleteDesignValidation(param);
	}
	@Parameters({"param","cloud","clust"})
	@Test
	public void deleteApp(@Optional String param,@Optional String cloud,@Optional String clust) throws InterruptedException, IOException {
		  utility.deleteApp(param);
	}
	@Parameters({"param","Depends","suiteName","cloud","clust"})
	@Test
	public void deleteValidation(@Optional String param,@Optional String Depends,@Optional String suiteName,@Optional String cloud,@Optional String clust) throws InterruptedException, IOException {
		FileInputStream skip = new FileInputStream(workspace + "/src/file.Properties");
		  prop.load(skip);
		  if (prop.getProperty(cloud+suiteName+Depends).equals("FAIL") ) {throw new SkipException("Skip");}
		  utility.deleteValidation(param);
	}
		
	@Parameters({"suiteName","cloud","clust"})
	@AfterMethod
		public void screenshot(ITestResult arg0,@Optional String suiteName,@Optional String cloud,@Optional String clust) {
		String screenshotname =cloud+suiteName+arg0.getName().toString(); 
		try {
		     String screenshot =  utility.screenshot(screenshotname,cloud,clust);
			 System.setProperty("org.uncommons.reportng.escape-output", "false");
			   Reporter.setCurrentTestResult(arg0); //// output gets lost without this entry
				  Reporter.log(
				  "<a title= \"title\" href=\"" + screenshot + "\">" +
				 "<img width=\"700\" height=\"550\" src=\"" + screenshot +
				  "\"></a>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			int result=arg0.getStatus();
		      String testcase =cloud+suiteName+arg0.getName().toString(); 
		     Properties prop = new Properties();
		     if(result ==1){
		      prop.put(testcase, "PASS");
		      test.log(LogStatus.PASS, arg0.getName()+"Screencast below:" + test.addScreenCapture("./html/"+screenshotname+".png"),suiteName+arg0.getName());
		     }else if(result ==2){
		      prop.put(testcase, "FAIL"); 
		      test.log(LogStatus.FAIL, arg0.getName()+"Screencast below:" + test.addScreenCapture("./html/"+screenshotname+".png"),arg0.getThrowable());
		     }else if(result ==3){
		      prop.put(testcase, "SKIP"); 
		      test.log(LogStatus.SKIP, arg0.getName()+"Screencast below:" + test.addScreenCapture("./html/"+screenshotname+".png"),arg0.getThrowable());
		     }
		     try {
		      FileInputStream fs = new FileInputStream(workspace + "/src/file.Properties");
		      prop.load(fs);
		      fs.close();
		      FileOutputStream fos = new FileOutputStream(workspace + "/src/file.Properties");
		      prop.store(fos, "Test Result");
	
		      fos.flush();
		     } catch (IOException e) { 
		      // TODO Auto-generated catch block
		      e.printStackTrace();
		     }
			
			report.endTest(test);
			report.flush();
		}
		@Override
		public void onFinish(ITestContext arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onStart(ITestContext arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onTestFailure(ITestResult arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onTestSkipped(ITestResult arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onTestStart(ITestResult arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onTestSuccess(ITestResult arg0) {
			// TODO Auto-generated method stub
			
		}

}
	