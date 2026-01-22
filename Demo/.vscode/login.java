//package Demo..vscode;

public class login {
   public static void main(String[] args) {
       String username = "Sabir Ali";
         String password = "password123";
         int enteredPassword = 123456;
         String enteredname = "Sabir Ali";
         boolean login = password.equals(enteredname) && password.equals(enteredPassword);
            System.out.println("you are successfully logged in: " + login);
            System.out.println("Welcome " + username);
            System.out.println("Your password is: " + password);
            System.out.println("Your entered password is: " + enteredPassword);
            


   }
}
