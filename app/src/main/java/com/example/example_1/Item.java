package com.example.example_1;

public class Item {
    String name;
    String email;
    int image;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Item(int image, String email, String name) {
        this.image = image;
        this.email = email;
        this.name = name;
    }
}
