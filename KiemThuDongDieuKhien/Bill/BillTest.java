package Bill;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BillTest {

    // Kiểm tra đầu vào không hợp lệ
    /*
     Input: -1, 10001
     Output: throws IllegalArgumentException
     Expected output: throws IllegalArgumentException
     */
    @Test
    public void testInvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> Bill.Bill(-1));
        assertThrows(IllegalArgumentException.class, () -> Bill.Bill(10001));
    }

    // kWh <= 50
    /*
     Input: 30
     Output: 59520
     Expected output: 59520
     */
    @Test
    public void testLevel1() {
        long result = Bill.Bill(30);
        assertEquals(30 * 1984, result);
    }

    // 50 < kWh <= 100
    /*
     Input: 80
     Output: 160700
     Expected output: 160700
     */
    @Test
    public void testLevel2() {
        long result = Bill.Bill(80);
        long expected = 50 * 1984 + (80 - 50) * 2050;
        assertEquals(expected, result);
    }

    // 100 < kWh <= 200
    /*
     Input: 150
     Output: 320700
     Expected output: 320700
     */
    @Test
    public void testLevel3() {
        long result = Bill.Bill(150);
        long expected = 50 * 1984 + 50 * 2050 + (150 - 100) * 2380;
        assertEquals(expected, result);
    }

    // 200 < kWh <= 300
    /*
     Input: 250
     Output: 589600
     Expected output: 589600
     */
    @Test
    public void testLevel4() {
        long result = Bill.Bill(250);
        long expected = 50 * 1984 + 50 * 2050 + 100 * 2380 + (250 - 200) * 2998;
        assertEquals(expected, result);
    }

    // 300 < kWh <= 400
    /*
     Input: 350
     Output: 907000
     Expected output: 907000
     */
    @Test
    public void testLevel5() {
        long result = Bill.Bill(350);
        long expected = 50 * 1984 + 50 * 2050 + 100 * 2380 + 100 * 2998 + (350 - 300) * 3350;
        assertEquals(expected, result);
    }

    // kWh > 400
    /*
     Input: 450
     Output: 1247500
     Expected output: 1247500
     */
    @Test
    public void testLevel6() {
        long result = Bill.Bill(450);
        long expected = 50 * 1984 + 50 * 2050 + 100 * 2380 + 100 * 2998 + 100 * 3350 + (450 - 400) * 3460;
        assertEquals(expected, result);
    }
}
