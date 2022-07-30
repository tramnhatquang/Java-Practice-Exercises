public abstract class Account implements IRate{

    // List common properties for savings and checking accounts
    private String name;
    private String sSN;
    private double balance;
    protected double rate;
    protected String accountNumber;
    private static int index = 10000;
    // Constructor to set base properties, and initialize the account
    public Account(String name,  String sSN, double initDeposit) {
        this.name = name;
        this.sSN = sSN;
        this.balance = initDeposit;


        // set account number
        this.accountNumber = setAccountNumber();
        index++;
        setRate();
    }
    public abstract void setRate();
    private String setAccountNumber() {
        String lastTwoOfSSN = sSN.substring(sSN.length() - 2);
        int uniqueID = index;
        int randomNumber = (int) (Math.random() * Math.pow(10, 3));
        return lastTwoOfSSN + index + randomNumber;

    }

    public  void compound() {
        double accruedInterest = balance * (rate/ 100);
        balance += accruedInterest;
        System.out.println("Accrued Interest: $" + accruedInterest);
        printBalance();

    }
    // List common methods - transactions

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Depositing $: " + amount);
    }

    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawing $: " + amount);
    }

    public void transfer(String toWhere, double amount) {
        balance -= amount;
        System.out.println("Transferring $" + amount + " to " + toWhere);
        printBalance();
    }

    public void printBalance() {
        System.out.println("Your balance is now: $" + balance);
    }

    public void showInfo() {
        System.out.println(
                "NAME: " + this.name +
                        "\nACCOUNT NUMBER: " + this.accountNumber +
                        "\nBALANCE: " + this.balance +
                        "\nRATE: " + this.rate + "%"

        );
    }
}
