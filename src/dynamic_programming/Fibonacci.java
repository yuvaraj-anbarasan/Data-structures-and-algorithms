package dynamicProgramming;

public class Fibonacci {
    static int fib(int n, int[] mem){
        int result;
        if(mem[n] != 0)
            return mem[n];
        if( n==1 || n==2)
            return 1;
        else
            result = fib(n-1, mem) + fib(n-2, mem);
        mem[n] = result;
        return result;
    }
    public static void main(String[] args){
        fib(5, new int[6]);
    }
}
