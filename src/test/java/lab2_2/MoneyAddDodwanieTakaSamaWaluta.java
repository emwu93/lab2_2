package lab2_2;

import org.junit.Test;

import pl.com.bottega.ecommerce.sharedkernel.Money;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;


public class MoneyAddDodwanieTakaSamaWaluta {
	
	@Test
	public void test(){
	Money money1=new Money(2.0,"USD");
	Money money2=new Money(3.0,"USD");
	Money oczekiwana_wart= new Money(5.0,"USD");
	
	Money suma=money1.add(money2);	
	
	assertThat(suma,is(equalTo(oczekiwana_wart)));
	
	
	}

}
