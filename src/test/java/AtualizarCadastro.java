import org.junit.Assert;
import org.junit.Test;

public class AtualizarCadastro extends Hooks {

	PaginaPrincipal pg = new PaginaPrincipal();
	PaginaDeListaDeUsuario lista = new PaginaDeListaDeUsuario();
	PaginaDeEditarUsuários editar = new PaginaDeEditarUsuários();
	NovoCadastrodeUsuario cadastroNovo = new NovoCadastrodeUsuario();

	@Test
	public void atualizarcadastrodeusuariocomsucesso() {
		// TODO Auto-generated method stub
		pg.clicarBotaoFormulario();
		pg.clicarBotaoListadeUsuario();
		lista.clicarBotaoDeEdicao();
		editar.clicarBotaoDeEditar();
		cadastroNovo.atualizarNovoCadastro(
				"Bruna", 
				"Silveira",
				"silva123@gmail.com", 
				"Paulista 123", 
				"Estagio", 
				"UNIP", 
				"Feminino", 
				"19");
		cadastroNovo.clicarNoBotaoConfirma();
		
		Assert.assertEquals("Seu Usuário foi Atualizado!", cadastroNovo.retornoDaMensagem());
	}
	
}