import java.util.Scanner;

public class VolumeOfShapes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double pi = 3.14;
        System.out.println("Which shape volume you want ? ");
        System.out.println("1. Cone");
        System.out.println("2. Prism");
        System.out.println("3. Cylinder");
        System.out.println("4. Sphere");
        System.out.println("5. Pyramid");
        int ch = sc.nextInt();
        switch (ch){
            case 1:
                System.out.println("Enter radius : ");
                double r = sc.nextInt();
                System.out.println("Enter height : ");
                double h = sc.nextInt();
                double volume = 0.3333 * pi * (r * r) * h;
                System.out.println("Volume of Cone : " + volume);
                break;

            case 2:
                System.out.println("Enter base : ");
                double b = sc.nextInt();
                System.out.println("Enter height : ");
                double h1 = sc.nextInt();
                double volume1 = b * h1;
                System.out.println("Volume of Prism : " + volume1);
                break;

            case 3:
                System.out.println("Enter radius : ");
                double r1 = sc.nextInt();
                System.out.println("Enter height : ");
                double h2 = sc.nextInt();
                double volume2 = pi * (r1 * r1) * h2;
                System.out.println("Volume of Cylinder : " + volume2);
                break;

            case 4:
                System.out.println("Enter radius : ");
                double r2 = sc.nextInt();
                double volume3 = 4/3 * (pi * (r2 * r2 * r2));
                System.out.println("Volume of Sphere : " + volume3);
                break;

            case 5:
                System.out.println("Enter base : ");
                double b1 = sc.nextInt();
                System.out.println("Enter height : ");
                double h3 = sc.nextInt();
                double volume4 = 0.3333 * b1 * h3;
                System.out.println("Volume of Pyramid : " + volume4);
                break;

            default:
                System.out.println("Invalid input");
        }
    }
}
