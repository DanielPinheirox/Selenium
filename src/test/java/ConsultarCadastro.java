import org.junit.Test;

public class ConsultarCadastro extends Hooks {

	PaginaPrincipal pg = new PaginaPrincipal();
	PaginaDeConsultaDeUsuarios consulta = new PaginaDeConsultaDeUsuarios();

	@Test
	public void consultarCadastroDeUsuarios() {
		pg.clicarBotaoFormulario();
		pg.clicarBotaoListadeUsuario();
		consulta.clicarBotaoDeConsulta();
		consulta.retornoDoNome();
		consulta.retornoDoSobreNome();
		consulta.retornoDoEmail();
		consulta.retornoDaUniversidade();
		consulta.retornoDoGenero();
		consulta.retornoDaProfissao();
		consulta.retornoDaIdade();
		consulta.retornoDoEndereco();
	}
}
