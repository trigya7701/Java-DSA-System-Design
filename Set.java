import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {
    
    public static void main(String[] args) {
        // TreeSet

        TreeSet ts= new TreeSet();

        ts.add(100);
        ts.add(25);
        ts.add(200);
        ts.add(74);
        ts.add(125);
        ts.add(175);

        System.out.println(ts);

        System.out.println(ts.contains(100));
        System.out.println(ts.first());
        System.out.println(ts.last());
        System.out.println(ts.pollFirst());
        System.out.println(ts);


        //HashSet

        HashSet hs= new HashSet();

        hs.add(100);
        hs.add(25);
        hs.add(200);
        hs.add(74);
        hs.add(125);
        hs.add(175);

        System.out.println(hs.size());
        System.out.println(hs.contains(100));
        System.out.println(hs);

        //Linked HashSet

        LinkedHashSet lhs=new LinkedHashSet();

        lhs.add(100);
        lhs.add(25);
        lhs.add(200);
        lhs.add(74);
        lhs.add(125);
        lhs.add(175);

        System.out.println(lhs.size());
        System.out.println(lhs.contains(100));
        System.out.println(lhs);





    }
}
