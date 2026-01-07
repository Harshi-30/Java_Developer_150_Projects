public class BankAccount {
    private String customerName;
    private int age;
    private String pan;
    private AccountType accountType;
    private double balance;
    private String accountNumber;
    private static int  sequence = 0;

    public BankAccount(String customerName, String pan, int age,AccountType accountType) {
        this.customerName = customerName;
        this.pan = pan;
        this.age = age;
        this.accountType=accountType;
        this.balance =accountType.getDefaultBalance();
        this.accountNumber = generateAccountNumber(accountType);
    }

    private String generateAccountNumber(AccountType type){
        return pan+type.name().charAt(0)+sequence++;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
