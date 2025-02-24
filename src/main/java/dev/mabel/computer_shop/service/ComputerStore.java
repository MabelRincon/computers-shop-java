package dev.mabel.computer_shop.service;

import dev.mabel.computer_shop.model.Computer;
import java.util.ArrayList;
import java.util.List;

public class ComputerStore {
    private  String name;
    private  String owner;
    private  String taxID;
    private  List<Computer> inventory;

    public ComputerStore(String name, String owner, String taxID) {
        this.name = name;
        this.owner = owner;
        this.taxID = taxID;
        this.inventory = new ArrayList<>();
    }

    public void addComputer(Computer computer) {
        inventory.add(computer);
    }

    public List<Computer> getAllComputers() {
        return new ArrayList<>(inventory);
    }

}
