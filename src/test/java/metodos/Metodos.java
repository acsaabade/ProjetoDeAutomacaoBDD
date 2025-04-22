package metodos;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import drivers.drivers;

public class Metodos extends drivers {

	/**
	 * Método responsável por escrever em um elemento usando a class by do Selenium
	 * 
	 * @param elemento
	 * @param texto
	 * @param passo
	 * @author acsaaba@hotmail.com
	 */

	public void escrever(By elemento, String texto, String passo) {
		try {
			driver.findElement(elemento).sendKeys(texto);
		} catch (Exception e) {
			System.out.println("**** ERRO AO ESCREVER O PASSO " + passo + " ****");
			System.out.println("**** CAUSA DO ERRO ****" + e.getCause());
			System.out.println("**** MENSAGEM DO ERRO ****" + e.getMessage());

		}

	}

	/**
	 * Método responsável por clicar em um elemento usando a class by do Seleniumx
	 * 
	 * @param elemento
	 * @param passo
	 * @author acsaaba@hotmail.com
	 */

	public void clicar(By elemento, String passo) {
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.out.println("**** ERRO AO CLICAR O PASSO " + passo + " ****");
			System.out.println("**** CAUSA DO ERRO ****" + e.getCause());
			System.out.println("**** MENSAGEM DO ERRO ****" + e.getMessage());
		}
	}

	/**
	 * Método responsável por validar a url desejada com url do site
	 * 
	 * @param urlDesejada
	 * @author acsaaba@hotmail.com
	 */

	public void validarUrl(String urlDesejada) {
		try {
			assertEquals(urlDesejada, driver.getCurrentUrl());
		} catch (Exception e) {
			System.out.println("**** URL DIFERENTE DA DESEJADA ****");
			System.out.println("**** CAUSA DO ERRO ****" + e.getCause());
			System.out.println("**** MENSAGEM DO ERRO ****" + e.getMessage());
		}
	}

	/**
	 * Método responsável por validar uma mensagem capturada através do elemento da
	 * usando By
	 * 
	 * @param elemento
	 * @param msgEsperada
	 * @author acsaaba@hotmail.com
	 */

	public void validarTexto(By elemento, String msgEsperada) {
		try {
			assertEquals(msgEsperada, driver.findElement(elemento).getText());
		} catch (Exception e) {
			System.out.println("**** ERRO AO VALIDAR TEXTO ****");
			System.out.println("**** CAUSA DO ERRO ****" + e.getCause());
			System.out.println("**** MENSAGEM DO ERRO ****" + e.getMessage());
		}
	}
}
