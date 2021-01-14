import java.util.*;

public class TwelveA{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choices");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Display");
        System.out.println("4. Exit");
        ArrayList<String> al = new ArrayList<>();
        System.out.print("Enter choice : ");
        int ch = sc.nextInt();
        while(true){
            switch(ch){
                case 1 : System.out.print("Enter element to enqueue : ");
                         String s = sc.next();
                         al.add(s);
                         System.out.println("Element inserted.");
                         break;
                case 2 : System.out.println(al.remove(0)+" is deleted.");
                break;
                case 3 : for(int i=0; i<al.size(); i++)
                            System.out.print(al.get(i)+"\t");
                        System.out.println();
                break;
                case 4 : System.out.println("Terminating Program.....");
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
