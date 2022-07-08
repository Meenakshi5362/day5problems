
public class power0f2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int basenumber=2;
		int result=1;
		for (int i=1; i<=31;i++)
		{
			result *=basenumber;
			System.out.println(basenumber+" power " + i +" is "+ result);
		}

	}

}
