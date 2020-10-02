package Lab2;
import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
   //หาค่างวดรถต่อเดือน รับข้อมูลเป็น ราคารถ เงินดาว และอัตราดอกเบี้ย(%)
        Scanner scanner = new Scanner(System.in);
        System.out.println("ราคารถ (บาท)");
        double x = scanner.nextDouble();
        System.out.println("เงินดาวน์ (บาท)");
        double y = scanner.nextDouble();
        System.out.println("ดอกเบี้ย (%)");
        double z = scanner.nextDouble();
        System.out.println("จำนวนงวดที่ต้องการผ่อน (งวด)");
        int w = scanner.nextInt();

        double a = x - y;//
        double b = a * (z/100)* w/12;//
        double c = a + b;//
        double d = c / (w);//
        //display
        System.out.println("ผ่อนเงวดละ:"+d);











    }//main
}//class
