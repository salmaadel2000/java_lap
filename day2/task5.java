import java.util.StringTokenizer;

class task5 {
    public static void main(String args[]) {
        String sentence = "ITI develops people and ITI house of developers and ITI for people";
        String word = "ITI";

        // Use StringTokenizer with "ITI" as the delimiter
        StringTokenizer tokenizer = new StringTokenizer(sentence, word);

        // Print the tokens
        System.out.println("Tokens using \"" + word + "\" as delimiter:");
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken().trim());
        }
    }
}