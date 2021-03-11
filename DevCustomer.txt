package Experiment;

public class DevCustomer extends  Dev_MenuOption{
    
    public DevCustomer(int customerId1,String name1, String gender1, String dob1, String address1,String city1, String state1, int pin1,long mobileNo1, String email1) {
        
        customerId=customerId1;
        name=name1;
        gender=gender1;
        dob=dob1;
        address=address1;
        city=city1;
        state=state1;
        pin=pin1;
        mobileNo=mobileNo1;
        email=email1;
        
    }
    public int getCustomerNo() {
        return customerId;
    }
    public String getName()
    {
        return name;
    }
    public String getGender()
    {
        return gender;
    }
    public String getDOB() {
        return dob;
    }
    public String getAdress() {
        return address;
    }
    public String getCity(){
        return city;
    }
    public String getState()
    {
        return state;
    }
    public int getPin()
    {
        return pin;
    }
    public long getMobileNo() {
        return mobileNo;
    }
    public String getEmail() {
        return email;
    }
       
    
}