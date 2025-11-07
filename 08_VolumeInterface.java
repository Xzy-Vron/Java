
interface Volume {
    double innerVolume(double s1,double s2,double s3);
    double outerVolume(double s1,double s2,double s3);
}
class Part implements Volume {
    double s1,s2,s3;
    Part(double s1,double s2,double s3){ this.s1=s1; this.s2=s2; this.s3=s3;}
    public double innerVolume(double s1,double s2,double s3){ return (1.0/3.0)*Math.PI*s1*s2*s3; }
    public double outerVolume(double s1,double s2,double s3){ return (4.0/3.0)*Math.PI*s1*s2*s3; }
    void display(){
        System.out.println("s: "+s1+","+s2+","+s3);
        System.out.println("Inner: "+innerVolume(s1,s2,s3));
        System.out.println("Outer: "+outerVolume(s1,s2,s3));
    }
}
public class VolumeInterface {
    public static void main(String[] args){
        Part p = new Part(1,2,3);
        p.display();
    }
}
