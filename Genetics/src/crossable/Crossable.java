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
public abstract class Crossable<T, K extends Crossable> {
 
    protected T value;
    
    public Crossable(T value){
        this.value = value;
    }
    
    public abstract K cross(K toCross);

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Crossable{" + "value=" + value + '}';
    }
    
    
    
    
    
    
}
