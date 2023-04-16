package com.google.common.collect.MapMakerInternalMap$Strength;
import java.lang.Enum;
import com.google.common.collect.MapMakerInternalMap$Strength$1;
import java.lang.String;
import com.google.common.collect.MapMakerInternalMap$Strength$2;
import com.google.common.collect.MapMakerInternalMap$a;
import java.lang.Class;
import java.lang.Object;
import com.google.common.base.Equivalence;

public abstract class MapMakerInternalMap$Strength extends Enum	// class@001829
{
    public static final MapMakerInternalMap$Strength[] $VALUES;
    public static final MapMakerInternalMap$Strength STRONG;
    public static final MapMakerInternalMap$Strength WEAK;

    static {
       MapMakerInternalMap$Strength$1 strength$1 = new MapMakerInternalMap$Strength$1("STRONG", 0);
       MapMakerInternalMap$Strength.STRONG = strength$1;
       MapMakerInternalMap$Strength$2 strength$2 = new MapMakerInternalMap$Strength$2("WEAK", 1);
       MapMakerInternalMap$Strength.WEAK = strength$2;
       MapMakerInternalMap$Strength[] strengthArra = new MapMakerInternalMap$Strength[]{strength$1,strength$2};
       MapMakerInternalMap$Strength.$VALUES = strengthArra;
    }
    public void MapMakerInternalMap$Strength(String p0,int p1){
       super(p0, p1);
    }
    public void MapMakerInternalMap$Strength(String p0,int p1,MapMakerInternalMap$a p2){
       super(p0, p1);
    }
    public static MapMakerInternalMap$Strength valueOf(String p0){
       return Enum.valueOf(MapMakerInternalMap$Strength.class, p0);
    }
    public static MapMakerInternalMap$Strength[] values(){
       return MapMakerInternalMap$Strength.$VALUES.clone();
    }
    public abstract Equivalence defaultEquivalence();
}
