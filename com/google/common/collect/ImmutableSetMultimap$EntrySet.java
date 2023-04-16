package com.google.common.collect.ImmutableSetMultimap$EntrySet;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSetMultimap;
import java.lang.Object;
import java.util.Map$Entry;
import com.google.common.collect.ImmutableMultimap;
import java.util.Iterator;
import qk.t0;

public final class ImmutableSetMultimap$EntrySet extends ImmutableSet	// class@0017fc
{
    public final ImmutableSetMultimap d;

    public void ImmutableSetMultimap$EntrySet(ImmutableSetMultimap p0){
       super();
       this.d = p0;
    }
    public boolean contains(Object p0){
       if (p0 instanceof Map$Entry) {
          return this.d.containsEntry(p0.getKey(), p0.getValue());
       }
       return false;
    }
    public boolean isPartialView(){
       return false;
    }
    public Iterator iterator(){
       return this.iterator();
    }
    public t0 iterator(){
       return this.d.entryIterator();
    }
    public int size(){
       return this.d.size();
    }
}
