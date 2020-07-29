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
public class RemoveTomatoe extends SandwichDecorator  {
    
    public RemoveTomatoe(Sandwich decoreatedSandwich) {
        super(decoreatedSandwich);
    }
            @Override
    public String description() {
       return decoreatedSandwich.description() + noTomato();
    }

    @Override
    public float getPrice() {
        return decoreatedSandwich.getPrice()+ removeTomato();
    }
    public String noTomato()
    {
        return "\n -No Tomato";
    }
    
    public float removeTomato()
    {
        return     -.25f;

    }
}
