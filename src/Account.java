public class Account {

    private String id;
    private String name;
    private double balance;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0;
    }

    Account(String id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getBalance() {
        return balance;
    }

    public double credit(double amount) {

        double credit = amount + getBalance();

        return amount + getBalance();
    }

    public boolean debit(double amount) {

        if (amount < this.balance) {
            this.balance = amount - this.balance;
            return true;
        } else {
            System.out.println("Amount exceeded");
            return false;
        }
    }
    public void transferTo(Account another,double amount){

        if(debit(amount)==true){

            another.balance = amount + another.balance;

            System.out.println("Transfer completed");
        }else{

            System.out.println("Amount exceeded");
        }

    }
    public String accountDetails() {
        return this.name + ", the current balance in your account: " + this.id + " is $" + this.balance;
    }
}

