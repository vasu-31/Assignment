class Reverse
{


	public static void main(String args[])
	{
		String s="vasu";
		String revS="";
		for(int i=s.length()-1;i>=0;i--)
		{
			revS=revS+s.charAt(i);
		}
		System.out.println("original  "+s);
		System.out.println("reverse   "  +revS);
	}
}
