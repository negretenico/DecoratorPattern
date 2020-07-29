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
public class Decorator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Sandwich ham = new Hamburger();
        System.out.println(ham.description());
        System.out.println(ham.getPrice()+"\n");
        Sandwich hamNoToAddBacon = new BaconDecorator(new RemoveTomatoe(new Hamburger()));
        System.out.println(hamNoToAddBacon.description());
        System.out.println("\n"+hamNoToAddBacon.getPrice());
    }
    
}
