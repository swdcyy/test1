package com.facebook.yoga.YogaJustify;
import java.lang.Enum;
import java.lang.String;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.Class;
import java.lang.Object;

public final class YogaJustify extends Enum	// class@001457
{
    public final int mIntValue;
    public static final YogaJustify[] $VALUES;
    public static final YogaJustify CENTER;
    public static final YogaJustify FLEX_END;
    public static final YogaJustify FLEX_START;
    public static final YogaJustify SPACE_AROUND;
    public static final YogaJustify SPACE_BETWEEN;
    public static final YogaJustify SPACE_EVENLY;

    static {
       YogaJustify yogaJustify = new YogaJustify("FLEX_START", 0, 0);
       YogaJustify.FLEX_START = yogaJustify;
       YogaJustify yogaJustify1 = new YogaJustify("CENTER", 1, 1);
       YogaJustify.CENTER = yogaJustify1;
       YogaJustify yogaJustify2 = new YogaJustify("FLEX_END", 2, 2);
       YogaJustify.FLEX_END = yogaJustify2;
       YogaJustify yogaJustify3 = new YogaJustify("SPACE_BETWEEN", 3, 3);
       YogaJustify.SPACE_BETWEEN = yogaJustify3;
       YogaJustify yogaJustify4 = new YogaJustify("SPACE_AROUND", 4, 4);
       YogaJustify.SPACE_AROUND = yogaJustify4;
       YogaJustify yogaJustify5 = new YogaJustify("SPACE_EVENLY", 5, 5);
       YogaJustify.SPACE_EVENLY = yogaJustify5;
       YogaJustify[] yogaJustifyA = new YogaJustify[]{yogaJustify,yogaJustify1,yogaJustify2,yogaJustify3,yogaJustify4,yogaJustify5};
       YogaJustify.$VALUES = yogaJustifyA;
    }
    public void YogaJustify(String p0,int p1,int p2){
       super(p0, p1);
       this.mIntValue = p2;
    }
    public static YogaJustify fromInt(int p0){
       if (!p0) {
          return YogaJustify.FLEX_START;
       }
       if (p0 == 1) {
          return YogaJustify.CENTER;
       }
       if (p0 == 2) {
          return YogaJustify.FLEX_END;
       }
       if (p0 == 3) {
          return YogaJustify.SPACE_BETWEEN;
       }
       if (p0 == 4) {
          return YogaJustify.SPACE_AROUND;
       }
       if (p0 == 5) {
          return YogaJustify.SPACE_EVENLY;
       }
       throw new IllegalArgumentException("Unknown enum value: "+p0);
    }
    public static YogaJustify valueOf(String p0){
       return Enum.valueOf(YogaJustify.class, p0);
    }
    public static YogaJustify[] values(){
       return YogaJustify.$VALUES.clone();
    }
    public int intValue(){
       return this.mIntValue;
    }
}
