package com.google.common.collect.HashBiMap$c;
import com.google.common.collect.HashBiMap$g;
import com.google.common.collect.HashBiMap;
import java.lang.Object;
import com.google.common.collect.HashBiMap$a;
import java.util.Map$Entry;
import ok.k;
import qk.w;

public final class HashBiMap$c extends HashBiMap$g	// class@0017cb
{
    public final HashBiMap c;

    public void HashBiMap$c(HashBiMap p0){
       this.c = p0;
       super(p0);
    }
    public Object b(int p0){
       return new HashBiMap$a(this.c, p0);
    }
    public boolean contains(Object p0){
       boolean b = false;
       if (p0 instanceof Map$Entry) {
          p0 = p0.getValue();
          int i = this.c.findEntryByKey(p0.getKey());
          if (i != -1 && k.a(p0, this.c.values[i])) {
             b = true;
          }
       }
       return b;
    }
    public boolean remove(Object p0){
       if (p0 instanceof Map$Entry) {
          Object key = p0.getKey();
          p0 = p0.getValue();
          int i = w.c(key);
          int i1 = this.c.findEntryByKey(key, i);
          if (i1 != -1 && k.a(p0, this.c.values[i1])) {
             this.c.removeEntryKeyHashKnown(i1, i);
             return true;
          }
       }
       return false;
    }
}
