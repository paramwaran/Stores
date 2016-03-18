package com.intuit.ecom.contactlist.restservice.impl;

import java.util.Arrays;

import com.intuit.ecom.contactlist.dao.ContactListDao;
import com.intuit.ecom.contactlist.model.ContactListRequest;
import com.intuit.ecom.contactlist.model.ContactRequest;
import com.intuit.ecom.contactlist.model.ContactResponse;
import com.inuit.ecom.contactlist.restservice.ContactListService;

public class ContactListServiceImpl implements ContactListService {

	private ContactListDao contactDao;
	
	
	@Override
	public ContactResponse fetchByCustId(ContactRequest req) {
		ContactResponse resp= new ContactResponse();
		
		try{
			resp.setContacts(Arrays.asList(getContactDao().fetchByCustId(req.getContact().getCustId())));
		}catch(Exception e){
			resp.setSuccess(false);
			resp.setErrorMessage("CustId not found");
		}
		
		return resp;
	}

	@Override
	public ContactResponse fetchAllContacts(ContactRequest request) {
		ContactResponse resp= new ContactResponse();
		
		try{
			resp.setContacts(getContactDao().fetchAllContacts());
		}catch(Exception e){
			resp.setSuccess(false);
			resp.setErrorMessage("CustId not found");
		}
		
		return resp;
	}

	@Override
	public ContactResponse insertContact(ContactRequest req) {
		
		ContactResponse resp= new ContactResponse();
		
		try{
			getContactDao().insertContact(req.getContact());
		}catch(Exception e){
			resp.setSuccess(false);
			resp.setErrorMessage("CustId not found");
		}
		
		return resp;
	}

	@Override
	public ContactResponse insertContactList(ContactListRequest req) {
			ContactResponse resp= new ContactResponse();
		
		try{
			getContactDao().insertContactList(req.getContacts());
		}catch(Exception e){
			resp.setSuccess(false);
			resp.setErrorMessage("CustId not found");
		}
		
		return resp;
	}
	
	@Override
	public ContactResponse updateContact(ContactRequest req) {
		
		ContactResponse resp= new ContactResponse();
		
		try{
			getContactDao().updateContact(req.getContact());
		}catch(Exception e){
			resp.setSuccess(false);
			resp.setErrorMessage("CustId not found");
		}
		
		return resp;
	}

	@Override
	public ContactResponse deleteContact(ContactRequest req) {
		
		ContactResponse resp= new ContactResponse();
		
		try{
			getContactDao().deleteContact(req.getContact());
		}catch(Exception e){
			resp.setSuccess(false);
			resp.setErrorMessage("CustId not found");
		}
		
		return resp;
	}

	public ContactListDao getContactDao() {
		return contactDao;
	}

	public void setContactDao(ContactListDao contactDao) {
		this.contactDao = contactDao;
	}

	

}
