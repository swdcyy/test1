package com.google.common.collect.ImmutableMultimap$b;
import qk.t0;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterators;
import java.util.Iterator;
import java.lang.Object;

public class ImmutableMultimap$b extends t0	// class@0017ef
{
    public Iterator b;
    public Iterator c;
    public final ImmutableMultimap d;

    public void ImmutableMultimap$b(ImmutableMultimap p0){
       this.d = p0;
       super();
       this.b = p0.map.values().iterator();
       this.c = Iterators.h();
    }
    public boolean hasNext(){
       boolean b = (this.c.hasNext() || this.b.hasNext())? true: false;
       return b;
    }
    public Object next(){
       if (!this.c.hasNext()) {
          this.c = this.b.next().iterator();
       }
       return this.c.next();
    }
}
