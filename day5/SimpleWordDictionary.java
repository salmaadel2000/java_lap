import java.util.*;

public class SimpleWordDictionary {
    private Map<Character, ArrayList<String>> dictionary = new HashMap<>();

    // To Validate the Word before adding it to the Dictionary
    private boolean validateWord(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (!Character.isLetter(word.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    // Implement the add method
    public boolean add(String word) {
        if (!validateWord(word)) {
            System.out.println("Word " + word + " is not valid");
            return false;
        }
        
        char firstChar = Character.toLowerCase(word.charAt(0));
        ArrayList<String> wordsList = dictionary.getOrDefault(firstChar, new ArrayList<>());
        wordsList.add(word.toLowerCase()); // Convert to lowercase
        dictionary.put(firstChar, wordsList);
        return true;
    }

    // Implement the printAll method
    public void printAll() {
        for (Map.Entry<Character, ArrayList<String>> entry : dictionary.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }

    // Implement the printByChar method
    public void printByChar(Character character) {
        ArrayList<String> wordsSet = dictionary.getOrDefault(Character.toLowerCase(character), new ArrayList<>());
        System.out.println(character + " = " + wordsSet);
    }

    public static void main(String[] args) {
        SimpleWordDictionary wordsDictionary = new SimpleWordDictionary();
        wordsDictionary.add("yousef");
        wordsDictionary.add("mariam");
        wordsDictionary.add("salma");
        wordsDictionary.add("eman");
        wordsDictionary.add("mohammed");
        wordsDictionary.add("adel");
        wordsDictionary.add("sabah");
        wordsDictionary.add("sara");
        wordsDictionary.add("renad");
        wordsDictionary.add("ahmed");
        wordsDictionary.add("mahmoud");
        wordsDictionary.add("ithar");
        wordsDictionary.add("ayman");

        // Print all Records
        wordsDictionary.printAll();

        System.out.println("___*_____*______*____");

        // Print Records by Character
        wordsDictionary.printByChar('s');
        wordsDictionary.printByChar('m');
    }
}
