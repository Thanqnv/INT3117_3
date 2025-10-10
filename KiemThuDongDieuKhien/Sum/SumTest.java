package Sum;

import static org.junit.Assert.*;
import org.junit.Test;

public class SumTest {

    // Đường đi C1: 0 → 1 → 2 → 3T → 4 → 3F → 5 → 6 (vòng lặp 1 lần)
    /*
     Input: {5}, 1
     Output: 5
     Expected output: 5
     */
    @Test
    public void testEmptyArray() {
        int[] a = {5};
        assertEquals(5, Sum.Sum(a, 1));
    }

    // Trường hợp mảng null
    /*
     Input: a = null, n = 0
     Output: 0
     Expected output: 0
     */
    @Test
    public void testNullArray() {
        int[] a = null;
        assertEquals(0, Sum.Sum(a, 0));
    }

    // Đường đi: 0 → 1 → 2 → 3F → 5 → 6 (vòng lặp 0 lần)
    /*
     Input: {}
     Output: 0
     Expected output: 0
     */
    @Test
    public void testOneElement() {
        int[] a = {};
        assertEquals(0, Sum.Sum(a, 0));
    }

    /*
     Input: {1}, 1
     Output: 1
     Expected output: 1
     */
    @Test
    public void testIndex1_N1() {
        int[] a = {1};
        assertEquals(1, Sum.Sum(a, 1));
    }

    // Đường đi: 0 → 1 → 2 → 3T → 4 → 3T → 4 → 3T → 4 → 3T → 4 → 3F → 5 → 6 (vòng lặp nhiều lần)
    /*
     Input: {1,2,3,4}, 4
     Output: 10
     Expected output: 10
     */
    @Test
    public void testMultipleElements() {
        int[] a = {1, 2, 3, 4};
        assertEquals(10, Sum.Sum(a, 4));
    }

    // Trường hợp n lớn hơn độ dài mảng (kiểm tra sai phạm)
    /*
     Input: {1,2,3,4}, 10
     Output: throws ArrayIndexOutOfBoundsException
     Expected output: throws ArrayIndexOutOfBoundsException
     */
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testNExceedsLength() {
        int[] a = {1, 2, 3, 4};
        Sum.Sum(a, 10);
    }
}
