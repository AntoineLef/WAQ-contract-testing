package com.antoineleuf.telephony.ws.domain;


import java.util.List;
import java.util.UUID;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import com.antoineleuf.telephony.ws.api.dto.ContactDto;

public class ContactService {
  private Logger logger = Logger.getLogger(ContactService.class.getName());

  private ContactRepository contactRepository;
  private ContactAssembler contactAssembler;

  public ContactService(ContactRepository contactRepository, ContactAssembler contactAssembler) {
    this.contactRepository = contactRepository;
    this.contactAssembler = contactAssembler;
  }

  public List<ContactDto> findAllContacts() {
    logger.info("Get all contacts");
    List<Contact> contacts = contactRepository.findAll();
    return contacts.stream().map(contactAssembler::create).collect(Collectors.toList());
  }

  public ContactDto findContact(String id) {
    logger.info(String.format("Get contact with id %s", id));
    Contact contact = contactRepository.findById(id);
    return contactAssembler.create(contact);
  }

  public void addContact(ContactDto contactDto) {
    logger.info(String.format("Add new contact %s", contactDto));
    Contact contact = contactAssembler.create(contactDto);
    contact.setId(UUID.randomUUID().toString());
    contactRepository.save(contact);
  }

  public void updateContact(String id, ContactDto contactDto)
          throws ContactNotFoundException {
    logger.info(String.format("Update contact with id %s", id));
    Contact contact = contactAssembler.create(contactDto);
    contact.setId(id);
    contactRepository.update(contact);
  }


  public void deleteContact(String id) throws ContactNotFoundException {
    logger.info(String.format("Delete contact with id %s", id));
    contactRepository.remove(id);
  }


}
