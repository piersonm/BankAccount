package backend_program;

public class BankAccount {
    String name, phoneNumber, email;
    double balance;
    int pin, accountNumber;

    public BankAccount(){

    }

    public void setContactInfo(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;

    }

    public String getName() {
        return this.name;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getEmail() {
        return this.name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public int getPin() {
        return this.pin;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setpin(int pin) {
        this.pin = pin;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
}
