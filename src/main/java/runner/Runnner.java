package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Training_h2a.06.17\\devils-workspace\\PACK1\\Features\\demofeature.feature",
	glue = {"Stepdef"},
	plugin={"pretty","html:target/reportdemo"})
public class Runnner {

}
