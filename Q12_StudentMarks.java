class StudentMarks {
    int marks1, marks2, marks3;
    static String universityName = "ABC University";

    StudentMarks(int a, int b, int c) {
        marks1 = a; marks2 = b; marks3 = c;
    }

    void displayAverage() {
        double total = marks1 + marks2 + marks3;
        double average = total / 3.0;
        System.out.println("University: " + universityName);
        System.out.println("Average marks: " + average);
    }

    public static void main(String[] args) {
        new StudentMarks(80, 75, 90).displayAverage();
    }
}
