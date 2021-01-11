import java.util.*;

class Complex{
    int a,b;
    
    Complex(int re, int im){
        this.a = re;
        this.b = im;
    }

    public static Complex Add(Complex N1, Complex N2){
        int a = N1.a + N2.a;
        int b = N1.b + N2.b;
        Complex result = new Complex(a, b);
        return result;
    }

    public static Complex Subtract(Complex N1, Complex N2){
        int a = N1.a - N2.a;
        int b = N1.b - N2.b;
        Complex result = new Complex(a, b);
        return result;
    }

    public static Complex Multiply(Complex N1, Complex N2){
        int a = N1.a*N2.a - N1.b*N2.b;
        int b = N1.b*N2.a + N2.b*N1.a;
        Complex result = new Complex(a, b);
        return result;
    }

    @Override
    public String toString(){
        return "("+this.a+")+("+this.b+")i";
    }
}

public class Four {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the real coefficient of first number : ");
        int re = sc.nextInt();
        System.out.println("Enter imaginary coefficient of first number : ");
        int im = sc.nextInt();
        Complex N1 = new Complex(re, im);
        System.out.println("Enter the real coefficient of second number : ");
        re = sc.nextInt();
        System.out.println("Enter imaginary coefficient of second number : ");
        im = sc.nextInt();
        Complex N2 = new Complex(re, im);
        System.out.println("Press 1 to add, 2 to subtract, 3 to multiply, 4 to exit");
        System.out.print("Enter choice : ");
        int ch = sc.nextInt();
        Complex result = new Complex(0,0);
        while(true){
            switch(ch){
                case 1 : result = Complex.Add(N1, N2);
                break;
                case 2 : result = Complex.Subtract(N1, N2);
                break;
                case 3 :  result = Complex.Multiply(N1, N2);
                break;
                case 4 : System.out.println("Terminating Program.....");
                System.exit(0);
                break;
                default : System.out.print("Invalid Choice\n");
                break;
            }
            System.out.println("Result of the operation is "+result);
            System.out.println("Enter choice : ");
            ch = sc.nextInt();
        }
    }
}
