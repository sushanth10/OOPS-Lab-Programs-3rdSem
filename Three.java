import java.util.*;

class Stack{
    int SIZE, top;
    int st[];
    Scanner sc = new Scanner(System.in);

    Stack(int size){
        top=-1;
        this.SIZE = size;
        st = new int[SIZE];
    }

    void push(){
        if(top==SIZE-1){
            System.out.println("Stack overflow condition\n");
            return;
        }
        System.out.print("Enter element  to be pushed : ");
        int data = sc.nextInt();
        st[++top] = data;
        System.out.println("Element inserted.\n");
    }

    int pop(){
        if(top==-1) return -1;
        else return st[top--];
    }

    void display(){
        if(top==-1){
            System.out.println("Stack Empty. No elements to display.");
            return;
        }
        System.out.println("Displaying Stack Content : ");
        for(int i=top; i>=0; i--)
            System.out.println("\t"+st[i]+"\t");
        System.out.println("\n---------------");
    }
}

public class Three {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Initialising Stack for Usage");
        System.out.print("Enter stack size : ");
        int size = sc.nextInt();
        Stack s = new Stack(size);
        System.out.println("Choices");
        System.out.println("1. Push Element\n2. Pop Element\n3. Display\n4. Exit");
        System.out.print("Enter choice : ");
        int ch = sc.nextInt();
        while(true){
            switch(ch){
                case 1 : s.push();
                        break;
                case 2 : int del = s.pop();
                if(del==-1)
                    System.out.println("Queue Underflow Condition\n");
                else
                    System.out.println(del+" was popped out of the stack.");
                break;
                case 3 : s.display();
                break;
                case 4 : System.out.println("Terminating Program....");
                        System.exit(0);
                        break;
                default : System.out.println("Invalid Choice ");
                break;
            }
            System.out.print("Enter choice : ");
            ch = sc.nextInt();
        }
    }
}
