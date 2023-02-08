public class Pangram {
    public static void main(String[] args) {
        String s="The quick brown fox jumps over lazy dog";

        s=s.replace(" ", "");
        s=s.toLowerCase();
        boolean arr[]=new boolean[26];

        for(int i=0;i<s.length();i++){
            
            char ch=s.charAt(i);
            arr[ch-97]=true;
           
        }
        boolean isPangram=true;
        for(boolean flag:arr){
            if(!flag){
                System.out.println("Not Pangram");
                isPangram=false;
                break;
            }
        }

        if(isPangram){
            System.out.println("Pangram");
        }


    }
}
