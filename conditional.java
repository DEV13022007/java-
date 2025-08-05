import java .util.Scanner;
public class conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        if (day%4==0) {
            System.out.println("leap year");
            
        } else if (day%100==0) {
            System.out.println("leap year");
            
        } else if (day%400==0) {
            System.out.println("leap year");
            
        } else{
            System.out.println("not a leap year");
        }
     

            
    }
    
}
