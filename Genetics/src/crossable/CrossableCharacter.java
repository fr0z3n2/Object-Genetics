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
public class CrossableCharacter extends Crossable<Character, CrossableCharacter> {
    
    public CrossableCharacter(char character) {
        super(character);
    }
    
    @Override
    public CrossableCharacter cross(CrossableCharacter toCross) {
        char val1 = this.value;
        char val2 = toCross.getValue();
        
        char val3 = (char) ((val1 + val2) / 2);
        
        return new CrossableCharacter(val3);
    }
    
}
