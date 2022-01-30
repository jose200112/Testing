import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTest {
	
	Persona p;
	
	@BeforeEach
	public void setUp() throws Exception {
		Persona p = new Persona("Juan", 20, 'H', 80, 1.75);
	}

	@Test
	void testCalcularIMC() {
		Persona p = new Persona();
		p.setAltura(1.75);
		p.setPeso(90);
	    int imc = p.calcularIMC();
	    assertEquals(p.SOBREPESO, p.calcularIMC());
	    p.setPeso(49);
	    imc = p.calcularIMC();
	    assertEquals(p.INFRAPESO, imc);
	    p.setPeso(68);
	    imc = p.calcularIMC();
	    assertEquals(p.PESO_IDEAL, imc);
	}

	@Test
	void testEsMayorDeEdad() {
		Persona p = new Persona();
		p.setEdad(20);
		assertTrue(p.esMayorDeEdad());
		p.setEdad(15);
		assertFalse(p.esMayorDeEdad());
	}

}
