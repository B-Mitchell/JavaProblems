import java.util.Scanner;
public class Second {
    public static void main(String[] args) {
        //write a program to convert from Fahrenheit to Celsius
        //formula is (F−32)*5/9
        Scanner scanner = new Scanner(System.in);
        System.out.println("degrees in fahrenheit ?");
        int fahrenheit = Integer.parseInt(scanner.nextLine());
        //call the method
        System.out.println(convert(fahrenheit));

    }
    static int convert(int fahrenheit) {
        int firstHalf = fahrenheit - 32;
        return firstHalf * 5/9;
    }
}
