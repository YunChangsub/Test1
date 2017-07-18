import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		System.out.println("Hello World");
		
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		
		String arr[] = text.split(" ");
		String ar[] = text.split("");
		
		for (int i = arr.length-1; i >= 0 ; i--)
		{
			System.out.print(arr[i].replaceAll("[?]", ""));
			if (i > 0) System.out.print(" ");
		}
		
		int num = 0;
		for ( int i = 0; i < ar.length; i++ ) 
		{
			int j;
			for (j = 0; j < ar[i].length(); j++) 
			{
				if (ar[i].charAt( j ) < 'A') 
				   break;
				else if (ar[i].charAt( j ) > 'z') 
				   break;
				else if (ar[i].charAt( j ) > 'Z' && ar[i].charAt( j ) < 'a' ) 
				   break;	   
			}
			
			if (j == ar[i].length()) 
				num++;
		}
		System.out.println("\nÀüÃ¼ ¼ö : " + num);
	}
}
