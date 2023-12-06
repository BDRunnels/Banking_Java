public class Checking extends Account {
    // List properties specific to Checking
    private long debitCardNumber;
    private int debitCardPin;

    // Constructor to initialize Checking account properties
    public Checking(String name, String SSN, double initDeposit) {
        super(name, SSN, initDeposit);
        accountNumber = "2" + accountNumber;

        // Checking Account specifics
        setDebitCard();
    }
    // List any methods specific to Checking
    private void setDebitCard() {
        this.debitCardNumber = (long) (Math.random() * Math.pow(10, 12));
        this.debitCardPin = (int) (Math.random() * Math.pow(10,4));
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.printf(" Your CHECKING account features: \n Debit Card Number: %d\n Debit Card Pin: %d\n", debitCardNumber, debitCardPin);
    }

    @Override
    public void setRate() {
        rate = getBaseRate() * .15;
    }
}
