package TesteRomanos;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import romanos.Romanos;

public class Testes {
	private Romanos romanos;
	@Test

	@Before
	public void inicializa(){
		romanos = new Romanos();
	}
	@Test
	public void testa_se_retorna_inteiro(){
		assertEquals(0, romanos.returnZero("x"));
	}

}
