package Foo1;

import static org.junit.Assert.*;
import org.junit.Test;

public class Foo1Test {

    // Đường đi: 0 → 1 → 2 → 3 → 7 → 8
    /*
     Input: 65
     Output: "A"
     Expected output: "A"
     */
    @Test
    public void testCase65() {
        assertEquals("A", Foo1.foo1(65));
    }

    // Đường đi: 0 → 1 → 2 → 4 → 7 → 8
    /*
     Input: 66
     Output: "B"
     Expected output: "B"
     */
    @Test
    public void testCase66() {
        assertEquals("B", Foo1.foo1(66));
    }

    // Đường đi: 0 → 1 → 2 → 5 → 7 → 8
    /*
     Input: 67
     Output: "C"
     Expected output: "C"
     */
    @Test
    public void testCase67() {
        assertEquals("C", Foo1.foo1(67));
    }

    // Đường đi: 0 → 1 → 2 → 6 → 7 → 8
    /*
     Input: 100
     Output: "haven't check"
     Expected output: "haven't check"
     */
    @Test
    public void testDefaultCase() {
        assertEquals("haven't check", Foo1.foo1(100));
    }
}
