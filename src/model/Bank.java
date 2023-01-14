package model;

import java.util.ArrayList;

public class Bank{
    private ArrayList<Item> itemArrayList;

    public Bank() {
        this.itemArrayList = new ArrayList<>();
    }

    public void addItemInArray(Item item) {
        itemArrayList.add(item);
    }

    public ArrayList<Item> getItemArrayList() {
        return itemArrayList;
    }
}
