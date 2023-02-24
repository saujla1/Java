package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
//@CucumberOptions(features = "src/test/resources/Features/", glue = { "StepDefinitions" }, monochrome = true, plugin = {
//		"pretty", "junit:target/JunitReports/junitreport.xml", "json:target/JsonReports/jsonreport.json",
//		"html:target/HtmlReports" })



@CucumberOptions(features = "src/test/resources/Features/", glue = { "StepDefinitions" }, monochrome = true, plugin = {
		"pretty", "junit:target/JunitReports/junitreport.xml", "json:target/JsonReports/jsonreport.json",
		"html:target/HtmlReports" }, tags = "@Smoketest")
public class TestRunner {

}
