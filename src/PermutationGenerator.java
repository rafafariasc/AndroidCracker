import java.util.ArrayList;

/**
 * Created by meire on 29-May-17.
 */

public class PermutationGenerator {

    public static ArrayList<String> GenerateAllPermutationsOfLength(int n){
        if (n == 0) return new ArrayList<>();

        if (n==1){
            ArrayList<String> response = new ArrayList<>();
            char c = 'A';
            while( c <= 'Z'){
                response.add(String.valueOf(c++));
            }
            return  response;
        }

        ArrayList<String> lastPermutations = GenerateAllPermutationsOfLength(n-1);


        ArrayList<String> response = new ArrayList<>();
        char c = 'A';
        while( c <= 'Z'){
            for(int i =0; i < lastPermutations.size(); i++){
                response.add(c + lastPermutations.get(i));
            }
            c++;
        }

        return  response;
    }
}
