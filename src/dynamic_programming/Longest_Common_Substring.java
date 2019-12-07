package algorithms.Dynamic_Programming;

public class Longest_Common_Substring {
    static int lcs(String s1, String s2, int n1, int n2){
        int[][] lcs = new int[n1+1][n2+1];
        int max = 0;

        for(int i=1; i<=n1; i++){
            for(int j=1; j<=n2; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)) {
                    lcs[i][j] = 1 + lcs[i - 1][j - 1];

                    if( lcs[i][j] > max)
                        max = lcs[i][j];
                }
            }
        }

        return max;
    }
    public static void main(String[] args){
        String s1 = "abcdef";
        String s2 = "zbcdf";

        System.out.println(lcs(s1, s2, s1.length(), s2.length()));
    }
}
