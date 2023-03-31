import java.util.ArrayDeque;

public class Queue {

    public static void main(String[] args) {
        
        //Array Deque
        ArrayDeque ad= new ArrayDeque();

        ad.add(100);
        ad.addFirst(200);
        ad.addLast(400);
        
       System.out.println( ad.contains(200));
        System.out.println(ad);
        ad.remove(100);
        System.out.println(ad);
        ad.removeFirst();
        ad.removeLast();
        System.out.println(ad);

        //Priority Queue
        


    }
    
}
