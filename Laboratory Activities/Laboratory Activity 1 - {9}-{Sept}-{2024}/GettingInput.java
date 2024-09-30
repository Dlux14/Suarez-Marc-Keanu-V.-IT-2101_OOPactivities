import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
            
            Scanner scanner = new Scanner(System.in);
      
            System.out.print("Enter the year: ");
            String year = scanner.nextLine(); 
            System.out.print("Enter the genre: ");
            String genre = scanner.nextLine(); 
            System.out.print("Enter the album name: ");
            String album = scanner.nextLine();
            System.out.print("Enter the song title: ");
            String title = scanner.nextLine();
            System.out.print("Enter the artist name: ");
            String artist = scanner.nextLine();

    

            

      System.out.println("--------------------");
      System.out.println("SONG DETAILS");
      System.out.println("--------------------");

      
            System.out.println("Year: " + year);
            System.out.println("Genre: " + genre);
            System.out.println("Album: " + album);
            System.out.println("Title: \"" + title + "\"");
            System.out.println("Artist: " + artist);
        }
    }



