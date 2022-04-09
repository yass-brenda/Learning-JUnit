package challenges;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {
    @Test
    public void caseReturnFizz(){
        Assert.assertEquals("Fizz",FizzBuzz.fizzBuzz(3));
    }
    @Test
    public void caseReturnBuzz(){
        Assert.assertEquals("Buzz",FizzBuzz.fizzBuzz(5));
    }
    @Test
    public void caseReturnFizzBuzz(){
        Assert.assertEquals("FizzBuzz",FizzBuzz.fizzBuzz(15));
    }
    @Test
    public void caseReturnNumber(){
        Assert.assertEquals("1",FizzBuzz.fizzBuzz(1));
    }

}