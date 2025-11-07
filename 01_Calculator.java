
import java.util.Scanner;
import java.lang.Math;
public class Calculator {
    // Simple calculator with switch-case and some Math methods
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        double a = sc.nextDouble();
        System.out.println("Enter second number:");
        double b = sc.nextDouble();
        System.out.println("Choose operation: + - * / ! (factorial using first number) p (pow) s (sqrt) r (round) a (abs) m (max)");
        char op = sc.next().charAt(0);
        switch(op) {
            case '+': System.out.println(a + b); break;
            case '-': System.out.println(a - b); break;
            case '*': System.out.println(a * b); break;
            case '/': if (b!=0) System.out.println(a / b); else System.out.println("Division by zero"); break;
            case '!': System.out.println(factorial((int)a)); break;
            case 'p': System.out.println(Math.pow(a,b)); break;
            case 's': System.out.println(Math.sqrt(a)); break;
            case 'r': System.out.println(Math.round(a)); break;
            case 'a': System.out.println(Math.abs(a)); break;
            case 'm': System.out.println(Math.max(a,b)); break;
            default: System.out.println("Invalid op");
        }
        sc.close();
    }
    static long factorial(int n) {
        if (n < 0) return -1;
        long f = 1;
        for (int i=2;i<=n;i++) f *= i;
        return f;
    }
}
