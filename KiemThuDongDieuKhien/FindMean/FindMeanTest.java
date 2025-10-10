package FindMean;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindMeanTest {

    /*
     * Kiểm thử dòng điều khiển
     * Phủ cấp C1 (bao gồm cả C2)
     * Đường đi 1: start → 1 → 2T → 3T → 4 → 6 → 2F → 7T → 8 → exit
     * Input: {10, 20, 30}
     * Output thực tế: "Mean score is 20.0"
     * Expected output: "Mean score is 20.0"
     */
    @Test
    public void test_ControlFlow_C1_Path1() {
        float[] scores = {10, 20, 30};
        assertEquals("Mean score is 20.0", FindMean.findMean(scores));
    }

    /*
     * Đường đi 2: start → 1 → 2T → 3F → 5 → 6 → 2F → 7F → 8 → exit
     * (Không có điểm hợp lệ)
     * Input: {-5, -10}
     * Output thực tế: "No scores found in file"
     * Expected output: "No scores found in file"
     */
    @Test
    public void test_ControlFlow_C1_Path2() {
        float[] scores = {-5, -10};
        assertEquals("No scores found in file", FindMean.findMean(scores));
    }
}
