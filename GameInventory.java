/**
* @author Edvin Hellsing
* @version 1.0
*/

package foo; // Package named 'foo'.

import java.util.Scanner; // Import of scanner class from the Java API.
import java.io.*; // Import all the classes of io package.
import java.util.HashMap; // Import of Hashmap for storing information.
import java.util.*; // 

public class GameInventory {

   private HashMap<String, Item> gameInventory;

   public GameInventory() {
      this.gameInventory = new HashMap<String, Item>();
   }

   /**
   * Add item
   */
   public void addItem() {
      System.out.println("So you want to add an item? Fill in the form below.");

      String name = askString("name");
      String desc = askString("description");
      int year = askInt("year", 1000, 2021); // Take a look at this since you can add a year vith just to digits today
      int intCond = askInt("condition (1 for New, 2 Mint, 3 for Good, 4 for Poor)", 1, 4);
      int intCurrentlyLoaned = askInt("loaned (0 for No, 1 for Yes", 0, 1);

      Condition cond;
      switch (intCond) {
         case 1:
         cond = Condition.NEW;
         break;
         case 2:
         cond = Condition.MINT;
         break;
         case 3:
         cond = Condition.GOOD;
         break;
         case 4:
         cond = Condition.POOR;
         break;
         default:
         cond = Condition.POOR;
      }

      Boolean currentlyLoaned;
      if (intCurrentlyLoaned == 0) {
         currentlyLoaned = false;
      }
      else {
         currentlyLoaned = true;
      }

      System.out.println("The item " + name + " has been added.");

      this.gameInventory.put(name, new Item(name, desc, year, cond, currentlyLoaned));
   }

   /**
   * Read item
   */
   public void readItem() {
      System.out.println("So you want to read about an item?");

      // System.out.println("Reading item");
      String name = askString("name");
      Item item = this.gameInventory.get(name);

      // Check if the entered name exsits in the hashmap, present information about it if it does.
      if (gameInventory.containsKey(name)) {
         System.out.println("Information about " + name + " presented below:");
         System.out.println("Item name: " + item.getName());
         System.out.println("Item description: " + item.getDesc());
         System.out.println("Item year: " + item.getYear());
         System.out.println("Item condition: " + item.getCond());
         System.out.println("Item currently loaned: " + item.getCurrentlyLoaned());
      }
      
      // If no information about the entered name, print this message.
      else {
         System.out.println("It seems like there's no information available about '" + name + "'. You'll be directed to the menu.");
      }
   }

   /**
   * Update item
   */
   public void updateItem() {
      System.out.println("So you want to update an item? Fill in the form below.");

      // System.out.println("Updating item");
      String name = askString("name");
   }

   /**
   * Delete item
   */
   public void deleteItem() {
      System.out.println("So you want to delete about an item?");

      // System.out.println("Deleting item");
      String name = askString("name");
      Item item = this.gameInventory.get(name);
      System.out.println("The item " + name + " contains the informtaion below:");
      System.out.println("Item name: " + item.getName());
      System.out.println("Item description: " + item.getDesc());
      System.out.println("Item year: " + item.getYear());
      System.out.println("Item condition: " + item.getCond());
      System.out.println("Item currently loaned: " + item.getCurrentlyLoaned());

      // Double check if the user wants to remaove the entered item.
      int intDeleteItem = deleteInt("Do you like to delete " + name + " and all its information? Enter 0 for no, 1 for yes. (This action cannot be undone): ", 0, 1);

      // If not, print message.
      Boolean deleteItem;
      if (intDeleteItem == 0) {
         deleteItem = false;
         System.out.println("The item " + name + " wasn't deleted from your Game Inventory.");
      }
      // If else (yes), delete item from hashmap, i.e. inventory and print message.
      else {
         deleteItem = true;
         gameInventory.remove(name);
         System.out.println("The item " + name + " has been deleted.");
      }

   }

   /**
   * askString
   */
   private String askString(String what) {
      Scanner keyboard = new Scanner(System.in);
      String promtName = "Enter a " + what + " for the item: ";
      String invalidName = "You haven't entered a " + what + ". " + promtName;
      String str = "";
      try {
         System.out.print(promtName);
         str = keyboard.nextLine();
         while (str.length() < 1) {
            System.out.print(invalidName);
            str = keyboard.nextLine();
         }
      }
      catch(Exception e) {
         System.out.println(e);
         System.exit(0); //Have something else than system.exit?
      }

      if (what.equals("name")) {
         str = str.toUpperCase();
      }
      
      return str;
   }

   /**
   * askInt
   */
   private int askInt(String what, int smallest, int largest) {
      Scanner keyboard = new Scanner(System.in);
      String prompt = "Enter a " + what + " for the item: ";
      String invalid = "You haven't entered a " + what + ". " + prompt;
      int userInt = 0;
      try {
         System.out.print(prompt);
         userInt = keyboard.nextInt();
         while (userInt <= smallest && userInt >= largest) {
            System.out.print(invalid);
            userInt = keyboard.nextInt();
         }
      }
      catch(Exception e) {
         System.out.println(e);
         System.exit(0);
      }
      return userInt;
   }

   /**
   * deleteInt
   */
   private int deleteInt(String what, int smallest, int largest) {
      Scanner keyboard = new Scanner(System.in);
      String prompt = what;
      String invalid = "You haven't entered a valid choise, please do. " + prompt;
      int userInt = 0;
      try {
         System.out.print(prompt);
         userInt = keyboard.nextInt();
         while (userInt <= smallest && userInt >= largest) {
            System.out.print(invalid);
            userInt = keyboard.nextInt();
         }
      }
      catch(Exception e) {
         System.out.println(e);
         System.exit(0);
      }
      return userInt;
   }
}