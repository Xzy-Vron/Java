
class EvenThread extends Thread {
    public void run(){
        System.out.print("Even: ");
        for(int i=2;i<=20;i+=2) System.out.print(i+" ");
        System.out.println();
    }
}
class OddThread extends Thread {
    public void run(){
        System.out.print("Odd: ");
        for(int i=1;i<=19;i+=2) System.out.print(i+" ");
        System.out.println();
    }
}
class PrimeThread extends Thread {
    boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2;i*i<=n;i++) if(n%i==0) return false;
        return true;
    }
    public void run(){
        System.out.print("Prime: ");
        for(int i=1;i<=20;i++) if(isPrime(i)) System.out.print(i+" ");
        System.out.println();
    }
}
public class NumberThreads {
    public static void main(String[] args){
        new EvenThread().start();
        new OddThread().start();
        new PrimeThread().start();
    }
}
