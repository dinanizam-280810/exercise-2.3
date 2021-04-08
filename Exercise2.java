package exercise2;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
for(int i=0;i<999999999;i++){
        paper types = new paper();
        types.papertypes();

        System.out.println("\nChoose the types of paper to get details:");
        int choosetypes;
        choosetypes = input.nextInt();

        switch (choosetypes) {
            case 1:
                types.choosing("Bond paper", "\nThis type of paper is stronger and more durable than the eaverage sheet of paper. \nInstead of being made from low grade wood pulp, it is mostly made up of rag pulp. \nIt's perfect for letterheads, typed reports and envelopes.");
                break;
            case 2:
                types.choosing("Gloss coated paper", "\nGloss paper is typically used for flyers and brochures as it has a high shine. \nAs the ink dries well there is no need for a seal varnish as the ink does not rub off.");
                break;
            case 3:
                types.choosing("Matt coated paper", "\nMatt paper is the opposite to gloss – it is coated with a matt finish to produce a paper that isn’t shiny, preventing glare. \nThis type of paper is perfect for reports, flyers and leaflets.");
                break;
            case 4:
                types.choosing("Recycled paper", "\nMade from re-used paper products, recycled paper is perfect for those who are trying to reduce their environmental impact. \nIt can be used for most documents including reports, memo paper and forms.");

                break;
            case 5:
                types.choosing("Silk coated paper", "\nThe interim between gloss and matt, silk coated paper has a smooth silky coating, leaving it smooth to the touch but without the shine of glass paper. \nThis type of paper can be used for many things such as magazines, books and catalogues.");
                break;
            case 6:
                types.choosing("Uncoated paper", "\nTypically found in most office printers, uncoated paper has no coating, making it excellent for ink receptivity and absorbency. \nAs it is uncoated it has the advantage of being used by both printer and pen, ideal for forms, letterheads and memo paper.");
                break;
            case 7:
                types.choosing("Watermarked paper", "\nUsed in high quality paper watermarked paper give a feel of luxury and high quality. \nTo create its desired effect an impression is pressed into the paper by attaching a wire pattern. \nThis type of paper is commonly used as a security feature for important documents, including exam certificates.");
            default:
                System.out.print("Wrong number");

        }

        paper size = new paper();
        size.sizepaper();

        paper weight = new paper();
        weight.paperweight();

        paper price = new paper();
        price.prices();
        
    }
}}
