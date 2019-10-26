package stringProblems;

import java.util.Arrays;
import java.util.Scanner;

public class Sherlock_And_Anagrams {
    static boolean isAnagram(String a, String b) {

        // Complete the function
        if (a.length() == b.length()) {
            if (sortString(a).equalsIgnoreCase(sortString(b))) {
                //System.out.println(a + "|" + b);
                return true;
            } else
                return false;
        }

        return false;
    }

    static String sortString(String s) {
//        char temp;
        char[] arr = s.toCharArray();

//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length - i - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
        Arrays.sort(arr);
        return new String(arr);

    }

    static int anagramCount(String s) {
        int i = 0, j = 0, left=0, right = 0,  count = 0;

        for( i = 0; i< s.length(); i++ ) {
            for (j = i+1; j <= s.length(); j++) {
                left = i+1;
                for(right = j+1; right<=s.length(); right++){
                    if ( j+1 <= s.length() && isAnagram(s.substring(i, j), s.substring(left, right))) {
                        count++;
                    }
                    left++;
                }

            }
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();
        System.out.println(anagramCount("cdcd"));

    }
}
