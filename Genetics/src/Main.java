
import java.util.Arrays;
import objects.vehicle.Wheel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fr0z3n2
 */
public class Main {
 
    
    
    public static void main(String[] args) {
        
        
        Wheel w1 = new Wheel(3, true, 15.0f);
        Wheel w2 = new Wheel(5, false, 10.0f);
        
        Wheel w3 = w1.breed(w2);
        
        
        System.out.println(Arrays.toString(new Wheel[]{w1,w2, w3}));
        
        
    }
    
}
