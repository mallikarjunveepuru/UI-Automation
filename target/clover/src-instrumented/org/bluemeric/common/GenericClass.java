/* $$ This file has been instrumented by Clover 4.1.1#20151207095404243 $$ */package org.bluemeric.common;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class GenericClass
{public static class __CLR4_1_100isihn5fw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_1();if(20151207095404243L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.1#20151207095404243,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0054\u0072\u006f\u0076\u0053\u0061\u0069\u005c\u005c\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u005c\u005c\u0047\u006f\u0070\u0061\u0064\u0064\u006c\u0065\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1472622883817L,8589935092L,19,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
	public static GenericClass unmarshallClass(String file, @SuppressWarnings("rawtypes") Class c) throws JAXBException, IOException 
	{try{__CLR4_1_100isihn5fw.R.inc(0);
		__CLR4_1_100isihn5fw.R.inc(1);JAXBContext context = JAXBContext.newInstance(c);
		__CLR4_1_100isihn5fw.R.inc(2);Unmarshaller unmarshaller = context.createUnmarshaller();
		__CLR4_1_100isihn5fw.R.inc(3);String fileContent = readFileAsString(file);
		__CLR4_1_100isihn5fw.R.inc(4);fileContent = fileContent.replace("\r\n", "").replace("\n", "");
		__CLR4_1_100isihn5fw.R.inc(5);GenericClass unMarshalledClass = (GenericClass) unmarshaller.unmarshal(new StringReader(fileContent));
		__CLR4_1_100isihn5fw.R.inc(6);return unMarshalledClass;
	}finally{__CLR4_1_100isihn5fw.R.flushNeeded();}}

	static String readFileAsString(String filePath) throws java.io.IOException
	{try{__CLR4_1_100isihn5fw.R.inc(7);
		__CLR4_1_100isihn5fw.R.inc(8);byte[] buffer = new byte[(int) new File(filePath).length()];
		__CLR4_1_100isihn5fw.R.inc(9);BufferedInputStream f = null;
		__CLR4_1_100isihn5fw.R.inc(10);try 
		{
			__CLR4_1_100isihn5fw.R.inc(11);f = new BufferedInputStream(new FileInputStream(filePath));
			__CLR4_1_100isihn5fw.R.inc(12);f.read(buffer);
		}
		finally {
			__CLR4_1_100isihn5fw.R.inc(13);if ((((f != null)&&(__CLR4_1_100isihn5fw.R.iget(14)!=0|true))||(__CLR4_1_100isihn5fw.R.iget(15)==0&false))) {__CLR4_1_100isihn5fw.R.inc(16);try { __CLR4_1_100isihn5fw.R.inc(17);f.close(); } catch (IOException ignored) { }
		}}
		__CLR4_1_100isihn5fw.R.inc(18);return new String(buffer);
	}finally{__CLR4_1_100isihn5fw.R.flushNeeded();}}
}