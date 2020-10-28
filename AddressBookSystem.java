package com.addresssbooksystem;

public class AddressBookSystem {
	public static void main(String[] args)
	{
		AddressBookDao addressBook = new AddressBookDao();
		addressBook.addNewAddressBook();
		addressBook.addNewAddressBook();
		addressBook.displayAddressBook();
	}
}
