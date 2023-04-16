package com.google.protobuf.LazyField$LazyIterator;
import java.util.Iterator;
import java.lang.Object;
import java.util.Map$Entry;
import com.google.protobuf.LazyField;
import com.google.protobuf.LazyField$LazyEntry;
import com.google.protobuf.LazyField$1;

public class LazyField$LazyIterator implements Iterator	// class@00045e
{
    public Iterator iterator;

    public void LazyField$LazyIterator(Iterator p0){
       super();
       this.iterator = p0;
    }
    public boolean hasNext(){
       return this.iterator.hasNext();
    }
    public Object next(){
       return this.next();
    }
    public Map$Entry next(){
       Map$Entry uEntry = this.iterator.next();
       if (uEntry.getValue() instanceof LazyField) {
          return new LazyField$LazyEntry(uEntry, null);
       }
       return uEntry;
    }
    public void remove(){
       this.iterator.remove();
    }
}
