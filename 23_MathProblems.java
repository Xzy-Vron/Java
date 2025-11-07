
import java.util.*;
public class MathProblems {
    static int gcd(int a,int b){ if(b==0) return a; return gcd(b,a%b); }
    static int[] reduceFraction(int a,int b){
        int g = gcd(Math.abs(a), Math.abs(b));
        return new int[]{a/g, b/g};
    }
    static boolean isArmstrong(int n){
        int orig=n; int sum=0;
        while(n>0){ int d=n%10; sum += d*d*d; n/=10; }
        return sum==orig;
    }
    static List<Integer> primeFactors(int n){
        List<Integer> res=new ArrayList<>();
        for(int p=2;p*p<=n;p++){
            while(n%p==0){ res.add(p); n/=p; }
        }
        if(n>1) res.add(n);
        return res;
    }
    public static void main(String[] args){
        // a) reduce fraction
        int a=3,b=12;
        int[] r = reduceFraction(a,b);
        System.out.println("Lowest terms: "+r[0]+"/"+r[1]);
        // b) Armstrong numbers 100-500
        System.out.print("Armstrong numbers between 100 and 500: ");
        for(int i=100;i<=500;i++) if(isArmstrong(i)) System.out.print(i+" ");
        System.out.println();
        // c) prime factors
        int n=360;
        System.out.println("Prime factors of "+n+": "+primeFactors(n));
    }
}
