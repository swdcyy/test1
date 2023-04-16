package com.airbnb.lottie.ex.model.layer.Layer$LayerType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class Layer$LayerType extends Enum	// class@000db7
{
    public static final Layer$LayerType[] $VALUES;
    public static final Layer$LayerType IMAGE;
    public static final Layer$LayerType NULL;
    public static final Layer$LayerType PRE_COMP;
    public static final Layer$LayerType SHAPE;
    public static final Layer$LayerType SOLID;
    public static final Layer$LayerType TEXT;
    public static final Layer$LayerType UNKNOWN;

    static {
       Layer$LayerType layerType = new Layer$LayerType("PRE_COMP", 0);
       Layer$LayerType.PRE_COMP = layerType;
       Layer$LayerType layerType1 = new Layer$LayerType("SOLID", 1);
       Layer$LayerType.SOLID = layerType1;
       Layer$LayerType layerType2 = new Layer$LayerType("IMAGE", 2);
       Layer$LayerType.IMAGE = layerType2;
       Layer$LayerType layerType3 = new Layer$LayerType("NULL", 3);
       Layer$LayerType.NULL = layerType3;
       Layer$LayerType layerType4 = new Layer$LayerType("SHAPE", 4);
       Layer$LayerType.SHAPE = layerType4;
       Layer$LayerType layerType5 = new Layer$LayerType("TEXT", 5);
       Layer$LayerType.TEXT = layerType5;
       Layer$LayerType layerType6 = new Layer$LayerType("UNKNOWN", 6);
       Layer$LayerType.UNKNOWN = layerType6;
       Layer$LayerType[] layerTypeArr = new Layer$LayerType[]{layerType,layerType1,layerType2,layerType3,layerType4,layerType5,layerType6};
       Layer$LayerType.$VALUES = layerTypeArr;
    }
    public void Layer$LayerType(String p0,int p1){
       super(p0, p1);
    }
    public static Layer$LayerType valueOf(String p0){
       return Enum.valueOf(Layer$LayerType.class, p0);
    }
    public static Layer$LayerType[] values(){
       return Layer$LayerType.$VALUES.clone();
    }
}
