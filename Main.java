import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.println("Enter your message: ");
            String msg = scanner.nextLine();

            if(msg.length() < 54)
            {
                for (int i = 0; i <= 60; i++)
                {
                    System.out.print("*");
                }
                System.out.print("\n***");

                int leftSpace = (54 - (msg.length())/2);
                int rightSpace = 54 - msg.length() - leftSpace;
                for (int i = 0; i <= leftSpace; i++)
                {
                    System.out.print(" ");
                }
                System.out.print(msg);
                System.out.print("***");

                for (int i = 0; i <= rightSpace; i++)
                {
                    System.out.print(" ");
                }
                System.out.print("\n***");

                for ( int i = 0; i <= 60; i++)
                {
                    System.out.print("*");
                }
                System.out.print("");
            }
        }
    }