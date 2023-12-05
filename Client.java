import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        ConcreteReceipt1 r1 = new ConcreteReceipt1();
        ConcreteReceipt2 r2 = new ConcreteReceipt2();
//Receipt3 r3=new Receipt3();
        do {
            System.out.println("1.Header1");
            System.out.println("1.Receipt1");
            System.out.println("1.Footer1");

            System.out.println("2.Header2");
            System.out.println("2.Receipt2");
            System.out.println("2.Footer2");

            System.out.println("3.Exit");

            System.out.println("\tEnter Your Choice:");
            int ch = sn.nextInt();
            switch (ch) {
                case 1:
                    r1.r1_body();
                    break;
                case 2:
                    r2.r2_body();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter Valid Choice");
            }
        } while (true);
    }
}
