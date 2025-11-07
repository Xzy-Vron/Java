
import java.util.*;
public class LeapAndService {
    static boolean isLeap(int y){
        if (y%400==0) return true;
        if (y%100==0) return false;
        return y%4==0;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter year:");
        int y=sc.nextInt();
        System.out.println(y + (isLeap(y) ? " is a leap year" : " is not a leap year"));

        System.out.println("Enter age, sex (M/F) and marital status (Y/N):");
        int age=sc.nextInt(); char sex=sc.next().charAt(0); char ms=sc.next().charAt(0);
        String place = "ERROR";
        if (sex=='F' || sex=='f') place = "Urban only";
        else {
            if (age>=20 && age<=40) place = "Anywhere";
            else if (age>40 && age<=60) place = "Urban only";
        }
        System.out.println("Place of service: " + place);
        sc.close();
    }
}
