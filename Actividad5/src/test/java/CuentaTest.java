import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuentaTest {

	Cuenta cuenta;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		cuenta = new Cuenta("3949.4345.45.4059332044", "Juan");
	}

	@Test
	void testIngresarDouble() {
		try {
			cuenta.ingresar(1000);

		} catch (Exception e) {
			fail("fallo");
		}
		assertTrue(cuenta.getSaldo() == 1000.0);

	}

	@Test
	void testRetirarDouble() {
		try {
			cuenta.retirar(1000);
		} catch (Exception e) {
		}
		assertTrue(cuenta.getSaldo() == 0.0);
	}

	@Test
	void testIngresarStringDouble() {
		try {
			cuenta.ingresar("Ingresa", 1000);

		} catch (Exception e) {
			fail("No falla");
		}
		assertTrue(cuenta.getSaldo() == 1000.0);
	}

	@Test
	void testRetirarStringDouble() {
		try {
			cuenta.retirar("Retira", 1000);
		} catch (Exception e) {
		}
		assertTrue(cuenta.getSaldo() == 0.0);
	}


}
