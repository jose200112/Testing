import static org.junit.jupiter.api.Assertions.*;

import java.util.Collection;
import java.util.HashSet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.runners.Parameterized.Parameters;

class FridgeTestParametrizada {

	Fridge nevera;
	Collection<String> food = new HashSet<String>();

	@BeforeEach
	void setUp() {
		nevera = new Fridge();
		food.add("Tortilla");
		food.add("Batido");
		food.add("Empanada");
	}
	
	@Parameters(name = "Test Contains")
	@CsvSource({"nevera"})
	void testContains(String item,boolean expectedResult) throws Exception {
	((Collection<String>) nevera).add("Tortilla");	
		
		assertEquals(expectedResult, nevera.contains(item));
	}
	

	@Parameters(name = "Test Put")
	@CsvSource({"nevera"})
	void testPut(String item, boolean expectedResult) throws Exception {
		((Collection<String>) nevera).add("Tortilla");
		
		assertEquals(expectedResult, nevera.put(item));
	}
	
	@Parameters(name = "Test Take")
	@CsvSource({"nevera"})
	void testTake(String item, boolean expectedResult) throws Exception {
		((Collection<String>) nevera).add("Tortilla");
		
		assertEquals(expectedResult, nevera.take(item));
	}
}
