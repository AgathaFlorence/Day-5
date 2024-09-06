package Day5;

import java.util.Random;


public class Guessword {
    public static void main (String[] args) {

        String wordtoguess = selectRandomWord();
        int n = wordtoguess.length();

        hidewords(n);


    }

    public static String selectRandomWord(){
        String [] wordlist = {"dog","bird","fly","cat","bear"};
        Random randomword = new Random();
        int randomInd = randomword.nextInt(wordlist.length);

        return wordlist[randomInd];

    }




    public static void hidewords(int a) {
        for (int i = 1; i<=a;i++){
        System.out.print("_");}
    }
}



