import org.openqa.selenium.By;

public class PaginaDeBotoes extends EstruturaBase{
	
	public void clicarBotaoSubmit() {
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[6]/div[1]/div/button")).click();
	}
	public String retornoDaMensagemDeBotoes() {
		return driver.findElement(By.id("div4")).getText();
	}

}
