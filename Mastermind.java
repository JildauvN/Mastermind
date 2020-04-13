import java.util.Random;
import java.util.Scanner;
//import java.math;
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
		System.out.println("Probeer de geheime code te raden, deze bestaat uit vier letters uit de verzameling \na, b, c, d, e of f, een letter mag vaker voorkomen");
		System.out.println("Als u wilt stoppen typt u \"q\".");
		
		
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.println("Voer uw code in:");
        String woord = input.nextLine();
		while (!code.equals(woord)) {
			if (woord.equals("q")){
				System.out.println("U heeft het spel gestopt, bedankt voor het spelen.");
				System.exit(0);
			}
			int aantalGoed = aantalGoedePlek(code, woord);
			int aantalBijna = aantalBijnaGoed(code, woord);
			System.out.println("Het aantal goede letters op de juiste plaats is: " + aantalGoed);
			System.out.println("Het aantal goede letters op de verkeerde plaats is: " + aantalBijna);
			System.out.println("Voer uw nieuwe code in:");
			woord = input.nextLine();
		}
		System.out.println("Gefeliciteerd, " + woord + " komt overeen met de geheime code. "); 
		
		        
        System.out.println("");
        System.out.println("Het spel is nu afgelopen. Bedankt voor het spelen!!");
    }
	
	
	static int aantalGoedePlek(String goed, String gok){
		int x = 0;
		for (int j = 0; j < 4; j++){
			if (goed.charAt(j) == (gok.charAt(j))){
				x++;
			}
		}
		return x;
	}
	
	static int aantalBijnaGoed(String goed, String gok) {
		int y = 4;
		int z = 4;
		for (int k = 0; k < 4; k++){
			if (goed.indexOf(gok.charAt(k)) == -1){
				y--; 
			}
		}
		for (int l = 0; l < 4; l++){
			if (gok.indexOf(goed.charAt(l)) == -1){
				z--; 
			}	
		}
		y = y - aantalGoedePlek(goed, gok);
		z = z - aantalGoedePlek(goed, gok);
		if (z <= y){
			return z;
		} else {
			return y;
		}
	}
}

/* Mastermind

De opdracht
Programmeer het spel Mastermind tegen de computer, waarbij je gebruik maakt van Object Oriented Programming. Hieronder staat het spelverloop uitgelegd.

Spelverloop
De computer kiest random vier letters uit de verzameling a, b, c, d, e, f. De gekozen rij wordt verder code genoemd.
De volgorde is van belang; een letter mag vaker voorkomen.
De gebruiker moet de verborgen code proberen te achterhalen.
De gebruiker geeft een code van vier letters op.
De computer geeft een reactie op de ingegeven code, door te antwoorden met:
  het aantal correcte letters die op de juiste plaats staan
  het aantal correcte letters dat NIET op de juiste plaats staat
De gebruiker geeft nu een nieuwe code op, gebaseerd op deze nieuwe informatie.
Deze loop blijft zich herhalen tot de juiste code is geraden tot OF;
  Als alle vier letters op de juiste plaats staan, en dus is de code gekraakt.
OF;
Een lopend spel kan worden beëindigd door de speler door het invoeren van een q; 

Het spel moet een commandline spel zijn. Swing, Spring of HTML is niet toegestaan.
 */