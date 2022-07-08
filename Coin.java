import java.util.*;

public class Coin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,head = 0,tail = 0,i;
		double tempflip=0.5;
		System.out.println("No of time to flip coin :");
		a = sc.nextInt();
		for( i=0;i<a;i++) {
			Random r = new Random();
			double dice = r.nextDouble(1);

	//	System.out.println(dice);
		if (dice < tempflip) {
			tail +=1;
		} 
		else {
			head +=1;
		}
		
			
	}
		System.out.println("No of Head is " +head);
		System.out.println("No of Tail is " +tail);
		double perhead = (head*100)/a;
		double pertail=(tail*100)/a;
		
		System.out.println(perhead);
		System.out.println(pertail);
		

}
}
