package com.google.common.collect.HashBiMap$e;
import com.google.common.collect.HashBiMap$g;
import com.google.common.collect.HashBiMap;
import java.lang.Object;
import qk.w;

public final class HashBiMap$e extends HashBiMap$g	// class@0017cd
{
    public final HashBiMap c;

    public void HashBiMap$e(HashBiMap p0){
       this.c = p0;
       super(p0);
    }
    public Object b(int p0){
       return this.c.keys[p0];
    }
    public boolean contains(Object p0){
       return this.c.containsKey(p0);
    }
    public boolean remove(Object p0){
       int i = w.c(p0);
       int i1 = this.c.findEntryByKey(p0, i);
       if (i1 == -1) {
          return false;
       }
       this.c.removeEntryKeyHashKnown(i1, i);
       return true;
    }
}
