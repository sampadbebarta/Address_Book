/*Contact class*/
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

	/* getter and setter methods to access and modify contact details*/
	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String toString() {
		return " First name: " + this.firstName + " Last Name: " + this.lastName + " House Id: " + this.address + " City: " + this.city + " State: " + this.state + " Zip: " + this.zip + " Phone number: " + this.phoneNum + " Email: " + this.email;
	}

}
