import java.util.HashMap;

public class Kasiski {
    public static int test(String cypherText) {
        HashMap<String, String> substringMap = new HashMap<>();
        String substring;

        // find repeated trigrams
        for (int i = 0; i < cypherText.length(); i++) {
            substring = cypherText.substring(i, i+4);
        }


        return 13;
    }
}
