// Thread creation extending Thread class
class MyThread extends Thread{
    public void run(){
        for(int i=0;i<5;i++)
            System.out.println("MyThread");
    }
}
public class CreateThread {
    public static void main(String[] args) {
        MyThread t=new MyThread();
        
        // by calling this, user defined thread is registered into thread scheduler, starts executing thread t
        t.start();
        
        // by default, user created thread name will be "Thread-n"
        System.out.println("MyThread name is "+t);  // MyThread name is Thread[Thread-0,5,]
        
        // setName will change a thread t's name
        t.setName("sravya");
        System.out.println("MyThread name is "+t);  // MyThread name is Thread[sravya,5,]
        
        System.out.println("main thread");
        // Thread.currentThread() will give current thread, getName() fetches the name
        System.out.println("main thread name is "+Thread.currentThread().getName());    // main thread name is main

    }
}
