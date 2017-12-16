package de.javaakademie.contacts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contacts")
public class ContactsController {

	@Autowired
	private ContactsService contactsService;

	@GetMapping
	public List<Contact> getAll() {
		return contactsService.getAll();
	}

	@GetMapping("{id}")
	public ResponseEntity<Contact> getContactById(@PathVariable("id") Integer id) {
		Contact contact = contactsService.getContactById(id);
		return new ResponseEntity<Contact>(contact, HttpStatus.OK);
	}

}
