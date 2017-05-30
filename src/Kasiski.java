import java.util.ArrayList;
import java.util.HashMap;

public class Kasiski {
    public static int test(String cypherText) {
        HashMap<String, ArrayList<Integer>> substringMap = new HashMap<>();
        String substring;

        // count trigrams
        for (int i = 0; i < cypherText.length()-2; i++) {
            substring = cypherText.substring(i, i+3);

            if (!substringMap.containsKey(substring)) {
                substringMap.put(substring, new ArrayList<>());
            }

            substringMap.get(substring).add(i);
        }

        // discard unique trigrams



        return 13;
    }
}
