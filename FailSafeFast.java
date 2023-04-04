import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeFast {
    public static void main(String[] args) {
        
        ArrayList al= new ArrayList();

        al.add(100);
        al.add(200);
        al.add(300);

        Iterator itr= al.iterator();

        //FailFast : Raises Exception

        while (itr.hasNext()) {
            
            System.out.println(itr.next());
            //al.add(500); ---> Causes Exception
        }

        //FailSafe

        CopyOnWriteArrayList al1= new CopyOnWriteArrayList();

        al1.add(100);
        al1.add(200);
        al1.add(300);

        Iterator itr1= al1.iterator();
        while (itr1.hasNext()) {
            
            System.out.println(itr1.next());
            al1.add(500); 
        }




    }
}
