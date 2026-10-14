class Employee {
    int empId;
    double salary;
    static String companyName = "ABC Pvt. Ltd.";

    Employee(int empId, double salary) {
        this.empId = empId;
        this.salary = salary;
    }

    void display() {
        String details = "Employee ID: " + empId + ", Salary: " + salary
                + ", Company: " + companyName;
        System.out.println(details);
    }

    public static void main(String[] args) {
        Employee e = new Employee(101, 35000);
        e.display();
    }
}
