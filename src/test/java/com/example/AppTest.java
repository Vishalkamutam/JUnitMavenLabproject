
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    App app = new App();

    @Test
    void testAddition() {
        assertEquals(10, app.add(5, 5));
    }

    @Test
    void testSubtraction() {
        assertEquals(5, app.subtract(10, 5));
    }
}
