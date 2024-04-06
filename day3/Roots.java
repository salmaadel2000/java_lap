import java.util.function.BiFunction;
import java.util.function.Function;

public class Roots {
    public static String calculateRoots(double a, double b, double c) {
        // Function to calculate discriminant (b^2 - 4ac)
        Function<Double, Double> discriminant = (Double temp) -> {
            return Math.pow(b, 2) - 4 * a * c;
        };

        // Function to calculate roots
        BiFunction<Double, Double, String> calculateRoots = (Double d, Double sqrtD) -> {
            if (d > 0) {
                double root1 = (-b + sqrtD) / (2 * a);
                double root2 = (-b - sqrtD) / (2 * a);
                return "Roots are real and different. Root 1 = " + root1 + ", Root 2 = " + root2;
            } else if (d == 0) {
                double root = -b / (2 * a);
                return "Roots are real and equal. Root = " + root;
            } else {
                double realPart = -b / (2 * a);
                double imaginaryPart = Math.sqrt(-d) / (2 * a);
                return "Roots are complex. Root 1 = " + realPart + "+" + imaginaryPart + "i, Root 2 = " + realPart + "-" + imaginaryPart + "i";
            }
        };

        // Calculate discriminant
        double d = discriminant.apply(0.0);

        // Calculate square root of discriminant
        double sqrtD = Math.sqrt(d);

        // Calculate roots
        return calculateRoots.apply(d, sqrtD);
    }
}
