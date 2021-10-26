package org.example;

public class Calculator {
    private int x;
    private int y;



    public Calculator(double x, double y){
        this.x = (int)x;
        this.y = (int) y;
        System.out.println("Constructor: double, double");
    }

    public Calculator(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Constructor: int , int");
    }

    public Calculator(String x, String y){
        this.x = Integer.parseInt(x);
        this.y = Integer.parseInt(y);
        System.out.println("Constructor: string, string");
    }

    public void addNumber(){
        System.out.println("X: "+ x);
        System.out.println("Y: "+ y);
        System.out.println("Sum: "+ (x + y));
    }
}
