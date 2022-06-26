package com.m76.javaspringvaadin.data.entity;

import com.m76.javaspringvaadin.data.AbstractEntity;

import javax.persistence.Entity;


    @Entity
    public class Status extends AbstractEntity {
        private String name;

        public Status() {
        }

        public Status(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

