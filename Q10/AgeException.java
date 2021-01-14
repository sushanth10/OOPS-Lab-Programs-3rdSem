package ise;

public class AgeException extends Exception{
    int age;
    AgeException(int age){
        this.age = age;
    }

    public String toString(){
        return "Age of Faculty greater than 58";
    }
}
