import java.util.Scanner;

public class ReverseString {
    
    public static void main(String[] args) {
        
        Scanner ob= new Scanner(System.in);

        String s;
        System.out.println("Enter a string ");
        s=ob.nextLine();
        String revStr="";

        // for(int i=s.length()-1;i>=0;i--){
        //     revStr+=s.charAt(i);
        // }
        String arr[]=s.split(" ");
        for(int i=arr.length-1;i>=0;i--){
            revStr+=arr[i]+" ";
        }
        System.out.println(revStr);
        
    }
}
