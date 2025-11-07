
/*
 Note: To fully demonstrate packages you'd create separate files and directories.
 Here we simulate usage by having a Calculator class and using it.
*/
class MyCalculator {
    public static double add(double a,double b){ return a+b;}
    public static double smartPow(double a,double b){ return Math.pow(a,b);}
}
public class CustomPackageDemo {
    public static void main(String[] args){
        double x = MyCalculator.add(4,5);
        double y = MyCalculator.smartPow(2,8);
        System.out.println("Add: "+x+" Pow: "+y);
    }
}
