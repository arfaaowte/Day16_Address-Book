import java.util.*;
class AddressBook {
	Scanner sc= new Scanner(System.in);
 	ArrayList persons;
 	//constructor
 	public AddressBook() 
	{
 		persons = new ArrayList();
 	}

 	//add new person record to arraylist after taking input
 	public void addPerson() 
	{
		System.out.println("Enter Name:");
        	String name = sc.nextLine();
		System.out.println("Enter Address:");
		String add = sc.nextLine();
		System.out.println("Enter phone number");
 		String pNum = sc.nextLine();
 		PersonInfo p = new PersonInfo(name, add, pNum);
 		//add the above PersonInfo object to arraylist
 		persons.add(p);
	}
	//search person record by name by iterating over arraylist
 	public void searchPerson (String n) 
	{
	 for (int i=0; i< persons.size(); i++) 
	{
 		PersonInfo p = (PersonInfo)persons.get(i);
 			if ( n.equals(p.name) ) 
			{
 				p.print();
 			}
 	} // end for
	 } // end searchPerson 
 	
	//delete person record by name by iterating over arraylist
	 public void deletePerson (String n) {
 		for (int i=0; i< persons.size(); i++) {
 			PersonInfo p = (PersonInfo)persons.get(i);
 			if ( n.equals(p.name) ) {
 				persons.remove(i);
 			}
 		}
 	} 

}

