package com.facebook.yoga.YogaPositionType;
import java.lang.Enum;
import java.lang.String;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.Class;
import java.lang.Object;

public final class YogaPositionType extends Enum	// class@00145f
{
    public final int mIntValue;
    public static final YogaPositionType[] $VALUES;
    public static final YogaPositionType ABSOLUTE;
    public static final YogaPositionType RELATIVE;

    static {
       YogaPositionType yogaPosition = new YogaPositionType("RELATIVE", 0, 0);
       YogaPositionType.RELATIVE = yogaPosition;
       YogaPositionType yogaPosition1 = new YogaPositionType("ABSOLUTE", 1, 1);
       YogaPositionType.ABSOLUTE = yogaPosition1;
       YogaPositionType[] yogaPosition2 = new YogaPositionType[]{yogaPosition,yogaPosition1};
       YogaPositionType.$VALUES = yogaPosition2;
    }
    public void YogaPositionType(String p0,int p1,int p2){
       super(p0, p1);
       this.mIntValue = p2;
    }
    public static YogaPositionType fromInt(int p0){
       if (!p0) {
          return YogaPositionType.RELATIVE;
       }
       if (p0 == 1) {
          return YogaPositionType.ABSOLUTE;
       }
       throw new IllegalArgumentException("Unknown enum value: "+p0);
    }
    public static YogaPositionType valueOf(String p0){
       return Enum.valueOf(YogaPositionType.class, p0);
    }
    public static YogaPositionType[] values(){
       return YogaPositionType.$VALUES.clone();
    }
    public int intValue(){
       return this.mIntValue;
    }
}
