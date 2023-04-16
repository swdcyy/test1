package com.google.common.collect.LinkedListMultimap$b;
import java.util.AbstractSequentialList;
import com.google.common.collect.LinkedListMultimap;
import java.util.ListIterator;
import com.google.common.collect.LinkedListMultimap$h;

public class LinkedListMultimap$b extends AbstractSequentialList	// class@001816
{
    public final LinkedListMultimap b;

    public void LinkedListMultimap$b(LinkedListMultimap p0){
       this.b = p0;
       super();
    }
    public ListIterator listIterator(int p0){
       return new LinkedListMultimap$h(this.b, p0);
    }
    public int size(){
       return this.b.size;
    }
}
