package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\wwwvu\\IdeaProjects\\incbyteAssement\\src\\test\\java\\resources\\features\\MagentoSignup.feature",  // Correct path to your feature file
        glue = "stepdefinitions"
)
public class TestRunner {
}

