class Person {
    String name;
    int age;
    static String country = "India";

    Person(String name, int age) { this.name = name; this.age = age; }

    void checkVotingEligibility() {
        boolean eligible = age >= 18;
        String result = eligible ? "Eligible to vote" : "Not eligible to vote";
        System.out.println(name + " (" + country + "): " + result);
    }

    public static void main(String[] args) {
        new Person("Riya", 19).checkVotingEligibility();
    }
}
