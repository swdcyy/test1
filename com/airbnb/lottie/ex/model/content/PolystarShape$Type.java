package com.airbnb.lottie.ex.model.content.PolystarShape$Type;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class PolystarShape$Type extends Enum	// class@000dae
{
    public final int value;
    public static final PolystarShape$Type[] $VALUES;
    public static final PolystarShape$Type POLYGON;
    public static final PolystarShape$Type STAR;

    static {
       PolystarShape$Type type = new PolystarShape$Type("STAR", 0, 1);
       PolystarShape$Type.STAR = type;
       PolystarShape$Type type1 = new PolystarShape$Type("POLYGON", 1, 2);
       PolystarShape$Type.POLYGON = type1;
       PolystarShape$Type[] typeArray = new PolystarShape$Type[]{type,type1};
       PolystarShape$Type.$VALUES = typeArray;
    }
    public void PolystarShape$Type(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static PolystarShape$Type forValue(int p0){
       object oobject;
       PolystarShape$Type[] typeArray = PolystarShape$Type.values();
       int len = typeArray.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return null;
          }
          oobject = typeArray[i];
          if (oobject.value == p0) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return oobject;
    }
    public static PolystarShape$Type valueOf(String p0){
       return Enum.valueOf(PolystarShape$Type.class, p0);
    }
    public static PolystarShape$Type[] values(){
       return PolystarShape$Type.$VALUES.clone();
    }
}
