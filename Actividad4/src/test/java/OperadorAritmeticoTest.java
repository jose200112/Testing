import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OperadorAritmeticoTest {
	
    OperadorAritmetico o;
    
    @BeforeEach
    public void init() {
    	o = new OperadorAritmetico();
    }
	
	@Test
	void testSuma() {
		assertEquals(10, o.suma(5, 5));
	}

	@Test
	void testDivision() throws Exception {
		try {
			assertEquals(2, OperadorAritmetico.division(10, 5));
		} catch (Exception a) {
			fail("No falla");
		}
	}
	
	/*@Test*/
	public void divisionException() {
		try {

			assertEquals(0, OperadorAritmetico.division(10, 0));
		} catch (Exception e) {

			fail("El dividendo no puede ser 0");
		}

	}

}
