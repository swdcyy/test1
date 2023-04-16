package com.airbnb.lottie.model.layer.Layer$MatteType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class Layer$MatteType extends Enum	// class@000dd2
{
    public static final Layer$MatteType[] $VALUES;
    public static final Layer$MatteType ADD;
    public static final Layer$MatteType INVERT;
    public static final Layer$MatteType NONE;
    public static final Layer$MatteType UNKNOWN;

    static {
       Layer$MatteType matteType = new Layer$MatteType("NONE", 0);
       Layer$MatteType.NONE = matteType;
       Layer$MatteType matteType1 = new Layer$MatteType("ADD", 1);
       Layer$MatteType.ADD = matteType1;
       Layer$MatteType matteType2 = new Layer$MatteType("INVERT", 2);
       Layer$MatteType.INVERT = matteType2;
       Layer$MatteType matteType3 = new Layer$MatteType("UNKNOWN", 3);
       Layer$MatteType.UNKNOWN = matteType3;
       Layer$MatteType[] matteTypeArr = new Layer$MatteType[]{matteType,matteType1,matteType2,matteType3};
       Layer$MatteType.$VALUES = matteTypeArr;
    }
    public void Layer$MatteType(String p0,int p1){
       super(p0, p1);
    }
    public static Layer$MatteType valueOf(String p0){
       return Enum.valueOf(Layer$MatteType.class, p0);
    }
    public static Layer$MatteType[] values(){
       return Layer$MatteType.$VALUES.clone();
    }
}
