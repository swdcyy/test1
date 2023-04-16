package com.google.common.collect.CompactHashMap$d;
import java.util.AbstractSet;
import com.google.common.collect.CompactHashMap;
import java.lang.Object;
import java.util.Map$Entry;
import ok.k;
import java.util.Iterator;

public class CompactHashMap$d extends AbstractSet	// class@0017ac
{
    public final CompactHashMap b;

    public void CompactHashMap$d(CompactHashMap p0){
       this.b = p0;
       super();
    }
    public void clear(){
       this.b.clear();
    }
    public boolean contains(Object p0){
       boolean b = false;
       if (p0 instanceof Map$Entry) {
          int i = this.b.indexOf(p0.getKey());
          if (i != -1 && k.a(this.b.values[i], p0.getValue())) {
             b = true;
          }
       }
       return b;
    }
    public Iterator iterator(){
       return this.b.entrySetIterator();
    }
    public boolean remove(Object p0){
       if (p0 instanceof Map$Entry) {
          int i = this.b.indexOf(p0.getKey());
          if (i != -1 && k.a(this.b.values[i], p0.getValue())) {
             this.b.removeEntry(i);
             return true;
          }
       }
       return false;
    }
    public int size(){
       return this.b.size;
    }
}
