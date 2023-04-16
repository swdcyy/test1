package com.google.common.collect.HashBiMap$f;
import com.google.common.collect.HashBiMap$g;
import com.google.common.collect.HashBiMap;
import java.lang.Object;
import qk.w;

public final class HashBiMap$f extends HashBiMap$g	// class@0017ce
{
    public final HashBiMap c;

    public void HashBiMap$f(HashBiMap p0){
       this.c = p0;
       super(p0);
    }
    public Object b(int p0){
       return this.c.values[p0];
    }
    public boolean contains(Object p0){
       return this.c.containsValue(p0);
    }
    public boolean remove(Object p0){
       int i = w.c(p0);
       int i1 = this.c.findEntryByValue(p0, i);
       if (i1 == -1) {
          return false;
       }
       this.c.removeEntryValueHashKnown(i1, i);
       return true;
    }
}
