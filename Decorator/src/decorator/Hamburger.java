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
public class Hamburger implements Sandwich{
    float price;
    public Hamburger()
    {
        this.price =  5.0f;
    }
    @Override
    public String description() {
       return "Hamburger comes with \n Tomatos, Lettuce ";
    }

    @Override
    public float getPrice() {
        return this.price;
    }
    
}
