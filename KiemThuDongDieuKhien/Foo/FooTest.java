package Foo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FooTest {

    /*
     * Đường đi 1: 0 → 1 → 2T
     * Điều kiện: a == 0
     * Trả về 0 ngay.
     * Input: a=0, b=1, c=2, d=3
     * Expected output: 0
     */
    @Test
    public void test_Path1() {
        assertEquals(0, Foo.foo(0, 1, 2, 3));
    }

    /*
     * Đường đi 2: 0 → 1 → 2F → 4 → 5T → 6 → 7,8
     * Điều kiện: a != 0, và (a == b) || (c == d) → true
     * → x=1 → e=1/x=1
     * Input: a=2, b=2, c=3, d=4
     * Expected output: 1.0
     */
    @Test
    public void test_Path2() {
        assertEquals(1.0f, Foo.foo(2, 2, 3, 4));
    }

    /*
     * Đường đi 3: 0 → 1 → 2F → 4 → 5F → 7,8
     * Điều kiện: a != 0, (a == b) || (c == d) → false
     * → x=0 → lỗi chia cho 0 → ArithmeticException
     * Input: a=2, b=3, c=4, d=5
     */
    @Test
    public void test_Path3() {
        assertThrows(ArithmeticException.class, () -> Foo.foo(2, 3, 4, 5));
    }
}
