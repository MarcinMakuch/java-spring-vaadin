package com.m76.javaspringvaadin.data.repository;

import com.m76.javaspringvaadin.data.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Integer> {
}
