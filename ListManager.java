import java.util.*;
  
public class ListManager {
    public static void main(String[] args) throws Exception
    {
  
        try {
  
            
            ArrayList<String>
                arrlist1 = new ArrayList<String>();
  
           
            arrlist1.add("vasu"); 
            arrlist1.add("2");
            arrlist1.add("3");
            arrlist1.add("4");
            arrlist1.add("5");
  
            
            System.out.println("ArrayList before "
                              
                               + arrlist1);
  
            
            ArrayList<String>
                arrlist2 = new ArrayList<String>();
            arrlist2.add("vasu");
            arrlist2.add("5");
            arrlist2.add("7");
  
            System.out.println(
                                " to be removed : "
                               + arrlist2);
  
          
            
            arrlist1.removeAll(arrlist2);
  
            System.out.println("ArrayList after "
                               + "removeAll() operation : "
                               + arrlist1);
        }
  
        catch (NullPointerException e) {
            System.out.println("Exception thrown : " + e);
        }
    }
}