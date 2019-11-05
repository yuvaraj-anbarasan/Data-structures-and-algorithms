package Dynamic_Programming;

public class Sum_Of_Substrings {

    public static int sumOfSubstrings(String num) {
        int n = num.length();

        long sumofdigit[] = new long[n];

        sumofdigit[0] = num.charAt(0)-'0';
        long res = sumofdigit[0];

        for (int i = 1; i < n; i++)
        {
            int numi = num.charAt(i)-'0';

             /*       sumofdigit[3] = 4 + 34 + 234 + 1234
                       = 4 + 30 + 4 + 230 + 4 + 1230 + 4
                       = 4*4 + 10*(3 + 23 +123)
                       = 4*4 + 10*(sumofdigit[2])
            */
            sumofdigit[i] =(long) (( ((i+1) * numi) + (10 * sumofdigit[i-1]) ) % (Math.pow(10, 9) + 7));

            res = (long) ((res + sumofdigit[i]) % (Math.pow(10, 9) + 7));
        }

        return (int) (res);
    }

    //  Driver code to test above methods
    public static void main(String[] args)
    {
        String num = "213676822290";

        System.out.println(sumOfSubstrings(num));

    }
}
