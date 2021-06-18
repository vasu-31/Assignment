import java.util.Scanner;
public class CharAt{

    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);
		char ch = input.next().charAt(0);
		String str = input.nextLine();
		System.out.println("input" +str);
		String out = RemoveCharater(str,ch);
		
		System.out.println("output"+out);

    }
	static String RemoveCharater(String in,char ch)
	{
		int index = in.indexOf(ch);
		return in.substring(0, index) + in.substring(index + 1);
	}
}