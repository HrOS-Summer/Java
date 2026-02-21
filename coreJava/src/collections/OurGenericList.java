package collections;

import java.util.Iterator;

public class OurGenericList<T> implements Iterable<T> {
    private T[] items;   // generic list (normal array of size 100)
    private int size;

    public OurGenericList() {
        size = 0;
        items = (T[])new Object[100];
    }

    public void add(T item) {
        items[size++] = item;
    }

    public T getItemAtIndex(int index) {
        return items[index];
    }


    @Override
    public Iterator<T> iterator() {
        return new OurGenericListIterator(this);
    }

    private class OurGenericListIterator implements Iterator<T> {

        private OurGenericList<T> list;
        private int index = 0;

        public OurGenericListIterator(OurGenericList<T> list) {
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            return index < list.size;
        }

        @Override
        public T next() {
            return list.items[index++];
        }
    }

}

/*
Making items public violates Encapsulation (and its close cousin, Information Hiding).

Encapsulation is the practice of bundling data (fields) and the methods that operate on that data (behavior)
 into a single unit, while restricting direct access to some of the object's components. By keeping items
 private, you ensure that the only way to modify the list is through the rules you defined in the add() method.


 */
