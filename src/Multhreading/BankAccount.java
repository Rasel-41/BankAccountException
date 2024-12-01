package Multhreading;

public class BankAccount {
    private String accountNumber;
    private double balance;
    public BankAccount(String accountNumber,double initialBalance){
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    public void deposit(double amount) throws InvalidAmountException{
        if(amount<=0) {
            throw new InvalidAmountException("Deposit amount must be greater than zero.");
        }
        balance+=amount;
        System.out.println("Depositing $ : "+amount);
        System.out.println("New Balance $: "+balance);
        }
        public void withdraw(double amount) throws InsuffficientFundException,InvalidAmountException {
            if (amount <= 0) {
                throw new InvalidAmountException("Withdraw amount must be zero.");

            }
            if (amount > balance) {
                throw new InsuffficientFundException("Insufficient funds!");
            }
            balance-=amount;
            System.out.println("Withdrawing $ : "+amount);
            System.out.println("New balance $ : "+balance);
        }

    public double getBalance() {
        return balance;
    }
}

