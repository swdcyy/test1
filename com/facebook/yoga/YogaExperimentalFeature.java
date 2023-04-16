package com.facebook.yoga.YogaExperimentalFeature;
import java.lang.Enum;
import java.lang.String;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.Class;
import java.lang.Object;

public final class YogaExperimentalFeature extends Enum	// class@001455
{
    public final int mIntValue;
    public static final YogaExperimentalFeature[] $VALUES;
    public static final YogaExperimentalFeature WEB_FLEX_BASIS;

    static {
       YogaExperimentalFeature yogaExperime = new YogaExperimentalFeature("WEB_FLEX_BASIS", 0, 0);
       YogaExperimentalFeature.WEB_FLEX_BASIS = yogaExperime;
       YogaExperimentalFeature[] yogaExperime1 = new YogaExperimentalFeature[]{yogaExperime};
       YogaExperimentalFeature.$VALUES = yogaExperime1;
    }
    public void YogaExperimentalFeature(String p0,int p1,int p2){
       super(p0, p1);
       this.mIntValue = p2;
    }
    public static YogaExperimentalFeature fromInt(int p0){
       if (!p0) {
          return YogaExperimentalFeature.WEB_FLEX_BASIS;
       }
       throw new IllegalArgumentException("Unknown enum value: "+p0);
    }
    public static YogaExperimentalFeature valueOf(String p0){
       return Enum.valueOf(YogaExperimentalFeature.class, p0);
    }
    public static YogaExperimentalFeature[] values(){
       return YogaExperimentalFeature.$VALUES.clone();
    }
    public int intValue(){
       return this.mIntValue;
    }
}
