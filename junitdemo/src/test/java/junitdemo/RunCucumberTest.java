package junitdemo;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.*;
import net.serenitybdd.junit.runners.SerenityRunner;


@RunWith(Cucumber.class)
//@RunWith(SerenityRunner.class)
@CucumberOptions(features="src/test/java")

public class RunCucumberTest {

}
