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
public abstract class SandwichDecorator implements Sandwich {
    protected Sandwich decoreatedSandwich;
    public SandwichDecorator(Sandwich decoreatedSandwich)
    {
        this.decoreatedSandwich = decoreatedSandwich;
    }
        @Override
    public String description() {
       return decoreatedSandwich.description();
    }

    @Override
    public float getPrice() {
        return decoreatedSandwich.getPrice();
    }
}
