package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void zeroLessThenOne() {
        int max = App.max(1, 0);
        assertEquals(1, max);
    }

    @Test
    public void zeroLessThenOneReversed() {
        int max = App.max(0, 1);
        assertEquals(1, max);
    }


}
