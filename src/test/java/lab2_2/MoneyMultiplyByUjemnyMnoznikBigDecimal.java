package lab2_2;

import org.junit.Test;
import java.math.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
import pl.com.bottega.ecommerce.sharedkernel.Money;

public class MoneyMultiplyByUjemnyMnoznikBigDecimal {

	@Test
	public void test(){
		
		Money money1=new Money(4.0,"USD");
		BigDecimal mnoznik=new BigDecimal(-2.0);
		Money oczekiwana_wart=new Money(-8.0, "USD");
		
		assertThat(oczekiwana_wart,is(equalTo(money1.multiplyBy(mnoznik))));
		
		
	}
	
	
	
	
}
