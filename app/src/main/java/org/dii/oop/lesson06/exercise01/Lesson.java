package app.src.main.java.org.dii.oop.lesson06.exercise01;

import java.util.Scanner;
import java.util.ArrayList;//this exercise MUST use arrayList
import java.lang.Math;

public class Shape {
    private String name = ""; //store the name of shape
    private int numSide = 0; //store number of shape sides
    protected double area = 0.0;
    protected double perimeter = 0.0;
    protected double rad = 0.0;

    public double getArea(){
        return area;
    }
    public double getPerimeter(){
        return perimeter;
    }
}
class Circle extends Shape {
    public Circle(double rad){
       this.rad  = rad;
    }
    public double calArea(double rad){
        this.area = Math.PI * Math.pow(2, rad);
        return area;
    }
    public double calPerimeter(double rad){
        this.perimeter = Math.PI * 2 * rad;
        return perimeter;
    }
}
class Rectangle extends Shape {

}

public class Lesson {
    public static void run() {
        ArrayList<String> StoreShape = new ArrayList<String>();
        ArrayList<Integer> StoreSide = new ArrayList<Integer>();
        ArrayList<Double> StoreArea = new ArrayList<Double>();
        ArrayList<Double> StorePerimeter = new ArrayList<Double>();

        //HINT1: usage arraylist with Shape class to store all of your shapes, check how to use arrayList by yourself

        //HINT2: you may want to declare your arrayList around here

        Scanner in = new Scanner(System.in);

        do {
            System.out.print("1. Circle\n2. Rectangle\n3. Square\n4. Display all shape\n5. exit\nPlease select [1-5]:");
            //print menu as instructed in MD file

            String choice = in.nextLine().trim();

            // TODO: write your code here

            if ("1".equals(choice)) {
                System.out.print("Enter radius: ");
                String strRadius = in.nextLine();
                double rad = Double.parseDouble(strRadius);

                Circle circle = new Circle(rad);
                circle.calArea(rad);

                StoreArea.add(circle.getArea());
                StorePerimeter.add(circle.getPerimeter());
                StoreShape.add("Circle");
                StoreSide.add(0);
                //store to arrayList
            }
            if ("2".equals(choice)) {
                System.out.print("Enter width: ");
                String strWidth = in.nextLine();
                System.out.print("Enter height: ");
                String strHeight = in.nextLine();

                StoreShape.add("Rectangle");
                StoreSide.add(4);
                
                //store to arrayList
            }
            if ("3".equals(choice)) {
                System.out.print("Enter side: ");
                String strSide = in.nextLine();

                StoreShape.add("Square");
                StoreSide.add(4);
                
                //store to arrayList
            }
            if ("4".equals(choice)) {
                System.out.print("List all shape: ");
                
                //print data as instructed
                //check how to iterate through arrayList

                //HINT3: you can use getClass() function of arrayList to get the name of class. It might be useful : )
            }
            if ("5".equals(choice)) {
                 break;
            }
           
        } while(true);

        in.close();
    }
}