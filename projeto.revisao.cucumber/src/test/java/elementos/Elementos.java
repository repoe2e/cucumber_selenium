package elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By usuario = By.id("user-name");
	private By senha = By.id("password");
	private By btnLogin = By.id("login-button");
	private By getMensagemSenhaErrada = By.xpath("//h3[@data-test='error']");

	public By getUsuario() {
		return usuario;
	}

	public By getSenha() {
		return senha;
	}

	public By getBtnLogin() {
		return btnLogin;
	}

	
	public By getGetMensagemSenhaErrada() {
		return getMensagemSenhaErrada;
	}

}
