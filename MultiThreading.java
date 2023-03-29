import java.util.Scanner;

class MyThread implements Runnable{

    public void run(){

        String name= Thread.currentThread().getName();
        if(name.equals("FUNC1")){
            func1();
        }
        else{
            func2();
        }

    }

    public void func1(){
        Scanner ob =new Scanner(System.in);

        int a=ob.nextInt();
        int b=ob.nextInt();
        System.out.println(a+b);
    }

    public void func2(){

        System.out.println("Task 2");

    }
}


public class MultiThreading {
    
    public static void main(String[] args) {
        MyThread mt1=new MyThread();
        MyThread mt2= new MyThread();

        Thread t1= new Thread(mt1);
        Thread t2=new Thread(mt2);

        t1.setName("FUNC1");
        t2.setName("FUNC2");

        t1.start();
        t2.start();

        
    }
}
