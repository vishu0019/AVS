package Pkg1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;;

public class AryList {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Array List Example");
		/*
			Type Safe Collection = same type of elements are added 
			Un-type Safe Collection= diff types of elements can be added
		
		*/
		System.out.println("=================================");
		//Type Safe Collection
				ArrayList<String>   list1 = new ArrayList<>();
				list1.add("Ajinkya");
				list1.add("Ayansh");				//Element of same data type (String/int) is added
				list1.add("Amol");
				list1.add("Ayansh");					//Duplicate elements allowed
			//System.out.println(list1);
			//	System.out.println(list1.get(1));		//Order is Preserved
			
			//System.out.println(list1.get(2));
			
		
		//Type Un-Safe Collection
//				 ArrayList list = new ArrayList();
//				 list.add("JavaLanguage");					//Element of String type is added
//				 list.add(123);								//Element of int type is added
//				 list.add(true);
//				 System.out.println(list);
				 
		//Operations
				//list1.remove(2) ;				//remove
				System.out.println(list1);
				
				System.out.println(list1.get(1));	//get
				
				System.out.println("Total Elements "+ list1.size()); // Size 
				
				System.out.println(list1.contains("Ajinkya"));  //to check specific element
				
				System.out.println("=================================");
				
//				LinkedList<String> lst = new LinkedList<String>();
//				//lst.add("Ajinkya");
//				lst.addAll(list1);
//				System.out.println(lst);
				
				
				//Traversing - Iterator
//				Iterator itr = list1.iterator();
//				while(itr.hasNext()) {
//					System.out.println(itr.next());
//				}
				
				//Traversing - Enhanced For-Each Loop
//				for (String str : list1) {
//					System.out.println(str);
//					Thread.sleep(2000);
//				}
				
				//Traversing - List Iterator
//				ListIterator<String> ltr = list1.listIterator();
//				while(ltr.hasNext()) {
//					System.out.println(ltr.next());
//				}
				
				// Simple For loop
//		        System.out.println("==============> 1. Simple For loop Example.");
//				for (int i = list1.size()-1; i >=0 ; i--) {
//		            System.out.println(list1.get(i));
//		            }
//				
//				for (int i = 0; i > list1.size() ; i++) {
//		            System.out.println(list1.get(i));
//		            }
				
				list1.forEach((e)->{
					System.out.println(e);
					});
				
				
		
				
		

		

	}

}
