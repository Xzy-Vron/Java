
class Student {
    int roll; String name;
    Student(int roll,String name){ this.roll=roll; this.name=name;}
}
class Exam extends Student {
    int[] marks = new int[6];
    Exam(int roll,String name,int[] marks){ super(roll,name); this.marks = marks;}
}
class Result extends Exam {
    int total; double percent;
    Result(int roll,String name,int[] marks){ super(roll,name,marks); compute(); }
    void compute(){
        total = 0;
        for(int m:marks) total += m;
        percent = total / (marks.length * 1.0);
    }
    void display(){
        System.out.println("Roll: "+roll+" Name: "+name);
        System.out.println("Total: "+total+" Percentage: "+percent);
    }
}
public class StudentExamResult {
    public static void main(String[] args){
        int[] marks = {80,75,90,85,70,60};
        Result r = new Result(1,"Avinash",marks);
        r.display();
    }
}
