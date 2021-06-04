import org.openqa.selenium.By;

public class PaginaDeListaDeUsuario extends EstruturaBase {
	
	public void clicarBotaoDeEdicao() {
		driver.findElement(By.className("material-icons")).click();
	} 

}
