import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 integers: ");
        System.out.print("Number 1 = ");
        int num1 = scanner.nextInt();
        System.out.print("Number 2 = ");
        int num2 = scanner.nextInt();
        System.out.print("Number 3 = ");
        int num3 = scanner.nextInt();
        System.out.print("Number 4 = ");
        int num4 = scanner.nextInt();
        System.out.print("Number 5 = ");
        int num5 = scanner.nextInt();

        int max = num1;

        max = num2 > max ? num2 : max;
        max = num3 > max ? num3 : max;
        max = num4 > max ? num4 : max;
        max = num5 > max ? num5 : max;

        System.out.println("\nThe largest number is: " + max);




    }
}