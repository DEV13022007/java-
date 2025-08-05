 class employee {
    int sall;
    String name;

    public int sal() {
        return sall;
    }
    public String getname(){
        return name;
    }
    public void setname( String n){
        name =n;
    }

 class Square{
    int side;
    public int area(int n){
        return side*side;
    }
    public int para(int n){
        return 4*side;
    }
 }


 }
public class oops_question {
    public static void main(String[] args) {
       /*  employee dev = new employee();
        employee devendra = new employee();
         dev.sall=10000;
         dev.setname("devendra kushwaha");
         System.out.println(dev.sall);
         System.out.println(dev.getname());
          */
// QUESTION 
    Square sq = new Square();
     sq.side=5;
     System.out.println("area is "+ sq.area(sq.side));
     System.err.println("peremeter is "+ sq.para(sq.side));
   

    }
    
}
