import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the maximum size of the multiplication table: ");
        int maxNumber = scanner.nextInt();

         System.out.println("Multiplication table:");

        int[][] table = new int[maxNumber][maxNumber];

        
        
        for (int i = 1; i <= maxNumber; i++) {
            for (int j = 1; j <= maxNumber; j++) {
                table[i - 1][j - 1] = i * j;
            }
        }

        
        for (int i = 0; i < maxNumber; i++) {
            for (int j = 0; j < maxNumber; j++) {
                System.out.printf("%4d", table[i][j]);
            }
            System.out.println();
        }
    }
}