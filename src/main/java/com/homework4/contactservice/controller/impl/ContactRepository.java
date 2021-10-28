package com.homework4.contactservice.controller.impl;

import com.homework4.contactservice.dao.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
    Optional<Contact> findBySalesRepId(Long id);
}
