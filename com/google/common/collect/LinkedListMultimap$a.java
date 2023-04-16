package com.google.common.collect.LinkedListMultimap$a;
import java.util.AbstractSequentialList;
import com.google.common.collect.LinkedListMultimap;
import java.lang.Object;
import java.util.ListIterator;
import com.google.common.collect.LinkedListMultimap$i;
import java.util.Map;
import com.google.common.collect.LinkedListMultimap$f;

public class LinkedListMultimap$a extends AbstractSequentialList	// class@0004e6
{
    public final Object b;
    public final LinkedListMultimap c;

    public void LinkedListMultimap$a(LinkedListMultimap p0,Object p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public ListIterator listIterator(int p0){
       return new LinkedListMultimap$i(this.c, this.b, p0);
    }
    public int size(){
       LinkedListMultimap$f uof = this.c.keyToKeyList.get(this.b);
       int i = (uof == null)? 0: uof.c;
       return i;
    }
}
