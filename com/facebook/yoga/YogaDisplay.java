package com.facebook.yoga.YogaDisplay;
import java.lang.Enum;
import java.lang.String;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.Class;
import java.lang.Object;

public final class YogaDisplay extends Enum	// class@001453
{
    public final int mIntValue;
    public static final YogaDisplay[] $VALUES;
    public static final YogaDisplay FLEX;
    public static final YogaDisplay NONE;

    static {
       YogaDisplay yogaDisplay = new YogaDisplay("FLEX", 0, 0);
       YogaDisplay.FLEX = yogaDisplay;
       YogaDisplay yogaDisplay1 = new YogaDisplay("NONE", 1, 1);
       YogaDisplay.NONE = yogaDisplay1;
       YogaDisplay[] yogaDisplayA = new YogaDisplay[]{yogaDisplay,yogaDisplay1};
       YogaDisplay.$VALUES = yogaDisplayA;
    }
    public void YogaDisplay(String p0,int p1,int p2){
       super(p0, p1);
       this.mIntValue = p2;
    }
    public static YogaDisplay fromInt(int p0){
       if (!p0) {
          return YogaDisplay.FLEX;
       }
       if (p0 == 1) {
          return YogaDisplay.NONE;
       }
       throw new IllegalArgumentException("Unknown enum value: "+p0);
    }
    public static YogaDisplay valueOf(String p0){
       return Enum.valueOf(YogaDisplay.class, p0);
    }
    public static YogaDisplay[] values(){
       return YogaDisplay.$VALUES.clone();
    }
    public int intValue(){
       return this.mIntValue;
    }
}
