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

	//UC-5
	void addMultipleContact()
	{
		while(true)
		{
			System.out.println("Want to add contact ?");
			System.out.println("Option 1:Yes");
			System.out.println("Option 2:No");
			int option = scannerObject.nextInt();
			switch(option)
			{
				case 1:
					addContact();
					break;
				case 2:
					System.out.println("Exiting..");
					break;
				default:System.out.println("Enter 1 or 2");
			}
			if(option == 2)
				break;
		}
	}
}
