package com.facebook.yoga.YogaLogLevel;
import java.lang.Enum;
import java.lang.String;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.Class;
import java.lang.Object;

public final class YogaLogLevel extends Enum	// class@001458
{
    public final int mIntValue;
    public static final YogaLogLevel[] $VALUES;
    public static final YogaLogLevel DEBUG;
    public static final YogaLogLevel ERROR;
    public static final YogaLogLevel FATAL;
    public static final YogaLogLevel INFO;
    public static final YogaLogLevel VERBOSE;
    public static final YogaLogLevel WARN;

    static {
       YogaLogLevel yogaLogLevel = new YogaLogLevel("ERROR", 0, 0);
       YogaLogLevel.ERROR = yogaLogLevel;
       YogaLogLevel yogaLogLevel1 = new YogaLogLevel("WARN", 1, 1);
       YogaLogLevel.WARN = yogaLogLevel1;
       YogaLogLevel yogaLogLevel2 = new YogaLogLevel("INFO", 2, 2);
       YogaLogLevel.INFO = yogaLogLevel2;
       YogaLogLevel yogaLogLevel3 = new YogaLogLevel("DEBUG", 3, 3);
       YogaLogLevel.DEBUG = yogaLogLevel3;
       YogaLogLevel yogaLogLevel4 = new YogaLogLevel("VERBOSE", 4, 4);
       YogaLogLevel.VERBOSE = yogaLogLevel4;
       YogaLogLevel yogaLogLevel5 = new YogaLogLevel("FATAL", 5, 5);
       YogaLogLevel.FATAL = yogaLogLevel5;
       YogaLogLevel[] yogaLogLevel6 = new YogaLogLevel[]{yogaLogLevel,yogaLogLevel1,yogaLogLevel2,yogaLogLevel3,yogaLogLevel4,yogaLogLevel5};
       YogaLogLevel.$VALUES = yogaLogLevel6;
    }
    public void YogaLogLevel(String p0,int p1,int p2){
       super(p0, p1);
       this.mIntValue = p2;
    }
    public static YogaLogLevel fromInt(int p0){
       if (!p0) {
          return YogaLogLevel.ERROR;
       }
       if (p0 == 1) {
          return YogaLogLevel.WARN;
       }
       if (p0 == 2) {
          return YogaLogLevel.INFO;
       }
       if (p0 == 3) {
          return YogaLogLevel.DEBUG;
       }
       if (p0 == 4) {
          return YogaLogLevel.VERBOSE;
       }
       if (p0 == 5) {
          return YogaLogLevel.FATAL;
       }
       throw new IllegalArgumentException("Unknown enum value: "+p0);
    }
    public static YogaLogLevel valueOf(String p0){
       return Enum.valueOf(YogaLogLevel.class, p0);
    }
    public static YogaLogLevel[] values(){
       return YogaLogLevel.$VALUES.clone();
    }
    public int intValue(){
       return this.mIntValue;
    }
}
