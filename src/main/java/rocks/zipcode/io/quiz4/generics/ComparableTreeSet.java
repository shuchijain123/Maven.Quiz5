package rocks.zipcode.io.quiz4.generics;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.TreeSet;

/**
 * @author leon on 11/12/2018.
 */
public class ComparableTreeSet<T> extends TreeSet  implements Comparable{

    TreeSet<T> tset = new TreeSet<T>();

    private T a[];
    public ComparableTreeSet(T... arr) {


     this.a=arr;

    }


    public ComparableTreeSet() {



    }

    public int compareTo(ComparableTreeSet<T> o) {





        return Integer.valueOf(null);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
