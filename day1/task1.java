class Example {
// Your program begins with a call to main().
public static void main(String args[]) {
System.out.println("Hello from salma");

if (args.length > 0) {
            String input = args[0];
            System.out.println("input is: " + input);
        } else {
            System.out.println("No input");
        }
 if (args.length != 2) {
            System.out.println("Usage: you add int,string");
            return;
        }

        // Parse the number from the first argument
        int number;
        try {
            number = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format.");
            return;
        }

        // Get the string from the second argument
        String inputString = args[1];

        // Print the string on different lines based on the given number
        for (int i = 0; i < number; i++) {
            System.out.println(inputString);
        }
    
}
}