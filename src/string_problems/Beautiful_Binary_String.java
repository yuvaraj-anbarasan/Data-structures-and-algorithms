package stringProblems;

import java.io.IOException;
import java.util.Scanner;

public class Beautiful_Binary_String {
    // Complete the beautifulBinaryString function below.
    static int beautifulBinaryString(String b) {
        int count=0;
        while(b.contains("010")){
            int index = b.indexOf("010") + 2;
            b = b.substring(0,index) + "1" + b.substring(index+1);
            count++;
        }
        System.out.println("b="+b);

        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        System.out.println(beautifulBinaryString("01100"));
    }
}
