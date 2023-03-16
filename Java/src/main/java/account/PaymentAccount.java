package account;

/**
 * Refactor Exercise 2: Account
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22)
 */
public abstract class PaymentAccount {

    // private final String accountHolder;
    // private final int accountNumber;
    private AccountData accountData;

    public PaymentAccount(String accountHolder, int accountNumber) {
        // this.accountHolder = accountHolder;
        // this.accountNumber = accountNumber;
        this.accountData = new AccountData(accountHolder, accountNumber);
    }

    public abstract boolean pay(int amount);

    /*
    public int getAccountNumber() {
        return this.accountNumber;
    }

    public String getAccountHolder() {
        return this.accountHolder;
    }
     */
    public AccountData getAccountData() {
        return this.accountData;
    }
}
