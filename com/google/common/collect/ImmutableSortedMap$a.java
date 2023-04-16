package com.google.common.collect.ImmutableSortedMap$a;
import java.util.Comparator;
import java.lang.Object;
import java.util.Map$Entry;

public final class ImmutableSortedMap$a implements Comparator	// class@001803
{
    public final Comparator b;

    public void ImmutableSortedMap$a(Comparator p0){
       this.b = p0;
       super();
    }
    public int compare(Object p0,Object p1){
       return this.b.compare(p0.getKey(), p1.getKey());
    }
}
