package backend_program;
import java.io.*;
import java.util.*;
public class Main {
    
    public static void main(String[] args){
        BankAccount newAccount = new BankAccount();

        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int accountNumber = 100000000 + random.nextInt(900000000);

        System.out.println("Please enter your name");
        String name = input.nextLine();
        newAccount.setName(name);

        System.out.println("Please enter your email address");
        String email = input.nextLine();
        newAccount.setEmail(email);

        System.out.println("Please enter your phone number");
        String phoneNumber = input.nextLine();
        newAccount.setPhoneNumber(phoneNumber);

        System.out.println("Thank you... we are generating your account now");

        newAccount.setAccountNumber(accountNumber);
        System.out.println("Thank you for waiting. Your new account number is: " + newAccount.getAccountNumber());

        boolean menu = true;
        while(menu == true){
            System.out.println("What would you like to do? (D)eposit, (W)ithdraw, (E)xit");
            String choice = input.nextLine();
            switch (choice) {
                case "D":
                    newAccount.balance += depositMoney(input);
                    continue;

                case "W":
                    //newAccount.balance -= withdrawMoney(input);
                    continue;
                
                case "E":
                    break;
                
                default:
                    System.out.println("I'm sorry, that option is invalid. Please try again.");
            }
        }
        

    }

    static double depositMoney(Scanner input) {
        // boolean correctPin = false;
        // System.out.println("Please enter your account number: ");
        // String customerAccountNumber = input.nextLine();

        // while(correctPin == false){
        //     System.out.println("Please enter the pin: ");
        //     int enteredPin = input.nextInt();

        //     checkPin(correctPin, enteredPin, pin);
        // }
        
        System.out.println("How much would you like to deposit? ");
        double depositAmount = input.nextInt();

        return depositAmount;

    }

    static void checkPin(boolean correctPin, int enteredPin, int pin) {

        if (enteredPin != pin){  
            System.out.print("Sorry, that was not the correct pin. Please try again");
        }
        else {
            System.out.println("Thank you, we have verified your account with the pin you entered");
            correctPin = true;
        }
    }
}
