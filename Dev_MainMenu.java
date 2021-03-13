import java.io.*;
import java.util.*;
public class Dev_MenuOption extends Dev_MainMenu{
    LinkedHashMap<Integer, String > lhm=new LinkedHashMap<Integer, String>();
    Iterator<Map.Entry<Integer, String>> itr = lhm.entrySet().iterator();
    boolean cusPresent=false;
    
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public void addCustomer() throws Exception{
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list1 = getRandomNonRepeatingIntegers1(1, 90000, 99999);
        customerId=(list1.get(0));
        System.out.println("\tADD NEW CUSTOMER");
        System.out.println("Enter the following details");
        System.out.println();
        do {
        System.out.println("Enter Cutomer Name :");
        name=br.readLine();
        System.out.println("Choose Gender : ");
        System.out.println("> M for Male");
        System.out.println("> F for Female");
        System.out.println("> O for Others");
        String ginput=br.readLine();
        char in=ginput.charAt(0);
        if(in=='m'||in=='M')
        {
            gender="Male";
        }
        else if(in=='f'||in=='F')
        {
            gender="Female";
        }
        else if(in=='o'||in=='O')
        {
            gender="Others";
        }
        else
        {
            System.out.println("Please Give Valid input");
        }
        System.out.println("Enter Date of Birth (dd/mm/yyyy) : ");
        System.out.println("Date(dd) : ");
        date=Integer.parseInt(br.readLine());
        System.out.println("Month(mm) : ");
        month=Integer.parseInt(br.readLine());
        System.out.println("Year(yyyy) : ");
        year=Integer.parseInt(br.readLine());
        dob=date+"/"+month+"/"+year;
        
        
        
        System.out.println("Enter Address : ");
        address=br.readLine();
        System.out.println("Enter City : ");
        city=br.readLine();
        System.out.println("Enter State : ");
        state=br.readLine();
        do {
        System.out.println("Enter 6 digit PIN : ");
        pin=Integer.parseInt(br.readLine());
        if(pin<100000||pin>999999)
        {
            System.out.println("Please enter valid PIN");
        }
        }while(pin<100000||pin>999999);
        System.out.println("Enter Mobile No. : ");
        mobileNo=Long.parseLong(br.readLine());
        System.out.println("Enter E-mail in valid format(abc@xyz.com) : ");
        email=br.readLine();
        boolean contain= false;
        do {
            if(email.contains("@")&&email.contains("."))
            {
                contain=true;
            }
            else
            {
                System.out.println("Invalid email format");
                System.out.println("Enter E-mail in valid format(abc@xyz.com) : ");
                email=br.readLine();    
            }
        }while(contain==false);
        
        System.out.println("Enter Password : ");
        password=br.readLine();
        
        System.out.println("Press 'S' to submit");
        System.out.println("Press 'R' to Reset");
        String decision=br.readLine();
        choice=decision.charAt(0);
        }while(choice=='r'||choice=='R');
        System.out.println("\tCustomer Registered Successfully!!!");
        cDetails=name+"\t"+gender+"\t"+dob+"\t"+address+"\t"+city+"\t"+state+"\t"+pin+"\t"+mobileNo+"\t"+email;
        lhm.put(customerId, cDetails);
    
    }
    


    
public void allCustomer() {
    //System.out.println(lhm);
    System.out.println();
    for(Map.Entry<Integer, String> entry:lhm.entrySet() )
    {
        System.out.println(entry.getKey()+"\t"+entry.getValue());
    }
    
    
}   
    
    
    
    
    


    public void addedCustomerDetails()
    {
        System.out.println("Registred Customer Details are as follows :");
        System.out.println("\tCustomer ID : "+customerId);
        System.out.println("Customer Name :\t"+name);
        System.out.println("Gender        :\t"+gender);
        System.out.println("Birthdate     :\t"+dob);
        System.out.println("Address       :\t"+address);
        System.out.println("City          :\t"+city);
        System.out.println("State         :\t"+state);
        System.out.println("PIN           :\t"+pin);
        System.out.println("Mobile No.    :\t"+mobileNo);
        System.out.println("Email         :\t"+email);
    }
    
    
    
    
    
    
    
    
    
        
    
    public void editCustomers() throws Exception{
        int epin;
        long emobileNo;
        char choice;
        int edate;
        int emonth;
        int eyear;
        String []at;
        
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
           System.out.println("Following is/are the available Custumers :");
           System.out.println(lhm.keySet());
           System.out.println("Enter the customer Id you want to edit :");
           int cusIn=Integer.parseInt(br.readLine());
           Iterator<Map.Entry<Integer, String>> itr = lhm.entrySet().iterator();
           boolean cusPresent=false;
           while(itr.hasNext())
           {
               Map.Entry<Integer, String> 
               entry 
               = itr.next(); 
           if(cusIn== entry.getKey())
           {
               cusPresent=true;
               String ed=lhm.get(cusIn);
               System.out.println(ed);
               at=ed.split("\t");
                int edit;
                do {
                System.out.println("What do you want to edit?");
                System.out.println("Press '1' to edit Customer Name");
                System.out.println("Press '2' to edit Gender");
                System.out.println("Press '3' to edit Date of Birth");
                System.out.println("Press '4' to edit Address(Address, City, State, PIN)");
                System.out.println("Press '5' to edit Mobile Number");
                System.out.println("Press '6' to edit E-mail");
                System.out.println("Press '0' to exit ");
                
                edit=Integer.parseInt(br.readLine());
                
                
                switch(edit)
                {
                    case 1 :
                            System.out.println("Enter the New Name");
                            at[0]=br.readLine();
                            break;
                    case 2 :
                        System.out.println("Enter the Gender");
                        System.out.println("> M for Male");
                        System.out.println("> F for Female");
                        System.out.println("> O for Others");
                        String ginput=br.readLine();
                        char in=ginput.charAt(0);
                        if(in=='m'||in=='M')
                        {
                            at[1]="Male";
                        }
                        else if(in=='f'||in=='F')
                        {
                            at[1]="Female";
                        }
                        else if(in=='o'||in=='O')
                        {
                            at[1]="Others";
                        }
                        else
                        {
                            System.out.println("Please Give Valid input");
                        }
                         break;
                    case 3 :
                             System.out.println("Enter new Date Of Birth");
                             System.out.println("Date(dd) : ");
                                 edate=Integer.parseInt(br.readLine());
                                System.out.println("Month(mm) : ");
                                 emonth=Integer.parseInt(br.readLine());
                                System.out.println("Year(yyyy) : ");
                                 eyear=Integer.parseInt(br.readLine());
                                at[2]=edate+"/"+emonth+"/"+eyear;
                                break;
                    case 4 :
                            System.out.println("What do you want to change in address?");
                            System.out.println("1) for Home Address");
                            System.out.println("2) for City ");
                            System.out.println("3) for State");
                            int qw=Integer.parseInt(br.readLine());
                            switch(qw)
                            {
                            case 1:
                                System.out.println("Enter New Address : ");
                                at[3]=br.readLine();
                                break;
                            case 2 :
                                System.out.println("Enter New Address : ");
                                at[3]=br.readLine();
                                System.out.println("Enter New City : ");
                                at[4]=br.readLine();
                                do {
                                    System.out.println("Enter 6 digit PIN : ");
                                epin=Integer.parseInt(br.readLine());
                                    if(epin<100000||epin>999999)
                                    {
                                        System.out.println("Please enter valid PIN");
                                    }
                                    }while(epin<100000||epin>999999);
                                String h=epin+"";
                                at[6]=h;
                                
                                    
                                break;
                            case 3 :
                                System.out.println("Enter New Address : ");
                                at[3]=br.readLine();
                                System.out.println("Enter New City : ");
                                at[4]=br.readLine();
                                do {
                                    System.out.println("Enter 6 digit PIN : ");
                                    epin=Integer.parseInt(br.readLine());
                                    if(epin<100000||epin>999999)
                                    {
                                        System.out.println("Please enter valid PIN");
                                    }
                                    }while(epin<100000||epin>999999);
                                String p=epin+"";
                                at[6]=p;
                                
                                    
                                System.out.println("Enter New State : ");
                                at[5]=br.readLine();
                                break;
                            default :
                                break;
                                
                            }
                            break;
                    case 5 :
                        System.out.println("Enter New Mobile No. : ");
                        emobileNo=Long.parseLong(br.readLine());
                        String m=emobileNo+"";
                        at[7]=m;
                      break;
                    case 6 :
                        System.out.println("Enter E-mail in valid format(abc@xyz.com) : ");
                        at[8]=br.readLine();
                        boolean contain= false;
                        do {
                            if(at[8].contains("@")&&at[8].contains("."))
                            {
                                contain=true;
                            }
                            else
                            {
                                System.out.println("Invalid email format");
                                System.out.println("Enter E-mail in valid format(abc@xyz.com) : ");
                                at[8]=br.readLine();    
                            }
                        }while(contain==false);
                        break;
                        default :
                            break;
                            
                }
                
                }while(edit!=0);
                System.out.println("Edited Customer Details are as follows :");
                System.out.println("\tCustomer ID : "+cusIn);
                System.out.println("Customer Name :\t"+at[0]);
                System.out.println("Gender        :\t"+at[1]);
                System.out.println("Birthdate     :\t"+at[2]);
                System.out.println("Address       :\t"+at[3]);
                System.out.println("City          :\t"+at[4]);
                System.out.println("State         :\t"+at[5]);
                System.out.println("PIN           :\t"+at[6]);
                System.out.println("Mobile No.    :\t"+at[7]);
                System.out.println("Email         :\t"+at[8]);
            String update=at[0]+"\t"+at[1]+"\t"+at[2]+"\t"+at[3]+"\t"+at[4]+"\t"+at[5]+"\t"+at[6]+"\t"+at[7]+"\t"+at[8];
                lhm.replace(cusIn, update);
            
            
                      }
        
           }
           if(cusPresent==false)
           {
               System.out.println("Wrong ID");
           }
       
           }
    
    
    
    
    
    
    
    
   public  Dev_Account getAccount(long accNo) {
        Dev_Account acct = null;
        for (int i = 0; i < acCount; i++) {
            if (accts[i].getAcNo() == accNo) {
                acct = accts[i];
                break;
            }
        }
        return acct;
    }
   
   
   
   
   
   
   
   
   
   
   public void openAccount() {
       if (acCount == TOTAL_ACCTS_LIMIT) {
           System.out.println("Limit reached, can't create more than " + 
               TOTAL_ACCTS_LIMIT + " accounts");
           return;
       }
       Iterator<Map.Entry<Integer, String>> itr = lhm.entrySet().iterator();
    boolean cusPresent=false;
    
       System.out.println("Following is/are the available Custumers :");
       System.out.println(lhm.keySet());
       ArrayList<Integer> list = getRandomNonRepeatingIntegers(1, 90000, 99999);
       Scanner in = new Scanner(System.in);
       System.out.println("Enter Customer ID: ");
       int acNum = in.nextInt();
       
       while(itr.hasNext())
       {
           Map.Entry<Integer, String> 
           entry 
           = itr.next(); 
       if(acNum== entry.getKey())
       {
           cusPresent=true;
           long acNum1 =(list.get(0));
           in.nextLine();
           System.out.println("Enter Account Holder Name: ");
           String name = in.nextLine();
         //a[0] = in.nextLine();
           System.out.println("Enter Account Type (Savings(S)/Current(C)): ");
           char type = in.next().charAt(0);
           System.out.println("Enter Account Balance: ");
           double bal = in.nextDouble();
           
           if(bal>1000)
           {
                accts[acCount++] = new Dev_Account(acNum1, name, type, bal);
                Dev_Account acct = getAccount(acNum1);
                System.out.println("Account Opened Successfully\n");
                acct.displayAcDetails();
                
           }
           else
           {
               System.out.println("Intial deposite must be Rs. 1000 or more");
           }
       }
      
       }
       if(cusPresent==false)
       {
           System.out.println("Wrong ID");
       }
   }
   
   
   
   
   
   
   
   
   
   
   public static ArrayList<Integer> getRandomNonRepeatingIntegers(int size, int min, int max) {
       ArrayList<Integer> numbers = new ArrayList<Integer>();
       while (numbers.size() < size) {
           int random = getRandomInt(min, max);
           if (!numbers.contains(random)) {
               numbers.add(random);
           }
       }
       return numbers;
   }
   
   
   
   
   
   
   
   
   
   
   
   public static int getRandomInt(int min, int max) {
       Random random = new Random();
       return random.nextInt((max - min) + 1) + min;
   }
   
   
   
   
   
   
   public void balanceEnquiry() {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter Account Number: ");
       long acNum = in.nextLong();
       Dev_Account acct = getAccount(acNum);
       if (acct == null) {
           System.out.println("Sorry, Account not found\n");
       }
       else {
           acct.displayAcDetails();
       }
       
       System.out.println();
   }
   
   

    
    
   
   
   
   public void makeDeposit() {
       
       Scanner in = new Scanner(System.in);
       System.out.println("Enter Account Number: ");
       long acNum = in.nextLong();
       System.out.println("Enter Amount: ");
       double amt = in.nextDouble();
       Dev_Account acct = getAccount(acNum);
       if (acct == null) {
           System.out.println("Sorry, Account not found");
       }
       else {
           acct.deposit(amt);
           System.out.println("Deposit Successful");
           System.out.println("Updated Account Details");
        //   acct.displayAcDetails();
       }
       
       System.out.println();
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   public void makeWithdrawal() {
       
       Scanner in = new Scanner(System.in);
       System.out.println("Enter Account Number: ");
       long acNum = in.nextLong();
       System.out.println("Enter Amount: ");
       double amt = in.nextDouble();
       Dev_Account acct = getAccount(acNum);
       if (acct == null) {
           System.out.println("Sorry, Account not found");
       }
       else {
           if (acct.withdraw(amt)) {
               System.out.println("Withdrawal Successful");
               System.out.println("Updated Account Details");
           }
           else {
               System.out.println("Insufficient Balance!!!");
               System.out.println("Account Details");
           }
           acct.displayAcDetails();
       }
       
       System.out.println();
   }
   
   
   
   
   
   
   
   
   
   
  
   public void displayAllAccounts() {
       System.out.println("A/C No.\tNAME\tTYPE\tBALANCE");
       for (int i = 0; i < acCount; i++) {
           System.out.println(accts[i].getAcNo() + "\t" 
               + accts[i].getAcHolder() + "\t" + accts[i].getAcType() + "\t" 
               + accts[i].getAcBal());
       }
       System.out.println();
   }
   
   
   
   
   
   
   
   
    public static ArrayList<Integer> getRandomNonRepeatingIntegers1(int size, int min, int max) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        while (numbers.size() < size) {
            int random = getRandomInt1(min, max);
            if (!numbers.contains(random)) {
                numbers.add(random);
            }
        }
        return numbers;
    }
   
   
   
   public static int getRandomInt1(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }
  
   
   
}
