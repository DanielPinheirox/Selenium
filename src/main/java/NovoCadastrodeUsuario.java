import org.openqa.selenium.By;

public class NovoCadastrodeUsuario extends EstruturaBase {

	public void preencherNovoNome(String novoNome) {

		if (By.id("user_name") != null) {

			driver.findElement(By.id("user_name")).clear();
			driver.findElement(By.id("user_name")).sendKeys(novoNome);
		}
	}

	public void preencherNovoSobrenome(String novoSobrenome) {

		if (By.id("user_lastname") != null) {

			driver.findElement(By.id("user_lastname")).clear();
			driver.findElement(By.id("user_lastname")).sendKeys(novoSobrenome);
		}
	}

	public void preencherNovoEmail(String novoEmail) {

		if (By.id("user_email") != null) {

			driver.findElement(By.id("user_email")).clear();
			driver.findElement(By.id("user_email")).sendKeys(novoEmail);
		}
	}

	public void preencherNovoEndereco(String novoEndereco) {

		if (By.id("user_address") != null) {

			driver.findElement(By.id("user_address")).clear();
			driver.findElement(By.id("user_address")).sendKeys(novoEndereco);
		}
	}

	public void preencherNovaUniversidade(String novaUniversidade) {

		if (By.id("user_university") != null) {

			driver.findElement(By.id("user_university")).clear();
			driver.findElement(By.id("user_university")).sendKeys(novaUniversidade);
		}
	}

	public void preencherNovaProfissao(String novaProfissao) {

		if (By.id("user_profile") != null) {

			driver.findElement(By.id("user_profile")).clear();
			driver.findElement(By.id("user_profile")).sendKeys(novaProfissao);
		}
	}

	public void preencherNovoGenero(String novoGenero) {

		if (By.id("user_gender") != null) {

			driver.findElement(By.id("user_gender")).clear();
			driver.findElement(By.id("user_gender")).sendKeys(novoGenero);
		}
	}

	public void preencherNovaIdade(String novaIdade) {

		if (By.id("user_age") != null) {

			driver.findElement(By.id("user_age")).clear();
			driver.findElement(By.id("user_age")).sendKeys(novaIdade);
		}
	}
	
	public void clicarNoBotaoConfirma() {
		driver.findElement(By.name("commit")).click();
	}

	public String retornoDaMensagem() {
		return driver.findElement(By.id("notice")).getText();
	}
	
	public void atualizarNovoCadastro(String novoNome, String novoSobrenome, String novoEmail, String novoEndereco,
			String novaUniversidade, String novaProfissao, String novoGenero, String novaIdade) {
		preencherNovoNome(novoNome);
		preencherNovoSobrenome(novoSobrenome);
		preencherNovoEmail(novoEmail);
		preencherNovoEndereco(novoEndereco);
		preencherNovaUniversidade(novaUniversidade);
		preencherNovaProfissao(novaProfissao);
		preencherNovoGenero(novoGenero);
		preencherNovaIdade(novaIdade);

	}
}
