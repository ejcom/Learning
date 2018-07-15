package lections.brovko;

public class NumbersUtil {

    int Fibonacci (int n) {
        if (n==0 || n==1) {
            return 1;
        }
        return Fibonacci(n-1) + Fibonacci(n-2);
    }

    int FibonacciNotRecursive(int n) {
        if (n==0 || n==1) {
            return 1;
        }
        int prev = 1, current = 1;
        for (int i = 0; i<=n; i++) {
            int tmp = current;
            current += prev;
            prev = tmp;
        }
        return current;
    }

    Boolean IsPrime (int n) {
        if (n==1) {
            return false;
        }
        for (int i = 2; i*i<=n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }



}
