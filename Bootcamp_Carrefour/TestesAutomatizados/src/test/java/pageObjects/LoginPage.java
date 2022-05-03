package pageObjects;

import static utils.Utils.*;


import org.openqa.selenium.By;


public class LoginPage {
	
	public void informarcampoUsuario(String usuario) {
		
		driver.findElement(By.name("email")).sendKeys(usuario);
	}
	
	public void informarcampoSenha(String senha) {
		
		driver.findElement(By.name("password")).sendKeys(senha);
	}
	
	public void acionarBotaoAcessar(){
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[1]/form/div[3]/button[1]")).click();
	}
	
	public void acionarBotaoRegistro() {
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[1]/form/div[3]/button[2]")).click();
	}
	
	public void informarcampoemail(String email) {
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/form/div[2]/input")).sendKeys(email);
	}
	 public void informarcamponame(String nome) {
		 driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/form/div[3]/input")).sendKeys(nome);
	 }
	 
	 public void informarcamposennharegistro(String senhaRegistro) {
		 driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/form/div[4]/div/input")).sendKeys(senhaRegistro);
	 }
	 
	 public void informarsenhaconfirmacao(String senhaConfirmacao) {
		 driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/form/div[5]/div/input")).sendKeys(senhaConfirmacao);
	 }
	 
	 public void clicarBotaoCadastrar(){
			
			driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/button")).click();
		}
	 

}
