package com.google.common.graph.ElementOrder$Type;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class ElementOrder$Type extends Enum	// class@0018d2
{
    public static final ElementOrder$Type[] $VALUES;
    public static final ElementOrder$Type INSERTION;
    public static final ElementOrder$Type SORTED;
    public static final ElementOrder$Type UNORDERED;

    static {
       ElementOrder$Type type = new ElementOrder$Type("UNORDERED", 0);
       ElementOrder$Type.UNORDERED = type;
       ElementOrder$Type type1 = new ElementOrder$Type("INSERTION", 1);
       ElementOrder$Type.INSERTION = type1;
       ElementOrder$Type type2 = new ElementOrder$Type("SORTED", 2);
       ElementOrder$Type.SORTED = type2;
       ElementOrder$Type[] typeArray = new ElementOrder$Type[]{type,type1,type2};
       ElementOrder$Type.$VALUES = typeArray;
    }
    public void ElementOrder$Type(String p0,int p1){
       super(p0, p1);
    }
    public static ElementOrder$Type valueOf(String p0){
       return Enum.valueOf(ElementOrder$Type.class, p0);
    }
    public static ElementOrder$Type[] values(){
       return ElementOrder$Type.$VALUES.clone();
    }
}
