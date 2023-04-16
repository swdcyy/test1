package com.facebook.yoga.YogaOverflow;
import java.lang.Enum;
import java.lang.String;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.Class;
import java.lang.Object;

public final class YogaOverflow extends Enum	// class@00145e
{
    public final int mIntValue;
    public static final YogaOverflow[] $VALUES;
    public static final YogaOverflow HIDDEN;
    public static final YogaOverflow SCROLL;
    public static final YogaOverflow VISIBLE;

    static {
       YogaOverflow yogaOverflow = new YogaOverflow("VISIBLE", 0, 0);
       YogaOverflow.VISIBLE = yogaOverflow;
       YogaOverflow yogaOverflow1 = new YogaOverflow("HIDDEN", 1, 1);
       YogaOverflow.HIDDEN = yogaOverflow1;
       YogaOverflow yogaOverflow2 = new YogaOverflow("SCROLL", 2, 2);
       YogaOverflow.SCROLL = yogaOverflow2;
       YogaOverflow[] yogaOverflow3 = new YogaOverflow[]{yogaOverflow,yogaOverflow1,yogaOverflow2};
       YogaOverflow.$VALUES = yogaOverflow3;
    }
    public void YogaOverflow(String p0,int p1,int p2){
       super(p0, p1);
       this.mIntValue = p2;
    }
    public static YogaOverflow fromInt(int p0){
       if (!p0) {
          return YogaOverflow.VISIBLE;
       }
       if (p0 == 1) {
          return YogaOverflow.HIDDEN;
       }
       if (p0 == 2) {
          return YogaOverflow.SCROLL;
       }
       throw new IllegalArgumentException("Unknown enum value: "+p0);
    }
    public static YogaOverflow valueOf(String p0){
       return Enum.valueOf(YogaOverflow.class, p0);
    }
    public static YogaOverflow[] values(){
       return YogaOverflow.$VALUES.clone();
    }
    public int intValue(){
       return this.mIntValue;
    }
}
