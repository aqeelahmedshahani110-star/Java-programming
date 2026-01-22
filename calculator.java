public class calculator {
    int add(int var1, int var2){
        return var1 + var2;
    }
       public static void main(String[] args) {
           calculator mycalc = new calculator();
           int sum = mycalc.add(200,400);
           System.out.println(sum);
       }
}
            