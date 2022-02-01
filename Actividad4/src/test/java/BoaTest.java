import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BoaTest {
	Boa bicho1;
	Boa bicho2;

	@BeforeEach
	void setUp() throws Exception {
		bicho1 = new Boa("Tina", 3, "Kiwi");
		bicho2 = new Boa("Dita", 6, "granola bars");
	}

	@Test
	void testIsHealthy() {
		assertFalse(bicho1.isHealthy());
		assertTrue(bicho2.isHealthy());
	}

	@Test
	void testFitsInCage() {
		assertTrue(bicho1.fitsInCage(4));
		assertFalse(bicho2.fitsInCage(3));
	}

}
