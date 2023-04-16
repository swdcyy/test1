package com.google.common.collect.HashBiMap$d;
import com.google.common.collect.HashBiMap$g;
import com.google.common.collect.HashBiMap;
import java.lang.Object;
import com.google.common.collect.HashBiMap$b;
import java.util.Map$Entry;
import ok.k;
import qk.w;

public class HashBiMap$d extends HashBiMap$g	// class@0017cc
{

    public void HashBiMap$d(HashBiMap p0){
       super(p0);
    }
    public Object b(int p0){
       return new HashBiMap$b(this.b, p0);
    }
    public boolean contains(Object p0){
       boolean b = false;
       if (p0 instanceof Map$Entry) {
          p0 = p0.getValue();
          int i = this.b.findEntryByValue(p0.getKey());
          if (i != -1 && k.a(this.b.keys[i], p0)) {
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
          int i1 = this.b.findEntryByValue(key, i);
          if (i1 != -1 && k.a(this.b.keys[i1], p0)) {
             this.b.removeEntryValueHashKnown(i1, i);
             return true;
          }
       }
       return false;
    }
}
