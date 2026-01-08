package Gun1.Example4;

public class BankAccountMain {
    static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.owner="Mert";
        BankAccount.interestRate=10;

        BankAccount account2 = new BankAccount();
        account2.owner="Bilal";

        System.out.println(account1.interestRate);
        System.out.println(account2.interestRate);

    }
}
