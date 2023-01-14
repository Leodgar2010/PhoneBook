
package model;

import java.util.UUID;

public class Item {
    private final UUID id;
    private String name;
    private String phoneNumber;

    public Item(String name, String phoneNumber) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
