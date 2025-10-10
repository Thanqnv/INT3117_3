package EvenSum;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvenSumTest {

    /*
     * Kiểm thử dòng điều khiển
     * Phủ cấp C1 và C2 (trùng nhau):
    * Đường đi: entry → 1 → 2T → 3T → 4 → 5 → 2F → 6 → exit
    * Input: i = 10
    * Expected output: 10
     */
    @Test
    public void test_ControlFlow_C1_C2() {
        assertEquals(10, EvenSum.evenSum(10));
    }

    /*
     * Đường đi khác: entry → 1 → 2F → 6 → exit
     * (Không vào vòng lặp while)
     * Input: i = 11
     * Expected output: 0
     */
    @Test
    public void test_ControlFlow_NoLoop() {
        assertEquals(0, EvenSum.evenSum(11));
    }

    /*
    * Đường đi: entry → 1 → 2T → 3F → 5 → 2F → 6 → exit
    * Input: i = 9
    * Expected output: 10
     */
    @Test
    public void test_ControlFlow_Entry_1_2T_3F_5_2F_6_exit() {
        assertEquals(10, EvenSum.evenSum(9));
    }
}
