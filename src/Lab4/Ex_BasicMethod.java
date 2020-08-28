package Lab4;

import java.util.concurrent.Callable;

public class Ex_BasicMethod {
    public static void B(int num){
        //ststement
        System.out.println("Hello B."+num);
    }//B
    public static void main(String[] args) {
      System.out.println("Hello Main.");
      //Call A()
      A();
        A();
        A();
      //call B()
        B(50);
        //call C()
        int sum = C(20,30);
        System.out.println(sum);
        System.out.println(C(100,100));


    }///main
    public static void A(){
        //statement
        System.out.println("Hello A.");
        B(100);

    }//A
    public static int C (int x, int y) {
        //statement
        System.out.println("Hello C.");
        int sum = x + y;
        return sum;
    }//C



}//class
