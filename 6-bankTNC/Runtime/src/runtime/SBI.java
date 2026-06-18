/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package runtime;

/**
 *
 * @author Administrator
 */
public class SBI extends Bank {

    public SBI( String name, float rate) {
        this.name = name;
        this.rate = rate;
    }
    
    @Override
    public float getRateOfInterest(){
        return 8.4f;
    }
}
