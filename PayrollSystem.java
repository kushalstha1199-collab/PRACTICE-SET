import java.io.*;
import java.util.*;

public class PayrollSystem {

    public static void main(String[] args) {

        ArrayList<Employee> staff = new ArrayList<>();

        staff.add(new FullTimeEmployee("Ram", 50000));
        staff.add(new Contractor("Sita", 500, 40));

        try {
            FileWriter fw = new FileWriter("payroll_report.txt");

            for (Employee e : staff) {
                fw.write(e.name + " " + e.calculatePay() + "\n");
            }

            fw.close();
            System.out.println("Payroll file created successfully.");

        } catch (IOException e) {
            System.out.println("Error writing file.");
        }
    }
}