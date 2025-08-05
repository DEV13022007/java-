import java .util.Scanner;
public class array_questions {
    public static void main(String[] args) {
  // QUESTION 2
        // Scanner n = new Scanner (System .in);
        // System.out.println("enter n");
        // int num = n.nextInt();
        // int [] marks ={34,65,58,3,22,87,87};
        // // int num =3;
        // boolean ck= false;
        // for (int i : marks) {
        //     if(num==i){
        //         ck =true;
        //         break;
        //     }
        // }
        // if(ck){
        //     System.out.println("the value is present in array");
        // } else {
        //     System.out.println("the value is not present in array");
        // }



// QUESTION 3
        //  int [] [] marks1={{28,49,69},{7,8,9}};
        // int [] [] marks2={{4,5,1},{8,3,1}};
        // int [][] marks={{0,0,0},{0,0,0}};
        // for(int i=0;i<marks1.length;i++){
        //   for(int j=0;j<marks1[i].length;j++){
        //      marks [i] [j] =marks1[i][j]+marks2[i][j] ;
        //       System.out.print( marks[i][j]+" ");
        //     } 
        //   System.out.println("");
        // }


// QUESTION 5
           
        //     int [] arry ={5,8,2,0,7,1,54,9};
        //     int l= arry.length;
        //     int n= Math.floorDiv(l,2); 
        //     int temp;
        //     for(int i =0;i<n;i++){
        //         temp=arry[i];
        //         arry[i]=arry[l-i-1];
        //         arry[l-i-1]=temp;
        //     }
        //     for (int i: arry) {
        //         System.out.print(i+" ");
        //     }
             
//  QUESTION 

        // int [] mat1={4,7,67,3,868,88,46};

        //  for max value is Integer.MAX_VALUE  -->   2147483647
        //  for min value is Inteder.MIN_VALUE  -->  -2147483648

        // int max=Integer.MIN_VALUE;  
        // for (int i : mat1) {
        //        if(i>max){
        //         max=i;
        //        } 
        // }
        // System.out.println("the min vale of array is :  "+max);

  
// CHECK THE ARRAY IS SHORTED OR NOT
        int [] mat ={930,100,90,26,20,16,11,0};
        boolean sh =true;
        for(int i=0;i<mat.length-1;i++){
                if(mat[i]<mat[i+1]){
                        sh= false;
                        break;
                }
        } 
        if(sh){
                System.out.println("shorted");
        } else{
                System.out.println("not shorted");
        }




    }
    
}
