package TestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Features",
		glue={"StepDefinations"},
	
		 plugin = {"json:target/cucumber/report.json", "html:target/cucumber/report.html" ,
			
		           "junit:target/cucumber/report.xml",
		            "pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
		            "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		 
		 tags = "@smart"
		)


public class TestRunner1 {

}
