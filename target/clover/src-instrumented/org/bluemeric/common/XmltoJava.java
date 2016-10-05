/* $$ This file has been instrumented by Clover 4.1.1#20151207095404243 $$ */package org.bluemeric.common;

import java.util.Arrays;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.bluemeric.common.GenericClass;

@XmlRootElement(name = "XmltoJava")
public class XmltoJava extends GenericClass {public static class __CLR4_1_1axaxisihn5kw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_1();if(20151207095404243L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.1#20151207095404243,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0054\u0072\u006f\u0076\u0053\u0061\u0069\u005c\u005c\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u005c\u005c\u0047\u006f\u0070\u0061\u0064\u0064\u006c\u0065\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1472622883817L,8589935092L,475,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
     
	private Suite[] suite;
	private String name;

	@XmlElement
	public Suite[] getSuite() {try{__CLR4_1_1axaxisihn5kw.R.inc(393);
		__CLR4_1_1axaxisihn5kw.R.inc(394);return suite;
	}finally{__CLR4_1_1axaxisihn5kw.R.flushNeeded();}}

	public void setSuite(Suite[] suite) {try{__CLR4_1_1axaxisihn5kw.R.inc(395);
		__CLR4_1_1axaxisihn5kw.R.inc(396);this.suite = suite;
	}finally{__CLR4_1_1axaxisihn5kw.R.flushNeeded();}}

	public String getName() {try{__CLR4_1_1axaxisihn5kw.R.inc(397);
		__CLR4_1_1axaxisihn5kw.R.inc(398);return name;
	}finally{__CLR4_1_1axaxisihn5kw.R.flushNeeded();}}

	public void setName(String name) {try{__CLR4_1_1axaxisihn5kw.R.inc(399);
		__CLR4_1_1axaxisihn5kw.R.inc(400);this.name = name;
	}finally{__CLR4_1_1axaxisihn5kw.R.flushNeeded();}}

	@XmlRootElement
	public static class Suite {
		private Parameter[] parameter;

		private String suitename;
		private String classname;

		@XmlAttribute
		public String getClassname() {try{__CLR4_1_1axaxisihn5kw.R.inc(401);
			__CLR4_1_1axaxisihn5kw.R.inc(402);return classname;
		}finally{__CLR4_1_1axaxisihn5kw.R.flushNeeded();}}

		public void setClassname(String classname) {try{__CLR4_1_1axaxisihn5kw.R.inc(403);
			__CLR4_1_1axaxisihn5kw.R.inc(404);this.classname = classname;
		}finally{__CLR4_1_1axaxisihn5kw.R.flushNeeded();}}

		@XmlAttribute
		public String getSuitename() {try{__CLR4_1_1axaxisihn5kw.R.inc(405);
			__CLR4_1_1axaxisihn5kw.R.inc(406);return suitename;
		}finally{__CLR4_1_1axaxisihn5kw.R.flushNeeded();}}

		public void setSuitename(String suitename) {try{__CLR4_1_1axaxisihn5kw.R.inc(407);
			__CLR4_1_1axaxisihn5kw.R.inc(408);this.suitename = suitename;
		}finally{__CLR4_1_1axaxisihn5kw.R.flushNeeded();}}

		@XmlElement
		public Parameter[] getParameter() {try{__CLR4_1_1axaxisihn5kw.R.inc(409);
			__CLR4_1_1axaxisihn5kw.R.inc(410);return parameter;
		}finally{__CLR4_1_1axaxisihn5kw.R.flushNeeded();}}

		public void setParameter(Parameter[] parameter) {try{__CLR4_1_1axaxisihn5kw.R.inc(411);
			__CLR4_1_1axaxisihn5kw.R.inc(412);this.parameter = parameter;
		}finally{__CLR4_1_1axaxisihn5kw.R.flushNeeded();}}

		@Override
		public String toString() {try{__CLR4_1_1axaxisihn5kw.R.inc(413);
			__CLR4_1_1axaxisihn5kw.R.inc(414);return "Suite [parameter=" + Arrays.toString(parameter) + ", suitename=" + suitename + "]";
		}finally{__CLR4_1_1axaxisihn5kw.R.flushNeeded();}}

	}

	@XmlRootElement
	public static class Parameter {

		private String name;
		private String testcase;
		private String dependson;
		private String param;
		private String param1;
		private String param2;
		private String param3;
		private String param4;
		private String param5;
		private String param6;
		private String param7;
		private String param8;
		private String param9;
		private String param10;
		
		@XmlAttribute
		public String getParam10() {try{__CLR4_1_1axaxisihn5kw.R.inc(415);
			__CLR4_1_1axaxisihn5kw.R.inc(416);return param10;
		}finally{__CLR4_1_1axaxisihn5kw.R.flushNeeded();}}

		public void setParam10(String param10) {try{__CLR4_1_1axaxisihn5kw.R.inc(417);
			__CLR4_1_1axaxisihn5kw.R.inc(418);this.param10 = param10;
		}finally{__CLR4_1_1axaxisihn5kw.R.flushNeeded();}}

		@XmlAttribute
		public String getParam4() {try{__CLR4_1_1axaxisihn5kw.R.inc(419);
			__CLR4_1_1axaxisihn5kw.R.inc(420);return param4;
		}finally{__CLR4_1_1axaxisihn5kw.R.flushNeeded();}}

		public void setParam4(String param4) {try{__CLR4_1_1axaxisihn5kw.R.inc(421);
			__CLR4_1_1axaxisihn5kw.R.inc(422);this.param4 = param4;
		}finally{__CLR4_1_1axaxisihn5kw.R.flushNeeded();}}
		@XmlAttribute
		public String getParam5() {try{__CLR4_1_1axaxisihn5kw.R.inc(423);
			__CLR4_1_1axaxisihn5kw.R.inc(424);return param5;
		}finally{__CLR4_1_1axaxisihn5kw.R.flushNeeded();}}
		
		public void setParam5(String param5) {try{__CLR4_1_1axaxisihn5kw.R.inc(425);
			__CLR4_1_1axaxisihn5kw.R.inc(426);this.param5 = param5;
		}finally{__CLR4_1_1axaxisihn5kw.R.flushNeeded();}}
		@XmlAttribute
		public String getParam6() {try{__CLR4_1_1axaxisihn5kw.R.inc(427);
			__CLR4_1_1axaxisihn5kw.R.inc(428);return param6;
		}finally{__CLR4_1_1axaxisihn5kw.R.flushNeeded();}}

		public void setParam6(String param6) {try{__CLR4_1_1axaxisihn5kw.R.inc(429);
			__CLR4_1_1axaxisihn5kw.R.inc(430);this.param6 = param6;
		}finally{__CLR4_1_1axaxisihn5kw.R.flushNeeded();}}
		@XmlAttribute
		public String getParam7() {try{__CLR4_1_1axaxisihn5kw.R.inc(431);
			__CLR4_1_1axaxisihn5kw.R.inc(432);return param7;
		}finally{__CLR4_1_1axaxisihn5kw.R.flushNeeded();}}

		public void setParam7(String param7) {try{__CLR4_1_1axaxisihn5kw.R.inc(433);
			__CLR4_1_1axaxisihn5kw.R.inc(434);this.param7 = param7;
		}finally{__CLR4_1_1axaxisihn5kw.R.flushNeeded();}}
		@XmlAttribute
		public String getParam8() {try{__CLR4_1_1axaxisihn5kw.R.inc(435);
			__CLR4_1_1axaxisihn5kw.R.inc(436);return param8;
		}finally{__CLR4_1_1axaxisihn5kw.R.flushNeeded();}}

		public void setParam8(String param8) {try{__CLR4_1_1axaxisihn5kw.R.inc(437);
			__CLR4_1_1axaxisihn5kw.R.inc(438);this.param8 = param8;
		}finally{__CLR4_1_1axaxisihn5kw.R.flushNeeded();}}
		@XmlAttribute
		public String getParam9() {try{__CLR4_1_1axaxisihn5kw.R.inc(439);
			__CLR4_1_1axaxisihn5kw.R.inc(440);return param9;
		}finally{__CLR4_1_1axaxisihn5kw.R.flushNeeded();}}

		public void setParam9(String param9) {try{__CLR4_1_1axaxisihn5kw.R.inc(441);
			__CLR4_1_1axaxisihn5kw.R.inc(442);this.param9 = param9;
		}finally{__CLR4_1_1axaxisihn5kw.R.flushNeeded();}}

		@XmlAttribute
		public String getDependson() {try{__CLR4_1_1axaxisihn5kw.R.inc(443);
			__CLR4_1_1axaxisihn5kw.R.inc(444);return dependson;
		}finally{__CLR4_1_1axaxisihn5kw.R.flushNeeded();}}

		public void setDependson(String dependson) {try{__CLR4_1_1axaxisihn5kw.R.inc(445);
			__CLR4_1_1axaxisihn5kw.R.inc(446);this.dependson = dependson;
		}finally{__CLR4_1_1axaxisihn5kw.R.flushNeeded();}}

		@XmlAttribute
		public String getParam3() {try{__CLR4_1_1axaxisihn5kw.R.inc(447);
			__CLR4_1_1axaxisihn5kw.R.inc(448);return param3;
		}finally{__CLR4_1_1axaxisihn5kw.R.flushNeeded();}}

		public void setParam3(String param3) {try{__CLR4_1_1axaxisihn5kw.R.inc(449);
			__CLR4_1_1axaxisihn5kw.R.inc(450);this.param3 = param3;
		}finally{__CLR4_1_1axaxisihn5kw.R.flushNeeded();}}

		@XmlAttribute
		public String getParam2() {try{__CLR4_1_1axaxisihn5kw.R.inc(451);
			__CLR4_1_1axaxisihn5kw.R.inc(452);return param2;
		}finally{__CLR4_1_1axaxisihn5kw.R.flushNeeded();}}

		public void setParam2(String param2) {try{__CLR4_1_1axaxisihn5kw.R.inc(453);
			__CLR4_1_1axaxisihn5kw.R.inc(454);this.param2 = param2;
		}finally{__CLR4_1_1axaxisihn5kw.R.flushNeeded();}}

		@XmlAttribute
		public String getParam() {try{__CLR4_1_1axaxisihn5kw.R.inc(455);
			__CLR4_1_1axaxisihn5kw.R.inc(456);return param;
		}finally{__CLR4_1_1axaxisihn5kw.R.flushNeeded();}}

		public void setParam(String param) {try{__CLR4_1_1axaxisihn5kw.R.inc(457);
			__CLR4_1_1axaxisihn5kw.R.inc(458);this.param = param;
		}finally{__CLR4_1_1axaxisihn5kw.R.flushNeeded();}}

		@XmlAttribute
		public String getParam1() {try{__CLR4_1_1axaxisihn5kw.R.inc(459);
			__CLR4_1_1axaxisihn5kw.R.inc(460);return param1;
		}finally{__CLR4_1_1axaxisihn5kw.R.flushNeeded();}}

		public void setParam1(String param1) {try{__CLR4_1_1axaxisihn5kw.R.inc(461);
			__CLR4_1_1axaxisihn5kw.R.inc(462);this.param1 = param1;
		}finally{__CLR4_1_1axaxisihn5kw.R.flushNeeded();}}

		@XmlAttribute
		public String getTestcase() {try{__CLR4_1_1axaxisihn5kw.R.inc(463);
			__CLR4_1_1axaxisihn5kw.R.inc(464);return testcase;
		}finally{__CLR4_1_1axaxisihn5kw.R.flushNeeded();}}

		public void setTestcase(String testcase) {try{__CLR4_1_1axaxisihn5kw.R.inc(465);
			__CLR4_1_1axaxisihn5kw.R.inc(466);this.testcase = testcase;
		}finally{__CLR4_1_1axaxisihn5kw.R.flushNeeded();}}

		@XmlAttribute
		public String getName() {try{__CLR4_1_1axaxisihn5kw.R.inc(467);
			__CLR4_1_1axaxisihn5kw.R.inc(468);return name;
		}finally{__CLR4_1_1axaxisihn5kw.R.flushNeeded();}}

		public void setName(String name) {try{__CLR4_1_1axaxisihn5kw.R.inc(469);
			__CLR4_1_1axaxisihn5kw.R.inc(470);this.name = name;
		}finally{__CLR4_1_1axaxisihn5kw.R.flushNeeded();}}

		@Override
		public String toString() {try{__CLR4_1_1axaxisihn5kw.R.inc(471);
			__CLR4_1_1axaxisihn5kw.R.inc(472);return "Parameter [name=" + name + ", testcase=" + testcase + ", dependson=" + dependson + ", param="
					+ param + ", param1=" + param1 + ", param2=" + param2 + ", param3=" + param3 + ", param4=" + param4
					+ ", param5=" + param5 + ", param6=" + param6 + ", param7=" + param7 + ", param8=" + param8
					+ ", param9=" + param9 + ", param10=" + param10 + "]";
		}finally{__CLR4_1_1axaxisihn5kw.R.flushNeeded();}}

		
		
		
		

	}

	@Override
	public String toString() {try{__CLR4_1_1axaxisihn5kw.R.inc(473);
		__CLR4_1_1axaxisihn5kw.R.inc(474);return "XmltoJava [suite=" + Arrays.toString(suite) + ", name=" + name + "]";
	}finally{__CLR4_1_1axaxisihn5kw.R.flushNeeded();}}

}
