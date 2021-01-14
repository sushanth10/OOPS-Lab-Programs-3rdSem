package StudentPackage;

public class InvalidSGPA extends Exception{
    int SGPA;

    public InvalidSGPA(int sgpa){
        this.SGPA = sgpa;
    }

    public String toString(){
        return "Invalid SGPA above 10";
    }
}
