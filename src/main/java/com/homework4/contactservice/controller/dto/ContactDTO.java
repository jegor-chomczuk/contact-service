package com.homework4.contactservice.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ContactDTO {
    @NotBlank(message = "Provide a name")
    private String name;
    @NotBlank(message = "Provide a phone number")
    private String phoneNumber;
    @NotBlank(message = "Provide an email")
    private String email;
    @NotBlank(message = "Provide a company name")
    private String companyName;
    @NotNull(message = "Provide a SalesRep id")
    private Long salesRepId;
    @NotNull(message = "Provide a account id")
    private Long accountId;
    @NotNull(message = "Provide an id")
    private Long id;

    public ContactDTO(String name, String phoneNumber, String email, String companyName, Long salesRepId, Long accountId) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.companyName = companyName;
        this.salesRepId = salesRepId;
        this.accountId = accountId;
    }
}
