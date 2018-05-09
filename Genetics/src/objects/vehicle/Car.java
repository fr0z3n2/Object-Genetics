/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects.vehicle;

import wellthinkofthatlater.Breedable;
import java.util.ArrayList;
import java.util.List;
import crossable.Crossable;

/**
 *
 * @author Logan Stanfield
 * @author Mike Resnik
 */
public class Car implements Breedable<Car> {

    private Wheel[] wheels;

    public Car(Wheel[] wheels) {
        this.wheels = wheels;
    }

    @Override
    public List<Breedable> getBreedableContents() {
        List<Breedable> retList = new ArrayList();
        for (Wheel w : wheels) {
            retList.add(w);
        }
        return retList;

    }

    public Wheel[] getWheels() {
        return this.wheels;
    }

    @Override
    public Car generator(List<Breedable> breedableContents, List<Crossable> crossableContents) {
        List<Wheel> wheel_list = new ArrayList();
        for (Breedable e : breedableContents) {
            if (e.getClass().equals(Wheel.class)) {
                wheel_list.add((Wheel) e);
            }
        }
        Wheel[] w_make = new Wheel[wheel_list.size()];
        w_make = wheel_list.toArray(w_make);

        return new Car(w_make);

    }

    @Override
    public List<Crossable> getCrossableContents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
