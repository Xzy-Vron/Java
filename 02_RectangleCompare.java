
class Rectangle {
    double width, length;
    double area;
    String color;
    Rectangle(double w, double l, String c){
        width = w; length = l; color = c;
        area = width * length;
    }
}
public class RectangleCompare {
    public static void main(String[] args){
        Rectangle r1 = new Rectangle(4,5,"Red");
        Rectangle r2 = new Rectangle(5,4,"Red");
        if (r1.area == r2.area && r1.color.equalsIgnoreCase(r2.color)) {
            System.out.println("Matching Rectangles");
            if (r1.width==r2.width && r1.length==r2.length && r1.color.equals(r2.color)) {
                System.out.println("Identical");
            } else System.out.println("Not Identical");
        } else {
            System.out.println("Non-matching Rectangle");
        }
    }
}
