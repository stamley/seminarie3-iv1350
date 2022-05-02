package sourcepackage.se.kth.iv1350.hackers.integration;
import sourcepackage.se.kth.iv1350.hackers.DTO.DiscountDTO;
import sourcepackage.se.kth.iv1350.hackers.model.Item;
import sourcepackage.se.kth.iv1350.hackers.util.Amount;


/**
 * A representation of the class that controls and manages
 * the external databases.
 */
public class DBController {
    private AccountingSystem accountingSystem;
    private InventorySystem inventorySystem;
    private DiscountDatabase discountDatabase;

    /**
     * Creates a new instance of DBHandler.
     */
    public DBController(){
        this.accountingSystem = new AccountingSystem();
        this.inventorySystem = new InventorySystem();
        this.discountDatabase = new DiscountDatabase();
    }

    /**
    * Fetches information for a particular item.
    *
    * @param identifier The item that is being scanned.
    */
    public boolean requestItemInfo(String identifier){
        return inventorySystem.requestItemInfo(identifier);
     }

     /**
      * Fetches <code>Item</code> with corresponding identifier and quantity. 
      *
      * @param identifier The specified identifier.
      * @param quantity  The specified quantity.
      * @return The requested item. 
      */
    public Item getItem(String identifier,Amount quantity){
        return inventorySystem.getItem(identifier, quantity);
    }

    /**
     * Requests discount from discount database.
     * 
     * @param customerID ID of customer proving eligibility of discount..
     * @return An object of type discount dto.
     */

    public DiscountDTO discountRequest(int customerID){
        return discountDatabase.discountRequest(customerID);
    }

}
