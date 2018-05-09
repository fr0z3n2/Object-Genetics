/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crossable;

/**
 *
 * @author fr0z3n2
 */
public class CrossableFloat extends Crossable<Float, CrossableFloat>{

    public CrossableFloat(Float value) {
        super(value);
    }

    @Override
    public CrossableFloat cross(CrossableFloat toCross) {
     
        float val1 = this.value.floatValue();
        float val2 = toCross.getValue().floatValue();
        
        float val3 = (val1+val2)/2;
        
        return new CrossableFloat(val3);
        
    }
    
    
}
