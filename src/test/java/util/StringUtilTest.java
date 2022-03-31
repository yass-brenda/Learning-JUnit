package util;


import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {

    @Test
    public void testRepeat(){
        // expect, actual
        Assert.assertEquals("holaholahola",StringUtil.repeat("hola", 3));
        Assert.assertEquals("hola",StringUtil.repeat("hola", 1));
    }


}