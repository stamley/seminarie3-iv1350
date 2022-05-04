package se.kth.iv1350.hackers.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import se.kth.iv1350.hackers.DTO.ItemDTO;
import se.kth.iv1350.hackers.DTO.SaleDTO;
import se.kth.iv1350.hackers.util.Amount;

public class SaleTest {
    private Sale currentSale;
    private SaleDTO saleDTO;

    @Test
    public void testAddItem() {
        currentSale = new Sale();
        saleDTO = new SaleDTO(currentSale);

        String itemName = "Apple";
        Amount costOfItem = new Amount(2);
        Amount VATOfItem = new Amount(20);

        Item itemToAdd = new Item(new ItemDTO(itemName, costOfItem, VATOfItem), "1234",new Amount(2));
        
        saleDTO = currentSale.addItem(itemToAdd);

        boolean expResult = true;
        boolean result = saleDTO.getItemList().get("1234").equals(itemToAdd);

        assertEquals(expResult, result, "Item in list that was added does not equal the same item that was added.");
    }

    @Test
    public void testApplyDiscount() {

    }

    @Test
    public void testEndSale() {

    }

    @Test
    public void testGetAmountPaid() {

    }

    @Test
    public void testGetChangeAmount() {

    }

    @Test
    public void testGetItems() {
        currentSale = new Sale();
        saleDTO = new SaleDTO(currentSale);

        boolean expResult = true;
        boolean result = currentSale.getItems().isEmpty();

        assertEquals(expResult, result, "Items is not null as expected.");
    }

    @Test
    public void testGetLocalDateTime() {
        currentSale = new Sale();
        saleDTO = new SaleDTO(currentSale);

        boolean expResult = true;
        boolean result = true;
    }

    @Test
    public void testGetTotalPrice() {

    }

    @Test
    public void testRegisterPayment() {

    }

    @Test
    public void addItemToList(){
        String itemName = "Apple";
        Amount costOfItem = new Amount(2);
        Amount VATOfItem = new Amount(20);

        Item itemToAdd = new Item(new ItemDTO(itemName, costOfItem, VATOfItem), "1234",new Amount(2));
        

    }
}
