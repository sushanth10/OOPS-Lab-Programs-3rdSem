import java.util.*;

class Personal{
    public Scanner sc = new Scanner(System.in);
    public int age, years_of_experience, no_of_loans;
    public String name, education;
    public double basic, da, hra, salary, loan_amt, tax;

    Personal(){
        System.out.print("Enter name : ");
        this.name = sc.nextLine();
        System.out.print("Enter age : ");
        this.age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter education : ");
        this.education = sc.nextLine();
        System.out.print("Enter basic salary : ");
        this.basic = sc.nextDouble();
        System.out.print("Enter da salary : ");
        this.da = sc.nextDouble();
        System.out.print("Enter hra : ");
        this.hra = sc.nextDouble();
        this.salary = this.basic +this.da+this.hra;
        System.out.print("Enter years of experience : ");
        this.years_of_experience = sc.nextInt();
        System.out.print("Enter number of outstanding loans : ");
        this.no_of_loans = sc.nextInt();
        System.out.print("Enter total outstanding loan amount : ");
        this.loan_amt = sc.nextDouble();
    }

    boolean isEligible(){
        if(no_of_loans<5 && loan_amt< (5*salary))
            return true;
        return false;
    }

    double taxPay(){
        if(salary<250000)
            this.tax = 0;
        else if(salary<500000)
            this.tax = 0.10*salary;
        else if(salary<1000000)
            this.tax = 0.20*salary;
        else if(salary<2000000)
            this.tax = 0.25*salary;
        else if(salary>3500000)
            this.tax = 0.35*salary;
        else
            this.tax = 0.5*salary;
        return this.tax;
    }

    boolean isEligiblePromotion(){
        if(years_of_experience>5 && age<53)
            return true;
        return false;
    }

    void Display(){
        System.out.println("________________________");
        System.out.println("Name : "+this.name);
        System.out.println("Age : "+this.age);
        System.out.println("Education : "+this.education);
        System.out.println("Salary : "+this.salary);
        System.out.println("Years of Experience : "+this.years_of_experience);
        System.out.println("Number of loans : "+this.no_of_loans);
        System.out.println("Loan Amount : "+this.loan_amt);
        System.out.println("Tax Amount to be paid : "+this.taxPay());
        if(this.isEligible())
            System.out.println(this.name+" is eligible for loan");
        else
            System.out.println(this.name+" is not eligible for loan");
        if(this.isEligiblePromotion())
            System.out.println(this.name+" is eligible for promotion");
        else 
            System.out.println(this.name+" is not eligible for promtion");
        
        System.out.println("________________________");
    }
}

public class Seven {
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees : ");
        n = sc.nextInt();
        Personal per[] = new Personal[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter personal details of Person"+(i+1));
            per[i] = new Personal();
            System.out.println();
        }
        for(Personal p : per){
            p.Display();
        }
    }
}
