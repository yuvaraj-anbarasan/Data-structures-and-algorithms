package Dynamic_Programming;

public class Min_Palindrome_Insertions {
    //using dynamic programming
    static int findMinInsertionsDP(char str[], int n)
    {
        int[][] min = new int[n][n];

        for(int range = 1; range < n; range++){
            for(int l = 0, r = range; r < n; l++, r++){
                min[l][r] = str[l] == str[r] ? min[l+1][r-1] : ((Math.min(min[l+1][r], min[l][r-1])) + 1);
            }
        }

//        debugging code to print min table
//        for(int i=0; i<n; i++){
//            for(int j=0; j<n; j++){
//                System.out.print(min[i][j] + "");
//            }
//            System.out.println();
//        }

        return min[0][n-1];
    }

    //recursive function
    static int findMinInsertions(char[] str, int l, int r){
        if( l > r)
            return Integer.MAX_VALUE;
        if( l == r)
            return 0;
        if(l == r-1)
            return str[l] == str[r] ? 0 : 1;
        if(str[l] == str[r])
            return findMinInsertions(str, l+1, r-1);
        else
            return (Math.min( findMinInsertions(str, l+1, r), findMinInsertions(str, l, r-1)) +1);

        //return 0;
    }
    // Driver program to test above function.
    public static void main(String args[])
    {
        String str = "geeks";
        System.out.println(findMinInsertions(str.toCharArray(), 0, str.length()-1));

        System.out.println(findMinInsertionsDP(str.toCharArray(), str.length()));
    }
}
