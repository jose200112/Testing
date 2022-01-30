import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductTest {
	
	Product p1;
	Product p2;
	
	@BeforeEach
	public void setup() throws Exception {
		Product p1 = new Product("Champu", 2.5);
	}

	@Test
	void testGetTitle() {
		assertEquals("Champu", p1.getTitle());
	}

	@Test
	void testGetPrice() {
		assertEquals(2.5, p1.getPrice());
	}

	@Test
	void testEqualsObject() {
		assertEquals("Champu", p1.equals(p1));
		
		assertFalse(p1.equals(p2));
	}

}
