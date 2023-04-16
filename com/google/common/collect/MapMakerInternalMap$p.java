package com.google.common.collect.MapMakerInternalMap$p;
import qk.b;
import com.google.common.collect.MapMakerInternalMap;
import java.lang.Object;
import java.util.Map$Entry;

public final class MapMakerInternalMap$p extends b	// class@001839
{
    public final Object b;
    public Object c;
    public final MapMakerInternalMap d;

    public void MapMakerInternalMap$p(MapMakerInternalMap p0,Object p1,Object p2){
       this.d = p0;
       super();
       this.b = p1;
       this.c = p2;
    }
    public boolean equals(Object p0){
       boolean b = false;
       if (p0 instanceof Map$Entry && (this.b.equals(p0.getKey()) && this.c.equals(p0.getValue()))) {
          b = true;
       }
    label_0020 :
       return b;
    }
    public Object getKey(){
       return this.b;
    }
    public Object getValue(){
       return this.c;
    }
    public int hashCode(){
       return (this.b.hashCode() ^ this.c.hashCode());
    }
    public Object setValue(Object p0){
       this.c = p0;
       return this.d.put(this.b, p0);
    }
}
