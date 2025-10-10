package Sum;

public class Sum {
    public static int Sum(int[] a, int n) {
        int i, total = 0;
        for (i = 0; i < n; i++)
            total = total + a[i];
        return total;
    }
}
