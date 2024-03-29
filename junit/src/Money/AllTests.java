package Money;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses(value = { MoneyTest.class, MoneyBagTest.class })
public class AllTests {
	@Test
	public void testMixedSimpleAdd() {
	// [12 CHF] + [7 USD] == {[12 CHF][7 USD]}
		
		Money f12CHF= new Money(12, "CHF");
		Money f14CHF= new Money(14, "CHF");
		Money f7USD= new Money( 7, "USD");
		Money f21USD= new Money(21, "USD");
		MoneyBag fMB1= new MoneyBag(f12CHF, f7USD);
		MoneyBag fMB2= new MoneyBag(f14CHF, f21USD);
	Money bag[] = { f12CHF, f7USD };
	MoneyBag expected = new MoneyBag(bag);
	assertEquals(expected, f12CHF.add(f7USD));
	}
	
	@Test
	public void testSimpleBagAdd() {
	    // [12 CHF] + [7 USD] == {[12 CHF][7 USD]}
		Money f12CHF= new Money(12, "CHF");
		Money f14CHF= new Money(14, "CHF");
		Money f7USD= new Money( 7, "USD");
		Money f21USD= new Money(21, "USD");
		MoneyBag fMB1= new MoneyBag(f12CHF, f7USD);
		MoneyBag fMB2= new MoneyBag(f14CHF, f21USD);
	    Money bag[] = { f12CHF, f7USD };
	    MoneyBag expected = new MoneyBag(bag);
	    assertEquals(expected, f12CHF.add(new MoneyBag(bag)));
	}

	@Test
	public void testBagBagAdd() {
	    // [12 CHF] + [7 USD] == {[12 CHF][7 USD]}
		Money f12CHF= new Money(12, "CHF");
		Money f14CHF= new Money(14, "CHF");
		Money f7USD= new Money( 7, "USD");
		Money f21USD= new Money(21, "USD");
		MoneyBag fMB1= new MoneyBag(f12CHF, f7USD);
		MoneyBag fMB2= new MoneyBag(f14CHF, f21USD);
	    Money bag1[] = { f12CHF };
	    Money bag2[] = { f7USD };
	    MoneyBag expected = new MoneyBag(bag1);
	    expected = (MoneyBag) expected.add(new MoneyBag(bag2));
	    assertEquals(expected, new MoneyBag(bag1).add(new MoneyBag(bag2)));
	}

}
