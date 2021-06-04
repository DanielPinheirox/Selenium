import org.openqa.selenium.By;

public class PaginaPrincipal extends EstruturaBase {

	public void clicarBotaoFormulario() {
		driver.findElement(By.className("collapsible-header")).click();
	}

	public void clicarBotaoListadeUsuario() {
		driver.findElement(By.linkText("Lista de Usuários")).click();
	}

	public void clicarBotaoBuscaDeElementos() {
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[2]/a")).click();
	}
	 public void clicarEmBotoes() {
	driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[2]/div/ul/li[3]/a")).click();
	}

}
