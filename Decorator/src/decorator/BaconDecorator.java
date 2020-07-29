/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author Nico
 */
public class BaconDecorator extends SandwichDecorator {
  

   public BaconDecorator(Sandwich decoratedSandwich) {
      super(decoratedSandwich);		
   }
        @Override
    public String description() {
       return decoreatedSandwich.description() + baconDescription();
    }

    @Override
    public float getPrice() {
        return decoreatedSandwich.getPrice()+ addBacon();
    }
    public String baconDescription()
    {
        return "\n -Add Bacon";
    }
    
    public float addBacon()
    {
        return     .75f;

    }
    
}
