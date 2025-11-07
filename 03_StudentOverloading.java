
class Student {
    String name; int roll; int age; String result; String city;
    Student() {}
    Student(String name, int roll) { this.name = name; this.roll = roll;}
    Student(String name, int roll, int age, String result, String city) {
        this.name=name; this.roll=roll; this.age=age; this.result=result; this.city=city;
    }
    void display() {
        System.out.println(name+" "+roll+" "+age+" "+result+" "+city);
    }
    // method overloading
    void setDetails(String name, int roll){ this.name=name; this.roll=roll;}
    void setDetails(String name, int roll, int age, String result, String city){
        this.name=name; this.roll=roll; this.age=age; this.result=result; this.city=city;
    }
}
public class StudentOverloading {
    public static void main(String[] args){
        Student s1 = new Student("Alice",101);
        Student s2 = new Student("Bob",102,20,"Pass","Pune");
        s1.display();
        s2.display();
        s1.setDetails("Alice",101,19,"Pass","Mumbai");
        s1.display();
    }
}
