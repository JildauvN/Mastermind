import java.util.Random;
import java.util.Scanner;
// Code genereren
// FD 
// TS 
// TS 
public class Mastermind {
    public static void main(String[] args) {
        System.out.println("Welkom bij Mastermind, De eindcode is:");
        Random ra = new Random();
		String code = "";
        for(int i = 0; i < 4; i++){
            int getal = ra.nextInt(6) + 97;
           	char a = (char) getal;
			code = code.concat( ("" + a));
        }
		System.out.println(code);
		
		
        
		Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.println("Voer uw code in");
        String woord = input.nextLine();
        char eersteLetterRaden = woord.charAt(0);


        System.out.println(eersteLetterRaden);
          System.out.println("");
          System.out.println("Bedankt voor het spelen!!");
    }
}