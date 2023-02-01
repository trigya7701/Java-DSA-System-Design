import java.util.Scanner;
public class ScannerClass {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter name");
        String name=sc.nextLine();

        System.out.println("Enter age");
        int age=sc.nextInt();

        System.out.println("Enter marks");
        double marks=sc.nextDouble();

        System.out.println(name+" "+ age+" "+ marks);

    }
}
