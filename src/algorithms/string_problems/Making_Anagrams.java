package stringProblems;

public class Making_Anagrams {
    static int makeAnagram( String s1, String s2){
        int[] charOccurrence = new int[26];
        int sum = 0;

        for(int i=0; i<s1.length(); i++){
            charOccurrence[s1.charAt(i) - 'a']++;
        }

        for(int i=0; i<s2.length(); i++){
            charOccurrence[s2.charAt(i) - 'a']--;
        }

        for(int i=0; i<charOccurrence.length; i++){
            sum += (charOccurrence[i] >= 0) ? charOccurrence[i] : (-charOccurrence[i]);
        }
        return sum;
    }
    public static void main(String[] args){
        System.out.println(makeAnagram("cde", "abc"));
    }
}
