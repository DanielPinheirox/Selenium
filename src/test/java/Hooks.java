import org.junit.After;
import org.junit.Before;

public class Hooks {

	EstruturaBase estruraBase = new EstruturaBase();

	@Before
	public void antes() {
		estruraBase.iniciarChrome();

	}
	@After
	public void depois() {
		estruraBase.finalizarChrome();
	}
}
