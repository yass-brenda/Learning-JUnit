package util;


import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DateUtilTest {

    // All years divisibles by 400 ARE leap years(1600,200,2400)
    @Test
    public void return_true_when_year_id_divisible_by_400(){
        assertThat(DateUtil.isLeapYear(1600), CoreMatchers.is(true));
        assertThat(DateUtil.isLeapYear(2000), CoreMatchers.is(true));
        assertThat(DateUtil.isLeapYear(2400), CoreMatchers.is(true));
    }

    // All years divisibles by 100 but not by 400 are NOT leap years(1700,1800,1900)
    @Test
    public void retunr_when_year_is_divisible_by_100_but_not_by_400() {
        assertThat(DateUtil.isLeapYear(1700), CoreMatchers.is(false));
        assertThat(DateUtil.isLeapYear(1800), CoreMatchers.is(false));
        assertThat(DateUtil.isLeapYear(1900), CoreMatchers.is(false));
    }

    // All years divisibles by 4 but not by 100 are NOT leap years(1996,2004,2008)
    @Test
    public void retunr_when_year_is_divisible_by_4_but_not_by_100() {
        assertThat(DateUtil.isLeapYear(1996), CoreMatchers.is(true));
        assertThat(DateUtil.isLeapYear(2004), CoreMatchers.is(true));
        assertThat(DateUtil.isLeapYear(2008), CoreMatchers.is(true));
    }

    // All years divisibles by 4 but not by 100 are NOT leap years(2017,2018,2019)
    @Test
    public void retunr_when_year_is_not_divisible_by_4() {
        assertThat(DateUtil.isLeapYear(2017), CoreMatchers.is(false));
        assertThat(DateUtil.isLeapYear(2016), CoreMatchers.is(false));
        assertThat(DateUtil.isLeapYear(2019), CoreMatchers.is(false));
    }
}