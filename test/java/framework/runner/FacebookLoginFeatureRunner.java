package framework.runner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "C:\\Users\\ajinkya.bh\\workspace\\cucumber2\\src\\test\\resources\\featurefile\\FacebookLogin.feature" }, 
				glue = {"C:\\Users\\ajinkya.bh\\workspace\\cucumber2\\src\\test\\java\\framework\\stepdefinations",
						"C:\\Users\\ajinkya.bh\\workspace\\cucumber2\\src\\test\\java\\framework\\runner\\FacebookLoginFeatureRunner.java" }, 
				plugin = { "pretty", "json:target/FacebookLoginFeatureRunner.json" })    //Feature file should always be under resources folder
public class FacebookLoginFeatureRunner extends AbstractTestNGCucumberTests {    //Every runner class should extend (AbstractTestNGCucumberTests) class




//This class will generate the code in testNG console --- Have to copy the data and create new class'stepdefinations' and paste on it



}
