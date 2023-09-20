package runer;

import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import drivers.Drivers;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = "steps", tags = "@teste and not @negativo", dryRun = false, monochrome = true, snippets = SnippetType.CAMELCASE, plugin = {
		"pretty", "html:target/cucumber-resport.html" }

)

public class Executa extends Drivers {

	public static void abrirNavegador() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");

	}

	public static void fecharNavegador() {
		// driver.quit();
	}

}
