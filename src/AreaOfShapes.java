import java.util.Scanner;

public class AreaOfShapes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Which shape area you want ? ");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Reactangle");
        System.out.println("4. Parallelogram");
        System.out.println("5. Rhombus");
        int ch = sc.nextInt();
        switch (ch){
            case 1:
                System.out.println("Enter radius : ");
                int r = sc.nextInt();
                double pi = 3.14;
                double area = pi * (r * r);
                System.out.println("Area of Circle : " + area);
                break;

            case 2:
                System.out.println("Enter base : ");
                double base = sc.nextInt();
                System.out.println("Enter height : ");
                double height = sc.nextInt();
                double area1 = 0.5 * (base * height);
                System.out.println("Area of Triangle : " + area1);
                break;

            case 3:
                System.out.println("Enter length : ");
                double length = sc.nextInt();
                System.out.println("Enter breadth : ");
                double breadth = sc.nextInt();
                double area2 = length * breadth;
                System.out.println("Area of Rectangle : " + area2);
                break;

            case 4:
                System.out.println("Enter base : ");
                double base1 = sc.nextInt();
                System.out.println("Enter height : ");
                double height1 = sc.nextInt();
                double area3 = base1 * height1;
                System.out.println("Area of Parallelogram : " + area3);
                break;

            case 5:
                System.out.println("Enter diagonal1 : ");
                double diagonal1 = sc.nextInt();
                System.out.println("Enter diagonal2 : ");
                double diagonal2 = sc.nextInt();
                double area4 = 0.5 * (diagonal1 * diagonal2);
                System.out.println("Area of Rhombus : " + area4);
                break;

            default:
                System.out.println("Invalid input");
        }
    }
}
