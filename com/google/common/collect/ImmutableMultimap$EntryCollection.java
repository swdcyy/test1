package com.google.common.collect.ImmutableMultimap$EntryCollection;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableMultimap;
import java.lang.Object;
import java.util.Map$Entry;
import java.util.Iterator;
import qk.t0;

public class ImmutableMultimap$EntryCollection extends ImmutableCollection	// class@0017eb
{
    public final ImmutableMultimap multimap;
    public static final long serialVersionUID;

    public void ImmutableMultimap$EntryCollection(ImmutableMultimap p0){
       super();
       this.multimap = p0;
    }
    public boolean contains(Object p0){
       if (p0 instanceof Map$Entry) {
          return this.multimap.containsEntry(p0.getKey(), p0.getValue());
       }
       return false;
    }
    public boolean isPartialView(){
       return this.multimap.isPartialView();
    }
    public Iterator iterator(){
       return this.iterator();
    }
    public t0 iterator(){
       return this.multimap.entryIterator();
    }
    public int size(){
       return this.multimap.size();
    }
}
