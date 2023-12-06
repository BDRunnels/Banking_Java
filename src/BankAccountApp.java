import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
    public static void main(String[] args) {
        // Data structure to hold new accounts (Account because Savings & Checking IS-A to Account, but if they were of type Savings, Checking would not fall into that)
        List<Account> accounts = new LinkedList<Account>();
        
        // Read a CSV file and create new accounts based on that data
        String file = "/Users/bdrunnels/downloads/NewBankAccounts.csv";

        List<String[]> newCustomers = utilities.CSV.read(file);

        
        for ( String[] customerField : newCustomers) {
            System.out.println("-".repeat(30));
            String name = customerField[0];
            String SSN = customerField[1];
            String accountType = customerField[2];
            double initDeposit = Double.parseDouble(customerField[3]);
            // System.out.println(name + " " + SSN + " " + accountType + " " + initDeposit);

            if (accountType.equalsIgnoreCase("Savings")) {

                accounts.add(new Savings(name, SSN, initDeposit));

            } else if (accountType.equalsIgnoreCase("Checking")) {

                accounts.add(new Checking(name, SSN, initDeposit));
                
            } else {
                System.out.println("ERROR READING ACCOUNT TYPE");
            }
        }


       for (Account acc : accounts) {
            System.out.println("-".repeat(30));
            acc.showInfo();
       }



        // UNIT TESTING
        // Checking chkAcc1 = new Checking("Tom Wilson", "1234567897", 1500);
        // Savings savAcc1 = new Savings("Rich Lowe", "213245789d59", 2500);

        // System.out.println("-".repeat(30));
        // chkAcc1.showInfo();
        // System.out.println("-".repeat(30));
        // savAcc1.showInfo();
        // System.out.println("-".repeat(30));

        // TESTING deposit / withdraw / transfer methods - OK
            // savAcc1.deposit(5000);
            // savAcc1.withdraw(200);
            // savAcc1.transfer("Brokerage", 3000);
        // TESTING compound - OK
            // savAcc1.compound();
            // savAcc1.showInfo();
            // System.out.println("-".repeat(30));
            // chkAcc1.compound();
            // chkAcc1.showInfo();
        
    }
}
