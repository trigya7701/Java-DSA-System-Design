
enum Result{
    PASS(50),
    FAIL(40),
    NR(0);

    int marks;

    Result(int marks){
        this.marks=marks;
    }

    int getMarks(){
        return marks;
    }


}

class Enums{

    public static void main(String[] args) {

        Result pass=Result.PASS;
        System.out.println(pass.marks);

        Result fail=Result.FAIL;
        System.out.println(fail.marks);

        Result nr=Result.NR;
        System.out.println(nr.marks);

        switch (pass) {
            case PASS:
            System.out.println(pass.getMarks());
            break;
            case FAIL:
            System.out.println(fail.getMarks());
            break;
            default:
            System.out.println(nr.getMarks());
                
        }
        
    }
}