class Pattern{
    public static void main(String[] args) {
        int n=5;
        // for (int i = 0; i < 5; i++) {

        //     for(int j=0;j<5;j++){
        //         if(i==0 || i==4 || j==0 || j==4){
        //             System.out.print("* ");
        //         }
        //         else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
            
        // }

        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j || i+j==n-1){
                   System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }
}