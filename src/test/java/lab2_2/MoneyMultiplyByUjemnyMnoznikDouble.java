package lab2_2;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import pl.com.bottega.ecommerce.sharedkernel.Money;

public class MoneyMultiplyByUjemnyMnoznikDouble {
	
	@Test
	public void test(){
		
		Money money1=new Money(4.0,"USD");
		double mnoznik=-2;
		Money oczekiwana_wart=new Money(-8.0,"USD");
		
		assertThat(oczekiwana_wart,is(equalTo(money1.multiplyBy(mnoznik))));
		
	}

}
