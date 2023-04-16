package com.google.common.collect.MapMakerInternalMap$i;
import com.google.common.collect.MapMakerInternalMap$j;
import com.google.common.collect.MapMakerInternalMap;
import com.google.common.collect.MapMakerInternalMap$a;
import java.lang.Object;
import java.util.Iterator;
import com.google.common.collect.MapMakerInternalMap$h;

public final class MapMakerInternalMap$i extends MapMakerInternalMap$j	// class@001832
{
    public final MapMakerInternalMap b;

    public void MapMakerInternalMap$i(MapMakerInternalMap p0){
       this.b = p0;
       super(null);
    }
    public void clear(){
       this.b.clear();
    }
    public boolean contains(Object p0){
       return this.b.containsKey(p0);
    }
    public boolean isEmpty(){
       return this.b.isEmpty();
    }
    public Iterator iterator(){
       return new MapMakerInternalMap$h(this.b);
    }
    public boolean remove(Object p0){
       boolean b = (this.b.remove(p0) != null)? true: false;
       return b;
    }
    public int size(){
       return this.b.size();
    }
}
