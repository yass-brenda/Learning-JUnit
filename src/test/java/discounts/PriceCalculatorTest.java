package discounts;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.junit.Assert.*;

public class PriceCalculatorTest {

    @Test
    public void return_total_zero_when_there_are_not_prices(){
        PriceCalculator priceCalculator = new PriceCalculator();
        assertThat(priceCalculator.getTotal(), CoreMatchers.is(0.0));
    }

    @Test
    public void total_is_the_sum_of_prices(){
        PriceCalculator priceCalculator = new PriceCalculator();
        priceCalculator.addPrices(10.2);
        priceCalculator.addPrices(15.5);
        assertThat(priceCalculator.getTotal(), CoreMatchers.is(25.7));
    }

    @Test
    public void apply_discount_to_prices(){
        PriceCalculator priceCalculator = new PriceCalculator();
        priceCalculator.addPrices(10.0);
        priceCalculator.addPrices(20.0);

        priceCalculator.setDiscount(50);
        assertThat(priceCalculator.getTotal(), CoreMatchers.is(15.0));
    }
}