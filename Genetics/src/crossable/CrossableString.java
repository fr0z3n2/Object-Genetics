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
public class CrossableString extends Crossable<String, CrossableString> {

    public CrossableString(String value) {
        super(value);
    }

    @Override
    public CrossableString cross(CrossableString toCross) {
        String val1 = this.value;
        String val2 = this.getValue();

        String val3 = val1 + val2;

        return new CrossableString(val3);
    }

}
