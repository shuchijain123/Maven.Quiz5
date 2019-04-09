package rocks.zipcode.io.quiz4.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * @author leon on 11/12/2018.
 */
public class SimpleStringGroup implements Iterable<String> {


    List<String> myList = new ArrayList<String>();


    public SimpleStringGroup(List myList)

    {
       this.myList = myList;
    }



    public SimpleStringGroup(){

        this.myList = myList;


       // throw new UnsupportedOperationException("Method not yet implemented");
    }

    public Integer count() {


        return myList.size();
    }

    public void insert(String string) {

        myList.add(string);
    }

    public Boolean has(String string) {


        return myList.contains(string);
    }

    public String fetch(int indexOfValue) {

        return myList.get(indexOfValue);
    }

    public void delete(String string) {

        myList.remove(string);
    }

    public void clear() {

        myList.clear();
    }

   @Override
    public Iterator<String> iterator() {

      return myList.iterator();
    }


    @Override
    public void forEach(Consumer<? super String> action) {

    }

    @Override
    public Spliterator<String> spliterator() {
        return null;
    }
}
