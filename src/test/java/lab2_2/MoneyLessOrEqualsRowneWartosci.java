package lab2_2;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import pl.com.bottega.ecommerce.sharedkernel.Money;


public class MoneyLessOrEqualsRowneWartosci {
	
	@Test
	public void test(){
	Money money1=new Money(2.0,"USD");
	Money money2=new Money(2.0,"USD");
	boolean tmp=true;
	
	assertThat(tmp,is(equalTo(money1.lessOrEquals(money2))));
	}
}
