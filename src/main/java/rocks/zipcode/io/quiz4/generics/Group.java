package rocks.zipcode.io.quiz4.generics;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * @author leon on 18/12/2018.
 */
public class Group<T> implements GroupInterface<T>{

    List<T> myList = new ArrayList<>();


    public Group() {

        this.myList = myList;

        //throw new UnsupportedOperationException("Method not yet implemented");
    }



    public Integer count() {


        return myList.size();
    }

    public void insert(T value) {

        myList.add(value);
    }

    public Boolean has(T value) {


        return myList.contains(value);
    }

    public T fetch(int indexOfValue)

    {
        return myList.get(indexOfValue);
    }

    public void delete(T value) {

        myList.remove(value);
    }

    public void clear() {
        myList.clear();
    }

    public Iterator<T> iterator() {


        return myList.iterator();


    }

    @Override
    public Spliterator<T> spliterator() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {

    }


    @Override
    public String toString() {


       return  myList.toString();
    }

}
