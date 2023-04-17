import java.util.ArrayList;

class Gen<T>{
    T obj;

    public Gen(T obj){

        this.obj=obj;

    }

    public void display(){

        System.out.println(obj.getClass().getName());

    }

    public T getData(){
        return obj;
    }
}

public class Generics {
    public static void main(String[] args) {
        
        ArrayList<Integer> al=new ArrayList<Integer>();

        Gen<Integer> g=new Gen<Integer>(10);

        g.display();
        System.out.println(g.getData());


    }
}
