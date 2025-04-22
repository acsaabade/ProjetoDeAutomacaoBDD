package runner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import drivers.drivers;
import io.github.bonigarcia.wdm.WebDriverManager;

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
