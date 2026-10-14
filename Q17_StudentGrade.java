class StudentGrade {
    String name;
    int marks;
    static int passingMarks = 40;

    StudentGrade(String name, int marks) { this.name = name; this.marks = marks; }

    void displayGrade() {
        String grade;
        if (marks < 0 || marks > 100) grade = "Invalid marks";
        else if (marks >= 90) grade = "A";
        else if (marks >= 75) grade = "B";
        else if (marks >= 60) grade = "C";
        else if (marks >= passingMarks) grade = "D";
        else grade = "F (Fail)";
        System.out.println(name + " grade: " + grade);
    }

    public static void main(String[] args) {
        new StudentGrade("Aman", 82).displayGrade();
    }
}
