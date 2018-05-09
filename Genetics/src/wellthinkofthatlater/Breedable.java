/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wellthinkofthatlater;

import crossable.Crossable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Logan Stanfield
 * @author Mike Resnik
 * @param <T>
 */
public interface Breedable<T extends Breedable> {

    public default T breed(T breedWith) {
        List<Breedable> newElements = new ArrayList();
        List<Crossable> newCrossables = new ArrayList();
        for (int i = 0; i < this.getBreedableContents().size(); i++) {
            Breedable new_element = this.getBreedableElement(i).breed(breedWith.getBreedableElement(i));
            newElements.add(new_element);
        }
        for (int i = 0; i < this.getCrossableContents().size(); i++) {
            Crossable c1 = this.getCrossableElement(i);
            System.out.println(c1);
            Crossable c2 = breedWith.getCrossableElement(i);
            System.out.println(c2);
            Crossable c3 = c1.cross(c2);
            System.out.println(c3);
            newCrossables.add(c3);
        }
        return generator(newElements, newCrossables);
    }

    public List<Breedable> getBreedableContents();

    public default Breedable getBreedableElement(int val) {
        return this.getBreedableContents().get(val);
    }

    public default boolean isBreedable() {
        return true;
    }

    public T generator(List<Breedable> breedableContents, List<Crossable> crossableContents);

    public List<Crossable> getCrossableContents();

    public default Crossable getCrossableElement(int val) {
        return this.getCrossableContents().get(val);
    }
}
