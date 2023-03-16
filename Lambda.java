
interface Car{

    int drive(int speed);
}
public class Lambda {

    public static void main(String[] args) {

        Car c=(int x)->{
            System.out.println("Driving");
            return x+1;
        };

       System.out.println(c.drive(45)); 
        
    }
    
}
