public class ArithmaticOperator {
        public static void main(String[] args) {
         //   int a =5, b = 10, c;
         //   c = a + b;                                             
          //  System.out.println("Addition: " +c);
          //  c = a - b;
          //  System.out.println("Subtraction: " +c);
          //  c = a * b;
          //  System.out.println("Multiplication: " +c);
          //  c = a / b;
          //  System.out.println("Division: " +c);
          //  c = a % b;
          //  System.out.println("Modulus: " +c);


                  int a = 100, b = 50, c = 30;
                  a +=30;
                  b *= 100;
                  c /= a * b;
                  c %= 50;

                  System.out.println("a = " +a);
                  System.out.println("b = " +b);
                  System.out.println("c = " +c);
        }
}
