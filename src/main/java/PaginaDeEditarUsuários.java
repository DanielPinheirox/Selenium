import org.openqa.selenium.By;

public class PaginaDeEditarUsu�rios extends EstruturaBase {

	public void clicarBotaoDeEditar() {
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div/a[1]")).click();

	}

}
