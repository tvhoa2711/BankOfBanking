/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package runtime;

/**
 *
 * @author Administrator
 */
public class AXIS extends Bank implements IBank{
    public AXIS(String name, float rate) {
        this.name = name;
        this.rate = rate;
    }
    @Override
    public float getRateOfInterest(){
        return rate;
    }
    
    @Override
    public float increaseInterest(float increRate){
        return rate+increRate;
    }
    
    @Override
    public float decreaseInterest(float decrRate){
        return rate - decrRate;
    }
}
