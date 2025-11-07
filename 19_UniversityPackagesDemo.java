
/*
 Simulated demo: In practice create two packages (studentpkg and staffpkg) and import them.
 Here classes are defined inline to simulate usage.
*/
class StudentClass { String name; StudentClass(String n){name=n;} }
class StaffClass { String name; StaffClass(String n){name=n;} }
public class UniversityPackagesDemo {
    public static void main(String[] args){
        StudentClass s = new StudentClass("Alice");
        StaffClass st = new StaffClass("Mr. Smith");
        System.out.println("Student: "+s.name+" Staff: "+st.name);
    }
}
