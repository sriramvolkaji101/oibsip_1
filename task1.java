package oasisinternship;
//ONLINE RESERVATION SYSTEM (ORS)
import java.lang.*;
import java.util.*;
import java.util.Date;
class ORSmain
{
    public static void main(String args[])
    {
        int farePrice = 100; int ticket = 0; int Operation,PIN;
        boolean b = false;
        String Name; String train = ""; String PNR = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("*******Welcome to Online ticket Booking*******");
        System.out.println("\'ENTER 1 TO BOOK TICKETS\'");
        int n = sc.nextInt();
        int pin[] = new int[n];
        String name[] = new String[n];
        System.out.println("Press 1 to Create account or Press 2 to Login\n 1.Create Account \n 2.Login");

        Operation = sc.nextInt();
        switch(Operation)
        {
            case 1:
            {
                System.out.println("*******CREATE NEW ACCOUNT*******");
                System.out.println("---Enter the details to create account---");
                for(int i = 0;i<n;i++)
                {
                    System.out.println("Enter Name");
                    sc.nextLine();
                    name[i] = sc.nextLine();
                    System.out.println("Enter Pin");
                    pin[i] = sc.nextInt();


                }


                System.out.println("-----Your details were recorded plz login to continue-----");
                break;
            }
            case 2:
            {

                name[0] = "RAJESH";
                pin[0] = 1111;
                break;
            }
        }



        while(true)
        {
            System.out.println("***** LOGIN FORM *****");
            System.out.println(">>>>>>Login into page for booking tickets<<<<<<");
            System.out.println("Enter Your Name");

            Name = sc.next();
            sc.nextLine();
            System.out.println("Enter the PIN");
            PIN = sc.nextInt();
            for(int i = 0;i<n;i++)
            {

                if ((PIN == pin[0]) &&Name.equals(name[0]) )
                {
                    System.out.println("---Your login is Successful---\n ---Happy Booking!!!---");
                    b = true;
                    break;
                }

                else
                {
                    System.out.println("--Sorry! Your login is Unsuccessful---\n Try again!!---");
                }

            }


            if(b == true)
            {
                System.out.println("...Choose Train...\n 1.Krishna Express\n 2.Chennai Express\n3.padmavathi Express\n4.Ajantha Express\n5.Rajdhani Express\n6.Rayalasima Express");
                int Option = sc.nextInt();
                switch(Option)
                {
                    case 1:
                    {
                        train ="Krishna Express";
                        PNR = "423-4888961";
                        break;
                    }
                    case 2:
                    {
                        train ="Channai Express";
                        PNR = "523-4808961";
                        break;
                    }
                    case 3:
                    {
                        train ="Vishaka Express";
                        PNR = "653-4888961";
                        break;
                    }
                    case 4:
                    {
                        train ="Brindhavan Express";
                        PNR = "223-4778961";
                        break;
                    }
                    case 5:
                    {
                        train ="Rajdhani Express";
                        PNR = "423-4777961";
                        break;
                    }
                }
                System.out.println("Please Enter 1 for AC or 2 for NON-AC \n1.FOR AC \n2.FOR NON-AC");
                int AC = sc.nextInt();
                if(AC==1)
                {
                    ticket = farePrice+10;
                }
                else
                {
                    ticket = farePrice;
                }
                System.out.println("Please Enter.. \n1.Sleeper\n2.NON-Sleeper");
                int window = sc.nextInt();
                if(window==1)
                {
                    ticket = ticket+10;
                }
                else
                {
                    ticket = ticket;
                }
                System.out.println("---- IRCTC-----");
                System.out.println("JOURNEY CUM RESERVATION TICKET");
                System.out.println(""+train +"PNR:"+PNR+"");

                Date date = new Date();
                System.out.println(""+ date.toString());
                System.out.println("Fare price = 50");
                System.out.printf( "-Please pay %d FOR THE TICKET-", ticket);
                System.out.println("\n");

                System.out.println("ENTER 1 TO CANCEL THE TICKET \n ENTER 0 to exit");
                int u = sc.nextInt();
                if(u == 1)
                {

                    System.out.println("----Your Ticket Has Been Cancelled----");
                }
                if(u == 0)
                {
                    System.exit(0);
                }
            }

        }
    }

}