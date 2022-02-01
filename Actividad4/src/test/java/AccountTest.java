import static org.junit.jupiter.api.Assertions.*;

import java.text.NumberFormat;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AccountTest {
	
	Account a;
	NumberFormat fmt = NumberFormat.getCurrencyInstance(); 
	
	@BeforeEach
	public void Account() {
		a = new Account("Juan", 2346, (float) 120.6);
	}

	@Test
	void testDeposit() {
		assertTrue(a.deposit(50));
		assertFalse(a.deposit(-50));
	}

	@Test
	void testWithdraw() {
		assertFalse(a.withdraw((float) -5, (float) -2));
		assertTrue(a.withdraw(4f, 3f));
	}

	@Test
	void testAddInterest() {
		a.addInterest();
		assertEquals(120.6f + (120.6f * 0.045f), a.getBalance());
	}

	@Test
	void testToString() {
		assertEquals(2346 + "\t" + "Juan" + "\t" + fmt.format(120.6f), a.toString());
	}

}
