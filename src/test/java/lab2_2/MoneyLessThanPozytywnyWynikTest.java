package lab2_2;

import org.junit.Test;

import pl.com.bottega.ecommerce.sharedkernel.Money;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class MoneyLessThanPozytywnyWynikTest {
	
	@Test
	public void test(){
		
		Money money1=new Money(2.0,"USD");
		Money money2=new Money(3.0,"USD");
		boolean tmp=true;	
		
		assertThat(tmp,is(equalTo(money1.lessThan(money2))));
		
	}

}
