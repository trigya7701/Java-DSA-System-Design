import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;


public class Maps{

    public static void main(String[] args) {
        //HashMap
        
        HashMap hm= new HashMap();
        hm.put(1, "ANV");
        hm.put(2, "hjg");
        hm.put(3,false);

        System.out.println(hm);


        Set set= hm.entrySet();
        Iterator itr =set.iterator();

        while (itr.hasNext()) {

           Entry data=(Entry) itr.next();
           System.out.println(data);
            
        }

    }
}