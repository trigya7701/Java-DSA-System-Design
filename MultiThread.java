// using Thread class
// class MyThread extends Thread{

//     public void run(){
//         System.out.println("child task");
//     }
// }

//Using Runnable interface
class MyThread implements Runnable{
    public void run(){
                System.out.println("child task");
            }
}


public class MultiThread {
    
    public static void main(String[] args) {
        
        System.out.println("Main Thread");

        // MyThread t=new MyThread();

        MyThread mt= new MyThread();
        Thread T=new Thread(mt);
        T.start();
        // System.out.println(Thread.currentThread().getName());

        // Thread.currentThread().setName("rrr");
        // Thread.currentThread().setPriority(2);

        // System.out.println("Main Thread");
        // System.out.println(Thread.currentThread().getName());
        // System.out.println(Thread.currentThread().getPriority());
        
    }
}
