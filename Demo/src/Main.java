class Student {
    public String name;
    public int age;
    public double gpa;
    public String rollNo;
    public String department;

    public void display() {                  //void the method that returns nothing other words no value return.
        System.out.println("Name: " + name +
                           ", Age: " + age +
                           ", GPA: " + gpa +
                           ", Roll No: " + rollNo +
                           ", Department: " + department);
    }
}

public class Main {
    public static void main(String args[]) {

                                                      // 5 Objects    real word entity in programming /istance of class and represents actual data. 
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();

        s1.name = "fayaz";    s1.age = 19; s1.gpa = 3.2; s1.rollNo = "25SW068"; s1.department = "software engineering";
        s2.name = "Sabir ali"; s2.age =18; s2.gpa = 3.8; s2.rollNo = "25SW044"; s2.department = "software engineering";
        s3.name = "Arslan";  s3.age = 20; s3.gpa = 3.1; s3.rollNo = "25SW011"; s3.department = "software engineering";
        s4.name = "Aqeel";   s4.age = 19; s4.gpa = 3.9; s4.rollNo = "25SW117"; s4.department = "software engineering";
        s5.name = "Musawir";   s5.age = 15; s5.gpa = 3.5; s5.rollNo = "25Sw074"; s5.department = "software engineering";

                // Array of objects     array is a data structure that store the multiple  values of same data type in a single variable.
        Student[] arr = { s1, s2, s3, s4, s5 };

                 // Loop to print all objects  repeatation of code or program.
        for (int i = 0; i < arr.length; i++) {
            System.out.print((i + 1) + ". ");
            arr[i].display();
        }
    }
}
