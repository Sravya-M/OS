// "static void main" must be defined in a public class.
class MyThread implements Runnable{
    public void run(){
        for(int i=0;i<5;i++)
            System.out.println("MyThread");
    }
}
public class CreateThreadRunnable {
    public static void main(String[] args) {
        
        MyThread r=new MyThread();
        
        Thread t=new Thread(r);
        t.start();
        
        System.out.println("MyThread name is "+t);  // MyThread name is Thread[Thread-0,5,main]
        t.setName("sravya");
        System.out.println("MyThread name is "+t);  // MyThread name is Thread[sravya,5,main]

    }
}
