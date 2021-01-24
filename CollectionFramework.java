package Pkg1;
import java.util.*;
public class CollectionFramework {

	public static void main(String[] args) 
	{
		System.out.println("Welcome to Java Collection Framework");
	 
	//ArrayList 
			 ArrayList<String> list = new ArrayList<String>();
		     list.add("Ajay");
		     list.add("Ajinkya");
		     Iterator itr = list.iterator();
				     while(itr.hasNext()) 
				         {
				    	 	System.out.println(itr.next());
				    	 }
				     
	//LinkedList
			 LinkedList<String> lnk = new LinkedList<String>();
			 lnk.add("Baba");
			 lnk.add("Bus");
			 Iterator itr1 = lnk.iterator();
			 	while(itr1.hasNext()) 
			 		{
			 				System.out.println(itr1.next());
			 		}
			 
	}
     
     
     
    
}
