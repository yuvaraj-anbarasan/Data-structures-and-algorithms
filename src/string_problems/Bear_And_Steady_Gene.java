package stringProblems;

/*
https://www.hackerrank.com/challenges/bear-and-steady-gene/problem
 */

import java.util.HashMap;
import java.util.Map;

public class Bear_And_Steady_Gene {
    public static boolean balanced(int N, Map<Character, Integer> map) {
        if (map.get('A') <= N && map.get('C') <= N && map.get('G') <= N
                && map.get('T') <= N)
            return true;

        return false;
    }

    static int smallestSubString(String s){
        int N = s.length()/4;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('A', 0);
        map.put('C', 0);
        map.put('G', 0);
        map.put('T', 0);

        for (int i = 0; i < s.length(); ++i) {
            map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
        }

        int min = s.length();

        int i = 0;
        int j = 0;

        while (i < s.length() && j < s.length()) {
            if (!balanced(N, map)) {
                map.put(s.charAt(j), map.get(s.charAt(j)) - 1);
                j++;
            } else {
                min = Math.min(min, j - i);
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
                i++;
            }
        }

        return min;
    }
    public static void main(String[] args){
        System.out.println(smallestSubString("GAAATAAA"));
    }
}
