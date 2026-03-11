import java.util.Scanner;

public class OOPSBannerUC8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Banner Message: ");
        String message = sc.nextLine();

        System.out.println("*****************************");
        System.out.println("*                           *");
        System.out.println("*   " + message + "   *");
        System.out.println("*                           *");
        System.out.println("*****************************");

        sc.close();
    }
}