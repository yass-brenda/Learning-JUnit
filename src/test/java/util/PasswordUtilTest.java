package util;

import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordUtilTest {
    @Test
    public void weak_when_has_less_than_8_letters() {
        assertEquals(PasswordUtil.SecurityLevel.WEAK,PasswordUtil.assessPassword("1gh?"));
    }

    @Test
    public void weak_when_has_only_letters() {
        assertEquals(PasswordUtil.SecurityLevel.WEAK,PasswordUtil.assessPassword("ulissesBarrios"));
    }

    @Test
    public void meduim_when_has_numbers_and_letters() {
        assertEquals(PasswordUtil.SecurityLevel.MEDIUM,PasswordUtil.assessPassword("ulissesBarrios2708"));
    }

    @Test
    public void strong_when_has_numbers_symbol_and_letters() {
        assertEquals(PasswordUtil.SecurityLevel.STRONG,PasswordUtil.assessPassword("ulissesBarrios2708?"));
    }
}