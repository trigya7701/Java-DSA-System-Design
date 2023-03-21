// class MyException extends Exception{
     
//     MyException(String msg){
//         super(msg);
//     }
// }

public class ExceptionHandling {

    public static void main(String[] args) {
        
        int num1=2;
        int num2 =-3;
        try {

            // if(num2<0){
            //     throw new MyException("Invalid number");
            // }
            // 
            err();
            System.out.println("err");
        } catch ( Exception e) {
            System.out.println("Catch");
            // throw e;
        }

        
       
    }
    public static void err() throws Exception{
        System.out.println("infunc err");
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("func catch");
            System.out.println(e);
        }
        
    }
}
