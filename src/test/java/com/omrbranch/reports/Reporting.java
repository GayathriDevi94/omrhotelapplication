package com.omrbranch.reports;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.omrbranch.baseclass.BaseClass;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting extends BaseClass {

	public static void generateJvmReport(String jsonFile) throws FileNotFoundException, IOException {
		File file = new File(getProjectPath() + getPropertyFileValue("jvmReportPath"));
		Configuration configuration = new Configuration(file, "OMRBranch Hotel  Project");

		configuration.addClassifications("OS", "WIN11");
		configuration.addClassifications("Browser Name", "Chrome");
		configuration.addClassifications("Browser Version", "144");
		configuration.addClassifications("Sprint", "34");

		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(jsonFile);
		ReportBuilder builder = new ReportBuilder(jsonFiles, configuration);

		builder.generateReports();

	}

}
