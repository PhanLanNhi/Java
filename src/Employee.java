class Employee {
    private int id;
    private String name;
    private int age;
    private String department;
    private String code;
    private double salary;

    public Employee(int id, String name, int age, String department, String code, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.code = code;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                ", code='" + code + '\'' +
                ", salary=" + salary +
                '}';
    }
}