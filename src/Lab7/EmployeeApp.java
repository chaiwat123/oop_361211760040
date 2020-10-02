package Lab7;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many you employee?: ");
        int emp = sc.nextInt();
        ArrayList<Employee> myEmp = new ArrayList<Employee>();

        //input employee data
        myEmp = inputEmpData (myEmp,emp);

        //display employee data
        displayEmpData(myEmp);


    }//main

    private static void displayEmpData(ArrayList<Employee> myEmp) {
        System.out.println("Your employee info below:");
        for (Employee e: myEmp) {
            System.out.println(e.toString());

        }//for
    }//displayEmpData

    private static ArrayList<Employee> inputEmpData(ArrayList<Employee> myEmp, int emp) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee data below:");
        for (int i = 0; i < emp ; i++) {
            ///input
            System.out.print("Enter Employee name:");
            String name = sc.nextLine();
            System.out.print("Enter Employee age:");
            String age = sc.nextLine();
            System.out.print("Enter Employee designation:");
            String designation = sc.nextLine();
            System.out.print("Enter Employee salary:");
            String salary = sc.nextLine();
            myEmp.add(new Employee(name,Integer.parseInt(age),designation,Double.parseDouble(salary)));

        }//for
    return myEmp;
    }//inputEmpData

}//class
