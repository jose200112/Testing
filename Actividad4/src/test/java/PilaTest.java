import static org.junit.jupiter.api.Assertions.*;

import java.util.Stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class PilaTest {
	
	Pila p;
	Stack<Integer> Pila;
	
	@BeforeEach
	public void init() {
		p = new Pila();
		Pila = new Stack<Integer>();
	}

	@Test
	void testPush() {
		p.push(1);
		assertTrue(p.isEmpty());
		p.push(5);
		assertFalse(p.isEmpty());
		
	}

	@Test
	void testPop() {
		assertEquals(null, p.pop());
		Pila.push(5);
		
		assertEquals(Pila.peek(), Pila.pop());
	}

	@Test
	void testIsEmpty() {
		assertTrue( p.isEmpty());

		p.push(10);
		assertFalse(p.isEmpty());
	}

	@Test
	void testTop() {
		p.isEmpty();
		assertEquals(null, p.top());
		Pila.push(5);
	}
	
}
