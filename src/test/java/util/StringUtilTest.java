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


    @Test
    public void string_without_text(){
        Assert.assertTrue(StringUtil.isEmpty(""));
    }
    @Test
    public void string_correct(){
        Assert.assertFalse(StringUtil.isEmpty("Ulisses"));
    }
    @Test
    public void string_with_only_null(){
        Assert.assertTrue(StringUtil.isEmpty(null));
    }

    @Test
    public void string_with_only_spaces(){
        Assert.assertTrue(StringUtil.isEmpty("   "));
    }

}