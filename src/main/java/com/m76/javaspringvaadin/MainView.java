package com.m76.javaspringvaadin;

import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class MainView extends VerticalLayout {
    public MainView(){
        add(new H2("Witaj Wojciech"));
    }
}
