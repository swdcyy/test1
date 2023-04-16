package com.google.common.collect.ImmutableMap$a;
import qk.t0;
import com.google.common.collect.ImmutableMap;
import java.util.Iterator;
import java.lang.Object;
import java.util.Map$Entry;

public class ImmutableMap$a extends t0	// class@0017e3
{
    public final t0 b;
    public final ImmutableMap c;

    public void ImmutableMap$a(ImmutableMap p0,t0 p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public boolean hasNext(){
       return this.b.hasNext();
    }
    public Object next(){
       return this.b.next().getKey();
    }
}
