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
public class CrossableBoolean extends Crossable<Boolean, CrossableBoolean>{

    public CrossableBoolean(boolean value) {
        super(value);
    }

    @Override
    public CrossableBoolean cross(CrossableBoolean toCross) {
        boolean val1 = this.value;
        boolean val2 = toCross.getValue();
        
        boolean val3 = (Math.random()>0.5 ? val1 : val2);
        
        return new CrossableBoolean(val3);
        
    
    }
    
    
}
