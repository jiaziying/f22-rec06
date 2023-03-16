package account;

/**
 * Refactor Exercise 2: Account
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22)
 */
// TODO: Think about what can be a issue of the Student class?
public class Student {

    private double gpa;
    private final PaymentAccount paymentAccount;

    public Student(PaymentAccount paymentAccount, double gpa) {
        this.gpa = gpa;
        this.paymentAccount = paymentAccount;
    }

    public void updateGPA(double gpa) {
        this.gpa = gpa;
    }

    public double getGPA() {
        return this.gpa;
    }

    public boolean pay(int amount) {
        return paymentAccount.pay(amount);
    }
}
