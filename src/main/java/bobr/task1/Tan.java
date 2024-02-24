package bobr.task1;

public class Tan {
    public static double tangent(double angle) {
        int n = 5;
        double x = angle * Math.PI / 180; // Угол в радианах
        double tan = x;
        double power = x;
        double factorial = 1;
        int sign = 1;

        for (int i = 1; i < n; i++) {
            power *= x * x;
            factorial *= (2 * i) * (2 * i - 1);
            tan += sign * power / factorial;
            sign *= -1;
        }

        return tan;
    }
}
