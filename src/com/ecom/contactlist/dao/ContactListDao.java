package com.ecom.contactlist.dao;

import java.util.ArrayList;
import java.util.List;

import com.ecom.contactlist.model.Contact;

public interface ContactListDao {
	public List<Contact> fetchAllContacts();
	public void insertContact(Contact ct);
	public void updateContact(Contact ct);
	public void deleteContact(Contact ct);
	public Contact fetchByCustId(Long id);
	public void insertContactList(ArrayList<Contact> contList);
	
}
