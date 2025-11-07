
interface Sports {
    int getGraceMarks();
}
class Student {
    int roll; String name;
    Student(int r,String n){ roll=r; name=n;}
}
class Exam extends Student {
    int marks;
    Exam(int r,String n,int marks){ super(r,n); this.marks = marks;}
}
class Result extends Exam implements Sports {
    int finalMarks;
    Result(int r,String n,int marks){ super(r,n,marks); }
    public int getGraceMarks(){ return 10; } // example
    void compute(){
        finalMarks = marks + getGraceMarks();
        int max = 100;
        if (finalMarks > max) finalMarks = max;
    }
    void display(){ compute(); System.out.println("Final marks: "+finalMarks); }
}
public class GraceMarks {
    public static void main(String[] args){
        Result res = new Result(1,"Stu",95);
        res.display();
    }
}
