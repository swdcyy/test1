package com.kwai.sdk.eve.proto.ClickEvent$ClickType;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kwai.sdk.eve.proto.ClickEvent$ClickType$1;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kwai.sdk.eve.proto.ClickEvent$ClickType$ClickTypeVerifier;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class ClickEvent$ClickType extends Enum implements Internal$EnumLite	// class@0015df
{
    public final int value;
    public static final ClickEvent$ClickType[] $VALUES;
    public static final ClickEvent$ClickType CLICK;
    public static final ClickEvent$ClickType DOUBLE_CLICK;
    public static final ClickEvent$ClickType DRAG;
    public static final ClickEvent$ClickType LONG_PRESS;
    public static final ClickEvent$ClickType PULL;
    public static final ClickEvent$ClickType PULL_DOWN;
    public static final ClickEvent$ClickType PULL_UP;
    public static final ClickEvent$ClickType SCALE;
    public static final ClickEvent$ClickType TRIPLE_CLICK;
    public static final ClickEvent$ClickType UNKNOWN;
    public static final ClickEvent$ClickType UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;

    static {
       ClickEvent$ClickType uClickType = new ClickEvent$ClickType("UNKNOWN", 0, 0);
       ClickEvent$ClickType.UNKNOWN = uClickType;
       ClickEvent$ClickType uClickType1 = new ClickEvent$ClickType("CLICK", 1, 1);
       ClickEvent$ClickType.CLICK = uClickType1;
       ClickEvent$ClickType uClickType2 = new ClickEvent$ClickType("DOUBLE_CLICK", 2, 2);
       ClickEvent$ClickType.DOUBLE_CLICK = uClickType2;
       ClickEvent$ClickType uClickType3 = new ClickEvent$ClickType("TRIPLE_CLICK", 3, 3);
       ClickEvent$ClickType.TRIPLE_CLICK = uClickType3;
       ClickEvent$ClickType uClickType4 = new ClickEvent$ClickType("LONG_PRESS", 4, 4);
       ClickEvent$ClickType.LONG_PRESS = uClickType4;
       ClickEvent$ClickType uClickType5 = new ClickEvent$ClickType("PULL", 5, 5);
       ClickEvent$ClickType.PULL = uClickType5;
       ClickEvent$ClickType uClickType6 = new ClickEvent$ClickType("DRAG", 6, 6);
       ClickEvent$ClickType.DRAG = uClickType6;
       ClickEvent$ClickType uClickType7 = new ClickEvent$ClickType("SCALE", 7, 7);
       ClickEvent$ClickType.SCALE = uClickType7;
       ClickEvent$ClickType uClickType8 = new ClickEvent$ClickType("PULL_DOWN", 8, 8);
       ClickEvent$ClickType.PULL_DOWN = uClickType8;
       ClickEvent$ClickType uClickType9 = new ClickEvent$ClickType("PULL_UP", 9, 9);
       ClickEvent$ClickType.PULL_UP = uClickType9;
       ClickEvent$ClickType uClickType10 = new ClickEvent$ClickType("UNRECOGNIZED", 10, -1);
       ClickEvent$ClickType.UNRECOGNIZED = uClickType10;
       ClickEvent$ClickType[] uClickTypeAr = new ClickEvent$ClickType[11];
       uClickTypeAr[0] = uClickType;
       uClickTypeAr[1] = uClickType1;
       uClickTypeAr[2] = uClickType2;
       uClickTypeAr[3] = uClickType3;
       uClickTypeAr[4] = uClickType4;
       uClickTypeAr[5] = uClickType5;
       uClickTypeAr[6] = uClickType6;
       uClickTypeAr[7] = uClickType7;
       uClickTypeAr[8] = uClickType8;
       uClickTypeAr[9] = uClickType9;
       uClickTypeAr[10] = uClickType10;
       ClickEvent$ClickType.$VALUES = uClickTypeAr;
       ClickEvent$ClickType.internalValueMap = new ClickEvent$ClickType$1();
    }
    public void ClickEvent$ClickType(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static ClickEvent$ClickType forNumber(int p0){
       switch (p0){
           case 0:
             return ClickEvent$ClickType.UNKNOWN;
           case 1:
             return ClickEvent$ClickType.CLICK;
           case 2:
             return ClickEvent$ClickType.DOUBLE_CLICK;
           case 3:
             return ClickEvent$ClickType.TRIPLE_CLICK;
           case 4:
             return ClickEvent$ClickType.LONG_PRESS;
           case 5:
             return ClickEvent$ClickType.PULL;
           case 6:
             return ClickEvent$ClickType.DRAG;
           case 7:
             return ClickEvent$ClickType.SCALE;
           case 8:
             return ClickEvent$ClickType.PULL_DOWN;
           case 9:
             return ClickEvent$ClickType.PULL_UP;
           default:
             return null;
       }
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return ClickEvent$ClickType.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return ClickEvent$ClickType$ClickTypeVerifier.INSTANCE;
    }
    public static ClickEvent$ClickType valueOf(int p0){
       return ClickEvent$ClickType.forNumber(p0);
    }
    public static ClickEvent$ClickType valueOf(String p0){
       return Enum.valueOf(ClickEvent$ClickType.class, p0);
    }
    public static ClickEvent$ClickType[] values(){
       return ClickEvent$ClickType.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != ClickEvent$ClickType.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
