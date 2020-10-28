package com.addresssbooksystem;

public class AddressBookDao {

	HashMap<String,PersonEntity> personMap = new HashMap<String, PersonEntity>();
	Scanner scannerObject = new Scanner(System.in);

	//UC-2
	void addContact()
	{
		PersonEntity person = new PersonEntity();
		
		System.out.println("Enter first name: ");
		String personName=scannerObject.next();
		person.setFirstName(personName);
		
		System.out.println("Enter last name: ");
		person.setLastName(scannerObject.next());
		
		System.out.println("Enter Addreess: ");
		person.setAddress(scannerObject.next());
		
		System.out.println("Enter city: ");
		person.setCity(scannerObject.next());
		
		System.out.println("Enter state: ");
		person.setState(scannerObject.next());
		
		System.out.println("Enter zip: ");
		person.setZip(scannerObject.nextLong());
		
		System.out.println("Enter phone number: ");
		person.setPhoneNumber(scannerObject.nextLong());
		
		System.out.println("Enter email: ");
		person.setEmail(scannerObject.next());
		
		personMap.put(personName, person);
		System.out.println("Contact added !!");
	}

	//UC-3
	void editContact()
	{
		System.out.println("Enter person name to edit: ");
		String personName = scannerObject.next();
		PersonEntity person = personMap.get(personName);
		
		while(true)
		{
			System.out.println("Which field to edit ?");
			System.out.println("Option 1:Address");
			System.out.println("Option 2:City");
			System.out.println("Option 3:State");
			System.out.println("Option 4:Zip");
			System.out.println("Option 5:Phone number");
			System.out.println("Option 6:Email");
			System.out.println("Option 7:Quit");
			int option = scannerObject.nextInt();
			
			switch(option)
			{
				case 1:editAddress(person);
						break;
				case 2:editCity(person);
						break;
				case 3:editState(person);
						break;
				case 4:editZip(person);
						break;
				case 5:editPhoneNumber(person);
						break;
				case 6:editEmail(person);
						break;
				case 7:System.out.println("Exiting..");
						break;
				default:System.out.println("Enter numbers between 1 to 7");
			}
			if( option == 7)
				break;
		}
	}

	private void editEmail(PersonEntity person) {
		System.out.println("Enter new email: ");
		person.setEmail(scannerObject.next());
		System.out.println("Email edited !!");
	}

	private void editPhoneNumber(PersonEntity person) {
		System.out.println("Enter new phone number: ");
		person.setPhoneNumber(scannerObject.nextLong());
		System.out.println("Phone number edited !!");
	}

	private void editZip(PersonEntity person) {
		System.out.println("Enter new Zip: ");
		person.setZip(scannerObject.nextLong());
		System.out.println("Zip edited !!");
	}

	private void editState(PersonEntity person) {
		System.out.println("Enter new state: ");
		person.setState(scannerObject.next());
		System.out.println("State edited !!");
	}

	private void editCity(PersonEntity person) {
		System.out.println("Enter new City: ");
		person.setCity(scannerObject.next());
		System.out.println("City edited !!");
	}

	private void editAddress(PersonEntity person) {
		System.out.println("Enter new Address: ");
		person.setAddress(scannerObject.next());
		System.out.println("Address edited !!");
	}

	//UC-4
	void deleteContact()
	{
		System.out.println("Enter the name of the person to delete");
		String personName = scannerObject.next();
		personMap.remove(personName);
		System.out.println("Details deleted");
	}	
}
