package com.example.runners;

import org.junit.platform.suite.api.*;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")
@ConfigurationParameter(key = "cucumber.glue", value = "com.example.steps")
@ConfigurationParameter(key = "cucumber.plugin", value =
        "pretty,html:target/cucumber-report.html,json:target/cucumber-report.json")
@ConfigurationParameter(key = "cucumber.junit-platform.naming-strategy", value = "long")
public class RunCucumberTest {
}

