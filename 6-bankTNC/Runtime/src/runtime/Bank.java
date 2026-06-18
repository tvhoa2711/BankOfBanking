/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package runtime;

public abstract class Bank {
    protected String name;
    protected float rate;

    public Bank() {
        name = "";
    }

    public String getName() {
        return name;
    }
    
    public abstract float getRateOfInterest();
}
