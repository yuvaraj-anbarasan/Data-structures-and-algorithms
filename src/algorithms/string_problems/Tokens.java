package stringProblems;

import java.util.Scanner;

public class Tokens {
    static String[] getTokens(String s){
        String[] tokens = s.split(" !,._'@");
        return tokens;
    }
    public static void main(String[] args){
//        String s = "He is a very very good boy, isn't he?";
//        String[] tokens = s.trim().split("[ !,._'@?]+");
//        for(int i=0; i<tokens.length; i++){
//            System.out.println(tokens[i]);
//        }
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(s.length());
    }
}
