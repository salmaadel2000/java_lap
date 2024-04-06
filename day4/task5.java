interface CharacterChecker {
    boolean check(Character c);
}

class Check {
    static void traverseString(String str) {
        CharacterChecker isLetter = Character::isLetter;
        boolean allLetters = true;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isLetter(str.charAt(i))) {
                allLetters = false;
                break;
            }
        }
        if (allLetters) {
            System.out.println("All characters in the word are letters.");
        } else {
            System.out.println("Not all characters in the word are letters.");
        }
    }
    
    public static void main(String[] args) {
        String word = "hellofromMain";
        traverseString(word);
    }
}
