import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Employee> employees = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Khởi tạo sẵn 10 nhân viên
        initializeEmployees();

        boolean continueProgram = true;
        while (continueProgram) {
            System.out.println("Chọn một chức năng:");
            System.out.println("1. Hiển thị danh sách nhân viên");
            System.out.println("2. Thêm nhân viên mới");
            System.out.println("3. Xoá nhân viên");
            System.out.println("4. Thoát");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    displayEmployees();
                    break;
                case 2:
                    addEmployee();
                    break;
                case 3:
                    removeEmployee();
                    break;
                case 4:
                    continueProgram = false;
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
    private static void initializeEmployees() {
        employees.add(new Employee(1, "Nhi 2ka1", 30, "IT", "E101", 50000));
        employees.add(new Employee(2, "Nhi 2ka2", 28, "HR", "E102", 45000));
        employees.add(new Employee(3, "Nhi 2ka3", 35, "Finance", "E103", 60000));
        employees.add(new Employee(4, "Nhi 2ka4", 32, "Marketing", "E104", 55000));
        employees.add(new Employee(5, "Nhi 2ka5", 29, "IT", "E105", 52000));
        employees.add(new Employee(6, "Nhi 2ka6", 27, "HR", "E106", 47000));
        employees.add(new Employee(7, "Nhi 2ka7", 34, "Finance", "E107", 58000));
        employees.add(new Employee(8, "Nhi 2ka8", 31, "Marketing", "E108", 53000));
        employees.add(new Employee(9, "Nhi 2ka9", 33, "IT", "E109", 56000));
        employees.add(new Employee(10, "Nhi 2ka10", 26, "HR", "E110", 48000));
    }

    private static void displayEmployees() {
        System.out.println("Danh sách nhân viên:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private static void addEmployee() {
        System.out.println("Nhập thông tin nhân viên mới:");
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Department: ");
        String department = scanner.nextLine();
        System.out.print("Code: ");
        String code = scanner.nextLine();
        System.out.print("Salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine();

        Employee newEmployee = new Employee(id, name, age, department, code, salary);
        employees.add(newEmployee);
        System.out.println("Nhân viên mới đã được thêm.");
    }

    private static void removeEmployee() {
        System.out.print("Nhập ID của nhân viên cần xoá: ");
        int idToRemove = scanner.nextInt();
        scanner.nextLine();

        boolean found = false;
        for (Employee employee : employees) {
            if (employee.getId() == idToRemove) {
                employees.remove(employee);
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Nhân viên đã được xoá.");
        } else {
            System.out.println("Không tìm thấy nhân viên có ID tương ứng.");
        }
    }

}