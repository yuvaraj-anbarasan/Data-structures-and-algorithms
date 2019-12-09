package algorithms.Dynamic_Programming;

/*
Given a rod of length n inches and an array of prices that contains prices of all pieces of size smaller than n.
Determine the maximum value obtainable by cutting up the rod and selling the pieces. For example, if length of the rod
is 8 and the values of different pieces are given as following, then the maximum obtainable value is 22 (by cutting in
two pieces of lengths 2 and 6)


length   | 1   2   3   4   5   6   7   8
--------------------------------------------
price    | 1   5   8   9  10  17  17  20

https://www.youtube.com/watch?v=zFe-SX7jzDs
 */
public class Cutting_Rod {
    static int cutRod(int price[], int n)
    {
        if (n <= 0)
            return 0;
        int max_val = Integer.MIN_VALUE;

        // Recursively cut the rod in different pieces and
        // compare different configurations


        for (int i = 0; i<n; i++) {
            System.out.println(price[i] + "->" + cutRod(price, n - i - 1));
            max_val = Math.max(max_val, price[i] + cutRod(price, n - i - 1));
        }

        System.out.println("<-");
        return max_val;
    }

    static int maxProfit(int[] price, int n){
        int[][] profit = new int[n+1][n+1];

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j < i)
                    profit[i][j] = profit[i-1][j];
                else{
                    profit[i][j] = Math.max( profit[i-1][j], (profit[i][j-i] + price[i-1]));
                }
                System.out.print(profit[i][j] + " ");
            }
            System.out.println();
        }

        return profit[n][n];
    }
    public static void main(String args[]){
        int arr[] = new int[] {1, 5, 8, 9, 10, 17, 17, 20};
        int size = arr.length;
        System.out.println(maxProfit(arr, arr.length));
    }
}
