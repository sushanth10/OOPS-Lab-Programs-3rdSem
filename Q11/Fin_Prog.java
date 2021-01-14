package StudentPackage;
import java.util.Scanner;

import ResultPackage.*;

public class Fin_Prog {
    public static void main(String args[]){

        try{
            Scanner sc = new Scanner(System.in);
            RegisterStudent S1 = new RegisterStudent();
            S1.getInput();
            System.out.println("Enter marks for each subject");
            float SGPA[] = new float[4];
            char grades[][] = new char[4][5];
            Result R = new Result();
            for(int i=0; i<4; i++){
                System.out.println("\t\tSemester"+(i+1)+"\t\t");
                float semcred = 0, GPAtotal=0;
                for(int j=0; j<5; j++){
                    System.out.print("Subject "+(j+1)+" : ");
                    S1.marks[i][j] = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter credits for subject "+(j+1)+": ");
                    int credits = sc.nextInt();
                    GPAtotal += R.getGPA(S1.marks[i][j])*credits;
                    semcred += credits;
                    grades[i][j] = R.CalcGrade(S1.marks[i][j]); 
                }
                SGPA[i] = GPAtotal / semcred;
                System.out.println();
            }
            float CGPA = SGPA[0]+SGPA[1]+SGPA[2]+SGPA[3];
            CGPA = CGPA/4;
            System.out.println();
            System.out.println("Calculating Grades for all subjects");
            for(int i=0; i<4; i++){
                System.out.println("__________________________");
                System.out.println("\t\tSemester "+(i+1));
                for(int j=0; j<5; j++){
                    System.out.println("Subject "+(j+1)+" : "+grades[i][j]);
                }
                System.out.println();
                System.out.println("Semester SGPA : "+SGPA[i]);
                System.out.println("__________________________");
            }
            System.out.println("***********************");
            System.out.println("TOTAL CGPA : "+CGPA);
            System.out.println("***********************");  
        }catch(Exception e){
            System.out.println(e);
            System.exit(0);
        }
      
    }
}
