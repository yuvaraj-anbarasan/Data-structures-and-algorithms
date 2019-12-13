package Dynamic_Programming;

import java.util.Arrays;

public class Coin_Change_Problem {
    static int count( int S[], int m, int n )
    {
        //we need a two dimensional matrix to store the result
        int[][] table = new int[m+1][n+1];

//       for(int i=1; i<m+1;i++){
//           for(int j=1; j<n+1;j++){
//                table[i][j] = 0;
//           }
//       }

        // Base case (If given value is 0)
        for(int i=0;i<=m;i++)
        {
            table[i][0] = 1;
        }
//        for(int i=0;i<=m;i++)
//        {
//            table[i][0] = 1;
//        }

        for(int i=1;i<=m;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(S[i-1]>j)
                {
                    table[i][j]=table[i-1][j];

                }

                else
                {
                    table[i][j]=table[i-1][j]+table[i][j-(S[i-1])];
                }

            }
        }

        for(int i=0; i<m+1;i++){
            for(int j=0; j<n+1;j++){
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }

        return table[m][n];
    }

//    static int count(int coins[], int m, int n){
//        //if the total amount is 0
//        if(n==0)
//            return 1;
//
//        //if total amount is < 0 then no solution
//        if(n<0)
//            return 0;
//
//        //if no coins but total is given
//        if(m<=0 && n>=0)
//            return 0;
//
//        // excluding and including coins[m-1]
//        return count(coins, m-1, n) + count(coins, m, n - coins[m-1]);
//    }

    // Driver program to test above function
    public static void main(String[] args)
    {
        int arr[] = {1, 2, 3};
        Arrays.sort(arr);
        int m = arr.length;
        System.out.println( count(arr, m, 4));
    }

}
