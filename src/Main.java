import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Importing the Scanner class to read user input
        Scanner scanner = new Scanner(System.in);

        //Defining the 5 int variables to store the values
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

        //Defining and initializing the largest number variable
        int max = num1;

        //Comparing the values and replacing the "Largest number" if the next number is greater
        max = num2 > max ? num2 : max;
        max = num3 > max ? num3 : max;
        max = num4 > max ? num4 : max;
        max = num5 > max ? num5 : max;

        //To print the result of the largest value
        System.out.println("\nThe largest number is: " + max);

    }
}