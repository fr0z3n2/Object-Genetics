/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crossable;

/**
 *
 * @author Logan Stanfield
 * @authro Mike Resnik
 */
public class CrossableFloat extends Crossable<Float, CrossableFloat> {

    public CrossableFloat(float value) {
        super(value);
    }

    @Override
    public CrossableFloat cross(CrossableFloat toCross) {

        float val1 = this.value;
        float val2 = toCross.getValue();

        float val3 = (val1 + val2) / 2;

        return new CrossableFloat(val3);

    }

}
