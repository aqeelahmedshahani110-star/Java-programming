class Employee {
    int id;
    String name;
    int salary;

    public static void main(String[] args) {

        Employee e1 = new Employee();

        e1.id = 101;
        e1.name = "Ali";
        e1.salary = 30000;

        System.out.println("Employee ID: " + e1.id);
        System.out.println("Employee Name: " + e1.name);
        System.out.println("Employee Salary: " + e1.salary);
    }
}

