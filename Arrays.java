 class Arrays{

    public static int add(int nums[]){

        int result =0;
        for(int n:nums){
            result+=n;
        }
        return result;
    }

    public static void main(String[] args) {
        
        int arr[][]=new int [3][2];

        for (int i = 0; i < arr.length; i++) {
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
            
        }
        int[] a=new int[0];

        System.out. println(a.length);
        //Anonymous Array
       System.out.println(add(new int[]{5,3,4,6})); 

    }
 }