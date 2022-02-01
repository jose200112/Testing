import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.runners.Parameterized.Parameters;
class BoaTestParametrizada {
	
	Boa bicho1;
	Boa bicho2;

	@BeforeEach
	void setUp() {
		bicho1 = new Boa("Tina", 3, "kiwi");
		bicho2 = new Boa("Dita", 6, "granola bars");
	}
	
	@Parameters(name = "Test IsHealthy")
	@CsvSource( {
		"Tina1, 4, kiwi, false",
		"Dita1, 2, granola bars, true",
		"Tina2, 5, kiwi,false",
		"Dita2, 6, kiwi, false",
		"Tina3, 8, granola bars, true",
		"Dita3, 5, kiwi, false",
		"Tina4, 3, kiwi, false",
		"Dita4, 5, granola bars, true"
	})
	
	void testIsHealthy1(String nombre,int medidas,String comida, boolean expectedResult) throws Exception {
		bicho1 = new Boa(nombre,medidas,comida);
		
		assertEquals(expectedResult, bicho1.isHealthy());
	}
	

	@Parameters(name = "Test FitsInCage")
	@CsvSource({
			"Tina, 2, 3, kiwi, true",
			"Dita, 5, 3, granola bars, false"
			
	})
	void testFitsInCage2(String nombre,int medidas,int cageLength,String comida, boolean expectedResult) throws Exception {
		bicho1 = new Boa(nombre,medidas,comida);
		
		assertEquals(expectedResult, bicho1.fitsInCage(cageLength));
	}
}
