package backEnd;

import java.util.ArrayList;
import java.io.Serializable;
import java.util.List;

/**
 * A class for Profile object  
 * @author Yigit Ekin and Arda Eren
 * @version 1.0 
 */
public  class Profile implements Serializable
{
   //properties
   private ArrayList<Box> boxes;
   
   //constructor
   public Profile()
   {
      boxes = new ArrayList<Box>(); 
   }
   
   //methods   
   /*
    * This method returns the collection of boxes specific to the profile
    * @param none
    * @return boxes the arraylist that includes the collection of boxes
    */ 
   public ArrayList<Box> getBoxes()
   {   
      return boxes;
   }
    
   /*
    * This method sets the boxes property of profile to the demanded list
    * @param List<Box> list is the demanded list
    * @return none
    */ 
   public void setBoxes( List<Box> list )
   {
      this.boxes = new ArrayList<Box>( list);
   }
   
   
} // end of class