import java.util.Scanner;
import java.util.ArrayList;

public class AddressBook {

	ArrayList<Contact> contactList = new ArrayList<Contact>();

	/* method to add contact */
	public void addContact() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter first name: ");
		String firstName = scan.next();

		System.out.println("Enter last name: ");
		String lastName = scan.next();

		System.out.println("Enter house id: ");
		String houseId = scan.next();

		System.out.println("Enter city: ");
		String city = scan.next();

		System.out.println("Enter state: ");
		String state = scan.next();

		System.out.println("Enter zip code: ");
		String zip = scan.next();

		System.out.println("Enter phone number: ");
		String phoneNum = scan.next();

		System.out.println("Enter email: ");
		String email = scan.next();

		Contact newcontact = new Contact(firstName , lastName , houseId , city , state , zip , phoneNum , email);
		contactList.add(newcontact);
	}

	private void displayContacts() {
		int i = 0;
		while (i < contactList.size()) {
		System.out.println(contactList.get(i));
		System.out.println();
		i++;
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		AddressBook contactBook = new AddressBook();
		contactBook.addContact();
		contactBook.addContact();
		contactBook.displayContacts();

	}
}
