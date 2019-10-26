package Dynamic_Programming;
/*
https://www.hackerrank.com/challenges/sherlock-and-cost/problem
*/
public class Sherlock_And_Cost {
    static int max(int[] ar){
        int sum=0;
        for(int i=1; i<ar.length; i++){
            sum += (Math.abs(ar[i] -ar[i-1]));
        }

        return sum;
    }
    public static void main(String[] args){
        int[] ar = {10 ,1 ,10 ,1 ,10};
        System.out.println(max(ar));
    }
}
