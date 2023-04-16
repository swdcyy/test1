package com.google.protobuf.FieldType$Collection;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class FieldType$Collection extends Enum	// class@000429
{
    public final boolean isList;
    public static final FieldType$Collection[] $VALUES;
    public static final FieldType$Collection MAP;
    public static final FieldType$Collection PACKED_VECTOR;
    public static final FieldType$Collection SCALAR;
    public static final FieldType$Collection VECTOR;

    static {
       FieldType$Collection uCollection = new FieldType$Collection("SCALAR", 0, 0);
       FieldType$Collection.SCALAR = uCollection;
       FieldType$Collection uCollection1 = new FieldType$Collection("VECTOR", 1, 1);
       FieldType$Collection.VECTOR = uCollection1;
       FieldType$Collection uCollection2 = new FieldType$Collection("PACKED_VECTOR", 2, 1);
       FieldType$Collection.PACKED_VECTOR = uCollection2;
       FieldType$Collection uCollection3 = new FieldType$Collection("MAP", 3, 0);
       FieldType$Collection.MAP = uCollection3;
       FieldType$Collection[] uCollectionA = new FieldType$Collection[]{uCollection,uCollection1,uCollection2,uCollection3};
       FieldType$Collection.$VALUES = uCollectionA;
    }
    public void FieldType$Collection(String p0,int p1,boolean p2){
       super(p0, p1);
       this.isList = p2;
    }
    public static FieldType$Collection valueOf(String p0){
       return Enum.valueOf(FieldType$Collection.class, p0);
    }
    public static FieldType$Collection[] values(){
       return FieldType$Collection.$VALUES.clone();
    }
    public boolean isList(){
       return this.isList;
    }
}
