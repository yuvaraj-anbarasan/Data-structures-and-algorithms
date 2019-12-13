package algorithms.greedy;
/*
https://www.hackerrank.com/challenges/candies/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
 */
public class Candies {
    static long minCandies(int rating[]){
        long sum = 0;
        int[] candies = new int[rating.length];
        candies[0] = 1;
        for(int i=1; i<rating.length; i++){
            if(rating[i] > rating[i-1]){
                candies[i] = candies[i-1]+1;
            }else{
                candies[i] = 1;
            }
        }

        sum = candies[candies.length-1];
        for(int i=rating.length-2; i>=0; i--){
            if(rating[i] > rating[i+1] && candies[i] <= candies[i+1])
                candies[i] = candies[i+1]+1;

            sum += candies[i];
        }

        return sum;
    }
    public static void main(String[] args){
        int[] ratings = {1, 2, 2};
        System.out.println(minCandies(ratings));
    }
}
