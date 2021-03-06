package backEnd;

import java.io.Serializable;

/**
 * Abstract class for shortcut  
 * @author Yigit Ekin and Arda Eren
 * @version 1.0 
 */
public abstract class Shortcut implements Serializable
{
   /*
    * abstract method for opening the shortcut object  
    * @param none
    * @return none
    */ 
   abstract void run();

   /*
    * abstract method for getting the name of the shortcut object 
    * @param none
    * @return String the name of the object
    */ 
   abstract String getName();
} // end of class