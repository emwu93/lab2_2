package lab2_2;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;


import pl.com.bottega.ecommerce.sharedkernel.Money;

public class MoneySubstractTakaSamaWalutaWynikUjemnyTest {
	
	@Test
	public void test(){
		
		Money money1=new Money(2.0,"USD");
		Money money2=new Money(3.0,"USD");
		Money oczekiwana_wart = new Money(-1.0,"USD");
		
		assertThat(oczekiwana_wart,is(equalTo(money1.subtract(money2))));
		
		
	}

}
