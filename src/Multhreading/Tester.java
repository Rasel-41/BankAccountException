package Multhreading;

public class Tester {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("ABC",100);
        try{
            bankAccount.deposit(50.00);
            bankAccount.withdraw(200.00);
            bankAccount.withdraw(50);
            bankAccount.deposit(-10.0);
        }
        catch (InsuffficientFundException e){
            System.out.println(e.getMessage());
        } catch (InvalidAmountException e) {
            throw new RuntimeException(e);
        }
        finally {
            System.out.println("Final balance : $"+bankAccount.getBalance());
            System.out.println("End of Transaction.");
        }
    }
}
