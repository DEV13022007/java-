public class array {
    public static void main(String[] args) {
        int [] marks = new int [10];
        marks [0]=78;
        marks [1]=7;
        marks [2]=58;
        marks [3]=47;
        marks [4]=29;
        
        System.out.println(marks.length);
        for (int i : marks) {
            System.out.println(i);
        }
    }
    
}
