public class calculator2 {
    float divide(float var1, float var2){
        return  var1 / var2;
    }
           public static void main(String[] args) {
               calculator2 myCalc = new calculator2();
               float divide = myCalc.divide(400f,500f);
               System.out.println(divide);
           }
}
