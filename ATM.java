import java.util.*;

 class atmmachine{

    int balance,pin,a,b,d=0;
    atmmachine(int bal)
    {
        balance=bal;
    }

   

    int getbal()
    {
       
        return balance;
    }

    void withdraw (int amo)
    {
        System.out.print("Enter a pin:");
        Scanner sc=new Scanner(System.in);
        pin=sc.nextInt();
        a=pin;

        while(a!=0)
        {
            b=a%10;
            d+=1;
            a=a/10;
        }

        if (d==4)
        {
            
            if (amo<=balance)
            {
                balance=balance-amo;
               System.out.println("cash withdraw successfully");
            }

            else
            {
                System.out.println("Insuufficient balance in your account");
            }
        }

        else
        {
           System.out.println("please enter a valid pin");
        }
     
    }


       void diposite(int amo)
       {
        System.out.print("Enter a pin:");
        Scanner sc=new Scanner(System.in);
        pin=sc.nextInt();
        a=pin;

        while(a!=0)
        {
            b=a%10;
            d+=1;
            a=a/10;
        }

        if (d==4)
        {
            balance=balance+amo;
        }

        else
        {
            System.out.println("please enter valid pin");
        }
        

       }

       void transfer(int amo)
       {
        System.out.print("Enter a pin:");
        Scanner sc=new Scanner(System.in);
        pin=sc.nextInt();
        a=pin;

        while(a!=0)
        {
            b=a%10;
            d+=1;
            a=a/10;
        }

        if (d==4)
        {
            if (amo<=balance)
            {
                balance=balance-amo;
            }

            else
            {
                System.out.println("Insufficient balnce in your account");
            }
        }
        else
        {
            System.out.println("please enter a valid pin");
        }
        
    }

    void exit()
    {
        System.out.println("Thank You Visit Again");
    }
};

public class ATM {
     
    static atmmachine ob1=new atmmachine(10000);
     public static void main(String[] args){

        int amo,choice;
        String ch; 
     do {
            System.out.println("1.view balance");
            System.out.println("2.cash withdraw");
            System.out.println("3.cash diposite");
            System.out.println("4.cash transfer");
            System.out.println("5.Exit");

            System.out.print("Enter a choice:");
            Scanner oc = new Scanner(System.in);
            choice=oc.nextInt();

       
        

        
            switch(choice)
            {
                case 1:
                      System.out.println("your balance is:"+  ob1.getbal());
                      break;

                case 2:
                      System.out.print("Enter a amount you want to withdraw:");
                      amo=oc.nextInt();
                      ob1.withdraw(amo);
                      break;

                case 3:
                      System.out.print("Enter a amount you want to Diposite:");
                      amo=oc.nextInt();
                      ob1.diposite(amo);
                      break;

                case 4:
                      System.out.print("Enter a amount you want to transfer:");
                      amo=oc.nextInt();
                      ob1.transfer(amo);
                      break;

                case 5:
                      
                      ob1.exit();
                      break;

                default:
                      System.out.println("invalid choice please enter a valid choice");
                      break;
             }
            

        } while (choice!=0);
            

    }
}
