package com.m76.javaspringvaadin;


import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("")
public class MainView extends VerticalLayout {
    public MainView() {
        TextField name = new TextField("Name");
        Paragraph greeting = new Paragraph("");

        Button button = new Button("Greet", event -> {
            greeting.setText("Hello " + name.getValue());
        });

        add(name, button, greeting);
    }
}
