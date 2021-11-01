package com.homework4.contactservice.controller.impl;

import com.homework4.contactservice.controller.dto.ContactDTO;
import com.homework4.contactservice.dao.Contact;
import com.homework4.contactservice.interfaces.IContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@EnableEurekaClient
@RequestMapping("/contacts")
public class ContactController {

    @Autowired
    private ContactRepository contactRepository;

    @Autowired
    private IContactService contactService;

    //  Get all Contacts
    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<Contact> findAllContacts() {
        return contactRepository.findAll();
    }

    //   Get a Contact by id
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Contact findById(@PathVariable("id") Long id) {
        return contactRepository.findById(id).get();
    }

    // Get a Contact by SalesRepId
    @GetMapping("sales-rep/id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Contact getBySalesRepId(@PathVariable(name = "id") Long id) {
        return contactRepository.findBySalesRepId(id).get();
    }

    //  Add a new Contact
    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public ContactDTO store(@RequestBody @Valid ContactDTO contactDTO) {
        return contactService.store(contactDTO);
    }
}
