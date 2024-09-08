package ERP_Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions( 
		tags= "",
		features = {"Featurefiles/ERP_Login.feature"},
		glue = {"ERP_StepDefinition"},
		plugin = {},
		monochrome=true
		)
public class ERP_Runner extends AbstractTestNGCucumberTests {

}
