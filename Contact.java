public class Contact {
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phoneNum;
	private String email;

	/* Constructor */
	public Contact(String firstName , String lastName , String address , String city , String state , String zip , String phoneNum , String email ) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNum = phoneNum;
		this.email = email;
	}

	public String toString() {
		return " First name: " + this.firstName + " Last Name: " + this.lastName + " House Id: " + this.address + " City: " + this.city + " State: " + this.state + " Zip: " + this.zip + " Phone number: " + this.phoneNum + " Email: " + this.email;
	}

}
