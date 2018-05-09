/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crossable;

/**
 *
 * @author Logan Stanfield
 * @author Mike Resnik
 */
public class CrossableDouble extends Crossable<Double, CrossableDouble>{
    
    public CrossableDouble(double value) {
        super(value);
    }

    @Override
    public CrossableDouble cross(CrossableDouble toCross) {
    
         double val1 = this.value.doubleValue();
         double val2 = toCross.value.doubleValue();
         
         double val3 = (val1+val2)/2;
         
         return new CrossableDouble(val3);
    
    }
    
    
}
