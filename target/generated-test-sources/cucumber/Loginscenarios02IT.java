import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"C:/Vivek/Automation/VPFramework/src/test/resources/features/loginScenarios.feature"},
        plugin = {"html:C:/Vivek/Automation/VPFramework/target/cucumber-parallel/2"},
        monochrome = true,
        tags = {},
        glue = {"com.VP.Framework.Adviser.StepsDefination"})
public class Loginscenarios02IT {
}
