package com.facebook.yoga.YogaDirection;
import java.lang.Enum;
import java.lang.String;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.Class;
import java.lang.Object;

public final class YogaDirection extends Enum	// class@001452
{
    public final int mIntValue;
    public static final YogaDirection[] $VALUES;
    public static final YogaDirection INHERIT;
    public static final YogaDirection LTR;
    public static final YogaDirection RTL;

    static {
       YogaDirection yogaDirectio = new YogaDirection("INHERIT", 0, 0);
       YogaDirection.INHERIT = yogaDirectio;
       YogaDirection yogaDirectio1 = new YogaDirection("LTR", 1, 1);
       YogaDirection.LTR = yogaDirectio1;
       YogaDirection yogaDirectio2 = new YogaDirection("RTL", 2, 2);
       YogaDirection.RTL = yogaDirectio2;
       YogaDirection[] yogaDirectio3 = new YogaDirection[]{yogaDirectio,yogaDirectio1,yogaDirectio2};
       YogaDirection.$VALUES = yogaDirectio3;
    }
    public void YogaDirection(String p0,int p1,int p2){
       super(p0, p1);
       this.mIntValue = p2;
    }
    public static YogaDirection fromInt(int p0){
       if (!p0) {
          return YogaDirection.INHERIT;
       }
       if (p0 == 1) {
          return YogaDirection.LTR;
       }
       if (p0 == 2) {
          return YogaDirection.RTL;
       }
       throw new IllegalArgumentException("Unknown enum value: "+p0);
    }
    public static YogaDirection valueOf(String p0){
       return Enum.valueOf(YogaDirection.class, p0);
    }
    public static YogaDirection[] values(){
       return YogaDirection.$VALUES.clone();
    }
    public int intValue(){
       return this.mIntValue;
    }
}
