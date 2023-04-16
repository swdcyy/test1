package com.facebook.yoga.YogaWrap;
import java.lang.Enum;
import java.lang.String;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.Class;
import java.lang.Object;

public final class YogaWrap extends Enum	// class@001461
{
    public final int mIntValue;
    public static final YogaWrap[] $VALUES;
    public static final YogaWrap NO_WRAP;
    public static final YogaWrap WRAP;
    public static final YogaWrap WRAP_REVERSE;

    static {
       YogaWrap yogaWrap = new YogaWrap("NO_WRAP", 0, 0);
       YogaWrap.NO_WRAP = yogaWrap;
       YogaWrap yogaWrap1 = new YogaWrap("WRAP", 1, 1);
       YogaWrap.WRAP = yogaWrap1;
       YogaWrap yogaWrap2 = new YogaWrap("WRAP_REVERSE", 2, 2);
       YogaWrap.WRAP_REVERSE = yogaWrap2;
       YogaWrap[] yogaWrapArra = new YogaWrap[]{yogaWrap,yogaWrap1,yogaWrap2};
       YogaWrap.$VALUES = yogaWrapArra;
    }
    public void YogaWrap(String p0,int p1,int p2){
       super(p0, p1);
       this.mIntValue = p2;
    }
    public static YogaWrap fromInt(int p0){
       if (!p0) {
          return YogaWrap.NO_WRAP;
       }
       if (p0 == 1) {
          return YogaWrap.WRAP;
       }
       if (p0 == 2) {
          return YogaWrap.WRAP_REVERSE;
       }
       throw new IllegalArgumentException("Unknown enum value: "+p0);
    }
    public static YogaWrap valueOf(String p0){
       return Enum.valueOf(YogaWrap.class, p0);
    }
    public static YogaWrap[] values(){
       return YogaWrap.$VALUES.clone();
    }
    public int intValue(){
       return this.mIntValue;
    }
}
