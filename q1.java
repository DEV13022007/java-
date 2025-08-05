import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {
        System.out.println("enter subj 1 marks");
        Scanner sub= new Scanner(System .in);
        int a= sub.nextInt();
        System.out.println("enter 2 subject ");
        int b = sub.nextInt();
        System.out.println("enter sub 3 mrks");
        int c =sub.nextInt();
    System.out.println("cgpa is  "+(a+b+c)/3);
    }
    
}
