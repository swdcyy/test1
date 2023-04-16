package com.google.common.collect.ImmutableMultimap$a;
import qk.t0;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterators;
import java.util.Iterator;
import java.lang.Object;
import java.util.Map$Entry;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.Maps;

public class ImmutableMultimap$a extends t0	// class@0017ee
{
    public final Iterator b;
    public Object c;
    public Iterator d;
    public final ImmutableMultimap e;

    public void ImmutableMultimap$a(ImmutableMultimap p0){
       this.e = p0;
       super();
       this.b = p0.map.entrySet().iterator();
       this.c = null;
       this.d = Iterators.h();
    }
    public boolean hasNext(){
       boolean b = (this.d.hasNext() || this.b.hasNext())? true: false;
       return b;
    }
    public Object next(){
       if (!this.d.hasNext()) {
          Map$Entry uEntry = this.b.next();
          this.c = uEntry.getKey();
          this.d = uEntry.getValue().iterator();
       }
       return Maps.k(this.c, this.d.next());
    }
}
