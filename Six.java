import java.util.*;
import java.lang.String;

public class Six {

    public static String arrange(String s){
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        String arranged = new String(arr);
        return arranged;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String orig = sc.nextLine();
        System.out.println("Options");
        System.out.println("1. Extract m characters from nth position");
        System.out.println("2. Count all occurences of a particular word");
        System.out.println("3. Replace a substring in given string");
        System.out.println("4. Rearrange string in alphabetical order");
        System.out.println("5. Comparing the strings ignoring case");
        System.out.println("6. Concatenate Two Strings");
        System.out.print("Enter choice : " );
        int ch = sc.nextInt();
        while(true){
            switch(ch){
                case 1 : System.out.print("Enter the index position to start : ");
                    int n = sc.nextInt();
                    System.out.print("Enter number of characters : ");
                    int m =sc.nextInt();
                    System.out.println("Resulting substring : " + orig.substring(n-1, n+m-1));
                    break;
                case 2 : System.out.print("Enter a word to count occurences of : ");
                        String w = sc.next();
                        int count=0;
                        for(String sub : orig.split(" ")){
                            if(sub.equals(w)) count++;
                        } 
                        System.out.println("Number of occurences : "+count);
                        break;
                case 3 : System.out.print("Enter substring to replace : ");
                        String sub = sc.next();
                        System.out.print("Enter replacement string : ");
                        String rep = sc.next();
                        System.out.println("Modified String : "+orig.replace(sub, rep));
                        break;
                case 4 : String sorted = arrange(orig);
                        System.out.println("Sorted String : "+sorted);
                        break;
                case 5 :  System.out.print("Enter string to compare with : ");
                        String s2 = sc.nextLine();
                        System.out.println(orig.equalsIgnoreCase(s2));
                        break;
                case 6 : System.out.println("Enter string to concatenate : ");
                        s2 = sc.next();
                        System.out.println("Result : "+orig.concat(s2));
                        break;
                default :  System.out.println("Invalid choice.");
                break;                
            }
            System.out.print("Enter choice : ");
            ch = sc.nextInt();            
        } 
    }
}
