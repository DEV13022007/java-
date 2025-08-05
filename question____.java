public class question____ {
    // QUESTION 1
    // static void patt (int n){
    //     for(int i =0;i<=n;i++){
    //         for(int j=0;j<i;j++){
    //             System.out.print("#");    
    //         }
    //         System.out.println();
    //     }
    // } public static void main(String[] args) {
    //     patt(100);
    // }

    // QUESTION 2
    // static int sum(int n){
    //     if(n==1){
    //         return 1;
    //     }else{
    //         return n + sum(n-1);
    //     }
    // }
    // public static void main(String[] args) {
    //     System.out.println("sum is "+sum(6));
    // }
     

    // QUESTION 3
    static void pat(int n){
        for(int i=n;i>=0;i--){
            for (int j=0;i>=j;j++){
                System.out.print("$");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {                
        pat(4);
    }
    
}
