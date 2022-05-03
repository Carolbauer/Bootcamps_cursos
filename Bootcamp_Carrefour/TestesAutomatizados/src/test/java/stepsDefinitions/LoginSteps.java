package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.LoginPage;



public class LoginSteps {
	
	LoginPage lp = new LoginPage();
	
	@Quando("eu informar o usuario {string}")
	public void euInformarOUsuario(String usuario) {
	   lp.informarcampoUsuario(usuario);
	}
	@Quando("informar a senha {string}")
	public void informarASenha(String senha) {
	    lp.informarcampoSenha(senha);
	}
	@Quando("clicar no acessar")
	public void acionarBotaoAcessar() {
	    lp.acionarBotaoAcessar();
	}
	@Entao("o sistema exibe a mensagem de usuario invalido")
	public void oSistemaExibeAMensagemDeUsuarioInvalido() {
	 
	}

	
	@Entao("o sistema exibe o usuario logado")
	public void oSistemaExibeOUsuarioLogado() {
	    
	}
	
	@Quando("eu clicar no registrar o sistema abre a pagina de registro de usuarios")
	public void euClicarNoRegistrarOSistemaAbreAPaginaDeRegistroDeUsuarios() {
	    lp.acionarBotaoRegistro();
	}


	@Entao("informa no campo email {string}")
	public void informaNoCampoEmail(String email) {
	   lp.informarcampoemail(email);
	}
	@Entao("informa no campo name {string}")
	public void informaNoCampoName(String nome) {
		lp.informarcamponame(nome);
	    
	}
	@Entao("informa no campo password {string}")
	public void informaNoCampoPassword(String senhaRegistro) {
		lp.informarcamposennharegistro(senhaRegistro);
		
	}
	    
	@Entao("informa no campo passwordConfirmation {string}")
	public void informaNoCampoPasswordConfirmation(String senhaConfirmacao) {
		lp.informarsenhaconfirmacao(senhaConfirmacao);
	 
	}
	@Entao("clica no botao cadastrar")
	public void clicaNoBotaoCadastrar() {
		lp.clicarBotaoCadastrar();
		
	}
	    
	@Entao("o sistema cadastra o usuario {string}")
	public void oSistemaCadastraOUsuario(String string) {
	    
	}





}
