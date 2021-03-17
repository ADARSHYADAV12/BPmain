/**
 * Main menu class
 * TESTING FINAL PROJECT
 * Created by Adarsh Divyansh Kanishk Lakshay Priyanshu Rishi Udit
 */
package TestBank;
import java.io.*;
//import java.util.*;
//import java.util.Random;
//import bankingDevelop.BankingApplication;
public class Dev_MainMenu {
    long acNo;
    String acHolderName;
    char acType; // 'S' for saving, 'C' for current
    double acBal;
    final int TOTAL_ACCTS_LIMIT = 10;
    Dev_Account[] accts;
    int acCount;
    /**
     * Method to create and run main menu
     */
    public Dev_MainMenu() {
        accts = new Dev_Account[TOTAL_ACCTS_LIMIT];
        acCount = 0;
    }
    public String name;
    public String gender;
    public String dob;
    public String address;
    public String city;
    public String state;
    public int pin;
    public long mobileNo;
    public String email;
    public String password;
    static char choice;
    public int date;
    public int month;
    public int year;
    public int customerId;
    int ch;
    public String cDetails;
    // ArrayList <Customer> customer =new ArrayList<Customer>();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    /**
     * 
     * @throws Exception for unforseen emergensies
     */
    public void MainMenu() throws Exception {
        Dev_MenuOption de = new Dev_MenuOption();
        // ankDevTest lo = new bankDevTest();
        // String cont;
        int m;
        do {
            System.out.println("Press 1 to Add New Customer");
            System.out.println("Press 2 to Edit a Customer");
            System.out.println("Press 3 for Accounts related procedures");
            System.out.println("Press 4 to see all Customer details");
            System.out.println("Press 0 to log out and go back to login screen ");
            m = Integer.parseInt(br.readLine());
            switch (m) {
            case 0:
                BankingApplication.main(null);
                break;
            case 1:
                de.addCustomer();
                de.addedCustomerDetails();
                break;
            case 2:
                de.editCustomers();
                break;
            case 3:
                do {
                    System.out.println("Main Menu");
                    System.out.println("1. Open New Account");
                    System.out.println("2. Deposit Amount");
                    System.out.println("3. Withdraw Amount");
                    System.out.println("4. Check Balance");
                    System.out.println("5. List All Accounts");
                    System.out.println("6. Exit");
                    System.out.println("Make Your Choice (1-6): ");
                    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                    ch = Integer.parseInt(in.readLine());
                    System.out.println();
                    switch (ch) {
                    case 1:
                        de.openAccount();
                        break;
                    case 2:
                        de.makeDeposit();
                        break;
                    case 3:
                        de.makeWithdrawal();
                        break;
                    case 4:
                        de.balanceEnquiry();
                        break;
                    case 5:
                        de.displayAllAccounts();
                        break;
                    case 6:
                        break;
                    default:
                        System.out.println("Incorrect choice!!!");
                    }
                } while (ch != 6);
                break;
            case 4:
                de.allCustomer();
                break;
            default:
                break;
            }
        } while (m != 0);
    }
}
