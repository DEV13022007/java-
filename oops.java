 class employee {
    int idee;
    String name;
    public void dev(){
        System.out.println("my id is "+ idee);
        System.out.println("my nameis "+ name);
    }
    
}
public class oops {
    public static void main(String[] args) {
        employee devendra =new employee();
        employee ankit = new employee();
        employee aremend = new employee();
          
        devendra.idee = 13;
        ankit.idee =34;
        aremend.idee =74;
        ankit.name = "ankit";
        aremend.name = "sefbhhvh";
        devendra.name = "dgufgivvuiv";

        ankit.dev();
        devendra.dev();
         
        


    }
    
}
