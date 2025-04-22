package steps;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import page.LoginPage;
import runner.Executa;

public class FuncionalidadeLoginTeste {

	LoginPage login = new LoginPage();

	String msgUsuarioObrigatorio = "Epic sadface: Username is required";
	String msgSenhaObrigatoria = "Epic sadface: Password is required";

	@After
	public void finalizarTeste() {
		Executa.fecharNavegador();

	}

	@Given("que esteja na tela de login")
	public void que_esteja_na_tela_de_login() {
		Executa.abrirNavegador();

	}

	@When("enviar os dados de login")
	public void enviar_os_dados_de_login() {
		login.login("standard_user", "secret_sauce");

	}

	@Then("login realizado com sucesso")
	public void login_realizado_com_sucesso() {
		login.validaLogin();
	}

	@Given("nao preencher o usario")
	public void nao_preencher_o_usario() {
		login.preencherUsuario("");
	}

	@Given("preencher a senha")
	public void preencher_a_senha() {
		login.preencherSenha("secret_sauce");
	}

	@Given("clicar no botao login")
	public void clicar_no_botao_login() {
		login.clicarBtnLogin();
	}

	@Given("login nao sera realizado com mensagem de usuario obrigatorio")
	public void login_nao_sera_realizado_com_mensagem_de_usuario_obrigatorio() {
		login.validarMensagensErroLogin(msgUsuarioObrigatorio);
	}

	@When("preencher o usario")
	public void preencher_o_usario() {
		login.preencherUsuario("standard_user");
	}

	@When("nao preencher a senha")
	public void nao_preencher_a_senha() {
		login.preencherSenha("");
	}

	@Then("login nao sera realizado com mensagem de senha obrigatorio")
	public void login_nao_sera_realizado_com_mensagem_de_senha_obrigatorio() {
		login.validarMensagensErroLogin(msgSenhaObrigatoria);
	}
	
	@When("informar o usuario {string}")
	public void informar_o_usuario(String usuario) {
		login.preencherUsuario(usuario);
	  	}

	@When("informar a senha {string}")
	public void informar_a_senha(String senha) {
		login.preencherSenha(senha);
	}

	@Then("validar a mensagem {string}")
	public void validar_a_mensagem(String string) {
	    }




}
