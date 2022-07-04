package com.m76.javaspringvaadin.service;

import com.m76.javaspringvaadin.data.entity.Company;
import com.m76.javaspringvaadin.data.entity.Contact;
import com.m76.javaspringvaadin.data.entity.Status;
import com.m76.javaspringvaadin.data.repository.CompanyRepository;
import com.m76.javaspringvaadin.data.repository.ContactRepository;
import com.m76.javaspringvaadin.data.repository.StatusRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CrmService {

    private final ContactRepository contactRepository;
    private final CompanyRepository companyRepository;
    private final StatusRepository statusRepository;

    public CrmService(ContactRepository contactRepository,
                      CompanyRepository companyRepository,
                      StatusRepository statusRepository) {
        this.contactRepository = contactRepository;
        this.companyRepository = companyRepository;
        this.statusRepository = statusRepository;
    }

    public List<Contact> findAllContacts(String filteredText) {
        if (filteredText == null || filteredText.isEmpty()) {
            return contactRepository.findAll();
        } else {
            return contactRepository.search(filteredText);
        }
    }

    public long countContacts() {
        return contactRepository.count();
    }

    public void deleteContact(Contact contact) {
        contactRepository.delete(contact);
    }

    public void saveContact(Contact contact) {
        if (contact == null) {
            System.err.println("Contact is null");
            return;
        }
        contactRepository.save(contact);
    }

    public List<Company> finAllCompanies() {
        return companyRepository.findAll();
    }

    public List<Status> findAllStatues() {
        return statusRepository.findAll();
    }
}
