package StudentPackage;

public class CreditLimit extends Exception{
    int credits;

    CreditLimit(int cred){
        this.credits = cred;
    }

    public String toString(){
        return "Credit limit of 30 is crossed. Registration unsuccesful";
    }
}
