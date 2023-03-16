package account;

public record AccountData(String accountHolder, int accountNumber) {
    public int getAccountNumber() {
        return this.accountNumber;
    }
    public String getAccountHolder() {
        return this.accountHolder;
    }
}
