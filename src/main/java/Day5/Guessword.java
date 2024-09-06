package Day5;

public class Guessword {
    public static void main (String[] args) {
        String wordtoguess = "method";
        int n = wordtoguess.length();

        hidewords(n);


    }
    public static void hidewords(int a) {
        for (int i = 1; i<=a;i++){
        System.out.print("_");}
    }
}



