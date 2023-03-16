class Demo{

    private int age;
    private String name;

    Demo(){
        System.out.println("Zero constructor");
    }

    Demo(int age,String name){
        this.age=age;
        this.name=name;

    }

    public void display(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

class Constructor{
    public static void main(String[] args) {

        Demo d1=new Demo();
        d1.display();
        Demo d2=new Demo(18,"Rahul");
        d2.display();
        
    }
}