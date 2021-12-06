package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports"},
        features = "src/test/resources/features", // feature dosyaları nerede ?
        glue = "stepDefinitions", // senaryo adımları nerede ?
        tags ="@insider",
        dryRun = false // testleri çalıştırma sadece eksik olan methodları (steps) run icin false


)

public class Runner {
}

