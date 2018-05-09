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
public class CrossableInteger extends Crossable<Integer, CrossableInteger> {

    public CrossableInteger(int value) {
        super(value);
    }

    @Override
    public CrossableInteger cross(CrossableInteger toCross) {

        int val1 = this.value;
        int val2 = toCross.getValue();

        int val3 = (val1 + val2) / 2;

        return new CrossableInteger(val3);

    }

}
