import java.util.Scanner;

public class CurvedAndTotalArea {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double pi = 3.14;
        System.out.println("1. Curved surface area of cylinder");
        System.out.println("2. Total surface area if cube");
        int ch = sc.nextInt();
        switch (ch){
            case 1:
                System.out.println("Enter radius : ");
                double r = sc.nextInt();
                System.out.println("Enter height : ");
                double h = sc.nextInt();
                double csa = 2 * pi * r * h;
                System.out.println("Curved surface area of cylinder : " + csa);
                break;

            case 2:
                System.out.println("Enter side of cube : ");
                double side = sc.nextInt();
                double tsa = 6 * (side * side);
                System.out.println("Total surface area if cube : " + tsa);
                break;

            default:
                System.out.println("Invalid input");
        }
    }
}
