package com.addresssbooksystem;

public class AddressBookSystem {
	public static void main(String[] args)
	{
		System.out.println("Welcome to Address Book System");
		AddressBookDao addressBook = new AddressBookDao();
		addressBook.addContact();
		addressBook.editContact();
		addressBook.deleteContact();
		addressBook.addMultipleContact();
		addressBook.addMultipleContact();
	}
}
