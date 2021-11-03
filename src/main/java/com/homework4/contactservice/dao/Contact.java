package com.homework4.contactservice.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "contact")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="contact_name")
    private String name;
    @Column(name= "phone_number")
    private String phoneNumber;
    private String email;
    @Column(name="company_name")
    private String companyName;
    private Long salesRepId;
    private Long accountId;

    public Contact(String name, String phoneNumber, String email, String companyName) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.companyName = companyName;
    }

    public Contact(String name, String phoneNumber, String email, String companyName, Long salesRepId, Long accountId) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.companyName = companyName;
        this.salesRepId = salesRepId;
        this.accountId = accountId;
    }
}
