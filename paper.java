package exercise2;

import java.util.Scanner;

public class paper {

    Scanner input = new Scanner(System.in);
    String a, b;
    double h, i;

    void papertypes() {
        System.out.println("\nA GUIDE TO PAPER TYPES AND SIZES");
        System.out.println("\nHere Is The Paper Types:");

        System.out.println("1.Bond paper\n2.Gloss coated paper\n3.Matt coated paper\n4.Recycled paper\n5.Silk coated paper\n6.Uncoated paper\n7.Watermarked paper");

    }

    void choosing(String a, String b) {

        System.out.print("\nType: " + a);
        System.out.print("\nDescription: " + b);

    }

    void sizepaper() {
        System.out.print("\n\n-----------------------------------------------------------------");
        System.out.print("\n\nSize: \t\tWidth * Height (mm): \t\tWidth * Height (in): ");
        System.out.println("\nA0	\t841 x 1189 mm	\t\t33.1 x 46.8 in\n"
                + "A1	\t594 x 841 mm	\t\t23.4 x 33.1 in\n"
                + "A2	\t420 x 594 mm	\t\t16.5 x 23.4 in\n"
                + "A3	\t297 x 420 mm	\t\t11.7 x 16.5 in\n"
                + "A4	\t210 x 297 mm	\t\t8.3 x 11.7 in\n"
                + "A5	\t148 x 210 mm	\t\t5.8 x 8.3 in\n"
                + "A6	\t105 x 148 mm	\t\t4.1 5.8 in\n"
                + "A7	\t74 x 105 mm	\t\t2.9 x 4.1 in\n"
                + "A8	\t52 x 74 mm	\t\t2.0 x 2.9 in\n"
                + "A9	\t37 x 52 mm	\t\t1.5 x 2.0 in\n"
                + "A10	\t26 x 37 mm	\t\t1.0 x 1.5 in");
        System.out.print("\nPaper Weight Description");
    }

    void paperweight() {
        System.out.print("\n\nWeight: \t\tFeels Similar to: ");
        System.out.print("\n35-55 gsm	\tMost newspapers\n"
                + "90 gsm	\t\tMid-market magazine inner pages\n"
                + "130-250 gsm	\tA good quality promotional poster\n"
                + "180-250 gsm	\tMid-market magazine cover\n"
                + "350 gsm	\t\tMost reasonable quality business cards");

        System.out.print("\n\nNotes: The higher the gsm the better quality and feel of the paper. \nStandard paper weights are between 75gsm and 100gsm for common business applications; \nphoto paper is much higher and goes up to 280gsm in weight.");
        System.out.print("\n\n-----------------------------------------------------------------\n");
        System.out.println("\nPrice Of Paper");
    }

    void prices() {

        System.out.println("\n1.Bond paper = RM 3.00(1pcs)\n2.Gloss coated paper = RM 0.40(1pcs)\n3.Matt coated paper = RM 1.20(1pcs)\n4.Recycled paper = RM 0.60(1 pcs)\n5.Silk coated paper = RM 0.80(1 pcs)\n6.Uncoated paper = RM 302.00(2pcs)\n7.Watermarked paper = RM 95.00(500sheets)");
        System.out.print("\n\nEnter types of paper based on the above: ");
        int enter;
        enter = input.nextInt();
        switch (enter) {
            case 1:
                System.out.print("\nEnter how much do you want to purchase: ");

                double i = input.nextDouble();
                double h = 3;
                double total = price(h, i);
System.out.print("\n");
                break;
            case 2:
                System.out.print("\nEnter how much do you want to purchase: ");
                double k = input.nextDouble();
                System.out.printf("Total:RM %.2f\n", 0.40 * k);
                break;
            case 3:
                System.out.print("\nEnter how much do you want to purchase: ");
                double l = input.nextDouble();
                System.out.printf("Total:RM %.2f\n", 1.20 * l);
                break;
            case 4:
                System.out.print("\nEnter how much do you want to purchase: ");
                double m = input.nextDouble();
                System.out.printf("Total:RM %.2f\n", 0.60 * m);
                break;
            case 5:
                System.out.print("\nEnter how much do you want to purchase: ");
                double n = input.nextDouble();
                System.out.printf("Total:RM %.2f\n", 0.80 * n);
                break;
            case 6:
                System.out.print("\nEnter how much do you want to purchase: ");
                double o = input.nextDouble();
                System.out.printf("Total:RM %.2f\n", 302.00 * o);
                break;
            case 7:
                System.out.print("\nEnter how much do you want to purchase: ");
                double p = input.nextDouble();
                System.out.printf("Total:RM %.2f\n", 95.00 * p);
                break;
            default:
                System.out.print("Not in the list\n");

        }

    }

    static double price(double h, double i) {
        System.out.printf("Total:RM %.2f", h * i);
        return h * i;

    }

}
