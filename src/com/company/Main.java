package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void printShapeDetails
            (ArrayList<Shape> l) {
        for (Shape i : l) {

            if (i instanceof Circle) {
                System.out.print("Circle - Radius " + ((Circle) i).getRadius()+" - Area "+ i.area());
                System.out.println();

            }
            if (i instanceof Rectangle) {
                System.out.print("Rectangle - Dimensions " + ((Rectangle) i).getHeight()+"x"+((Rectangle) i).getWidth()+" - Area "+ i.area());
                System.out.println();

            }
            if (i instanceof RightAngledTriangle) {
                System.out.print("Right-angled triangle - Dimensions " + ((RightAngledTriangle) i).getBase()+"x"+((RightAngledTriangle) i).getHeight()+" - Area "+ i.area());
                System.out.println();

            }
            if (i instanceof Square) {
                System.out.print("Square - Dimensions " + ((Square) i).getWidth()+"x"+((Square) i).getWidth()+" - Area "+ i.area());
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {



        ArrayList<Shape> figureList = new ArrayList<>();

        Square square1 = null;
        Rectangle rectangle1 = null;
        Circle circle1 = null;
        RightAngledTriangle triangle1 = null;

        int userchoice;

        do {
            System.out.println();
            System.out.println("Choose your shape:");
            System.out.println("1. Square");
            System.out.println("2. Rectangle");
            System.out.println("3. Circle");
            System.out.println("4. Right-angled triangle");
            System.out.println("5. View all shape details");
            System.out.println("6. Quit");
            Scanner scan = new Scanner(System.in);
            userchoice = scan.nextInt();


            if (userchoice == 1) {
                System.out.println("Enter the width of the square: ");
                int sWidth = scan.nextInt();
                square1 = new Square(sWidth);
                figureList.add(square1);


            } else if (userchoice == 2) {
                System.out.println("Enter the height of the rectangle: ");
                int rHeight = scan.nextInt();
                System.out.println("Enter the width of the rectangle: ");
                int rWidth = scan.nextInt();
                rectangle1 = new Rectangle(rHeight, rWidth);
                figureList.add(rectangle1);


            } else if (userchoice == 3) {
                System.out.println("Enter the radius of the circle: ");
                int cRadius = scan.nextInt();
                circle1 = new Circle(cRadius);
                figureList.add(circle1);


            } else if (userchoice == 4) {
                System.out.println("Enter the base of the triangle: ");
                int tBase = scan.nextInt();
                System.out.println("Enter the height of the triangle: ");
                int tHeight = scan.nextInt();
                triangle1 = new RightAngledTriangle(tBase, tHeight);
                figureList.add(triangle1);


            } else if (userchoice == 5) {
                System.out.println("All shape details: ");
                printShapeDetails(figureList);

            }


        }while(userchoice!=6);
        System.out.println("Goodbye!");

    }
}



