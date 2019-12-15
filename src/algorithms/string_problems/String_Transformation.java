package algorithms.stringProblems;

public class String_Transformation {
    static String transform(String s, int n){
        String q = "";
        char ch;
        int[] alpha = new int[26];

        for(int i=0; i<n; i++){
            ch = s.charAt(i);
            if( alpha[ch - 'a'] != 0) {
                q = q + Character.toString((char) (Integer.valueOf(ch) + alpha[ch - 'a']));
                alpha[ch - 'a']++;
            }else {
                alpha[ch - 'a']++;
                q = q + Character.toString(ch);
            }
        }
        return q;
    }
    public static void main(String[] args){
        System.out.println(transform("bbbdca", 6));
        System.out.println((char)98);
    }
}
