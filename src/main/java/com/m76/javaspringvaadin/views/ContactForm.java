package com.m76.javaspringvaadin.views;

import com.m76.javaspringvaadin.data.entity.Company;
import com.m76.javaspringvaadin.data.entity.Status;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.TextField;

import java.util.List;

public class ContactForm extends FormLayout {
    TextField firstName = new TextField("First Name");
    TextField lastName = new TextField("Last Name");
    EmailField email = new EmailField("E-Mail");
    ComboBox<Status> status = new ComboBox<>("Status");
    ComboBox<Company> company = new ComboBox<>("Company");

    public ContactForm(List<Company> companies, List<Status> statuses) {
        addClassName("contact-form");
    }
}
