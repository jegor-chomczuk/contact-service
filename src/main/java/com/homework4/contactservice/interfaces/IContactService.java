package com.homework4.contactservice.interfaces;

import com.homework4.contactservice.controller.dto.ContactDTO;

public interface IContactService {
    ContactDTO store(ContactDTO contactDTO);
}
