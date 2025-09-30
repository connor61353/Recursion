public class Rec {

    static public int multiplyPos(int m, int n){
        if (m <= 0 || n <= 0){ //must be positive
            return 0;
        }

        if (m > 1){
            return (n + multiplyPos(m - 1, n));
        }

        return n;
    }

    static public Boolean palindrome(String word){

        if (word.charAt(0) != word.charAt(word.length()-1)){              //checks if it's NOT a palindrome
            return false;
        } else if (word.length() > 2){                                          //checks if done
            return palindrome(word.substring(1, word.length()-1));  
        }
        return true;
    }

    static public Boolean moreVowels(String s){
        if (s.charAt(0) == 'A' || s.charAt(0) == 'a'){
            v++;
        } else if (s.charAt(0) == 'E' || s.charAt(0) == 'e'){
            v++;
        } else if (s.charAt(0) == 'I' || s.charAt(0) == 'i'){
            v++;
        } else if (s.charAt(0) == 'O' || s.charAt(0) == 'o'){
            v++;
        } else if (s.charAt(0) == 'U' || s.charAt(0) == 'u'){
            v++;
        } else {
            c++;
        }

        if (s.length() > 1){
            return moreVowels(s.substring(1, s.length()));
        }

        Boolean result = (v > c);

        v = 0; //reset v
        c = 0; //reset c

        return result;

    }

    static public void hanoi(int start, int aux, int goal, int n){
        if (n == 1){
            System.out.println("Move disc from peg " + start + " to peg " + goal);
        } else{
        hanoi(start, goal, aux, n-1);
        System.out.println("Move disc from peg " + start + " to peg " + goal);
        hanoi(aux, start, goal, n-1);
        }
    }

    static private int v = 0;
    static private int c = 0;
}
