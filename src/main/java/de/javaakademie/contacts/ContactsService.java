package de.javaakademie.contacts;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ContactsService {

	@Autowired
	private ContactsRepository contactsRepository;

	@Transactional(propagation = Propagation.REQUIRED)
	public List<Contact> getAll() {
		return contactsRepository.findAll();
	}

	public Contact getContactById(Integer contactId) {
		Optional<Contact> contact = contactsRepository.findById(contactId);
		return contact.isPresent() ? contact.get() : null;
	}
}
