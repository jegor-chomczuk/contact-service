package com.homework4.contactservice;

import com.homework4.contactservice.controller.impl.ContactRepository;
import com.homework4.contactservice.dao.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Data {

    @Autowired
    ContactRepository contactRepository;

    public void populate(){
//        List<Contact> opportunities = contactRepository.saveAll(List.of(
//                new Contact("Name 1", "123456789", "1email@domain.com", "Company name 1", 1l, 1l),
//                new Contact("Name 2", "123456789", "2email@domain.com", "Company name 2", 2l, 2l),
//                new Contact("Name 3", "123456789", "3email@domain.com", "Company name 3", 3l, 3l)
//        ));
        contactRepository.save(new Contact("Name 1", "123456789", "1email@domain.com", "Company name 1", 1l, 1l));
        contactRepository.save(new Contact("Name 2", "123456789", "2email@domain.com", "Company name 2", 2l, 2l));
        contactRepository.save(new Contact("Name 3", "123456789", "3email@domain.com", "Company name 3", 3l, 3l));

    }
}