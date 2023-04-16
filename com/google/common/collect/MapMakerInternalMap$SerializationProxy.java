package com.google.common.collect.MapMakerInternalMap$SerializationProxy;
import com.google.common.collect.MapMakerInternalMap$AbstractSerializationProxy;
import com.google.common.collect.MapMakerInternalMap$Strength;
import com.google.common.base.Equivalence;
import java.util.concurrent.ConcurrentMap;
import java.lang.Object;

public final class MapMakerInternalMap$SerializationProxy extends MapMakerInternalMap$AbstractSerializationProxy	// class@001826
{
    public static final long serialVersionUID = 0x3;

    public void MapMakerInternalMap$SerializationProxy(MapMakerInternalMap$Strength p0,MapMakerInternalMap$Strength p1,Equivalence p2,Equivalence p3,int p4,ConcurrentMap p5){
       super(p0, p1, p2, p3, p4, p5);
    }
    public final Object readResolve(){
       return this.delegate;
    }
}
