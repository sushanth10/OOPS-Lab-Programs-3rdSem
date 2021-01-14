import java.util.*;

public class TwelveB {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        LinkedList<String> ll = new LinkedList<>();
        System.out.println("Press\n1. Insert Data\n2. Display names with size less than 5\n3. Exit");
        System.out.print("Enter choice : ");
        int ch = sc.nextInt();
        while(true){
            switch(ch){
                case 1 : System.out.print("Enter string to insert : ");
                    String s = sc.next();
                    ll.add(s);
                    break;
                case 2 : Iterator<String> iter = ll.iterator();
                    while(iter.hasNext()){
                        s = iter.next();
                        if(s.length()<5) System.out.println(s);
                    }
                    break;
                case 3 : System.out.println("Terminating Program.....\n");
                System.exit(0);
                break;
                default : System.out.println("Invalid Choice");
                break;
            }
            System.out.println("Enter choice : ");
            ch = sc.nextInt();
        }
    }
}
