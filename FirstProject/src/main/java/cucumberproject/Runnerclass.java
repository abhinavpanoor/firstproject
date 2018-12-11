package cucumberproject;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"./cucumber.feature"},glue= {"cucumberproject"})

public class Runnerclass {
	

}
