package com.facebook.yoga.YogaEdge;
import java.lang.Enum;
import java.lang.String;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.Class;
import java.lang.Object;

public final class YogaEdge extends Enum	// class@001454
{
    public final int mIntValue;
    public static final YogaEdge[] $VALUES;
    public static final YogaEdge ALL;
    public static final YogaEdge BOTTOM;
    public static final YogaEdge END;
    public static final YogaEdge HORIZONTAL;
    public static final YogaEdge LEFT;
    public static final YogaEdge RIGHT;
    public static final YogaEdge START;
    public static final YogaEdge TOP;
    public static final YogaEdge VERTICAL;

    static {
       YogaEdge yogaEdge = new YogaEdge("LEFT", 0, 0);
       YogaEdge.LEFT = yogaEdge;
       YogaEdge yogaEdge1 = new YogaEdge("TOP", 1, 1);
       YogaEdge.TOP = yogaEdge1;
       YogaEdge yogaEdge2 = new YogaEdge("RIGHT", 2, 2);
       YogaEdge.RIGHT = yogaEdge2;
       YogaEdge yogaEdge3 = new YogaEdge("BOTTOM", 3, 3);
       YogaEdge.BOTTOM = yogaEdge3;
       YogaEdge yogaEdge4 = new YogaEdge("START", 4, 4);
       YogaEdge.START = yogaEdge4;
       YogaEdge yogaEdge5 = new YogaEdge("END", 5, 5);
       YogaEdge.END = yogaEdge5;
       YogaEdge yogaEdge6 = new YogaEdge("HORIZONTAL", 6, 6);
       YogaEdge.HORIZONTAL = yogaEdge6;
       YogaEdge yogaEdge7 = new YogaEdge("VERTICAL", 7, 7);
       YogaEdge.VERTICAL = yogaEdge7;
       YogaEdge yogaEdge8 = new YogaEdge("ALL", 8, 8);
       YogaEdge.ALL = yogaEdge8;
       YogaEdge[] yogaEdgeArra = new YogaEdge[9];
       yogaEdgeArra[0] = yogaEdge;
       yogaEdgeArra[1] = yogaEdge1;
       yogaEdgeArra[2] = yogaEdge2;
       yogaEdgeArra[3] = yogaEdge3;
       yogaEdgeArra[4] = yogaEdge4;
       yogaEdgeArra[5] = yogaEdge5;
       yogaEdgeArra[6] = yogaEdge6;
       yogaEdgeArra[7] = yogaEdge7;
       yogaEdgeArra[8] = yogaEdge8;
       YogaEdge.$VALUES = yogaEdgeArra;
    }
    public void YogaEdge(String p0,int p1,int p2){
       super(p0, p1);
       this.mIntValue = p2;
    }
    public static YogaEdge fromInt(int p0){
       switch (p0){
           case 0:
             return YogaEdge.LEFT;
           case 1:
             return YogaEdge.TOP;
           case 2:
             return YogaEdge.RIGHT;
           case 3:
             return YogaEdge.BOTTOM;
           case 4:
             return YogaEdge.START;
           case 5:
             return YogaEdge.END;
           case 6:
             return YogaEdge.HORIZONTAL;
           case 7:
             return YogaEdge.VERTICAL;
           case 8:
             return YogaEdge.ALL;
           default:
             throw new IllegalArgumentException("Unknown enum value: "+p0);
       }
    }
    public static YogaEdge valueOf(String p0){
       return Enum.valueOf(YogaEdge.class, p0);
    }
    public static YogaEdge[] values(){
       return YogaEdge.$VALUES.clone();
    }
    public int intValue(){
       return this.mIntValue;
    }
}
