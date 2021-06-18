import java.util.Scanner;
class Menu
{
	public static void main(String[] agrs)
	{
		int price;
		Scanner sc=new Scanner(System.in);
		System.out.println("do you want to order");
		System.out.println("enter 1 for menu");
		
		int n =sc.nextInt();
		if(n==1)
		{
			System.out.println("display menu");
			System.out.println("snacks , enter 1");
			System.out.println("lunch, enter 2");
			System.out.println("dinner,enter 3");
			System.out.println("drinks, enter 4");
			int num=sc.nextInt();
			switch(num)
			{
				case 1:System.out.println("idli cost-40 ,enter 1");
				System.out.println("dosa cost-30 ,enter 2");
				System.out.println("poha cost-60 ,enter 3");
				int choice1 =sc.nextInt();
				System.out.println("enter the quantity you want");
				int quantity1 =sc.nextInt();
				if(choice1 ==1)
				{
					price=quantity1*40;
					System.out.println("bill="+price);
				}
				else if(choice1==2)
				{
					price=quantity1*30;
					System.out.println("bill="+price);
				}
				else if(choice1==3)
				{
					price=quantity1*60;
					System.out.println("bill="+price);
				}
				break;
				
				
				case 2:System.out.println("daal fry cost-80 ,enter 1");
				System.out.println("paneer cost-130 ,enter 2");
				System.out.println("chicken cost-160 ,enter 3");
				int choice2 =sc.nextInt();
				System.out.println("enter the quantity you want");
				int quantity2 =sc.nextInt();
				if(choice2 == 1)
				{
					price=quantity2*80;
					System.out.println("bill="+price);
				}
				else if(choice2 == 2)
				{
					price=quantity2*130;
					System.out.println("bill="+price);
				}
				else if(choice2 == 3)
				{
					price=quantity2*160;
					System.out.println("bill="+price);
				}
				break;
				case 3:System.out.println("fried rice with fravycost-140 ,enter 1");
				System.out.println("puneer butter masalacost-230 ,enter 2");
				System.out.println("chicken korma cost-260 ,enter 3");
				int choice3 =sc.nextInt();
				System.out.println("enter the quantity you want");
				int quantity3 =sc.nextInt();
				if(choice3==1)
				{
					price=quantity3*140;
					System.out.println("bill="+price);
				}
				else if(choice3==2)
				{
					price=quantity3*230;
					System.out.println("bill="+price);
				}
				else if(choice3==3)
				{
					price=quantity3*260;
					System.out.println("bill="+price);
				}
				break;
				case 4:System.out.println("mojito cost-140 ,enter 1");
				System.out.println("wine cost-310 ,enter 2");
				System.out.println("fire beer cost-260 ,enter 3");
				int choice4 =sc.nextInt();
				System.out.println("enter the quantity you want");
				int quantity4 =sc.nextInt();
				if(choice4==1)
				{
					price=quantity4*140;
					System.out.println("bill="+price);
				}
				else if(choice4==2)
				{
					price=quantity4*310;
					System.out.println("bill="+price);
				}
				else if(choice4==3)
				{
					price=quantity4*260;
					System.out.println("bill="+price);
					
				}
				break;
				
				default:
				{
					System.out.println("please input the correct number");
			}
			}
		}
		else
		{
			System.out.println("Thanks for visiting");
		}
	}
}
		

		