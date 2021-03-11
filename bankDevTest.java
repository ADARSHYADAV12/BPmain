package Banks;

import java.io.*;
public class bankDevTest {
public static void main(String str[]) throws Exception
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("\tWELCOME TO ABC BANK");
    System.out.println("PRESS S/s TO PROCEED");
    String proceed = br.readLine();
    int tries = 1;
    int count = 2;
    do {
    if(proceed.equalsIgnoreCase("s")){
        System.out.print("Enter your Login ID: ");
        String id = br.readLine();
        System.out.print("Enter your password: ");
        String pass = br.readLine();
        if(id.equals("demo")==false || pass.equals("demo")==false){
                tries++;
                if(tries==4)
                {
                    System.out.println("INVALID INPUT. NO MORE CHANCES LEFT");
                }
                else
                {
                       System.out.println("INVALID INPUT. "+count+" MORE CHANCES LEFT");
                       count--;
                }
        }else{
            System.out.println("\tWelcome Manager : "+id);
            Dev_MainMenu mm=new Dev_MainMenu();
            mm.MainMenu();
            break;
        }
    }
    }while (tries<4);
        if(tries>=4){
            System.exit(0);
        }
}
}





