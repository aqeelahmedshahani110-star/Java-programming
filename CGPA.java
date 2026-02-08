public class CGPA{
    private double totalGradePoints;
    private int totalCredits;

    public CGPA() {
        this.totalGradePoints = 0.0;
        this.totalCredits = 0;
    }

    public void addCourse(double gradePoint, int credits) {
        this.totalGradePoints += gradePoint * credits;
        this.totalCredits += credits;
    }

    public double calculateCGPA() {
        if (totalCredits == 0) {
            return 0.0; // Avoid division by zero
        }
        return totalGradePoints / totalCredits;
    }

    public static void main(String[] args) {
        CGPA cgpaCalculator = new CGPA();
        cgpaCalculator.addCourse(3.5, 3); // Course 1: 3.5 GPA, 3 credits
        cgpaCalculator.addCourse(4.0, 4); // Course 2: 4.0 GPA, 4 credits
        cgpaCalculator.addCourse(2.8, 2); // Course 3: 2.8 GPA, 2 credits

        double cgpa = cgpaCalculator.calculateCGPA();
        System.out.printf("Calculated CGPA: %.2f%n", cgpa);
    }
}