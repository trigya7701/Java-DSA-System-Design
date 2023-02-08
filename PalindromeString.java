import java.util.Scanner;

public class PalindromeString {
    
    public static void main(String[] args) {
        
        Scanner ob =new Scanner(System.in);

        String s= ob.next();
        boolean flag=true;

        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                flag=false;
                break;
            }
        }

        if(flag){
            System.out.println("Pallindrome");;
        }
        else{
            System.out.println("Not Pallindrome");
        }
    }
}
