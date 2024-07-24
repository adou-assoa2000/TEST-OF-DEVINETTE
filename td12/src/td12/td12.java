package td12;
import java.util.*;

public class td12 {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random(); 
		
		int min_number = 1, max_number = 100,a = 1;
		int random_number =  min_number + rand.nextInt((max_number - min_number) + 1);
		
		System.out.println("Bienvenue, nous jouons à un jeu de devinette "
				+ "et nous vous proposons de deviner un entier compris entre 1 et 100 ");
		
		do {
			System.out.println("Veillez entrer le nombre deviné ici : ");
			
			int number = sc.nextInt();
			
			if(a++ == 10) {
				System.out.println("Vous avez perdu :-(");
			break;
			}
			   
			
			else if(number == random_number ) {
				
				System.out.println( "Vous avez gagné :-)"); 
				break;
				}
			
			else if(number > random_number )
				System.out.println( "le nombre deviné est supérieur au nombre aléatoire");
			
			else 
				System.out.println( "le nombre deviné est inférieur au nombre aléatoire");
			
		}while(true);
		
		
	}
	
}
