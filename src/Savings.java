public class Savings extends Account {

    // List properties specific to Saving
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;

    // Constructor to initialize Saving account properties
    public Savings(String name, String SSN, double initDeposit) {
        super(name, SSN, initDeposit);
        accountNumber = "1" + accountNumber;

        // Create Safety Deposit Box
        setSafetyDepositBox();
    }


    // List any methods specific to Saving
    private void setSafetyDepositBox() {
        this.safetyDepositBoxID = (int) (Math.random() * Math.pow(10,3));
        this.safetyDepositBoxKey = (int) (Math.random() * Math.pow(10,4));
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.printf(" Your SAVINGS account features: \n Safety Deposit Box ID: %d\n Safety Deposit Box Key: %d\n", safetyDepositBoxID, safetyDepositBoxKey);
    }

    @Override
    public void setRate() {
        rate = getBaseRate() - .25;
    }
}
