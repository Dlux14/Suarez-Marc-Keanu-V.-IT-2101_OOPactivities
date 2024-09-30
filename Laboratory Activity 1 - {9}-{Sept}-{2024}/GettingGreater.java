import java.util.Scanner;
public class Main{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first character: ");
        char char1 = scanner.next().charAt(0);
        System.out.print("Enter the second character: ");
        char char2 = scanner.next().charAt(0);

        int ascii1 = (int) char1;
        int ascii2 = (int) char2;

        char greaterChar = (char) Math.max(ascii1, ascii2);
        System.out.println("------------------------------");
        System.out.println("The character with the greater value is: " + greaterChar);
        System.out.println("-------------------------------");
System.out.println("Showing the ASCII Codes");
        System.out.println(char1 + ": " + ascii1);
        System.out.println(char2 + ": " + ascii2);

        scanner.close();
    }
}
