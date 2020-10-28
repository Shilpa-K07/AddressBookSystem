package com.addresssbooksystem;

public class AddressBookDao {
	HashMap<String, ArrayList<HashMap>> addressBookDict = new HashMap<String,ArrayList<HashMap>>();
	Scanner scannerObject = new Scanner(System.in);
	
	HashMap addContact(String addressBookName)
	{
		PersonEntity person = new PersonEntity();
		HashMap<String,PersonEntity> personMap = new HashMap<String, PersonEntity>();
		
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
		return personMap;
	}

	void addMultipleContact(String addressBookName)
	{
		ArrayList<HashMap> personMapList = new ArrayList<HashMap>();
		while(true)
		{
			System.out.println("Want to add contact ?");
			System.out.println("Option 1:Yes");
			System.out.println("Option 2:No");
			int option = scannerObject.nextInt();
			switch(option)
			{
				case 1:
					personMapList.add(addContact(addressBookName));
					break;
				case 2:
					System.out.println("Exiting..");
					break;
				default:System.out.println("Enter 1 or 2");
			}
			if(option == 2)
				break;
		}
		addressBookDict.put(addressBookName, personMapList);
	}
	//UC-6
	void addNewAddressBook()
	{
		System.out.println("Enter name of address book");
		String addressBookName = scannerObject.next(); 
		addMultipleContact(addressBookName);
	}
	void displayAddressBook()
	{
		Set set = addressBookDict.entrySet();
		Iterator iterator = set.iterator();
		while(iterator.hasNext())
		{
			Map.Entry entry = (Map.Entry)iterator.next();
			System.out.println("addresbookname: "+entry.getKey());
			ArrayList<HashMap>list =addressBookDict.get(entry.getKey());
			
			for(int i=0;i<list.size();i++)
			{
				HashMap<String,PersonEntity> hashMap = list.get(i);
				
				Set hashSet = hashMap.entrySet();
				Iterator hashSetIterator = hashSet.iterator();
				while(hashSetIterator.hasNext())
				{
					Map.Entry hashEntry = (Map.Entry)hashSetIterator.next();
					System.out.println("Key: "+hashEntry.getKey());
					PersonEntity person = hashMap.get(hashEntry.getKey());
					System.out.println("Value is : " +person.getFirstName());
				}
			}
		}
	}
}
