package com.facebook.yoga.YogaFlexDirection;
import java.lang.Enum;
import java.lang.String;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.Class;
import java.lang.Object;

public final class YogaFlexDirection extends Enum	// class@001456
{
    public final int mIntValue;
    public static final YogaFlexDirection[] $VALUES;
    public static final YogaFlexDirection COLUMN;
    public static final YogaFlexDirection COLUMN_REVERSE;
    public static final YogaFlexDirection ROW;
    public static final YogaFlexDirection ROW_REVERSE;

    static {
       YogaFlexDirection yogaFlexDire = new YogaFlexDirection("COLUMN", 0, 0);
       YogaFlexDirection.COLUMN = yogaFlexDire;
       YogaFlexDirection yogaFlexDire1 = new YogaFlexDirection("COLUMN_REVERSE", 1, 1);
       YogaFlexDirection.COLUMN_REVERSE = yogaFlexDire1;
       YogaFlexDirection yogaFlexDire2 = new YogaFlexDirection("ROW", 2, 2);
       YogaFlexDirection.ROW = yogaFlexDire2;
       YogaFlexDirection yogaFlexDire3 = new YogaFlexDirection("ROW_REVERSE", 3, 3);
       YogaFlexDirection.ROW_REVERSE = yogaFlexDire3;
       YogaFlexDirection[] yogaFlexDire4 = new YogaFlexDirection[]{yogaFlexDire,yogaFlexDire1,yogaFlexDire2,yogaFlexDire3};
       YogaFlexDirection.$VALUES = yogaFlexDire4;
    }
    public void YogaFlexDirection(String p0,int p1,int p2){
       super(p0, p1);
       this.mIntValue = p2;
    }
    public static YogaFlexDirection fromInt(int p0){
       if (!p0) {
          return YogaFlexDirection.COLUMN;
       }
       if (p0 == 1) {
          return YogaFlexDirection.COLUMN_REVERSE;
       }
       if (p0 == 2) {
          return YogaFlexDirection.ROW;
       }
       if (p0 == 3) {
          return YogaFlexDirection.ROW_REVERSE;
       }
       throw new IllegalArgumentException("Unknown enum value: "+p0);
    }
    public static YogaFlexDirection valueOf(String p0){
       return Enum.valueOf(YogaFlexDirection.class, p0);
    }
    public static YogaFlexDirection[] values(){
       return YogaFlexDirection.$VALUES.clone();
    }
    public int intValue(){
       return this.mIntValue;
    }
}
