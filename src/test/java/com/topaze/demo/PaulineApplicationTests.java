package com.topaze.demo;

import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.IncludeClassNamePatterns;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SuiteDisplayName("Suite Test Name")
@SelectPackages({"com.topaze.demo", "pauline"})
@IncludeClassNamePatterns(".*Test")

class PaulineApplicationTests {
}
