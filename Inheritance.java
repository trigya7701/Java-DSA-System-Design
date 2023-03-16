class Vehicle{

    public void drive(){
        System.out.println("Driving vehicle");
    }

    public void feature(){
        System.out.println("Vehicle features");
    }

}
class Car extends Vehicle{

    public void drive(){
        System.out.println("driving Car");
    }

}

class Bike extends Vehicle{

    public void drive(){
        System.out.println("driving Bike");
    }
    
}

public class Inheritance {
    public static void main(String[] args) {

        Car c= new Car();
        c.drive();
        c.feature();

        Bike b =new Bike();
        b.drive();
        b.feature();
        
    }
}
