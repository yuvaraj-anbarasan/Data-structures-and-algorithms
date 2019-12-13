package Dynamic_Programming;
/*
https://www.hackerrank.com/challenges/sherlock-and-cost/problem
*/
public class Sherlock_And_Cost {
    static int max(int[] ar){
        int max1=0, max2=0;
        for(int i=1; i<ar.length; i++){
            if(i%2 != 0) {
                max1 += (Math.abs(ar[i] - 1));
                max2 += (Math.abs(1 - ar[i-1]));
            }
            else {
                max1 += (Math.abs(1 - ar[i-1]));
                max2 += (Math.abs(ar[i] - 1));
            }

            System.out.println("max1="+max1+" | max2="+max2);
        }

        return Math.max(max1, max2);
    }
    public static void main(String[] args){
        int[] ar = {30,1,1,30};
        System.out.println(max(ar));
    }
}
