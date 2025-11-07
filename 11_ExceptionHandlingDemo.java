
import java.util.*;
class MyException extends Exception {
    MyException(String msg){ super(msg); }
}
public class ExceptionHandlingDemo {
    static int divide(int a,int b) throws ArithmeticException {
        return a/b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter dividend and divisor:");
            int a = sc.nextInt(), b = sc.nextInt();
            System.out.println("Result: "+divide(a,b));
            if (a < 0) throw new MyException("Negative number not allowed for this demo");
        } catch (ArithmeticException ae) {
            System.out.println("Arithmetic error: "+ae.getMessage());
        } catch (MyException me) {
            System.out.println("Custom exception: "+me.getMessage());
        } catch (InputMismatchException ime) {
            System.out.println("Input mismatch");
        } finally {
            System.out.println("Finally block");
            sc.close();
        }
    }
}
