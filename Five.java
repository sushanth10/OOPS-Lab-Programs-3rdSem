import java.util.*;

class Matrix{
    int a, b;
    int mat[][];
    Scanner sc = new Scanner(System.in);

    Matrix(int a, int b){
        this.a = a;
        this.b = b;
        mat = new int[a][b];
    }

    public void getValues(){
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                System.out.print("["+(i+1)+"]["+(j+1)+"] : ");
                mat[i][j] = sc.nextInt();
            }
        }
    }

    public void display(){
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                System.out.print(mat[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static Matrix Multiply(Matrix M1, Matrix M2){
        Matrix result = new Matrix(M1.a, M2.b);
        for(int i=0; i<M1.a; i++){
            for(int j=0; j<M2.b; j++){
                for(int k=0; k<M1.b; k++){
                    result.mat[i][j] += M1.mat[i][k]*M2.mat[k][j];
                }
            }
        }
        return result;
    }

}

public class Five {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter order of first matrix : ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        Matrix A = new Matrix(m, n);
        System.out.println("Enter values of matrix A :");
        A.getValues();
        System.out.println("Displaying Matrix A :");
        A.display();
        System.out.println("Enter order of second matrix : ");
        m = sc.nextInt();
        n = sc.nextInt();
        Matrix B = new Matrix(m, n);
        System.out.println("Enter values of second matrix : ");
        B.getValues();
        System.out.println("Displaying Matrix B : ");
        B.display();
        if(A.b != B.a){
            System.out.println("Matrix multiplication not possible.");
            System.exit(0);
        }
        else{
            Matrix result = Matrix.Multiply(A, B);
            System.out.println("Resulting Product Matrix");
            result.display();
        }
    }
}
