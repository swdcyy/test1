package com.google.common.collect.MapMakerInternalMap$d;
import com.google.common.collect.MapMakerInternalMap$j;
import com.google.common.collect.MapMakerInternalMap;
import com.google.common.collect.MapMakerInternalMap$a;
import java.lang.Object;
import java.util.Map$Entry;
import com.google.common.base.Equivalence;
import java.util.Iterator;
import com.google.common.collect.MapMakerInternalMap$c;

public final class MapMakerInternalMap$d extends MapMakerInternalMap$j	// class@00182d
{
    public final MapMakerInternalMap b;

    public void MapMakerInternalMap$d(MapMakerInternalMap p0){
       this.b = p0;
       super(null);
    }
    public void clear(){
       this.b.clear();
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
       key = this.b.get(key);
       if (key != null && this.b.valueEquivalence().equivalent(p0.getValue(), key)) {
          b = true;
       }
       return b;
    }
    public boolean isEmpty(){
       return this.b.isEmpty();
    }
    public Iterator iterator(){
       return new MapMakerInternalMap$c(this.b);
    }
    public boolean remove(Object p0){
       boolean b = false;
       if (!p0 instanceof Map$Entry) {
          return b;
       }
       Object key = p0.getKey();
       if (key != null && this.b.remove(key, p0.getValue())) {
          b = true;
       }
       return b;
    }
    public int size(){
       return this.b.size();
    }
}
