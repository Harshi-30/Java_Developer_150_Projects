import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
            Bank bank = new Bank();

        while(true){
            System.out.println("Hello customer How should we help you\n If You want to\n " +
                    "Create account chose 1\n Deposit in account 2\n Withdraw form account 3 " +
                    "\nfor Exit return -1");

            int choice = src.nextInt();
            src.nextLine();
            if(choice == -1) break;

            if(choice == 1){
                bank.createAccount();
            }else if (choice == 2) {
                System.out.println("Enter Your Account Number");
                String accountNumber = src.nextLine();
                System.out.println("Enter money to deposit");
                double money = src.nextDouble();
                src.nextLine();
                System.out.println("Enter Type of account");
                bank.deposit(accountNumber,money);
            }else if (choice == 3) {
                System.out.println("Enter Your Account Number");
                String accountNumber = src.nextLine();
                System.out.println("Enter money to deposit");
                double money = src.nextDouble();
                src.nextLine();
                System.out.println("Enter Type of account");
                bank.withdraw(accountNumber,money);
            }else {
                System.out.println("Invalid choice");
            }
//            switch (choice){
//
//                case 1 ->bank.createAccount();
//                case 2 ->bank.deposit(accountNumber,2000);
//                case 3 ->bank.withdraw(accountNumber,600);
//                case 4 ->bank.findAccount("ind");
//                default -> System.out.println("Invalid choice");
//            }
        }

    }
}