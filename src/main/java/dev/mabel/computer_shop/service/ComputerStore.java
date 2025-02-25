package dev.mabel.computer_shop.service;

import dev.mabel.computer_shop.model.Computer;
import java.util.ArrayList;
import java.util.List;

public class ComputerStore {
    private String name;
    private String owner;
    private String taxID;
    private  List<Computer> inventory = new ArrayList<>();

    public ComputerStore(String name, String owner, String taxID) {
        this.name = name;
        this.owner = owner;
        this.taxID = taxID;
    }

    public void addComputer(Computer computer) {
        inventory.add(computer);
    }

    public void deleteComputerByBrand(String brand) {
        inventory.removeIf(computer -> computer.getBrand().equalsIgnoreCase(brand));
    }

    public List<Computer> getAllComputers() {
        return new ArrayList<>(inventory);
    }

    public List<Computer> searchComputersByBrand(String brand) {
        List<Computer> foundComputers = new ArrayList<>();
        for (Computer computer : inventory) {
            if (computer.getBrand().equalsIgnoreCase(brand)) {
                foundComputers.add(computer);
            }
        }
        return foundComputers;
    }

    public String getDetailedComputerList() {
        StringBuilder computerDetails = new StringBuilder();
        for (Computer computer : inventory) {
            computerDetails.append("Brand: ").append(computer.getBrand()).append(", ");
            computerDetails.append("Memory: ").append(computer.getMemory()).append(", ");
            computerDetails.append("Processor: ").append(computer.getProcessor()).append(", ");
            computerDetails.append("Operating System: ").append(computer.getOperatingSystem()).append(", ");
            computerDetails.append("Price: ").append(computer.getPrice()).append("\n");
        }
        return computerDetails.toString();
    }
}
