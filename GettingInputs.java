import java.util.Scanner;

public class GettingInputs {
    public static void main(String []args){
        Scanner inputInt = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);
        System.out.print(" Enter the year: ");
        int year = inputInt.nextInt();
        System.out.print(" Enter the genre: ");
        String genre = inputString.nextLine();
        System.out.print(" Enter the album: ");
        String album = inputString.nextLine();
        System.out.print(" Enter the song title: ");
        String title = inputString.nextLine();
        System.out.print(" Enter the artist: ");
        String artist = inputString.nextLine();
        System.out.println(" ----------------------");
        System.out.println(" SONG DETAILS");
        System.out.println(" ----------------------");
        System.out.println(" Year released: " + year);
        System.out.println(" Genre: " + genre);
        System.out.println(" Album: " + album);
        System.out.println(" Title: " + "\"" + title + "\"");
        System.out.println(" Artist: " + artist);
        inputInt.close();
        inputString.close();
    }
}
