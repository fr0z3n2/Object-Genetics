/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects.vehicle;

import java.util.ArrayList;
import wellthinkofthatlater.Breedable;
import java.util.List;
import crossable.Crossable;
import crossable.CrossableBoolean;
import crossable.CrossableFloat;
import crossable.CrossableInteger;
import java.util.Arrays;

/**
 *
 * @author fr0z3n2
 */
public class Wheel implements Breedable<Wheel> {
    
    CrossableInteger spokes;
    CrossableBoolean hubCap;
    CrossableFloat size;

    protected Wheel(CrossableInteger spokes, CrossableBoolean hubCap, CrossableFloat size) {
        this.spokes = spokes;
        this.hubCap = hubCap;
        this.size = size;
    }

    public Wheel(int spokeVal, boolean hubCapVal, float sizeVal) {
        this(new CrossableInteger(spokeVal), new CrossableBoolean(hubCapVal), new CrossableFloat(sizeVal));
    }
    
    

    
    
    @Override
    public List<Breedable> getBreedableContents() {
        return new ArrayList();
    }

    @Override
    public Wheel generator(List<Breedable> breedableContents, List<Crossable> crossableContents) {
        // breedableContents dont matter
        
        return new Wheel(
                (CrossableInteger) crossableContents.get(0), 
                (CrossableBoolean) crossableContents.get(1), 
                (CrossableFloat) crossableContents.get(2));
        
    }

    @Override
    public List<Crossable> getCrossableContents() {
        List<Crossable> retList = new ArrayList();
        retList.addAll(Arrays.asList(spokes, hubCap, size));
        return retList;
    }

    @Override
    public String toString() {
        return "Wheel{" + "spokes=" + spokes + ", hubCap=" + hubCap + ", size=" + size + '}';
    }
    
    


}
