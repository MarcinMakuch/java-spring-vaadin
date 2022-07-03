package com.m76.javaspringvaadin.data.repository;

import com.m76.javaspringvaadin.data.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Integer> {
}
