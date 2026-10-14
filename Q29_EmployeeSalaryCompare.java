class Employee {
    String name;
    double salary;
    static String organization = "ABC Organization";

    Employee(String name, double salary) {
        this.name = name; this.salary = salary;
    }

    static void compareSalaries(Employee e1, Employee e2) {
        String result;
        if (e1.salary > e2.salary) result = e1.name + " earns more.";
        else if (e2.salary > e1.salary) result = e2.name + " earns more.";
        else result = "Both employees earn the same salary.";
        System.out.println(organization + ": " + result);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Aman", 40000);
        Employee e2 = new Employee("Riya", 45000);
        compareSalaries(e1, e2);
    }
}
