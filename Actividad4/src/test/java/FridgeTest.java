import static org.junit.jupiter.api.Assertions.*;

import java.util.Collection;
import java.util.HashSet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FridgeTest {
	
	Fridge nevera;
	Collection<String> food = new HashSet<String>();
	
	@BeforeEach
	void setUp() {
		nevera = new Fridge();
		food.add("Tortilla");
		food.add("Batido");
		food.add("Empanada");
	}

	@Test
	void testPut() {
		nevera.put("Tortilla");
		assertTrue(nevera.contains("Tortilla"));
	}

	@Test
	void testContains() {
		nevera.put("Tortilla");
		assertTrue(nevera.contains("Tortilla"));
		assertFalse(nevera.contains("Empanada"));
	}

	@Test
	void testTake() {
		try {
			nevera.put("Batido");
			assertTrue(nevera.contains("Batido"));
			nevera.take("Batido");
			assertFalse(nevera.contains("Batido"));
		} catch (Exception a) {
			fail("fallo");
		}
	}
	
	@Test
	void testTakeException() {
		try {
			nevera.take("Empanada");
			fail("No queda en el frigorifico");
		} catch (Exception a) {
			assertTrue(a.getMessage().contains("Empanada"));
		}
	}

}
