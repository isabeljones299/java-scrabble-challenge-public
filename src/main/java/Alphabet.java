import java.util.*;

public class Alphabet {

    public static HashMap<String, Integer> alphabet;

    public static HashMap<String, Integer> getAlphabet () {
        HashMap<String, Integer> alphabet = new HashMap<>();
        alphabet.put("a", 1);
        alphabet.put("b", 3);
        alphabet.put("c", 3);
        alphabet.put("d", 2);
        alphabet.put("g", 2);
        alphabet.put("e", 1);
        alphabet.put("i", 1);
        alphabet.put("o",1);
        alphabet.put("u", 1);
        alphabet.put("l", 1);
        alphabet.put("n", 1);
        alphabet.put("r", 1);
        alphabet.put("s", 1);
        alphabet.put("t", 1);
        alphabet.put("p",3);
        alphabet.put("m", 3);
        alphabet.put("f", 4);
        alphabet.put("h",4);
        alphabet.put("v", 4);
        alphabet.put("w", 4);
        alphabet.put("y", 4);
        alphabet.put("k",5);
        alphabet.put("j", 8);
        alphabet.put("x", 8);
        alphabet.put("q", 10);
        alphabet.put("z", 10);
        return alphabet;
    }
}
