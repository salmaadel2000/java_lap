class CustomException extends Exception {
    public CustomException() {
        super("It's something wrong");
    }
}

class MathOperations {
    int factorial(int n) throws CustomException {
        if (n < 0)
            throw new CustomException();
        if (n == 1)
            return 1;
        return n * factorial(n - 1);
    }

    public void computeFactorial() {
        System.out.println("Computing factorial...");
        try {
            System.out.println("Factorial of -5 = " + factorial(-5));
        } catch (CustomException e) {
            System.out.println("Error computing factorial: " + e.getMessage());
        } finally {
            System.out.println("Factorial computation completed (with or without error)");
        }
    }

    public void divideByZero(int num) throws CustomException {
        try {
            if (num == 0)
                throw new CustomException();
            else
                System.out.println("Result of 10 divided by " + num + " = " + 10 / num);
        } finally {
            System.out.println("Division operation completed (with or without error)");
        }
    }

    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        math.computeFactorial();
        int val = 0;
        try {
            math.divideByZero(val);
        } catch (CustomException e) {
            System.out.println("Error dividing by zero: " + e.getMessage());
        }
    }
}
