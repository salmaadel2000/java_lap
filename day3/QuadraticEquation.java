public class QuadraticEquation{
    public static void main(String[] args) {
        // Quadratic equation coefficients
        Coefficients coefficients = new Coefficients(1, -3, 2);

        // Calculate roots
        String roots = Roots.calculateRoots(coefficients.getA(), coefficients.getB(), coefficients.getC());

        // Print roots
        System.out.println(roots);
    }
}
