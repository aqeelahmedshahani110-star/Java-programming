public class bank {
      public static void main(String[] args) {
           // String bankName = "UBL Bank";
           // String accountHolder = "Sabir ALi";
           // int accountNumber = 123456789;
//double balance = 1500.75;
    
          //  System.out.println("Bank Name: " + bankName);
          //  System.out.println("Account Holder: " + accountHolder);
           // System.out.println("Account Number: " + accountNumber);
          //  System.out.println("Balance: $" + balance);
            int balance = 2000;
            int withdrawAmount = 500;
            int currentBalance = balance - withdrawAmount;
            int pin =2436 ;
            int depositAmount = 800;
            currentBalance = currentBalance + depositAmount;
            int newbalance = currentBalance;
            System.out.println("New Balance: $" + newbalance);
            System.out.println("PIN: " + pin);
           System.out.println("Current Balance: $" + currentBalance);
           System.out.println("Withdraw Amount: $" + withdrawAmount);
           System.out.println("Deposit Amount: $" + depositAmount);
      }
}
