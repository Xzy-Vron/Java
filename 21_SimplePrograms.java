
import java.util.*;
public class SimplePrograms {
    static long factorial(int n){ long f=1; for(int i=2;i<=n;i++) f*=i; return f; }
    static boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2;i*i<=n;i++) if(n%i==0) return false;
        return true;
    }
    public static void main(String[] args){
        System.out.println("Factorial of 5: "+factorial(5));
        System.out.print("First 50 primes: ");
        int count=0, n=2;
        while(count<50){ if(isPrime(n)){ System.out.print(n+" "); count++; } n++; }
        System.out.println();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N for sum and average:");
        int N=sc.nextInt(); int sum=0;
        System.out.println("Enter numbers:");
        for(int i=0;i<N;i++) sum += sc.nextInt();
        System.out.println("Sum="+sum+" Average="+(N>0?((double)sum/N):0));
        sc.close();
    }
}
