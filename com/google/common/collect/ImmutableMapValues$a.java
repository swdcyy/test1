package com.google.common.collect.ImmutableMapValues$a;
import qk.t0;
import com.google.common.collect.ImmutableMapValues;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap;
import java.util.Iterator;
import java.lang.Object;
import java.util.Map$Entry;

public class ImmutableMapValues$a extends t0	// class@0017e9
{
    public final t0 b;
    public final ImmutableMapValues c;

    public void ImmutableMapValues$a(ImmutableMapValues p0){
       this.c = p0;
       super();
       this.b = p0.map.entrySet().iterator();
    }
    public boolean hasNext(){
       return this.b.hasNext();
    }
    public Object next(){
       return this.b.next().getValue();
    }
}
