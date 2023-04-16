package com.kwai.flash.Flash$Type;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class Flash$Type extends Enum	// class@0014c3
{
    public static final Flash$Type[] $VALUES;
    public static final Flash$Type BACKGROUND;
    public static final Flash$Type MAIN;

    static {
       Flash$Type type = new Flash$Type("MAIN", 0);
       Flash$Type.MAIN = type;
       Flash$Type type1 = new Flash$Type("BACKGROUND", 1);
       Flash$Type.BACKGROUND = type1;
       Flash$Type[] typeArray = new Flash$Type[]{type,type1};
       Flash$Type.$VALUES = typeArray;
    }
    public void Flash$Type(String p0,int p1){
       super(p0, p1);
    }
    public static Flash$Type valueOf(String p0){
       return Enum.valueOf(Flash$Type.class, p0);
    }
    public static Flash$Type[] values(){
       return Flash$Type.$VALUES.clone();
    }
}
