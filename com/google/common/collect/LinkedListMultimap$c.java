package com.google.common.collect.LinkedListMultimap$c;
import com.google.common.collect.o$e;
import com.google.common.collect.LinkedListMultimap;
import java.lang.Object;
import java.util.Iterator;
import com.google.common.collect.LinkedListMultimap$e;
import java.util.List;
import java.util.Map;

public class LinkedListMultimap$c extends o$e	// class@0004e8
{
    public final LinkedListMultimap b;

    public void LinkedListMultimap$c(LinkedListMultimap p0){
       this.b = p0;
       super();
    }
    public boolean contains(Object p0){
       return this.b.containsKey(p0);
    }
    public Iterator iterator(){
       return new LinkedListMultimap$e(this.b);
    }
    public boolean remove(Object p0){
       return (this.b.removeAll(p0).isEmpty() ^ 0x01);
    }
    public int size(){
       return this.b.keyToKeyList.size();
    }
}
