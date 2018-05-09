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
public class CrossableBoolean extends Crossable<Boolean, CrossableBoolean>{

    public CrossableBoolean(Boolean value) {
        super(value);
    }

    @Override
    public CrossableBoolean cross(CrossableBoolean toCross) {
        boolean val1 = this.value.booleanValue();
        boolean val2 = toCross.getValue().booleanValue();
        
        boolean val3 = (Math.random()>0.5 ? val1 : val2);
        
        return new CrossableBoolean(val3);
        
    
    }
    
    
}
