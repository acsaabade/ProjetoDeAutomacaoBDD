package page;

import org.openqa.selenium.By;

import metodos.Metodos;

public class LoginPage {

	Metodos metodo = new Metodos();
	By usuario = By.id("user-name");
	By senha = By.id("password");
	By btnLogin = By.id("login-button");
	By msgError = By.xpath("");
	String urlLogado = "https://www.saucedemo.com/inventory.html";

	public void login(String usuario, String senha) {

		metodo.escrever(this.usuario, usuario, "informar o usuario para login");
		metodo.escrever(this.senha, senha, "informar a senha para login");
		metodo.clicar(this.btnLogin, "clicar no botão para login");
	}

	public void validaLogin() {
		metodo.validarUrl(urlLogado);
	}

	public void preencherUsuario(String usuario) {
		metodo.escrever(this.usuario, usuario, "informar o usuario para login");
	}

	public void preencherSenha(String senha) {
		metodo.escrever(this.senha, senha, "informar a senha para login");
	}

	public void clicarBtnLogin() {
		metodo.clicar(this.btnLogin, "clicar no botão para login");
	}

	public void validarMensagensErroLogin(String msgEsperada) {
		if (msgEsperada.equals("urlLogado")) {
			metodo.validarUrl(msgEsperada);
		}else {
		metodo.validarTexto(msgError, msgEsperada);
	}

} 
	}
