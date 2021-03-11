package Banks;



public class Dev_Account extends  Dev_MenuOption {
public Dev_Account(long no, String name, 
    char type, double bal) {
        acNo = no;
        acHolderName = name;
        acType = type;
        acBal = bal;
    }
    public long getAcNo() {
        return acNo;
    }
    public String getAcHolder() {
        return acHolderName;
    }
    public char getAcType() {
        return acType;
    }
    public double getAcBal() {
        return acBal;
    }
    public void deposit(double amt) {
        acBal += amt;
    }
    public boolean withdraw(double amt) {
        if (acBal < amt)
            return false;
        acBal -= amt;
        return true;
    }
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





