package com.google.common.collect.RegularImmutableMap$EntrySet;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap;
import java.lang.Object;
import java.util.Map$Entry;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.RegularImmutableMap$EntrySet$1;
import java.util.Iterator;
import qk.t0;

public class RegularImmutableMap$EntrySet extends ImmutableSet	// class@001870
{
    public final Object[] alternatingKeysAndValues;
    public final ImmutableMap d;
    public final int keyOffset;
    public final int size;

    public void RegularImmutableMap$EntrySet(ImmutableMap p0,Object[] p1,int p2,int p3){
       super();
       this.d = p0;
       this.alternatingKeysAndValues = p1;
       this.keyOffset = p2;
       this.size = p3;
    }
    public boolean contains(Object p0){
       boolean b = false;
       if (p0 instanceof Map$Entry) {
          Object key = p0.getKey();
          p0 = p0.getValue();
          if (p0 != null && p0.equals(this.d.get(key))) {
             b = true;
          }
       }
       return b;
    }
    public int copyIntoArray(Object[] p0,int p1){
       return this.asList().copyIntoArray(p0, p1);
    }
    public ImmutableList createAsList(){
       return new RegularImmutableMap$EntrySet$1(this);
    }
    public boolean isPartialView(){
       return true;
    }
    public Iterator iterator(){
       return this.iterator();
    }
    public t0 iterator(){
       return this.asList().iterator();
    }
    public int size(){
       return this.size;
    }
}
