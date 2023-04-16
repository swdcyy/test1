package com.google.common.collect.MapMakerInternalMap$h;
import com.google.common.collect.MapMakerInternalMap$e;
import com.google.common.collect.MapMakerInternalMap;
import java.lang.Object;
import com.google.common.collect.MapMakerInternalMap$p;

public final class MapMakerInternalMap$h extends MapMakerInternalMap$e	// class@001831
{
    public final MapMakerInternalMap j;

    public void MapMakerInternalMap$h(MapMakerInternalMap p0){
       this.j = p0;
       super(p0);
    }
    public Object next(){
       return this.c().getKey();
    }
}
