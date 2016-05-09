package com.ecom.contactlist.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.ecom.contactlist.dao.ContactListDao;
import com.ecom.contactlist.model.Contact;

public class ContactListDaoImpl implements ContactListDao{

	private long custId =0L;
	
	List<Contact> ctList = new ArrayList<Contact>();
	
	@Override
	public List<Contact> fetchAllContacts() {
		// TODO Auto-generated method stub
		return ctList;
	}

	@Override
	public void insertContact(Contact ct) {
		// TODO Auto-generated method stub
		ct.setCustId(custId++);
		ctList.add(ct);
	}

	@Override
	public void insertContactList(ArrayList<Contact> contList) {
		// TODO Auto-generated method stub
		Iterator<Contact> it1=contList.iterator();
		while(it1.hasNext()){
			
			Contact ct = it1.next();
			ct.setCustId(custId++);
			ctList.add(ct);
		}
		
	}
	
	@Override
	public void updateContact(Contact ct) {
		// TODO Auto-generated method stub
		Contact editContact = fetchByCustId(ct.getCustId());
		editContact.setEmail(ct.getEmail());
		editContact.setFirstName(ct.getFirstName());
		editContact.setLastName(ct.getLastName());
		editContact.setPhone(ct.getPhone());
	}

	@Override
	public void deleteContact(Contact ct) {
		// TODO Auto-generated method stub
		Contact delContact = fetchByCustId(ct.getCustId());
		ctList.remove(delContact);
	}

	@Override
	public Contact fetchByCustId(Long id) {
		// TODO Auto-generated method stub
		for(Contact ct : ctList){
			if(ct.getCustId()==id){
				return ct;
			}
		}
		throw new RuntimeException("Customer Not found");
	}

	
	
	

}
