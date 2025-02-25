package dev.mabel.computer_shop;

import dev.mabel.computer_shop.model.Computer;
import dev.mabel.computer_shop.service.ComputerStore;

public class App {
    public static void main(String[] args) {

        ComputerStore store = new ComputerStore("NortePC", "Ada Lovelace", "123456789");

        store.addComputer(new Computer("Dell", 16, "Intel Core i7", "Windows 10", 1200));
        store.addComputer(new Computer("Lenovo", 8, "Intel Core i5", "Windows 11", 800));
        store.addComputer(new Computer("Asus", 16, "Intel Core i7", "Ubuntu Linux", 1000));


        System.out.println("All computers in the store:");
        System.out.println(store.getDetailedComputerList());


        System.out.println("\nSearching for Lenovo computers...");
        System.out.println(store.searchComputersByBrand("Lenovo"));


        System.out.println("\nRemoving Dell from store...");
        store.deleteComputerByBrand("Dell");

        System.out.println("\nUpdated Computer List:");
        System.out.println(store.getDetailedComputerList());
    }
}
