package Lab2;

public class MyVariable {

    public static void main(String[] args) {

     //Data type
     //1. integer จำนวนเต็ม
     //2. floaะing จำนวนจริง
     //3. character อักขระ 1 ตัว
     //4. sTRING ข้อความ
     //5. boolean ค่าความจริง

     //1. integer เช่น 10 20 30 100 -15 -47
     int x; // ประกาศตัวแปรชื่อ x สำหรับเก็บข้อความจำนวนเต็ม
     x = 10;
     System.out.println("x = "+x);
     int y = 20; // ประกาศตัวแปรชื่อ y และมีค่าเท่ากับ 20
     System.out.println("y = "+y);

     System.out.println("x+y="+ (x+y));

     int z = x+y; // ประกาศตัวแปรชื่อ z มีค่าเท่ากับ x+y
     System.out.println("z = "+z);

     //2. float and double เช่น 11.11 23.56 -45.63 10.00
     float a = 10.00f;
     double b = -45.85;

     //3. character เช่น a A # @ & h J
     char c ='C'; // ใช้สัญลักญณ์ '_' เพื่อระบุชนิดของข้อมูล
     System.out.println(c);

     //4. String เช่น "Hello RUTS" "My name is yod"
     // String เป็นคลาสในภาษา Jav
     //ดังนั้นตัวแปร จึงเป็นการประกาศ object ของคลาส String

     String s = "RUTS : Management Technology"; // ประกาศ object ชื่อ s เก็บข้อความ "RUTS"
     System.out.println(s);
     System.out.println(s.length()); //length () จำนวนอักขระ คือค่าเป็นจำนวนเต็ม
     System.out.println(s.toUpperCase()); //แปลงข้อความเป็นพิทพ์ใหญ่
     System.out.println(s.toLowerCase()); //แปลงข้อความเป็นพิทพ์เล็ก

     String msg = "Management Informtiom Technology";
     String conn = s + msg; // เครื่องหมาย + เป็นการต่อข้อความสำหรับตัวแปร String

     String conn2 = s.concat(msg); // concat() ใช้ต่อข้อความเช่นเดียวกับ +

     //5. boolean เก็บค่า 2 ค่า คือ true (1) และ false(0)
     boolean bb = true;
     boolean bb2 =false;

     System.out.println(bb+" "+bb2);

    }//main
}//class
