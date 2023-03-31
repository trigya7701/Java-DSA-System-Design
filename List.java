import java.util.ArrayList;
import java.util.LinkedList;

public class List {
    
    public static void main(String[] args) {

        // ArrayList
        
        ArrayList arr1=new ArrayList();
        ArrayList arr2=new ArrayList();

        arr2.add(1.1);

        arr1.add(100);
        arr1.add("ABC");
        arr1.addAll(1, arr2);

        System.out.println(arr1);
        System.out.println(arr2);
        System.out.println(arr1.size());
        System.out.println(arr1.containsAll(arr2));


        //Linked List

        LinkedList ll= new LinkedList();

        ll.add(100);
        ll.add(200);
        ll.add("ll");
        ll.add(1, 5);
        ll.addFirst(98);
        ll.addLast("oiu");

        System.out.println(ll.peekLast());
        System.out.println(ll.peekFirst());
        System.out.println(ll.pollFirst());
        System.out.println(ll.pollLast());
        System.out.println(ll);
        
        


    }
}
