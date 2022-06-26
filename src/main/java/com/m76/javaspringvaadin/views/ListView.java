package com.m76.javaspringvaadin.views;

import com.m76.javaspringvaadin.data.entity.Contact;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.value.ValueChangeMode;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Contacts | Vaadin CRM")
@Route("")
public class ListView extends VerticalLayout {

    Grid<Contact> grid = new Grid<>(Contact.class);
    TextField filteredText = new TextField();

    public ListView() {
        addClassName("List-view");
        setSizeFull();

        configuredGrid();

        add(
                getToolbar(),
                grid
        );

    }

    private Component getToolbar() {
        filteredText.setPlaceholder("Filtered by name ...");
        filteredText.setClearButtonVisible(true);
        filteredText.setValueChangeMode(ValueChangeMode.LAZY);
        Button addContactButton = new Button("Add contact");

        HorizontalLayout toolbar = new HorizontalLayout(filteredText, addContactButton);
        toolbar.addClassName("toolbar");
        return toolbar;
    }

    private void configuredGrid() {
        grid.addClassName("contact-grid");
        grid.setSizeFull();
        grid.setColumns("firstName", "lastName", "email");
        grid.addColumn(contact -> contact.getStatus().getName()).setHeader("Status");
        grid.addColumn(contact -> contact.getCompany().getName()).setHeader("Company");
        grid.getColumns().forEach(col -> col.setAutoWidth(true));

    }
}
