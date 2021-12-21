package com.contact.service;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

import com.contact.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService {
	
	//fake list of contacts...
	List<Contact> contacts = List.of(new Contact(1L, "aakash@mail.com", "Aakash", 1311L), new Contact(2L, "vikash@mail.com", "Vikash", 1312L), new Contact(3L, "ajay@mail.com", "Ajay", 1313L));

	@Override
	public List<Contact> getContactsOfUser(Long userId) {
		// TODO Auto-generated method stub
		return this.contacts.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
