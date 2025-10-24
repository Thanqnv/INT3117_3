package Bill;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BillTest {

    // -------- Path 1: 1 → 7 → 8(T) → 9 → Exit -------------
    // DU-pair: (kWh, 8(T)) – Invalid input
    @Test
    void testPath1_InvalidInput() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> Bill.Bill(-5));
        assertEquals("Invalid input", ex.getMessage());
    }

    // -------- Path 2: 1 → 7 → 8(F) → 10(T) → 11 → 21 → 22 -------------
    // DU-pair: (kWh,10(T)), (tongTien,11→21)
    @Test
    void testPath2_Level1_kWh_40() {
        long expected = 40L * 1984;
        long actual = Bill.Bill(40);
        assertEquals(expected, actual);
    }

    // -------- Path 3: 1 → 7 → 8(F) → 10(F) → 12(T) → 13 → 21 → 22 -------------
    // DU-pair: (kWh,12(T)), (tongTien,13→21)
    @Test
    void testPath3_Level2_kWh_80() {
        long expected = 50L * 1984 + (80L - 50L) * 2050;
        long actual = Bill.Bill(80);
        assertEquals(expected, actual);
    }

    // -------- Path 4: 1 → 7 → 8(F) → 10(F) → 12(F) → 14(T) → 15 → 21 → 22 -------------
    // DU-pair: (kWh,14(T)), (tongTien,15→21)
    @Test
    void testPath4_Level3_kWh_150() {
        long expected = 50L * 1984
                      + 50L * 2050
                      + (150L - 100L) * 2380;
        long actual = Bill.Bill(150);
        assertEquals(expected, actual);
    }

    // -------- Path 5: 1 → 7 → 8(F) → 10(F) → 12(F) → 14(F) → 16(T) → 17 → 21 → 22 -------------
    // DU-pair: (kWh,16(T)), (tongTien,17→21)
    @Test
    void testPath5_Level4_kWh_250() {
        long expected = 50L * 1984
                      + 50L * 2050
                      + 100L * 2380
                      + (250L - 200L) * 2998;
        long actual = Bill.Bill(250);
        assertEquals(expected, actual);
    }

    // -------- Path 6: 1 → 7 → 8(F) → 10(F) → 12(F) → 14(F) → 16(F) → 18(T) → 19 → 21 → 22 -------------
    // DU-pair: (kWh,18(T)), (tongTien,19→21)
    @Test
    void testPath6_Level5_kWh_350() {
        long expected = 50L * 1984
                      + 50L * 2050
                      + 100L * 2380
                      + 100L * 2998
                      + (350L - 300L) * 3350;
        long actual = Bill.Bill(350);
        assertEquals(expected, actual);
    }

    // -------- Path 7: 1 → 7 → 8(F) → 10(F) → 12(F) → 14(F) → 16(F) → 18(F) → 20 → 21 → 22 -------------
    // DU-pair: (kWh,20), (tongTien,20→21)
    @Test
    void testPath7_Level6_kWh_500() {
        long expected = 50L * 1984
                      + 50L * 2050
                      + 100L * 2380
                      + 100L * 2998
                      + 100L * 3350
                      + (500L - 400L) * 3460;
        long actual = Bill.Bill(500);
        assertEquals(expected, actual);
    }
}
