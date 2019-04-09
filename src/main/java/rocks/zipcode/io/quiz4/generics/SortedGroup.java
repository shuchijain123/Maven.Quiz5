package rocks.zipcode.io.quiz4.generics;

import java.util.*;
import java.util.function.Consumer;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<T> extends Group<T>   {





  TreeSet<T> mySet = new TreeSet<>();








        //throw new UnsupportedOperationException("Method not yet implemented");


    public SortedGroup(){

       this.mySet=mySet;
       // super();
    }


    @Override

    public void insert(T value) {

    mySet.add(value);




    }

    @Override
    public void delete(T value) {


     mySet.remove(value);

    }

    public Integer indexOf(T value)

    {
    return mySet.headSet(value).size();


    }

    @Override
    public Integer count() {
       return mySet.size();
    }

    @Override
    public Boolean has(T valueToInsert) {

        return mySet.contains(valueToInsert);
    }





    @Override
    public void clear() {
       mySet.clear();

    }

    @Override
    public Iterator iterator() {
        return super.iterator();
    }

    @Override
    public void forEach(Consumer action) {

    }

    @Override
    public Spliterator spliterator() {
        return null;
    }
}
