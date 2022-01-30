import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SerieTest {

	Serie s1;
	Serie s2;
	Serie s3;
	
	@BeforeEach
	public void Constructor() {
		s1 = new Serie("The Witcher", 2, "Drama", "Lauren");
		s2 = new Serie("La casa de papel", 5, "Suspense", "Alex");
		s3 = new Serie("Futurama", 7, "Humor", "Matt");
	}
	
	@Test
	public void testIsEntregado() {
		s1.entregar();
		assertEquals(true, s1.isEntregado());
		s2.devolver();
		assertEquals(false, s2.isEntregado());
	}

	@Test
	public void testCompareTo() {
		assertEquals(Serie.IGUAL, s1.compareTo(s1));
		
		assertEquals(Serie.MAYOR, s2.compareTo(s1));

		assertEquals(Serie.MENOR, s1.compareTo(s3));
		
	}

	@Test
	public void testToString() {
		assertEquals("Informacion de la Serie: \n" +
                "\tTitulo: "+"The Witcher"+"\n" +
                "\tNumero de temporadas: "+2+"\n" +
                "\tGenero: "+"Drama"+"\n" +
                "\tCreador: "+"Lauren", s1.toString());
	}

	@Test
	public void testEqualsSerie() {
		assertTrue(s1.equals(s1));
		assertFalse(s1.equals(s2));
	}

}
