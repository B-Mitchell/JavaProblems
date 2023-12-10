import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        //this program prints the multiplication table of any number
        Scanner scanner = new Scanner(System.in);
        //request the number from the user
        System.out.println("input your number.");
        int number = Integer.parseInt(scanner.nextLine());
        multiply(number);
    }
    static void multiply(int number) {
        for (int i = 0; i <= 12; i++) {
            int result = number * i;
            System.out.println(number + "*" + i + "=" +result);
        }
    }
}
