package myproject;
import java.util.Scanner;
class BankAccount {
 private double balance;
 public BankAccount(double initialBalance) {
     balance = initialBalance;
 }
 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println("Amount deposited successfully.");
     } else {
         System.out.println("Invalid deposit amount.");
     }
 }
 public void withdraw(double amount) {
     if (amount <= balance && amount > 0) {
         balance -= amount;
         System.out.println("Withdrawal successful.");
     } else {
         System.out.println("Insufficient balance or invalid amount.");
     }
 }
 public double getBalance() {
     return balance;
 }
}
class ATM {
 private BankAccount account;
 public ATM(BankAccount account) {
     this.account = account;
 }
 public void showMenu() {
     Scanner sc = new Scanner(System.in);
     int choice;
     do {
         System.out.println("\n===== ATM MENU =====");
         System.out.println("1. Check Balance");
         System.out.println("2. Deposit");
         System.out.println("3. Withdraw");
         System.out.println("4. Exit");
         System.out.print("Enter your choice: ");
         choice = sc.nextInt();
         switch (choice) {
             case 1:
                 System.out.println("Current Balance: " + account.getBalance());
                 break;
             case 2:
                 System.out.print("Enter amount to deposit: ");
                 double depositAmount = sc.nextDouble();
                 account.deposit(depositAmount);
                 break;
             case 3:
                 System.out.print("Enter amount to withdraw: ");
                 double withdrawAmount = sc.nextDouble();
                 account.withdraw(withdrawAmount);
                 break;
             case 4:
                 System.out.println("Thank you for using ATM!");
                 break;
             default:
                 System.out.println("Invalid choice. Try again.");
         }
     } while (choice != 4);
     sc.close();
 }
}
public class Atminterface {
 public static void main(String[] args) {
     BankAccount userAccount = new BankAccount(1300);
     ATM atm = new ATM(userAccount);
     atm.showMenu();
 }
}