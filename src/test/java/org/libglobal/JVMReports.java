package org.libglobal;

import java.io.File;
import java.util.*;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;


public class JVMReports {
	
	public static void generateCucumberReports(String json) {

		File f=new File("C:\\Users\\cex\\eclipse-workspace\\MavenCucumberAdactinHotelApp\\src\\test\\java\\Reports");
		Configuration con=new Configuration(f,"Adactin Overall Report");
		con.addClassifications("Browser","GoogleChrome");
		con.addClassifications("Operating System","Windows 10 Pro");
		con.addClassifications("Sprint","39");
		List<String> jsonfiles=new ArrayList();
		jsonfiles.add(json);
		ReportBuilder report=new ReportBuilder(jsonfiles, con);
		report.generateReports();
		
		
		
		
	}

}
