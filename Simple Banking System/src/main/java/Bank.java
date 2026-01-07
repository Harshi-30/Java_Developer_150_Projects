import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank {

    List<BankAccount> bankAccount = new ArrayList<>();

    public void createAccount(){
    Scanner src = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
    String customerName = src.nextLine();
        System.out.print("\n Enter Your age: ");
    int age = src.nextInt();
        src.nextLine();
        System.out.print("\n Enter Your PAN: ");
    String Pan = src.nextLine();
        System.out.println("Select Account Type: \n 1.Saving Account\n 2.Current Account\n Enter Your Choice");
        int choice = src.nextInt();
        AccountType accountType = switch (choice){
            case 1-> AccountType.SAVING;
            case 2-> AccountType.CURRENT;
            default->throw new IllegalArgumentException("Invalid account type.");
        };
        BankAccount bankAccount1 = new BankAccount(customerName,Pan,age,accountType );
        bankAccount.add(bankAccount1);
        System.out.println("Account is created and your account no is :"+bankAccount1.getAccountNumber());
    }

    public BankAccount findAccount(String accountNumber){
        for(BankAccount account : bankAccount){
            if(account.getAccountNumber().equals(accountNumber)) {
                System.out.println("Account is found");
                return account;
            }
        }
        System.out.println("Account is  not found");
        return null;
    }
    public void deposit(String accountNumber ,double money) {
        if (money <= 0) {
            System.out.println("Invalid money");
            return;
        }
        BankAccount account = findAccount(accountNumber);
        if(account == null){
            System.out.println("account not found");
        }else {
            double currentBalance = account.getBalance() + money;
            account.setBalance(currentBalance);
            System.out.println("Deposit successful and balance is :"+currentBalance);
        }

    }
    public void withdraw(String accountNumber ,double money){
        if(money <= 0){
            System.out.println("Invalid withdraw amount");
        }
        BankAccount account = findAccount(accountNumber);
        if(account == null){
            return;
        }
        double remainingAmount = account.getBalance()- money;
            if (remainingAmount >= account.getAccountType().getDefaultBalance()) {
                account.setBalance(remainingAmount);
                System.out.println("Amount is credited and money is "+remainingAmount);
            } else {
                System.out.println("Balance is not enough");
            }

    }

}

