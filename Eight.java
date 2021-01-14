import java.util.*;
import java.math.*;

class Circle{
    int rad;

    Circle(int r){
        this.rad = r;
    }

    double Area(){
        return 3.14*rad*rad;
    }
}

class Sector extends Circle{
    float centang;
    Sector(int r, float centang){
        super(r);
        this.centang = centang;
    }

    double Area(){
        return 0.5*rad*rad*centang;
    }
}

class Segment extends Circle{
    float len;

    Segment(int r, float len){
        super(r);
        this.len = len;
    }

    double Area(){
        return Math.pow(rad, 2)*Math.acos((rad-len)/rad) - (rad-len)*Math.pow((2*rad*len-len*len), 0.5); 
    }
}

public class Eight {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Circle Details");
        System.out.print("Enter radius of circle : ");
        int r = sc.nextInt();
        Circle c = new Circle(r);
        System.out.println("Area of Circle : "+ c.Area());
        System.out.println("\nSector Details");
        System.out.print("Enter central angle of sector : ");
        float cenang = sc.nextFloat();
        Sector sec = new Sector(r, cenang);
        System.out.println("Area of sector : "+sec.Area());
        System.out.println("\nSegment Details"); 
        System.out.print("Enter length of segment : ");
        float len = sc.nextFloat();
        Segment seg = new Segment(r, len);
        System.out.println("Area of Segment : "+seg.Area());
        System.out.println("Terminating Program....");
    }
}
