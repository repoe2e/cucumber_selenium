package steps;

import elementos.Elementos;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import runer.Executa;

public class TestandoLoginTeste {

	Metodos metodo = new Metodos();
	Elementos el = new Elementos();

	String usuario = "standard_user";
	String senha = "secret_sauce";
	String senhaErrada = "123";
	String urlLogado = "https://www.saucedemo.com/inventory.html";
	String msgSenhaErrada = "Epic sadface: Username and password do not match any user in this service";

	@After
	public void encerrarTeste() {
		Executa.fecharNavegador();
	}

	@Given("que esteja na tela de login")
	public void que_esteja_na_tela_de_login() {
		Executa.abrirNavegador();
	}

	@Given("preencher o nome")
	public void preencher_o_nome() {

		metodo.escrever(el.getUsuario(), usuario);
	}

	@Given("preencher a senha")
	public void preencher_a_senha() {
		metodo.escrever(el.getSenha(), senha);
	}

	@When("clicar no botao login")
	public void clicar_no_botao_login() {
		metodo.clicar(el.getBtnLogin());
	}

	@Then("acesso conta")
	public void acesso_conta() {
		metodo.validarUrl(urlLogado);
	}

	@Given("preencher a senha errada")
	public void preencher_a_senha_errada() {
		metodo.escrever(el.getSenha(), senhaErrada);
	}

	@Then("valido mensagem de senha invalida")
	public void valido_mensagem_de_senha_invalida() {
		metodo.validarMensagem(el.getGetMensagemSenhaErrada(), msgSenhaErrada);
	}

}
