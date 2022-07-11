import java.util.Scanner;

public class Vowel_Consonant {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter charachter to find it is vowel or consonant");
		
		String alphabet = scanner.next();
		char ch= alphabet.charAt(0);
		
		
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			
		System.out.println("Entered character "+ch+" is  Vowel"); 
		
		else 
			System.out.println("Entered character "+ch+" is Consonant");
		
		     

	}

}
