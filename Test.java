import java.util.*;

public class Test
{
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		AddressBook ab = new AddressBook();
		String input, s;
		int ch;
		while(true)
		{
		System.out.println("-----------------------");
		System.out.println("Address Book Features :");
		System.out.println("1.Add Use\n2.To Search\n3.To delete\n4.Quit");
		ch = Integer.parseInt(input);
		switch (ch)
		{
			case 1:
				ab.addperson();
				break;
			case 2:
				System.out.println("Enter name to search:");
				s = sc.nextLine();
				ab.search(s);
				break;
			case 3:
				System.out.println("Enter name to delete");
				s = sc.nextLine();
				ab.deletePerson(s);
				break;
			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice");
		}
		}	
	}

}
