import java.util.Arrays;
import java.util.Collections;
 
public class ListManager1
{
    public static void main(String[] args)
    {
        String arr[] = {"vasu",
                        "bhasin",
                        "coforge"
                       };
 
        
        Arrays.sort(arr);
        System.out.printf("Modified arr[] : \n%s\n\n",
                          Arrays.toString(arr));
 

    }
}