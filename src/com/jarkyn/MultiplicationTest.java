package com.jarkyn;

import org.junit.Test;
import static org.junit.Assert.*;

public class MultiplicationTest {
    @Test
    public void rowForTwoZeroes() {
        assertEquals("0 x 0 = 0", Multiplication.row(0, 0));
    }

    @Test
    public void rowForOneAndZero() {
        assertEquals("1 x 0 = 0", Multiplication.row(1, 0));
    }

    @Test
    public void rowForZeroAndOne() {
        assertEquals("0 x 1 = 0", Multiplication.row(0, 1));
    }

    @Test
    public void rowForOneAndOne() {
        assertEquals("1 x 1 = 1", Multiplication.row(1, 1));
    }

    @Test
    public void tableUpToLimit() {
        assertEquals("0 x 0 = 0\n", Multiplication.table(0));
        assertEquals("0 x 0 = 0\n0 x 1 = 0\n1 x 0 = 0\n1 x 1 = 1\n", Multiplication.table(1));
    }
}
