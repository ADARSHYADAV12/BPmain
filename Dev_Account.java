/**
 * Class for types of accounts
 * TESTING FINAL PROJECT
 * Created by Divyansh Kanishk Adarsh Lakshay Priyanshu Rishi Udit
 */
package TestBank;
public class Dev_Account extends  Dev_MenuOption {
    /**
     * 
     * @param no for account number
     * @param name for customer name
     * @param type for account type
     * @param bal for balance 
     */    
    public Dev_Account(long no, String name, 
            char type, double bal) {
                acNo = no;
                acHolderName = name;
                acType = type;
                acBal = bal;
            }
            /**
             * 
             * @return returns the Account number
             */
            public long getAcNo() {
                return acNo;
            }
            /**
             * 
             * @return returns account holder name
             */
            public String getAcHolder() {
                return acHolderName;
            }
            /**
             * 
             * @return returns account type
             */
            public char getAcType() {
                return acType;
            }
            /**
             * 
             * @return returns account balance
             */
            public double getAcBal() {
                return acBal;
            }
            /**
             * function to create a deposit
             * @param amt amount to be added
             */
            public void deposit(double amt) {
                acBal += amt;
            }
            /**
             * 
             * @param amt amount to be withdrawn
             * @return returns state of transaction (Either true or false)
             */
            public boolean withdraw(double amt) {
                if (acBal < amt)
                    return false;
                acBal -= amt;
                return true;
            }
            /**
             * To display all the account details
             */
            public void displayAcDetails() {
                System.out.println("Account No. : " + acNo);
                System.out.println("Account Holder Name : " + acHolderName);
                if(acType=='S'||acType=='s')
                {
                    System.out.println("Type of Account : Saving");
                }
                else if(acType=='C'||acType=='c')
                {
                    System.out.println("Type of Account : Current");
                }
                
                System.out.println("Balance Amount : " + acBal);
            }
}
