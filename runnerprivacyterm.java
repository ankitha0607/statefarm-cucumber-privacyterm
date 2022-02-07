package statefarmprivacyterm;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome = true,
        features = "C:\\Users\\ANKITHA\\Desktop\\java-selenium\\cucumberdemo\\src\\test\\java\\statefarmprivacyterm\\",
        glue = "/statefarmprivacyterm"
		)
public class runnerprivacyterm {
}