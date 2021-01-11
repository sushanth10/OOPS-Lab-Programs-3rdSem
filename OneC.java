import java.util.Scanner;

public class OneC {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter terms : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Sorting array....");
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.print("Sorted Array : ");
        for(int i : arr){
            System.out.print(" "+i);
        }
        System.out.println();
    }    
}
