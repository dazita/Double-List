package co.edu.uptc;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class DoubleListIterator implements Iterator<Integer>{

    private Node actualNode;

    public DoubleListIterator(Node firstNode){
        actualNode = firstNode;
    }

    @Override
    public boolean hasNext() {
        return actualNode != null;
    }

    @Override
    public Integer next() {
       if (!hasNext()) {
            throw new NoSuchElementException();
       } else {
            Integer info = actualNode.getInfo();
            actualNode = actualNode.getNext();
            return info;
       }

    }

}
