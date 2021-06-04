import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;

public class PaginaDeConsultaDeUsuarios extends EstruturaBase {

	public void clicarBotaoDeConsulta() {
		driver.findElement(By.className("material-icons")).click();
	}

	public void retornoDoNome() {
		String elementoNome = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div/p[1]")).getText();
		Assert.assertEquals("Nome: Bruna", elementoNome);
	}

	public void retornoDoSobreNome() {
		String elementoDoSobreNome = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div/p[2]")).getText();
		Assert.assertEquals("Ultimo Nome: Silva", elementoDoSobreNome);
	}

	public void retornoDoEmail() {
		String elementoDoEmail = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div/p[3]")).getText();
		Assert.assertEquals("Email: brunavianna88@gmail.com", elementoDoEmail);
	}

	public void retornoDaUniversidade() {
		String elementoDaUniversidade = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div/p[4]"))
				.getText();
		Assert.assertEquals("Univercidade: UVA", elementoDaUniversidade);
	}

	public void retornoDoGenero() {
		String elementoDoGenero = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div/p[5]")).getText();
		Assert.assertEquals("Gênero: Feminino", elementoDoGenero);
	}

	public void retornoDaProfissao() {
		String elementoDaProfissao = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div/p[6]")).getText();
		Assert.assertEquals("Profissão: Analista", elementoDaProfissao);
	}

	public void retornoDaIdade() {
		String elementoDaIdade = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div/p[7]")).getText();
		Assert.assertEquals("Idade: 10", elementoDaIdade);
	}

	public void retornoDoEndereco() {
		String elementoDoEndereco = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div/p[8]")).getText();
		Assert.assertEquals("Address: Rua ABC, 555", elementoDoEndereco);
	}
	

}
