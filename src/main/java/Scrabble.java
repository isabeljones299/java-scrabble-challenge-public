import java.util.ArrayList;
import java.util.Arrays;

public class Scrabble {

    public String word;
    ArrayList<String> usedDoubleLetters = new ArrayList<>();
    ArrayList<String> usedTripleLetters = new ArrayList<>();
    public Boolean doubleWord = false;
    public Boolean tripleWord = false;
    public Character[] doubleChar = {};
    public Character[] tripleChar = {};
    public int wordMultiplier = 1;

    public Scrabble(String word, Character[] doubleChar, Character[] tripleChar, boolean doubleWord, boolean tripleWord) {
        this.word = word;
        this.doubleWord = doubleWord;
        this.tripleWord = tripleWord;
        this.doubleChar = doubleChar;
        this.tripleChar = tripleChar;
    }
    public Scrabble(String word) {
        this.word = word;
    }

    public int score() {
        String word = this.word;
        int score = 0;
        if (word != null) {
            if (word.length() == 0) {
                score = 0;
            }
            for(char c : word.toCharArray()) {
                int a = Alphabet.getAlphabet().get(Character.toString(c).toLowerCase());
                score += (a*isDoubleOrTripleLetter(c));
            }
        } return score*countDoubleAndTripleWords();
    }


    public int isDoubleOrTripleLetter(char c) {
        int letterMultiplier = 1;
        if (Arrays.stream(doubleChar).count() != 0) {
            if (c == Character.toLowerCase(doubleChar[0]) && !usedDoubleLetters.contains(String.valueOf(c))) {
                letterMultiplier = 2;
                usedDoubleLetters.add(String.valueOf(c));
            }
        }
        if (Arrays.stream(tripleChar).count() != 0 && letterMultiplier == 1) {
            if (c == Character.toLowerCase(tripleChar[0]) && !usedTripleLetters.contains(String.valueOf(c))) {
                letterMultiplier = 3;
                usedTripleLetters.add(String.valueOf(c));
            }
        }
        return letterMultiplier;
    }
    public int countDoubleAndTripleWords() {
        if (doubleWord) {
            wordMultiplier = 2;
        } if (tripleWord) {
            wordMultiplier = 3;
        }
        return wordMultiplier;
    }
}

