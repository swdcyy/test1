package com.google.common.collect.CompactHashMap$h;
import java.util.AbstractCollection;
import com.google.common.collect.CompactHashMap;
import java.util.Iterator;

public class CompactHashMap$h extends AbstractCollection	// class@0017b0
{
    public final CompactHashMap b;

    public void CompactHashMap$h(CompactHashMap p0){
       this.b = p0;
       super();
    }
    public void clear(){
       this.b.clear();
    }
    public Iterator iterator(){
       return this.b.valuesIterator();
    }
    public int size(){
       return this.b.size;
    }
}
