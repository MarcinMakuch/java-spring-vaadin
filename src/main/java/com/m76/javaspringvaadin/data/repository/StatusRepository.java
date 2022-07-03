package com.m76.javaspringvaadin.data.repository;

import com.m76.javaspringvaadin.data.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepository extends JpaRepository<Status, Integer> {

}
