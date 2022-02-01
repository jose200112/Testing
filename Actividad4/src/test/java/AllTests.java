import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	AccountTest.class,
	BoaTest.class,
	FridgeTest.class,
	OperadorAritmetico.class,
	Pila.class,
	SubscripcionTest.class,
	BoaTestParametrizada.class,
	FridgeTestParametrizada.class
	
})
public class AllTests {

}
