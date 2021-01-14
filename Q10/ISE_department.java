package ise;
import java.util.*;

public class ISE_department extends Faculty implements Department{
    
    public void readData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name : ");
        this.name = sc.nextLine();
        System.out.print("Enter age : ");
        this.age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter designation : ");
        this.designation = sc.nextLine();
        this.num_desig += 1;
        System.out.print("Enter number of subjects handled : ");
        this.no_subjects = sc.nextInt();
        sc.nextLine();
        subjects_handled = new String[no_subjects];
        System.out.print("Enter subject names : ");
        for(int i=0; i<no_subjects; i++){
            this.subjects_handled[i] = sc.next();
        }
        System.out.print("Enter years of experience : ");
        this.years_of_experience = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter joining date(dd-mm-yyyy) : ");
        this.joining_date = sc.nextLine();
        System.out.println("Enter number of research consultancy projects : ");
        this.num_res_projs = sc.nextInt();
    }

    public void printData(){
        System.out.println("________________________________________");
        System.out.println("Name : "+this.name);
        System.out.println("Age : "+this.age);
        System.out.println("Joining Date : "+this.joining_date);
        System.out.println("Years of Experience : "+this.years_of_experience);
        System.out.println("Designation : "+this.designation);
        System.out.println("Number of research Consultancy Projects : "+this.num_res_projs);
        System.out.print("Subjects handled : ");
        for(String s : subjects_handled){
            System.out.print(s+"   ");
        }
        System.out.println();
        try{
            this.AgeExc();
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println();
        System.out.println("________________________________________");
    }

    public void print_number_designations(){
        System.out.println("Number of designations : "+this.num_desig);
    }

    public int number_research_consultancy_projs(){
        return num_res_projs;
    }

    public void AgeExc() throws AgeException{
        if(this.age>58) throw new AgeException(this.age);
    }
}
