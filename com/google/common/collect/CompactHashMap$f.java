package com.google.common.collect.CompactHashMap$f;
import java.util.AbstractSet;
import com.google.common.collect.CompactHashMap;
import java.lang.Object;
import java.util.Iterator;

public class CompactHashMap$f extends AbstractSet	// class@0017ae
{
    public final CompactHashMap b;

    public void CompactHashMap$f(CompactHashMap p0){
       this.b = p0;
       super();
    }
    public void clear(){
       this.b.clear();
    }
    public boolean contains(Object p0){
       return this.b.containsKey(p0);
    }
    public Iterator iterator(){
       return this.b.keySetIterator();
    }
    public boolean remove(Object p0){
       int i = this.b.indexOf(p0);
       if (i == -1) {
          return false;
       }
       this.b.removeEntry(i);
       return true;
    }
    public int size(){
       return this.b.size;
    }
}
