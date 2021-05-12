package runner;

import com.google.selenuim.test.TestNG;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features ="src/test/java/features",glue= {"steps"}
,plugin = {"pretty"
		,"html:target/cucumber-html-report"} )
public class TestRunner extends AbstractTestNGCucumberTests  {
	
	

}
