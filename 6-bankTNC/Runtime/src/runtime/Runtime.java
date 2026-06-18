/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package runtime;

/**
 *
 * @author Administrator
 */
public class Runtime {
    static void prinfRateOfInterest(Bank bank){
        System.out.format("%s rate of interest: %s%n",
                bank.getName(), bank.getRateOfInterest());
    }
    static void changeOfInterest(IBank ibank, float rate){
        System.out.println(ibank.decreaseInterest(rate));
        System.out.println(ibank.increaseInterest(rate));
    }
    public static void main(String[] args) {
        SBI sbi = new SBI("SBI BANK", 8.4F);
        prinfRateOfInterest(sbi);
        
        ICI ici = new ICI("ICI BANK", 7.3F);
        prinfRateOfInterest(ici);
        
        AXIS axis = new AXIS("AXIS BANK", 9.7F);
        prinfRateOfInterest(axis);
        changeOfInterest(axis, 3.5f);
        //
        System.out.println("Current Rate Of Interest");
        System.out.println(IBank.getCurrentInterest());
    }
    
}
