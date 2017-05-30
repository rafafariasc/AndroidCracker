/**
 * Created by meire on 29-May-17.
 */
public class Brute implements Runnable{

    String cyphertext;
    int keyLength;

    public Brute(int keyLength, String cyphertext){
        this.keyLength = keyLength;
        this.cyphertext = cyphertext;
    }

    public void run(){
        System.out.println(this.keyLength + " " + this.cyphertext);
    }
}
