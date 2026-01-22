public class task2 {
   public static void main(String[] args) {
       int oop = 95;
         int cs = 85;
       int is = 55;
       int ise = 60;
       int obtainedmarks = oop + cs + is + ise;
         int totalmarks = 400;
            float percentage = (obtainedmarks / (float)totalmarks) * 100;
            System.out.println("student name: Aqeel Shahani"); 
             System.out.println("oop marks: " + oop);
              System.out.println("cs marks: " + cs);
               System.out.println("is marks: " + is);
                System.out.println("ise marks: " + ise);
                    System.out.println("obtained marks: " + obtainedmarks);
                    System.out.println("total marks: " + totalmarks);
                    System.out.println("percentage: " + percentage + "%");
                    System.out.println("yor grade is A: " + (percentage >= 40));
   }
}
