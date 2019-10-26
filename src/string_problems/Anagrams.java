package stringProblems;

import java.util.Scanner;

public class Anagrams {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length() == b.length()){
            if( sortString(a).equals(sortString(b)))
                return true;
            else
                return false;
        }

        return false;
    }

    static String sortString( String s){
        char temp;
        char[] arr = s.toCharArray();

        for( int i=0; i<arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if ( arr[j] > arr[j + 1] ) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return new String(arr);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}