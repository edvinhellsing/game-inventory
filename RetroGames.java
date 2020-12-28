/**
* @author Edvin Hellsing
* @version 1.0
*/

package foo; // Package named 'foo'.

import java.util.Scanner; // Import of scanner class from the Java API.
import java.io.*; // Import all the classes of io package.
import java.util.HashMap; // Import of Hashmap for storing information.

/**
* RetroGames class holds the main method and the runMenu method.
*/
public class RetroGames {
   /**
   * main method in which the userinput from runMenu is placed in a switch in a while loop to handle input from menu choices, includes an exit message and an error message as well.
   * @exception e for try Scanner, and a catch of exception.
   */
   public static void main(String[] args) {
      GameInventory gameInventory = new GameInventory();

      String exitMessage = "Program has been quit. Over and out.";

      while (true) {
         int numInput = runMenu();
         switch (numInput) {
            case 1:
            gameInventory.addItem();
            break;
            case 2:
            gameInventory.readItem();
            break;
            case 3:
            gameInventory.updateItem();
            break;
            case 4:
            gameInventory.deleteItem();
            break;
            case 5:
            System.out.println(exitMessage);
            System.exit(0);
            break;
            default:
            System.out.println("Oops! Something went wrong. Program exiting.");
            System.exit(0);
         }
      }
   }

   /**
   * runMenu method that creates a scanner object to read keyboard input, and gets the user's menu choice as input.
   * @return userMenuInput which is the input given by the user when doing a choice in the program menu. Input validation.
   * @exception e for try Scanner, and a catch of exception.
   */
   private static int runMenu() {

      Scanner keyboard = new Scanner(System.in);
      int userMenuInput;
      
      System.out.println("\n1. Add an item to your Retro Games Inventory"); // a menu option to add new instances of the class GameInventory to the program
      System.out.println("2. Read about an item in your Retro Games Inventory"); // a menu option for selecting an item and show all information in a clear way.
      System.out.println("3. Update an item in your Retro Games Inventory"); // update the fields of an item from a menu option, except for the name, after the item has been added to the program.
      System.out.println("4. Delete an item in your Retro Games Inventory"); // delete a selected Game Inventory from the program by a menu option.
      System.out.println("5. Ouit Retro Games Inventory program"); // menu option to exit the program

      String promtUserMenuInput = "Choose an option from the menu by enter a number: ";
      String invalidUserMenuInput = "That's not a choise in the menu. " + promtUserMenuInput;

      try {
         System.out.print(promtUserMenuInput);
         userMenuInput = keyboard.nextInt();

         while (userMenuInput != 1 && userMenuInput != 2 && userMenuInput != 3 && userMenuInput != 4 && userMenuInput != 5) {
            System.out.print(invalidUserMenuInput);
            userMenuInput = keyboard.nextInt();
         }

         return userMenuInput;
         }  
   
      catch(Exception e) {
         System.out.println(e);
         return -1;
      }
   }
}