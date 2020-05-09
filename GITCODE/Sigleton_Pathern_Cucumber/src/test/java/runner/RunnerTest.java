package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = { "src/test/resources/features" }, 
		glue = {"stepDefinitions" }, 
		monochrome = true,
		tags = {}, 
		plugin = {  "json:target/cucumber.json","pretty", "html:target/negative/cucumber.html" })

		
		
public class RunnerTest extends AbstractTestNGCucumberTests  {

}
