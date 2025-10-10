package EvenSum;

public class EvenSum {

    public static int evenSum(int i) {
        int sum = 0;
        while (i <= 10) {
            if (i % 2 == 0)
                sum = sum + i;
            i++;
        }
        return sum;
    }
}
