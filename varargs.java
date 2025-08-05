public class varargs {
  
        static int sum(int t,int ...arr){
            int a = 0;
            for(int i :arr){
                a +=i;
            }
            return a;
        }
        public static void main(String[] args) {
            System.out.println("sum is:"+sum( 4,8,3,47));
        }
//         import java .util.Scanner;
//         static int fact(int i){
//             if(i==0 || i==1){
//                 return 1;
//             } else {
//                 return i *fact(i-1);
//             }
//         }
// public static void main(String[] args) {
//      Scanner sc = new Scanner (System.in);
//      int n = sc.nextInt();
//      System.out.println("factorial is "+fact(n));

//}
}






    
    

