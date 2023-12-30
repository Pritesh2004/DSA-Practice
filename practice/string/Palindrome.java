package practice.string;

public class Palindrome {
    public static void main(String[] args) {

        String str = "abcdcba";
        System.out.println("String "+str+" is a palindrome = "+palindrome(str));

    }

    public static boolean palindrome(String string){

        if(string == null || string.length()==0){
            return true;
        }

        string = string.toLowerCase();

        for (int i = 0; i < string.length(); i++) {

            char start = string.charAt(i);
            char end = string.charAt(string.length()-1-i);

            if(start != end){
                return false;
            }

        }
        return true;
    }
}
