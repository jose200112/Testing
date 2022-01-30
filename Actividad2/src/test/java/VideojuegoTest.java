import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class VideojuegoTest {
	Videojuego v1;
	Videojuego v2;
	
	@BeforeEach
	public void constructor() {
		v1 = new Videojuego("GTA V", 50, "Aventuras", "Rockstar");
		v2 = new Videojuego("Warcraft", 60, "Aventuras", "Blizzard");
	}

	@Test
	public void testIsEntregado() {
		v1.entregar();
		assertEquals(true, v1.isEntregado());
		v2.devolver();
		assertEquals(false, v2.isEntregado());
	}

	@Test
	public void testCompareTo() {
		assertEquals(Videojuego.MENOR ,v1.compareTo(v2));
		assertEquals(Videojuego.MAYOR, v2.compareTo(v1));
		assertEquals(Videojuego.IGUAL, v1.compareTo(v1));
	}

	@Test
	public void testToString() {
		assertEquals("Informacion del videojuego: \n" +
	               "\tTitulo: "+"GTA V"+"\n" +
	               "\tHoras estimadas: "+50+"\n" +
	               "\tGenero: "+"Aventuras"+"\n" +
	               "\tcompañia: "+"Rockstar", v1.toString());
	}

	@Test
	public void testEqualsVideojuego() {
		assertTrue(v1.equals(v1));
		assertFalse(v1.equals(v2));
	}

}
