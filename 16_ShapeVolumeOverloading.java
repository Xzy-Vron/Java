
public class ShapeVolumeOverloading {
    // Method overloading for different shapes
    static double volumeCuboid(double l,double w,double h){ return l*w*h; }
    static double volumeCube(double a){ return Math.pow(a,3); }
    static double volumeCylinder(double r,double h){ return Math.PI*r*r*h; }
    static double volumePrism(double B,double h){ return B*h; }
    static double volumeSphere(double r){ return (4.0/3.0)*Math.PI*Math.pow(r,3); }
    static double volumePyramid(double B,double h){ return (1.0/3.0)*B*h; }
    static double volumeCone(double r,double h){ return (1.0/3.0)*Math.PI*r*r*h; }
    static double volumeEllipsoid(double a,double b,double c){ return (4.0/3.0)*Math.PI*a*b*c; }
    static double volumeTetrahedron(double a){ return Math.pow(a,3)/(6*Math.sqrt(2)); }
    public static void main(String[] args){
        System.out.println("Cuboid vol: "+volumeCuboid(2,3,4));
        System.out.println("Cube vol: "+volumeCube(3));
        System.out.println("Sphere vol: "+volumeSphere(2));
        System.out.println("Ellipsoid vol: "+volumeEllipsoid(1,2,3));
    }
}
