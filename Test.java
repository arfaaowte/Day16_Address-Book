import java.util.*;

public class Test
{

        public static void main(String args[])
        {
                Scanner sc= new Scanner(System.in);
                AddressBook ab = new AddressBook();
		String s;
                int ch;
                while(true)
                {
                System.out.println("-----------------------");
                System.out.println("Address Book Features :");
                System.out.println("1.Add Use\n2.To Search\n3.To delete\n4.Quit");
		ch = sc.nextInt();
                //ch = Integer.parseInt(input);
                switch (ch)
                {
                        case 1:
				System.out.println("case1");
                                ab.addPerson();
                                break;
                        case 2:
                                ab.searchPerson();
                                break;
                        case 3:
                                ab.deletePerson();
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
