import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SubscripcionTest {
	
	Subscripcion s1;
	Subscripcion s2;
	Subscripcion s3;
	Subscripcion s4;
	
	@BeforeEach
	void setUp() {
		s1 = new Subscripcion(0,3);
		s2 = new Subscripcion(8,0);
		s3 = new Subscripcion(3,1);
		s4 = new Subscripcion(3,2);
	}

	@Test
	void testPrecioPorMes() {
		assertEquals(0.0, s1.precioPorMes());
		assertEquals(0.0, s2.precioPorMes());
		assertEquals(3.0, s3.precioPorMes());
		assertEquals(2.5, s4.precioPorMes());
	}

	@Test
	void testCancel() {
		s3.cancel();
		assertEquals(0, s3.getPeriodo());
	}

}
