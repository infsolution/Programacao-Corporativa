import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TesteConverter {
	private Converter converter;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	@Before
	public void setup(){
		converter = new Converter();
	}
	@Test
	public void testa_se_retorno_e_inteiro() {
		assertEquals(0, converter.convertRomano(1, "X"));
	}

}
