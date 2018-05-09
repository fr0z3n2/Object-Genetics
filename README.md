# Object-Genetics
This library allows the user to "breed" objects based on their primitive data types.

* [Getting Started](#gettingstarted)
* [What is it?](#whatisit)
* [Wheel Example](#wheelexample)

Getting Started <a name="gettingstarted"></a>
===============
Download/Clone the repository and open the Genetics folder using NetBeans.

Run the Main.java to test the Genetics library.

What is it? <a name="whatisit"></a>
===========

The goal of this project is to allow users to "breed" two programming objects
together to produce another resulting object. How the resultant object is
defined is up to the programmer or the default traits can be used.

When breeding two objects together, they must be the same class and they must
implement the Breedable interface. Then, the class must consist of Crossable
primitive data type wrappers. For example, CrossableInt, CrossableBool,
CrossableDouble, CrossableFloat, CrossableCharacter, and CrossableString.

These Crossable data types are used to build a Breedable object as fields. When
an object is being bred with another all of the Crossable fields are crossed
respectively. The results of a cross can be redefined from the default operations.
For instance, when breeding two integers 1 and 3, the result will be 2. Breeding
two characters 'a' and 'c' would result in the character 'b'. The goal is to be
able to bread any type of object based on its primitive data types.

Wheel Example <a name="wheelexample"></a>
=======

Here is an example using the analogy of a wheel. A wheel could contain a number
of spokes, a hubcap, and a wheel size. Take a look at the following code:

```java
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

    // =-=-=-=-=-=-=-=-=-=-=-=-=-=-= MAIN METHOD =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= //
    public static void main(String[] args) {

        Wheel w1 = new Wheel(3, true, 15.0f);
        Wheel w2 = new Wheel(5, false, 10.0f);

        Wheel w3 = w1.breed(w2);

        System.out.println(Arrays.toString(new Wheel[]{w1, w2, w3}));

    }
}
```

The results would be as follows:

```
Output:
----------------------
Crossable{value=3}
Crossable{value=5}
// Result number of spokes.
Crossable{value=4}

Crossable{value=true}
Crossable{value=false}
// Result if the wheel has a hubcap.
Crossable{value=false}

Crossable{value=15.0}
Crossable{value=10.0}
// Result of the combined wheel size. 
Crossable{value=12.5}
```
