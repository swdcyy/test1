package com.google.common.collect.MapMakerInternalMap$m;
import java.util.AbstractCollection;
import com.google.common.collect.MapMakerInternalMap;
import java.lang.Object;
import java.util.Iterator;
import com.google.common.collect.MapMakerInternalMap$l;
import java.util.Collection;
import java.util.ArrayList;

public final class MapMakerInternalMap$m extends AbstractCollection	// class@001836
{
    public final MapMakerInternalMap b;

    public void MapMakerInternalMap$m(MapMakerInternalMap p0){
       this.b = p0;
       super();
    }
    public void clear(){
       this.b.clear();
    }
    public boolean contains(Object p0){
       return this.b.containsValue(p0);
    }
    public boolean isEmpty(){
       return this.b.isEmpty();
    }
    public Iterator iterator(){
       return new MapMakerInternalMap$l(this.b);
    }
    public int size(){
       return this.b.size();
    }
    public Object[] toArray(){
       return MapMakerInternalMap.toArrayList(this).toArray();
    }
    public Object[] toArray(Object[] p0){
       return MapMakerInternalMap.toArrayList(this).toArray(p0);
    }
}
