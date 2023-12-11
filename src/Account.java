// can't create objects from abstract class, but children can. (i.e. Account acc1 = new Account() --> WILL ERROR)
public abstract class Account implements IBaseRate {
    // List common properties for savings and checking accounts
    private String name;
    private String SSN;
    private double balance;
    private static int index = 10000; // unique because it is static.
    protected String accountNumber;
    protected double rate;
    
    // Constructor to set base properties and initialize the account
    public Account(String name, String SSN, double initDeposit) {
        this.name = name;
        this.SSN = SSN;
        this.balance = initDeposit;

        // SET ACCOUNT NUMBER
        this.accountNumber = setAccountNumber();

        setRate();
    }
    
    // Method to set account number - called in constructor
    private String setAccountNumber() {
        String lastTwoOfSSN = SSN.substring(SSN.length() - 2);
        int uniqueID = ++index;
        int randomNumber = (int) (Math.random() * Math.pow(10, 3));
        return lastTwoOfSSN + uniqueID + randomNumber;
    }

    // Compound Interest
    public void compound() {
        double accruedInterest = balance * (rate / 100);
        System.out.println("Accrued Interest: $" + accruedInterest);
        printBalance();
    }

    // Abstract method to set rate (interest rate from IBaseRate interface)
    public abstract void setRate();

    // COMMON METHODS - Transactions
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Depositing $" + amount);
        printBalance();
    }

    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawing $" + amount);
        printBalance();
    }

    public void transfer(String toWhere, double amount) {
        balance -= amount;
        System.out.println("Transferring $" + amount + " to " + toWhere);
        printBalance();
    }

    public void printBalance() {
        System.out.println("Your balance is now: $" + balance);
    }

    // toString (not overriding toString on parent object)
    public void showInfo() {
        System.out.println(
            "NAME: " + name +
            "\nACCOUNT NUMBER: " + accountNumber + 
            "\nBALANCE: $" + balance + 
            "\nRATE: " + rate + "%"
        );
    }
    
}
