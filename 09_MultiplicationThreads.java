
class TableThread extends Thread {
    int num;
    TableThread(int num){ this.num = num; }
    public void run(){
        for(int i=1;i<=10;i++) System.out.println(num+" x "+i+" = "+(num*i));
    }
}
public class MultiplicationThreads {
    public static void main(String[] args){
        Thread t1 = new TableThread(5);
        Thread t2 = new TableThread(7);
        Thread t3 = new TableThread(13);
        t1.start(); t2.start(); t3.start();
    }
}
