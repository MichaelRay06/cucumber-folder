package runnerClasses;

import io.cucumber.testng.AbstractTestNGCucumberTests;

@cucumber.api.CucumberOptions(
		

		features = "./features", glue = "stepDefination", monochrome = true, dryRun = true, strict = false, plugin = {
				"json:target/positive/cucumber.json", "pretty", "html:target/positive/cucumber.html" }

)

public class RunTest {

}

/*	private TestNGCucumberRunner testNGCucumberRunner;

	@BeforeClass(alwaysRun = true)
	public void setUpClass() {
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	}

	@Test(dataProvider = "features")
	public void features(CucumberFeatureWrapper cucumberFeature) throws Throwable {
		testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
	}

	@DataProvider
	public Object[][] features() {

		return testNGCucumberRunner.provideFeatures();
	}

	@AfterClass(alwaysRun = true)
	public void tearDownClass() {
		testNGCucumberRunner.finish();
	}
}
*/