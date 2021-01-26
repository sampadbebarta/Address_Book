import java.util.Scanner;

public class AddressBook {
	/* method to get contact details from user */
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
		System.out.println(newcontact);
		scan.close();
	}

	public static void main(String[] args) {
		AddressBook contactbook = new AddressBook();
	    	contactbook.addContact();

	}

}
