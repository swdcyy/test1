package com.google.common.collect.ImmutableMultimap$Values;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableMultimap;
import java.lang.Object;
import com.google.common.collect.ImmutableMap;
import qk.t0;
import java.util.Iterator;

public final class ImmutableMultimap$Values extends ImmutableCollection	// class@0017ed
{
    public final ImmutableMultimap c;
    public static final long serialVersionUID;

    public void ImmutableMultimap$Values(ImmutableMultimap p0){
       super();
       this.c = p0;
    }
    public boolean contains(Object p0){
       return this.c.containsValue(p0);
    }
    public int copyIntoArray(Object[] p0,int p1){
       t0 ot0 = this.c.map.values().iterator();
       while (ot0.hasNext()) {
          p1 = ot0.next().copyIntoArray(p0, p1);
       }
       return p1;
    }
    public boolean isPartialView(){
       return true;
    }
    public Iterator iterator(){
       return this.iterator();
    }
    public t0 iterator(){
       return this.c.valueIterator();
    }
    public int size(){
       return this.c.size();
    }
}
