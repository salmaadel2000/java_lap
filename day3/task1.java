import java.util.function.Function;

class task1 {
    
    public static Double convertTemperature(Double temp) {
        return (1.8 * temp) + 32;
    }

    public static void main(String args[]) {
        // Create a Function object using the convertTemperature method
        Function<Double, Double> convertTemperatureFunction = task1::convertTemperature;

        Double result = convertTemperatureFunction.apply(18.0);


        System.out.println(result);
    }
}