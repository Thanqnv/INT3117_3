package Grade;

import static org.junit.Assert.*;
import org.junit.Test;

public class GradeTest {

    // Đường đi: 0 → 1 → 2T → 3
    @Test
    public void testInvalidScore() {
        /*
         Input: -1, 11
         Output: 'I'
         Expected output: 'I'
         */
        assertEquals('I', Grade.Grade(-1));
        assertEquals('I', Grade.Grade(11));
    }

    // Đường đi: 0 → 1 → 2F → 4T → 5 → 13
    @Test
    public void testGradeA() {
        /*
         Input: 9, 10
         Output: 'A'
         Expected output: 'A'
         */
        assertEquals('A', Grade.Grade(9));
        assertEquals('A', Grade.Grade(10));
    }

    // Đường đi: 0 → 1 → 2F → 4F → 6T → 7 → 13
    @Test
    public void testGradeB() {
        /*
         Input: 8, 8.9
         Output: 'B'
         Expected output: 'B'
         */
        assertEquals('B', Grade.Grade(8));
        assertEquals('B', Grade.Grade(8.9));
    }

    // Đường đi: 0 → 1 → 2F → 4F → 6F → 8T → 9 → 13
    @Test
    public void testGradeC() {
        /*
         Input: 6.5, 7.9
         Output: 'C'
         Expected output: 'C'
         */
        assertEquals('C', Grade.Grade(6.5));
        assertEquals('C', Grade.Grade(7.9));
    }

    // Đường đi: 0 → 1 → 2F → 4F → 6F → 8F → 10T → 11 → 13
    @Test
    public void testGradeD() {
        /*
         Input: 5, 6.4
         Output: 'D'
         Expected output: 'D'
         */
        assertEquals('D', Grade.Grade(5));
        assertEquals('D', Grade.Grade(6.4));
    }

    // Đường đi: 0 → 1 → 2F → 4F → 6F → 8F → 10F → 12 → 13
    @Test
    public void testGradeF() {
        /*
         Input: 0, 4.9
         Output: 'F'
         Expected output: 'F'
         */
        assertEquals('F', Grade.Grade(0));
        assertEquals('F', Grade.Grade(4.9));
    }
}
