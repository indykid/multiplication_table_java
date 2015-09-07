package com.jarkyn;

import org.junit.Test;
import static org.junit.Assert.*;

public class MultiplicationTest {
    @Test
    public void tableUpToZero() {
        assertEquals("0 x 0 = 0\n", Multiplication.table(0));
    }

    @Test
    public void tableUpToOne() {
        assertEquals("0 x 0 = 0\n" +
                     "0 x 1 = 0\n" +
                     "1 x 0 = 0\n" +
                     "1 x 1 = 1\n", Multiplication.table(1));
    }

    @Test
    public void tableUpToLimit() {
        assertEquals("0 x 0 = 0\n" +
                     "0 x 1 = 0\n" +
                     "0 x 2 = 0\n" +
                     "0 x 3 = 0\n" +
                     "1 x 0 = 0\n" +
                     "1 x 1 = 1\n" +
                     "1 x 2 = 2\n" +
                     "1 x 3 = 3\n" +
                     "2 x 0 = 0\n" +
                     "2 x 1 = 2\n" +
                     "2 x 2 = 4\n" +
                     "2 x 3 = 6\n" +
                     "3 x 0 = 0\n" +
                     "3 x 1 = 3\n" +
                     "3 x 2 = 6\n" +
                     "3 x 3 = 9\n", Multiplication.table(3));
    }
}
