import java.util.Scanner;
public class OneB {
    public static void main(String args[]){
        System.out.print("Enter the number to check : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=2; i<=n/2; i++){
            if(n%i==0){
                System.out.print("Composite Number\n");
                System.exit(0);
            }
        }
        System.out.println("Prime number");
    }
}
