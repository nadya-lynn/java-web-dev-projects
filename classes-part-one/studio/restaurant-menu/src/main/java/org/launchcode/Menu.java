package org.launchcode;

import java.time.LocalDate;

public class Menu {

    private String name;
    private String description;
    private double price;
    private String category;
    private LocalDate dateAdded;

    public void MenuItem(String name, String description, double price, String category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
    }
}
