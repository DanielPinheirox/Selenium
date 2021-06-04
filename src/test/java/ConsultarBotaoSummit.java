import org.junit.Assert;
import org.junit.Test;

public class ConsultarBotaoSummit extends Hooks{
	
	PaginaPrincipal pg = new PaginaPrincipal();
	PaginaDeBotoes pgDeBotoes = new PaginaDeBotoes();
	
	@Test
	public void consultarBotoes() {
		
		pg.clicarBotaoBuscaDeElementos();
		pg.clicarEmBotoes();
		
		pgDeBotoes.clicarBotaoSubmit();
		
		Assert.assertEquals("Voc� Clicou no Bot�o!", pgDeBotoes.retornoDaMensagemDeBotoes());
	}

}
