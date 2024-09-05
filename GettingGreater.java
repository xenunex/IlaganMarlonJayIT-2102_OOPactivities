import java.util.Scanner;

public class GettingGreater {
    public static void main(String []args){
        Scanner inputChar = new Scanner(System.in);
        System.out.println(" Getting the Greater Value");
        System.out.print(" Enter first character: ");
        char firstChar = inputChar.next().charAt(0);
        System.out.print(" Enter second character: ");
        char secondChar = inputChar.next().charAt(0);
        int greaterVal = Math.max(firstChar, secondChar);
        char greaterChar = (char) greaterVal;
        System.out.println("------------------------");
        System.out.println(" The character with greater value is: " + greaterChar);
        System.out.println("------------------------");
        System.out.println(" Showing the ASCII Codes");
        System.out.println(" " + firstChar + " : " + (int) firstChar);
        System.out.println(" " + secondChar + " : " + (int) secondChar);
    }
}
