package Lab8;

public class studentApp {
    public static void main(String[] args) {

        person p = new person("chaiwat thongmee",24,"Male");

        student std1 = new student("chawat thong",25,"Female");

        System.out.println(p.toString());
        System.out.println(std1.toString());

        std1.setSid("361211760040");
        std1.setMajor("MIT");


        System.out.println(std1.toString());

        System.out.println(std1.getName());



    }//main
}//class
