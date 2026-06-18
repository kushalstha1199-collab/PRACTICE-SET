import java.io.*;
import java.util.*;

abstract class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    abstract double calculatePay();
}

class FullTimeEmployee extends Employee {
    double salary;

    FullTimeEmployee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    double calculatePay() {
        return salary;
    }
}
