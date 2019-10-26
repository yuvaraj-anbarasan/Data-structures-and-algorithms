package recursion;

public class Fibonacci {
    static int fib(int n){
        int result;
        if( n==1 || n==2)
            return 1;
        else
            result = fib(n-1) + fib(n-2);
        return result;
    }
    public static void main(String[] args){
        fib(5);
    }
}
