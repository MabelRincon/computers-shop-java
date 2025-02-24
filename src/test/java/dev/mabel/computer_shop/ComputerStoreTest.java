package dev.mabel.computer_shop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import dev.mabel.computer_shop.service.ComputerStore;
import dev.mabel.computer_shop.model.Computer;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

public class ComputerStoreTest {
    private ComputerStore store;
    private Computer pc1;
    private Computer pc2;

    @BeforeEach
    public void setUp() {
        store = new ComputerStore("NortePC", "Ada Lovelace", "123456789");
        pc1 = new Computer ("Dell", 16, "Intel Core i7", "Windows 10", 1200);
        pc2 = new Computer ("Lenovo", 8, "Intel Core i5", "Windows 10", 800);

        store.addComputer(pc1);
        store.addComputer(pc2);
    }

    @Test
    @DisplayName("Test for adding a computer to the store")
    public void testAddComputer() {
        Computer pc3 = new Computer ("Asus", 16, "Intel Core i7", "Windows 10", 1200);
        store.addComputer(pc3);

        List<Computer> allComputers = store.getAllComputers();
        assertTrue(allComputers.contains(pc3), "Computer was added to inventory");
        assertEquals(3,allComputers.size(), "There should be 3 computers at the inventory");
    }

    @Test
    @DisplayName("Test deleting a computer from the store by brand")
    public void testDeleteComputerByBrand() {
        store.deleteComputerByBrand("Dell");

        List<Computer> allComputers = store.getAllComputers();
        assertFalse(allComputers.contains(pc1), "Computer was deleted from inventory");
        assertEquals(2,allComputers.size(), "There should be 2 computer at the inventory");
    }

}
