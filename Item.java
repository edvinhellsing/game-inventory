package foo; // Package named 'foo'.

import java.util.Scanner; // Import of scanner class from the Java API.
import java.io.*; // Import all the classes of io package.
import java.util.HashMap; // Import of Hashmap for storing information.

public class Item {
   private String itemName; //"Name of the item"
   private String itemDesc; //"Short note about the item"
   private int itemReleaseYear; //"Release year for the item"
   private Condition itemCondition; //"What condition the item is in, for example new, complete, complete (not mint) and so on."
   private boolean itemCurrentlyLoaned; //"If you loaned it to someone."

   public Item(String itemName, String itemDesc, int itemReleaseYear, Condition condition, boolean itemCurrentlyLoaned) {
      this.itemName = itemName;
      this.itemDesc = itemDesc;
      this.itemReleaseYear = itemReleaseYear;
      this.itemCondition = condition;
      this.itemCurrentlyLoaned = itemCurrentlyLoaned;
   }

   //Get functions
   public String getName() {
      return this.itemName;
   }
   public String getDesc() {
      return this.itemDesc;
   }
   public int getYear() {
      return this.itemReleaseYear;
   }
   public Condition getCond() {
      return this.itemCondition;
   }
   public boolean getCurrentlyLoaned() {
      return this.itemCurrentlyLoaned;
   }

   //Set functions
   public void setDesc(String desc) {
      this.itemDesc = desc;
   }
   public void setReleaseYear(int year) {
      this.itemReleaseYear = year;
   }
   public void setCond(Condition cond) {
      this.itemCondition = cond;
   }
   public void setCurrentlyLoaned(boolean currentlyLoaned) {
      this.itemCurrentlyLoaned = currentlyLoaned;
   }

}

enum Condition {
   NEW,
   MINT,
   GOOD,
   POOR
}