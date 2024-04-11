package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions ( tags = "@smoke", features = {"src/test/resources/Features"},
			glue = {"StepDefination"}, plugin = {"pretty","html:target/htmalreport.html"})
	
	public class CucumberTestRunner extends AbstractTestNGCucumberTests{

}
