package rocks.zipcode.io.quiz4.generics;

import java.util.*;
import java.util.function.Consumer;

/**
 * @author leon on 11/12/2018.
 */
public class MyStack<SomeType>  implements Iterable {

    Stack<SomeType> myStack = new Stack<>();


    private int size;
    private SomeType[] elements;

    SomeType element;

    public SomeType[] getElements() {



        return elements;
    }





    public MyStack() {

this.myStack = myStack;
        elements = (SomeType[]) new Object[0];
       //throw new UnsupportedOperationException("Method not yet implemented");


    }


    public Boolean isEmpty(){

        if (myStack.isEmpty())

            return true;

else
     return false;



    }

    public void push(SomeType i) {



        myStack.push(i);




    }

    public SomeType peek()

    {
        if (!myStack.isEmpty())

        return myStack.peek();


      else return null;
          //throw new UnsupportedOperationException("Method not yet implemented");
    }

    public SomeType pop() {


       return  myStack.pop();




   }


    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {

    }

    @Override
    public Spliterator spliterator() {
        return null;
    }
}
