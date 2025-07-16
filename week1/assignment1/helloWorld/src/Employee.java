import java.util.ArrayList;
import java.util.List;

public class EmployeeCRUD {
    static List<Employee> employees = new ArrayList<>();

    public static void addEmployee(Employee emp) {
        employees.add(emp);
    }

    public static void listEmployees() {
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }

    public static void updateEmployee(int id, String newName, String newDepartment) {
        for (Employee emp : employees) {
            if (emp.getId() == id) {
                emp.setName(newName);
                emp.setDepartment(newDepartment);
                return;
            }
        }
    }