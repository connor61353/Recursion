public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(Rec.multiplyPos( 5, 3));
        System.out.println(Rec.palindrome("gohangsalamiimalasgnahog"));
        System.out.println(Rec.palindrome("a"));
        System.out.println(Rec.moreVowels("racecar"));
        System.out.println(Rec.moreVowels("eagar"));
        Rec.hanoi(1, 2, 3,4);
    }
}
