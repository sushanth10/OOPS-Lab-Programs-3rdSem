import java.util.*;

class Account{
    int Accno, Phone_No;
    float balance_amt;
    String name;
    public Scanner sc = new Scanner(System.in);

    void getInput(){
        System.out.print("Enter customer name : ");
        this.name = sc.next();
        System.out.print("Enter customer account number : ");
        this.Accno = sc.nextInt();
        System.out.print("Enter customer phone number : ");
        this.Phone_No = sc.nextInt();
        System.out.print("Enter balance amount : ");
        this.balance_amt = sc.nextFloat();
    }

    void Deposit(float dep){
        this.balance_amt += dep;
        System.out.println("Money Deposited successfully");
        System.out.println("Balance Amount : "+this.balance_amt);
    }

    void Withdraw(float wid){
        if(wid>this.balance_amt){
            System.out.println("Insufficient Balance. Withdrawal not Accepted");
            return;
        }
        this.balance_amt -= wid;
        System.out.println("Withdrawal successful.\nBalance Amount : "+this.balance_amt);
    }

    void display(){
        System.out.println("DISPLAYING DETAILS");
        System.out.println("Name : "+this.name);
        System.out.println("Phone Number : "+this.Phone_No);
        System.out.println("Account Number : "+this.Accno);
        System.out.println("Balance Amount : "+this.balance_amt);
        System.out.println("________________________");
    }
}

public class Two {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter details first  : ");
        Account a = new Account();
        a.getInput();
        System.out.println("Options");
        System.out.println("1. Deposit Money");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Display Details");
        System.out.println("4. Exit");
        System.out.print("Enter option : ");
        int ch = sc.nextInt();
        while(1){
            switch(ch){
                case 1 : System.out.print("Enter deposit amount : ");
                        float dep = sc.nextFloat();
                        a.Deposit(dep);
                        break;
                case 2 : System.out.print("Enter withdrawal amount : ");
                        float wid = sc.nextFloat();
                        a.Withdraw(wid);
                        break;
                case 3 : a.display();
                break;
                case 4 : System.out.println("Terminating Program....");
                        System.exit(0);
                break;
                default : System.out.println("Invalid Choice");
                break;
            }
            System.out.print("Enter choice : ");
            ch = sc.nextInt();
        }
    }
}
