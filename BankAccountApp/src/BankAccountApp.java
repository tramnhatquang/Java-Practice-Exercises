import utilities.CSV;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
    public static void main(String[] args) throws IOException {
        List<Account> accounts = new LinkedList<>();







        String file = "src/NewBankAccounts.csv";
        // Read a CSV file then create new accounts based on that data
        List<String[]> newAccountHolder = utilities.CSV.read(file);
        for (String[] accountHolder : newAccountHolder)
        {
            String name = accountHolder[0];
            String sSN = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
            if (accountType.equals("Savings"))
            {
                accounts.add(new Savings(name, sSN, initDeposit));
            } else if (accountType.equals("Checking"))
            {
                accounts.add(new Checking(name, sSN, initDeposit));
            }
            else
                System.out.println("ERROR READING  ACCOUNT TYPE");

        }

        for (Account acct: accounts) {
            System.out.println("\n***************");
            acct.showInfo();
        }
    }
}
