import java.util.Scanner;

public class TriangleException {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("Enter length of edge a: ");
            double a=sc.nextDouble();
            System.out.println("Enter length of edge b: ");
            double b=sc.nextDouble();
            System.out.println("Enter length of edge c: ");
            double c=sc.nextDouble();
        } catch (IllegalTriangleException e){
            System.out.println("Input is invalid!");
        }


    }
}

