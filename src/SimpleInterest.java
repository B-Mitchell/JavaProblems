import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        // write a simple java program that calculates simple interest
        Scanner scanner = new Scanner(System.in);
        //SI=PRT/100
        System.out.println("what is the principal ?");
        int principal = Integer.parseInt(scanner.nextLine());
        System.out.println("what is the Rate ?");
        int rate = Integer.parseInt(scanner.nextLine());
        System.out.println("what is the time ?");
        int time = Integer.parseInt(scanner.nextLine());
        //call the method
        int simpleInterest = simpleInterestMethod(principal,rate,time);
        System.out.println(simpleInterest);
    }
    static int simpleInterestMethod(int p,int r,int t) {
        int total = p * r * t;
        int simpleInterest = total/100;
        return simpleInterest;
    }
}
