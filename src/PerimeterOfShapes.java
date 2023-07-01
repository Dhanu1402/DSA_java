import java.util.Scanner;

public class PerimeterOfShapes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Which shape perimeter you want ? ");
        System.out.println("1. Circle");
        System.out.println("2. Equilateral triangle");
        System.out.println("3. Rectangle");
        System.out.println("4. Parallelogram");
        System.out.println("5. Rhombus");
        System.out.println("6. Square");
        int ch = sc.nextInt();
        switch (ch){
            case 1:
                System.out.println("Enter radius : ");
                double r = sc.nextInt();
                double pi = 3.14;
                double perimeter = 2 * pi * r;
                System.out.println("Perimeter of Circle : " + perimeter);
                break;

            case 2:
                System.out.println("Enter side : ");
                double side = sc.nextInt();
                double perimeter1 = 3 * side;
                System.out.println("Perimeter of Equilateral triangle : " + perimeter1);
                break;

            case 3:
                System.out.println("Enter length : ");
                double length = sc.nextInt();
                System.out.println("Enter breadth : ");
                double breadth = sc.nextInt();
                double perimeter2 = 2 * (length + breadth);
                System.out.println("Perimeter of Rectangle : " + perimeter2);
                break;

            case 4:
                System.out.println("Enter AB : ");
                double base1 = sc.nextInt();
                System.out.println("Enter AD : ");
                double height1 = sc.nextInt();
                double perimeter3 = 2 * (base1 + height1);
                System.out.println("Perimeter of Parallelogram : " + perimeter3);
                break;

            case 5:
                System.out.println("Enter side : ");
                double side1 = sc.nextInt();
                double perimeter4 = 4 * side1;
                System.out.println("Perimeter of Rhombus : " + perimeter4);

            case 6:
                System.out.println("Enter a side of a square : ");
                double side2 = sc.nextInt();
                double perimeter5 = 4 * side2;
                System.out.println("Perimeter of Square : " + perimeter5);
                break;

            default:
                System.out.println("Invalid input");
        }
    }
}
