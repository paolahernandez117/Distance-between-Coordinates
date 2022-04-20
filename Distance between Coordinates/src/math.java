import java.util.Scanner;
public class math {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter the coordinates of where you are right now (example: 1234 782):");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        System.out.println("\nEnter the coordinates of where you would like to go: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double a = x1-x2;
        double b = y1-y2;
        double newa= Math.pow(a, 2);
        double newb = Math.pow(b,2);
        double distance = Math.sqrt((newa)+(newb));

        System.out.println("\nThe distance between your current location to the destination you selected is: "+distance+" miles.");


    }
}
