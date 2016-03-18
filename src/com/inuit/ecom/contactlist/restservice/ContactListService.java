package com.inuit.ecom.contactlist.restservice;


import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.intuit.ecom.contactlist.dao.ContactListDao;
import com.intuit.ecom.contactlist.model.Contact;
import com.intuit.ecom.contactlist.model.ContactListRequest;
import com.intuit.ecom.contactlist.model.ContactRequest;
import com.intuit.ecom.contactlist.model.ContactResponse;

@Consumes("application/json")
@Produces("application/json")
public interface ContactListService {
	
	@POST
	@Path("/fetchByCustId")
	public ContactResponse fetchByCustId(ContactRequest request);
	
	@POST
	@Path("/fetchAllContacts")
	public ContactResponse fetchAllContacts(ContactRequest request);
	
	@POST
	@Path("/insertContact")
	public ContactResponse insertContact(ContactRequest request);
	
	@POST
	@Path("/insertContactList")
	public ContactResponse insertContactList(ContactListRequest request);
	
	@POST
	@Path("/updateContact")
	public ContactResponse updateContact(ContactRequest request);
	
	@POST
	@Path("/deleteContact")
	public ContactResponse deleteContact(ContactRequest request);
	
	
}
