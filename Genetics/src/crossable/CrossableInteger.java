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
public class CrossableInteger extends Crossable<Integer, CrossableInteger>{

    public CrossableInteger(Integer value) {
        super(value);
    }

    @Override
    public CrossableInteger cross(CrossableInteger toCross) {
        
        int val1 = this.value.intValue();
        int val2 = toCross.getValue().intValue();
        
        int val3 = (val1+val2)/2;
        
        return new CrossableInteger(val3);
        
    
    }


    
}
