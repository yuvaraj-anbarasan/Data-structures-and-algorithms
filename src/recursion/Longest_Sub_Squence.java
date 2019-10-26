package recursion;

import java.util.Arrays;
import java.util.Scanner;

public class Longest_Sub_Squence {
    static int commonChild(String s1, String s2, int n1, int n2) {
        if( n1 < 0 || n2 < 0 )
            return 0;
        if( s1.charAt(n1) == s2.charAt(n2) )
            return 1 + commonChild(s1, s2, n1-1, n2-1);
        else
            return maxSubSequence( commonChild(s1, s2, n1, n2-1), commonChild(s1, s2,
                    n1-1, n2));
    }

    static int maxSubSequence( int max1, int max2){
        return ( max1 >= max2) ? max1 : max2;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
//        String s1 = scanner.nextLine();
//        String s2 = scanner.nextLine();
//        int result = commonChild(s1, s2, s1.length()-1, s2.length()-1);
//
//        System.out.println( result );


    }
}
