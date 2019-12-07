package algorithms.Dynamic_Programming;

/*
https://www.youtube.com/watch?v=sSno9rV8Rhg
 */
public class Longest_Common_subsequence {
    static int lcs(String s1, String s2, int n1, int n2){
        int[][] lcs = new int[n1+1][n2+1];

        for(int i=0; i<=n1; i++){
            for(int j=0; j<=n2; j++){
                if( i == 0 || j == 0)
                    lcs[i][j] = 0;
                else if( s1.charAt(i-1) == s2.charAt(j-1))
                    lcs[i][j] = 1 + lcs[i-1][j-1];
                else
                    lcs[i][j] = Math.max( lcs[i-1][j], lcs[i][j-1]);
            }
        }

        return lcs[n1][n2];
    }
    public static void main(String[] args){
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";

        System.out.println(lcs(s1, s2, s1.length(), s2.length()));
    }
}
