package StudentPackage;
import StudentPackage.*;
import java.util.*;

public class RegisterStudent implements Student{
    String name, branch;
    int credits;
    int marks[][];

    public void getInput() throws CreditLimit{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name : ");
        this.name = sc.nextLine();
        System.out.print("Enter branch : ");
        this.branch = sc.nextLine();
        System.out.print("Enter number of credits registered for : ");
        this.credits = sc.nextInt();
        this.marks = new int[4][5];
        if(this.credits>30){
                throw new CreditLimit(this.credits);
        }
    }
}
