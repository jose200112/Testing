import static org.junit.jupiter.api.Assertions.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DebitoTest {

	Debito debito;
	Cuenta cuenta;

	@BeforeEach
	void setUp() throws Exception {
		cuenta = new Cuenta("3745.2452.22.4938273043", "Juan");

		String caducidad = "25/09/2022";
		DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Date duracion = formato.parse(caducidad);
		Date fechaCaducidad = new Date(duracion.getTime());
		debito = new Debito("3468394873498212", "Juan", fechaCaducidad);

		debito.setCuenta(cuenta);
	}

	@Test
	void testRetirar() {
		
		
		try {
			debito.ingresar(2000);
			debito.retirar(1500.0);
			assertEquals(500, debito.getSaldo());
		} catch (Exception e) {
			fail("fallo");
		}
	}

	@Test
	void testIngresar() {
		try {
			debito.ingresar(1000.0);
			assertEquals(1000, debito.getSaldo());
		} catch (Exception e) {
			fail("fallo");
		}
	}

	@Test
	void testPagoEnEstablecimiento() {
		try {
			debito.ingresar(1000.0);
			debito.pagoEnEstablecimiento("Panaderia", 100);
			assertEquals(900, debito.getSaldo());
		} catch (Exception e) {
			fail("fallo");
		}
	}

	@Test
	void testGetSaldo() {
		try {
			debito.ingresar(1000.0);
			assertEquals(1000.0, debito.getSaldo());
		} catch (Exception e) {
		}

		
	}

}
