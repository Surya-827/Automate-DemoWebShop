package MyRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;


@CucumberOptions( 
		        
     features = "./src/test/java/Features",
     glue = "StepDefinition",
     dryRun = true,

     plugin= {"pretty","html:target/AdvanceReport/demowebshop.html","json:target/cucumber1/cucumber.json"})

     

public class TestRunner extends AbstractTestNGCucumberTests{

	
}









































/*import org.junit.runner.RunWith;
import io.cucumber.junit.*;
*/
//@RunWith(Cucumber.class)



/* plugin = {
"pretty","html:Reports/HTMLReport.html",
"json:Reports/Jsonreport.json",
"junit:Reports/Junitreport.xml"
})*/