package com.homework4.contactservice.services;

import com.homework4.contactservice.controller.dto.ContactDTO;
import com.homework4.contactservice.controller.impl.ContactRepository;
import com.homework4.contactservice.dao.Contact;
import com.homework4.contactservice.interfaces.IContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService implements IContactService {

    @Autowired
    private ContactRepository contactRepository;

    public ContactDTO store(ContactDTO contactDTO) {
        Contact contact = new Contact(
                contactDTO.getName(),
                contactDTO.getPhoneNumber(),
                contactDTO.getEmail(),
                contactDTO.getCompanyName(),
                contactDTO.getSalesRepId(),
                contactDTO.getAccountId()
        );
        contactRepository.save(contact);

        ContactDTO createdContact= new ContactDTO(
                contact.getName(),
                contact.getPhoneNumber(),
                contact.getEmail(),
                contact.getCompanyName(),
                contact.getSalesRepId(),
                contact.getAccountId(),
                contact.getId()
                );

        return createdContact;
    }
}
