package Bill;

public class Bill {
    
}
package Bill;

public class Bill {

    public static long Bill(int kWh) {
        final int GIA_BAC1 = 1984;
        final int GIA_BAC2 = 2050;
        final int GIA_BAC3 = 2380;
        final int GIA_BAC4 = 2998;
        final int GIA_BAC5 = 3350;
        final int GIA_BAC6 = 3460;

        long tongTien = 0;

        if (kWh < 0 || kWh > 10000) {
            throw new IllegalArgumentException("Invalid input");
        }
        if (kWh <= 50) {
            tongTien = kWh * GIA_BAC1;
        } else if (kWh <= 100) {
            tongTien = 50 * GIA_BAC1
                        + (kWh - 50) * GIA_BAC2;
        } else if (kWh <= 200) {
            tongTien = 50 * GIA_BAC1
                        + 50 * GIA_BAC2
                        + (kWh - 100) * GIA_BAC3;
        } else if (kWh <= 300) {
            tongTien = 50 * GIA_BAC1
                        + 50 * GIA_BAC2
                        + 100 * GIA_BAC3
                        + (kWh - 200) * GIA_BAC4;
        } else if (kWh <= 400) {
            tongTien = 50 * GIA_BAC1
                        + 50 * GIA_BAC2
                        + 100 * GIA_BAC3
                        + 100 * GIA_BAC4
                        + (kWh - 300) * GIA_BAC5;
        } else {
            tongTien = 50 * GIA_BAC1
                        + 50 * GIA_BAC2
                        + 100 * GIA_BAC3
                        + 100 * GIA_BAC4
                        + 100 * GIA_BAC5
                        + (kWh - 400) * GIA_BAC6;
        }
        return tongTien;
    }
}
