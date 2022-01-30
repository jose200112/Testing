import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShoppingCartTest {
	Product p;
	Product r;
	ShoppingCart s;

	@BeforeEach
	public void setUp() throws Exception {
		p = new Product("Champu", 2.5);
		r = new Product("Gel", 2);
		s = new ShoppingCart();
		s.addItem(p);
		
	}

	@Test
	void testGetBalance() {
		assertEquals(2.5, s.getBalance());
	}

	@Test
	void testAddItem() {
		s.addItem(r);
		
		double precioTotal = r.getPrice() + p.getPrice(); 
		
		assertEquals(precioTotal, s.getBalance());
		
		assertEquals(2, s.getItemCount());
		
	}

	@Test
	void testRemoveItem() throws ProductNotFoundException {
		s.removeItem(p);
		assertEquals(0, s.getItemCount());
	}

	@Test
	void testGetItemCount() {
		assertEquals(1, s.getItemCount());
	}

	@Test
	void testEmpty() {
		s.empty();
		assertEquals(0, s.getItemCount());
	}

}
