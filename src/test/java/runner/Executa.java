package runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import drivers.drivers;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = "steps",
		dryRun = true, //true estou em planejamento / false estou em execução
		tags = "@regressivos",
		monochrome = true,
		plugin = {"pretty" ,"html:target/cucumber-report.html"}		
		)

public class Executa extends drivers {

	/**
	 * Método responsável por abrir o Navegador Chrome ou Firefox de acordo com o
	 * valor da variável navegador
	 */

	public static void abrirNavegador() {
		String ambiente = "https://saucedemo.com";
		String navegador = "Chrome";

		if (navegador.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		driver.get(ambiente);
		driver.manage().window().maximize();
	}

	/**
	 * Método responsável por encerrar o navegador utilizado nos testes
	 */
	public static void fecharNavegador() {
		driver.quit();

	}
}
