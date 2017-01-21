package lab2_2;


import org.junit.Test;

import pl.com.bottega.ecommerce.sharedkernel.Money;

public class MoneyAddDodawanieRoznaWaluta {


	@Test(expected=IllegalArgumentException.class)
	public void test(){		
		
		Money money1=new Money(3.0,"USD");
		Money money2=new Money(1.0, "EUR");
		
		money1.add(money2);	
		
	}
	
	
}
