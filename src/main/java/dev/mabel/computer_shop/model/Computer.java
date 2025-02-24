package dev.mabel.computer_shop.model;

public class Computer {
    private String brand;
    private int memory;
    private String processor;
    private String operatingSystem;
    private double price;

public Computer(String brand, int memory, String processor, String operatingSystem, double price) {
    this.brand = brand;
    this.memory = memory;
    this.processor = processor;
    this.operatingSystem = operatingSystem;
    this.price = price;
}

public String getBrand() {
    return brand;
}

}




