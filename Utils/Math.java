package utils;
public class Math {
    public static long factorial(long b)
    {
        if(b <= 1)
        {
            return 1;
        }
        return b * factorial(b - 1);
    }
    public static long factorialforLoop(long n)
    {
        long integer = 1;
        if(n <= 0)
        {
            return integer;
        }
        for(int i = 1; i <= n; i++) 
        {
            integer = integer * i;
        }
        return integer;
    }
}