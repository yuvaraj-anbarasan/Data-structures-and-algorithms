package Dynamic_Programming;

public class Sum_Of_Substrings {

    public static int sumOfSubstrings(String num) {
        int n = num.length();

        int sumofdigit[] = new int[n];

        sumofdigit[0] = num.charAt(0)-'0';
        int res = sumofdigit[0];

        for (int i = 1; i < n; i++)
        {
            int numi = num.charAt(i)-'0';

             /*       sumofdigit[3] = 4 + 34 + 234 + 1234
                       = 4 + 30 + 4 + 230 + 4 + 1230 + 4
                       = 4*4 + 10*(3 + 23 +123)
                       = 4*4 + 10*(sumofdigit[2])
            */
            sumofdigit[i] = (i+1) * numi +
                    10 * sumofdigit[i-1];

            res += sumofdigit[i];
        }

        return res;
    }

    //  Driver code to test above methods
    public static void main(String[] args)
    {
        String num = "123";

        System.out.println(sumOfSubstrings(num));

    }
}
