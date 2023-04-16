package com.facebook.yoga.YogaAlign;
import java.lang.Enum;
import java.lang.String;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.Class;
import java.lang.Object;

public final class YogaAlign extends Enum	// class@001451
{
    public final int mIntValue;
    public static final YogaAlign[] $VALUES;
    public static final YogaAlign AUTO;
    public static final YogaAlign BASELINE;
    public static final YogaAlign CENTER;
    public static final YogaAlign FLEX_END;
    public static final YogaAlign FLEX_START;
    public static final YogaAlign SPACE_AROUND;
    public static final YogaAlign SPACE_BETWEEN;
    public static final YogaAlign STRETCH;

    static {
       YogaAlign yogaAlign = new YogaAlign("AUTO", 0, 0);
       YogaAlign.AUTO = yogaAlign;
       YogaAlign yogaAlign1 = new YogaAlign("FLEX_START", 1, 1);
       YogaAlign.FLEX_START = yogaAlign1;
       YogaAlign yogaAlign2 = new YogaAlign("CENTER", 2, 2);
       YogaAlign.CENTER = yogaAlign2;
       YogaAlign yogaAlign3 = new YogaAlign("FLEX_END", 3, 3);
       YogaAlign.FLEX_END = yogaAlign3;
       YogaAlign yogaAlign4 = new YogaAlign("STRETCH", 4, 4);
       YogaAlign.STRETCH = yogaAlign4;
       YogaAlign yogaAlign5 = new YogaAlign("BASELINE", 5, 5);
       YogaAlign.BASELINE = yogaAlign5;
       YogaAlign yogaAlign6 = new YogaAlign("SPACE_BETWEEN", 6, 6);
       YogaAlign.SPACE_BETWEEN = yogaAlign6;
       YogaAlign yogaAlign7 = new YogaAlign("SPACE_AROUND", 7, 7);
       YogaAlign.SPACE_AROUND = yogaAlign7;
       YogaAlign[] yogaAlignArr = new YogaAlign[]{yogaAlign,yogaAlign1,yogaAlign2,yogaAlign3,yogaAlign4,yogaAlign5,yogaAlign6,yogaAlign7};
       YogaAlign.$VALUES = yogaAlignArr;
    }
    public void YogaAlign(String p0,int p1,int p2){
       super(p0, p1);
       this.mIntValue = p2;
    }
    public static YogaAlign fromInt(int p0){
       switch (p0){
           case 0:
             return YogaAlign.AUTO;
           case 1:
             return YogaAlign.FLEX_START;
           case 2:
             return YogaAlign.CENTER;
           case 3:
             return YogaAlign.FLEX_END;
           case 4:
             return YogaAlign.STRETCH;
           case 5:
             return YogaAlign.BASELINE;
           case 6:
             return YogaAlign.SPACE_BETWEEN;
           case 7:
             return YogaAlign.SPACE_AROUND;
           default:
             throw new IllegalArgumentException("Unknown enum value: "+p0);
       }
    }
    public static YogaAlign valueOf(String p0){
       return Enum.valueOf(YogaAlign.class, p0);
    }
    public static YogaAlign[] values(){
       return YogaAlign.$VALUES.clone();
    }
    public int intValue(){
       return this.mIntValue;
    }
}
