package com.google.common.collect.LinkedListMultimap$d;
import java.util.AbstractSequentialList;
import com.google.common.collect.LinkedListMultimap;
import java.util.ListIterator;
import com.google.common.collect.LinkedListMultimap$h;
import com.google.common.collect.LinkedListMultimap$d$a;

public class LinkedListMultimap$d extends AbstractSequentialList	// class@001818
{
    public final LinkedListMultimap b;

    public void LinkedListMultimap$d(LinkedListMultimap p0){
       this.b = p0;
       super();
    }
    public ListIterator listIterator(int p0){
       return new LinkedListMultimap$d$a(this, new LinkedListMultimap$h(this.b, p0), new LinkedListMultimap$h(this.b, p0));
    }
    public int size(){
       return this.b.size;
    }
}
