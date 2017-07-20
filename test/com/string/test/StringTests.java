package com.string.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.string.reversal.StringReverse;

public class StringTests {

    @Test
    public void reverseString() {
        StringReverse str = new StringReverse();

        assertEquals("gan", str.stringReverse("nag"));
    }

    @Test
    public void reverseEmptyString() {
        StringReverse str = new StringReverse();

        assertEquals("", str.stringReverse(""));
    }

}
