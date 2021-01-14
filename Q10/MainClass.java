package def;
import java.util.*;
import ise.*;
public class MainClass {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of faculties : ");
        int n = sc.nextInt();   
        ISE_department[] ise = new ISE_department[n];
        for(int i=0; i<n; i++){
            System.out.println("Entering data for faculty "+(i+1));
            ise[i] = new ISE_department();
            ise[i].readData();
        }
        System.out.println("\n\n\t\tDISPLAYING FACULTY DATA");
        for(int i=0; i<n; i++){
            ise[i].printData();
        }
        System.out.println("\n\nDISPLAYING DETAILS OF FACULTY WITH > 20 YEARS OF EXPERIENCE");
        for(ISE_department i : ise){
            if(i.years_of_experience>20){
                System.out.println(i.name);
            }
        }
        System.out.println("\n\nEnding Program.....");
    }
}
