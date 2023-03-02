import java.util.HashMap;
import java.util.Scanner;

public class Alphabet

{

    public static void main(String args[])
    {

        HashMap<String, String> morse = new HashMap<>();// change to ""
        morse.put("a",",-");
        morse.put("b","-...");
        morse.put("c", "-.-.");
        morse.put("d", "-..");
        morse.put("e", ".");
        morse.put("f", "..-.");
        morse.put("g", "--.");
        morse.put("h", "....");
        morse.put("i", "..");
        morse.put("j",".---");
        morse.put("k", "-.-");
        morse.put("l", ".-..");
        morse.put("m", "--");
        morse.put("n", "-.");
        morse.put("o", "---");
        morse.put("p", ".--.");
        morse.put("q", "--.-");
        morse.put("r", ".-.");
        morse.put("s", "...");
        morse.put("t", "-");
        morse.put("u", "..-");
        morse.put("v", "...-");
        morse.put("w", ".--");
        morse.put("x", "-..-");
        morse.put("y", "-.--");
        morse.put("z", "--..");
        morse.put(" ", "/");


        // English to Morse
        final StringBuilder builder = new StringBuilder(); //StringBilder is a class to create a modifiable succession of characters.
        for (final char letter : input.toCharArray()) {
            builder.append(morse.get(Character.toString(letter)));
        }
        Morse_code = builder.toString();
    }
}