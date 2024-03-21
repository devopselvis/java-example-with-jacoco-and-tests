package com.mycompany.app;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class AppTest {
    @Test
    public void testIsEven() {
        assertTrue(App.isEven(2));
        assertFalse(App.isEven(3));
    }
}