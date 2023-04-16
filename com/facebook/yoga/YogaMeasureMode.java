package com.facebook.yoga.YogaMeasureMode;
import java.lang.Enum;
import java.lang.String;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.Class;
import java.lang.Object;

public final class YogaMeasureMode extends Enum	// class@00145a
{
    public final int mIntValue;
    public static final YogaMeasureMode[] $VALUES;
    public static final YogaMeasureMode AT_MOST;
    public static final YogaMeasureMode EXACTLY;
    public static final YogaMeasureMode UNDEFINED;

    static {
       YogaMeasureMode yogaMeasureM = new YogaMeasureMode("UNDEFINED", 0, 0);
       YogaMeasureMode.UNDEFINED = yogaMeasureM;
       YogaMeasureMode yogaMeasureM1 = new YogaMeasureMode("EXACTLY", 1, 1);
       YogaMeasureMode.EXACTLY = yogaMeasureM1;
       YogaMeasureMode yogaMeasureM2 = new YogaMeasureMode("AT_MOST", 2, 2);
       YogaMeasureMode.AT_MOST = yogaMeasureM2;
       YogaMeasureMode[] yogaMeasureM3 = new YogaMeasureMode[]{yogaMeasureM,yogaMeasureM1,yogaMeasureM2};
       YogaMeasureMode.$VALUES = yogaMeasureM3;
    }
    public void YogaMeasureMode(String p0,int p1,int p2){
       super(p0, p1);
       this.mIntValue = p2;
    }
    public static YogaMeasureMode fromInt(int p0){
       if (!p0) {
          return YogaMeasureMode.UNDEFINED;
       }
       if (p0 == 1) {
          return YogaMeasureMode.EXACTLY;
       }
       if (p0 == 2) {
          return YogaMeasureMode.AT_MOST;
       }
       throw new IllegalArgumentException("Unknown enum value: "+p0);
    }
    public static YogaMeasureMode valueOf(String p0){
       return Enum.valueOf(YogaMeasureMode.class, p0);
    }
    public static YogaMeasureMode[] values(){
       return YogaMeasureMode.$VALUES.clone();
    }
    public int intValue(){
       return this.mIntValue;
    }
}
