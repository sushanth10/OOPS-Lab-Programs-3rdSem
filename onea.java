import java.util.Scanner;

public class onea {
    public static void fib(int n){
        int a=0, b=1, c;
        System.out.print("Displaying series using loop : ");
        if(n==1)
            System.out.println(" "+a);
        else if(n==2)
            System.out.println(" "+a+" "+b);
        else{
            System.out.print(" "+a+" "+b);
            for(int i=1; i<n-1; i++){
                c=a+b;
                System.out.print(" "+c);
                a=b;
                b=c;
            }
        }
        System.out.println();
    }

    public static int fib_rec(int n){
        if(n==1)
            return 0;
        else if(n==2)
            return 1;
        else 
            return fib_rec(n-1)+fib_rec(n-2);
    }

    public static void main(String args[]){
        System.out.print("Enter number of terms : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Options\n1. Using Loop\n2. Using Recursion");
        int ch = sc.nextInt();
        if(ch==1){
            fib(n);
        }
        else{
            System.out.print("Displaying Series using Recursion : ");
            for(int i=1; i<=n; i++){
                System.out.print(" "+fib_rec(i));
            }
        }
        System.out.println();
    }
}
