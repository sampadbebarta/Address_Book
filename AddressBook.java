import java.util.Scanner;
import java.util.ArrayList;

public class AddressBook {

	ArrayList<Contact> contactList = new ArrayList<Contact>(); //ArrayList to store contacts

	/* method to display contact manipulation menu */
	public void displayMenu() {
		System.out.println("Enter your choice: ");
		System.out.println("1. Add contact");
		System.out.println("2. Edit contact");
		System.out.println("3. Display contacts");
		System.out.println("4. Delete a contact");
		System.out.println("5. Exit");
	}

	/* method to direct control to respective contact manipulation action methods*/
	public void contactManagementMenu() {
		int choice;
		Scanner scan = new Scanner(System.in);
		do {
			displayMenu();
			choice = scan.nextInt();
			switch(choice) {
				case 1:
					addContact();
					System.out.println("Contact created.");
					break;
				case 2:
					editContact();
					break;
				case 3:
					displayContacts();
					break;
				case 4:
					deleteContacts();
					break;
				case 5:
					System.exit(0);

				default:
					System.out.println("Invalid choice.Try again.");
			}
		} while (choice != 5);

	}

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

	/* method to access contact to be edited */
	private void editContact() {
		int choice;
		if(contactList.size() == 0) {
			System.out.println("Contact list is currently empty.");
		}
		else {
			System.out.println("Enter the first name of the contact you want to edit: ");
			Scanner scan = new Scanner(System.in);
			String name = scan.next();
			for (int i = 0; i < contactList.size(); i++)
				if (contactList.get(i).getFirstName().equals(name) ) {
					do {
						choice = displayEditMenu();
						editActions(choice,contactList.get(i));
					} while (choice != 7);
				}
				else
					System.out.println("Contact doesn't exist");
		}
	}

	/* method to display edit menu */
	private int displayEditMenu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your choice: ");
		System.out.println("1. To edit house id ");
		System.out.println("2. To edit city ");
		System.out.println("3. To edit state ");
		System.out.println("4. To edit zip ");
		System.out.println("5. To edit phone number ");
		System.out.println("6. To edit email ");
		System.out.println("7. To exit edit zone ");
		int choice = scan.nextInt();
		return choice;

	}

	/* method to edit contact details */
	private void editActions(int choice , Contact contactx) {
		Scanner scan = new Scanner(System.in);
		switch(choice) {

			case 1:
				System.out.println("Enter new house id: ");
				String houseId = scan.next();
				contactx.setAddress(houseId);
				break;
			case 2:
				System.out.println("Enter new city: ");
				String city = scan.next();
				contactx.setCity(city);
				break;
			case 3:
				System.out.println("Enter new state: ");
				String state = scan.next();
				contactx.setState(state);
				break;
			case 4:
				System.out.println("Enter new zip code: ");
				String zip = scan.next();
				contactx.setZip(zip);
				break;
			case 5:
				System.out.println("Enter new phone number: ");
				String phoneNum = scan.next();
				contactx.setPhoneNum(phoneNum);
				break;
			case 6:
				System.out.println("Enter new email: ");
				String email = scan.next();
				contactx.setEmail(email);
				break;
			case 7:
				break;
			default:
				System.out.println("Invalid choice,try again.");
		}

	}

	/* method to display contact details of each contact in address book */
	private void displayContacts() {
		int i = 0;
		if(contactList.size() == 0)
			System.out.println("Contact list is empty!");
		else
			while (i < contactList.size()) {
				System.out.println(contactList.get(i));
				i++;
			}
	}

	/* method to delete a contact */
	private void deleteContacts() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first name of the contact you want to delete: ");
		String firstName = scan.next();
		System.out.println("Enter the last name of the contact you want to delete: ");
		String lastName = scan.next();

		for(int i = 0; i < contactList.size(); i++)
			if (contactList.get(i).getFirstName().equals(firstName)) {
				if (contactList.get(i).getLastName().equals(lastName))
					contactList.remove(contactList.get(i));
				else
					System.out.println("No such contact exists.");
			}

	}

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		AddressBook contactBook = new AddressBook(); //create new address book
		contactBook.contactManagementMenu();	     //show contact manipulation menu
	}

}
