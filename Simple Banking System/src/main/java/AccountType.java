public enum AccountType {
    SAVING(500),CURRENT(250);
    private final double defaultBalance;
    AccountType(double defaultBalance) {
    this.defaultBalance = defaultBalance;
    }
    public double getDefaultBalance() {
        return defaultBalance;
    }
}
