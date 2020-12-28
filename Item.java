package foo; // Package named 'foo'.

import java.util.Scanner; // Import of scanner class from the Java API.
import java.io.*; // Import all the classes of io package.
import java.util.HashMap; // Import of Hashmap for storing information.

/**
* Item class has the Item parameters, the get and the set functions and conditions alternatives.
*/
public class Item {
   private String itemName; //Name of the item.
   private String itemDesc; //Short description about the item.
   private int itemReleaseYear; //Release year for the item.
   private Condition itemCondition; //What condition the item is in, for example new, complete, complete (not mint) and so on.
   private boolean itemCurrentlyLoaned; // If you loaned it to someone.

   /**
   * Item method
   * @param itemName A name of the item.
   * @param itemDesc A description of the item.
   * @param itemReleaseYear Release year of the item.
   * @param itemCondition Condition between 1-4 (from NEW to POOR) of the item.
   * @param itemCurrentlyLoaned If the item is loaned or not (true or false).
   */
   public Item(String itemName, String itemDesc, int itemReleaseYear, Condition condition, boolean itemCurrentlyLoaned) {
      this.itemName = itemName;
      this.itemDesc = itemDesc;
      this.itemReleaseYear = itemReleaseYear;
      this.itemCondition = condition;
      this.itemCurrentlyLoaned = itemCurrentlyLoaned;
   }

   /**
   * Get methods for every item parameter below.
   * getName method
   * @return itemName which is the name of the item.
   */
   public String getName() {
      return this.itemName;
   }

   /**
   * getDesc method
   * @return itemDesc which is a description of the item.
   */
   public String getDesc() {
      return this.itemDesc;
   }

   /**
   * getYear method
   * @return itemReleaseYear which is the release year of the item.
   */
   public int getYear() {
      return this.itemReleaseYear;
   }

   /**
   * getCond method
   * @return getCond which is a condition between 1-4 of the item.
   */
   public Condition getCond() {
      return this.itemCondition;
   }

   /**
   * getCurrentlyLoaned method
   * @return itemCurrentlyLoaned which is a boolean (true or false) regarding loan status.
   */
   public boolean getCurrentlyLoaned() {
      return this.itemCurrentlyLoaned;
   }

   /**
   * Set functions for item's all parameters below.
   * @param desc The description is a string containing an items description.
   */
   public void setDesc(String desc) {
      this.itemDesc = desc;
   }

   /**
   * @param setReleaseYear The release year is an integer containing an items release year.
   */
   public void setReleaseYear(int year) {
      this.itemReleaseYear = year;
   }

   /**
   * @param setCond The Condition is a condition created at the bottom of this document containing an item's condition status between 1-4 (NEW-POOR).
   */
   public void setCond(Condition cond) {
      this.itemCondition = cond;
   }

   /**
   * @param setCurrentlyLoaned The currentlyLoaned is a boolean (true or false) containing loan status of an item.
   */
   public void setCurrentlyLoaned(boolean currentlyLoaned) {
      this.itemCurrentlyLoaned = currentlyLoaned;
   }

}

// Conditions
enum Condition {
   NEW,
   MINT,
   GOOD,
   POOR
}