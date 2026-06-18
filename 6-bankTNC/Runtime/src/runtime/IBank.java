/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package runtime;

/**
 *
 * @author Administrator
 */
public interface IBank {
    final static float currentRate = 5.5f;
    static float getCurrentInterest(){
        return currentRate; 
    }
    float increaseInterest(float rate);
    default float decreaseInterest(float rate){
        return rate - 1.0f;
    }
}
