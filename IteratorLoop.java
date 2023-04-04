import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorLoop {
    
    public static void main(String[] args) {
        
        ArrayList al= new ArrayList();

        al.add(100);
        al.add(200);
        al.add(300);

        Iterator itr = al.iterator();

        while (itr.hasNext()) {
         
            System.out.println(itr.next());
        }

        ListIterator litr= al.listIterator(al.size());

        while (litr.hasPrevious()) {
         System.out.println(litr.previous());   
        }
        
        }
    }

