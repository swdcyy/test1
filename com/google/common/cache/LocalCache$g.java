package com.google.common.cache.LocalCache$g;
import com.google.common.cache.LocalCache$c;
import com.google.common.cache.LocalCache;
import java.util.concurrent.ConcurrentMap;
import java.lang.Object;
import java.util.Map$Entry;
import com.google.common.base.Equivalence;
import java.util.Iterator;
import com.google.common.cache.LocalCache$f;

public final class LocalCache$g extends LocalCache$c	// class@001760
{
    public final LocalCache d;

    public void LocalCache$g(LocalCache p0,ConcurrentMap p1){
       this.d = p0;
       super(p0, p1);
    }
    public boolean contains(Object p0){
       boolean b = false;
       if (!p0 instanceof Map$Entry) {
          return b;
       }
       Object key = p0.getKey();
       if (key == null) {
          return b;
       }
       key = this.d.get(key);
       if (key != null && this.d.g.equivalent(p0.getValue(), key)) {
          b = true;
       }
       return b;
    }
    public Iterator iterator(){
       return new LocalCache$f(this.d);
    }
    public boolean remove(Object p0){
       boolean b = false;
       if (!p0 instanceof Map$Entry) {
          return b;
       }
       Object key = p0.getKey();
       if (key != null && this.d.remove(key, p0.getValue())) {
          b = true;
       }
       return b;
    }
}
