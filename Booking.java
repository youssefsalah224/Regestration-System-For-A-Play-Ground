/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass4;

/**
 * booking class to book a slot 
 * @author youssefsalah ,gasser ahmed , marwn mostafa 
 */
public class Booking extends Playground {
    private String slot;
    /**
     * slot getter method 
     * @return  slot
     */

    public String getSlot() {
        return slot;
    }
    /**
     * to display the play ground available slots
     */
    public void displayAvailableHours() {

        for (int i = 0; i < getAvaliableHours().size(); i++) {
            System.out.println(getAvaliableHours().get(i));
        }
    }
    /**
     * to select the available hours
     * @param selectedslot represent the selected slot  
     */
    public String selectAvailableHours(String selectedslot) {
        for (int i = 0; i < getAvaliableHours().size(); i++) {
            if (getAvaliableHours().get(i).equals(selectedslot)) {
                System.out.println("Booking is done");
                String temp = getAvaliableHours().get(i);
                changeAvaliableHours(selectedslot);
                slot = temp;
                return temp;
            }
        }
        System.out.println(" please check the hours again and try again");

        return null;
    }

}
