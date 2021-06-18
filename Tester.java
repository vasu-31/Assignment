 import java.util.*;
 import java.util.object;
 
 class Tester
{
public static void main(String[] args)
{
List<String> list1=new ArrayList<String>();
List<object>list2=list1;
list2.add(new Integer(12));
System.out.println(list2.size());
}
}
