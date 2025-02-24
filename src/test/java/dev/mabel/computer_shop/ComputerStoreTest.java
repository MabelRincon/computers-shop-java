package dev.mabel.computer_shop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
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
        assertEquals(2, store.getComputers("Dell").size() + store.searchComputers("Lenovo").size());
    }

}
