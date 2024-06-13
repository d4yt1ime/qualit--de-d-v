package data;

import org.junit.platform.suite.api.IncludeClassNamePatterns;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SuiteDisplayName("Test Suite VenteVoiture")
@SelectPackages("data, service")
@IncludeClassNamePatterns(".*Test")
class SuiteDemo {
}


