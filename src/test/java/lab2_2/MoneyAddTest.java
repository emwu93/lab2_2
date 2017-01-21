package lab2_2;

import org.junit.Test;

import pl.com.bottega.ecommerce.sharedkernel.Money;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;


public class MoneyAddTest {

	@Test
	public void test(){
		
		
		Money money1=new Money(3.0);
		Money money2=new Money(1.0);
		Money oczekiwana_wart=new Money(4.0);
		
		Money suma=money1.add(money2);
		
		assertThat(suma,is(equalTo(oczekiwana_wart)));
		
	}
	
}
