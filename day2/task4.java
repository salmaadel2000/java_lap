class Task4 {
    public static void main(String args[]) {
        String sentence = "ITI develops people and ITI house of developers and ITI for people";
        String word = "ITI";
        int count = 0;
        int index = sentence.indexOf(word);

        while (index != -1) {
            count++;
            index = sentence.indexOf(word, index + 1);
        }

        if (count == 0) {
            System.out.println("No matching word \"" + word + "\" found.");
        } else {
            System.out.println("Count of \"" + word + "\" is: " + count);
        }
    }
}
