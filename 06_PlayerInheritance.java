
class Player {
    String name;
    int age;
    Player(String name, int age){ this.name=name; this.age=age;}
    void display(){ System.out.println(name+" age:"+age); }
}
class Cricket_player extends Player {
    String role;
    Cricket_player(String name,int age,String role){ super(name,age); this.role=role;}
    void display(){ super.display(); System.out.println("Cricket role: "+role); }
}
class Football_player extends Player {
    String position;
    Football_player(String name,int age,String pos){ super(name,age); position=pos;}
    void display(){ super.display(); System.out.println("Football pos: "+position); }
}
class Tennis_player extends Player {
    String handed;
    Tennis_player(String name,int age,String h){ super(name,age); handed=h;}
    void display(){ super.display(); System.out.println("Tennis: "+handed); }
}
public class PlayerInheritance {
    public static void main(String[] args){
        Cricket_player c = new Cricket_player("Dhoni",40,"Wicketkeeper-batsman");
        Football_player f = new Football_player("Messi",37,"Forward");
        Tennis_player t = new Tennis_player("Serena",40,"Right");
        c.display(); f.display(); t.display();
    }
}
