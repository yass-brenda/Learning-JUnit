package util;


import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {

    @Test
    public void repeat_string_one(){
        Assert.assertEquals("hola",StringUtil.repeat("hola", 1));
    }

    @Test
    public void repeat_string_multiple_times(){
        Assert.assertEquals("holaholahola",StringUtil.repeat("hola", 3));
    }

    @Test
    public void repeat_string_zero_times(){
        Assert.assertEquals("",StringUtil.repeat("", 0));
    }

    // Esperar que devuelva una exception
    @Test(expected = IllegalArgumentException.class)
    public void repeat_string_negative_times(){
        Assert.assertEquals("",StringUtil.repeat("", -1));
    }
}