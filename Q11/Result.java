package ResultPackage;
import StudentPackage.*;

public class Result extends RegisterStudent{
    public char CalcGrade(int marks) throws InvalidSGPA{
            if(marks>100){
                int sgpa = 11;
                throw new InvalidSGPA(sgpa);
            }
            else if(marks>90) return 'S';
            else if(marks>80) return 'A';
            else if(marks>70) return 'B';
            else if(marks>60) return 'C';
            else if(marks>50) return 'D';
            else if(marks>40) return 'E';
            else return 'F';
    }

    public int getGPA(int marks) throws InvalidSGPA{
            if(marks>100){
                int sgpa = 11;
                throw new InvalidSGPA(sgpa);
            }
            else if(marks>90) return 10;
            else if(marks>80) return 9;
            else if(marks>70) return 8;
            else if(marks>60) return 7;
            else if(marks>50) return 6;
            else if(marks>40) return 4;
            else return 0;   
    }
}
