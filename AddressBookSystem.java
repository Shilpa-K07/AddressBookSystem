package com.addresssbooksystem;

import java.util.Scanner;

public class AddressBookSystem {
	public static void main(String[] args)
	{
		AddressBookDao addressBook = new AddressBookDao();
		addressBook.addContact();
	}
}
