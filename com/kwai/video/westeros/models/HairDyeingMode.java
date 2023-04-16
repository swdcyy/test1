package com.kwai.video.westeros.models.HairDyeingMode;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kwai.video.westeros.models.HairDyeingMode$1;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kwai.video.westeros.models.HairDyeingMode$HairDyeingModeVerifier;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class HairDyeingMode extends Enum implements Internal$EnumLite	// class@000f8a
{
    public final int value;
    public static final HairDyeingMode[] $VALUES;
    public static final HairDyeingMode UNRECOGNIZED;
    public static final HairDyeingMode colorTemplate;
    public static final HairDyeingMode hexColor;
    public static final Internal$EnumLiteMap internalValueMap;
    public static final HairDyeingMode none;

    static {
       HairDyeingMode hairDyeingMo = new HairDyeingMode("none", 0, 0);
       HairDyeingMode.none = hairDyeingMo;
       HairDyeingMode hairDyeingMo1 = new HairDyeingMode("hexColor", 1, 1);
       HairDyeingMode.hexColor = hairDyeingMo1;
       HairDyeingMode hairDyeingMo2 = new HairDyeingMode("colorTemplate", 2, 2);
       HairDyeingMode.colorTemplate = hairDyeingMo2;
       HairDyeingMode hairDyeingMo3 = new HairDyeingMode("UNRECOGNIZED", 3, -1);
       HairDyeingMode.UNRECOGNIZED = hairDyeingMo3;
       HairDyeingMode[] hairDyeingMo4 = new HairDyeingMode[]{hairDyeingMo,hairDyeingMo1,hairDyeingMo2,hairDyeingMo3};
       HairDyeingMode.$VALUES = hairDyeingMo4;
       HairDyeingMode.internalValueMap = new HairDyeingMode$1();
    }
    public void HairDyeingMode(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static HairDyeingMode forNumber(int p0){
       if (!p0) {
          return HairDyeingMode.none;
       }
       if (p0 == 1) {
          return HairDyeingMode.hexColor;
       }
       if (p0 != 2) {
          return null;
       }
       return HairDyeingMode.colorTemplate;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return HairDyeingMode.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return HairDyeingMode$HairDyeingModeVerifier.INSTANCE;
    }
    public static HairDyeingMode valueOf(int p0){
       return HairDyeingMode.forNumber(p0);
    }
    public static HairDyeingMode valueOf(String p0){
       return Enum.valueOf(HairDyeingMode.class, p0);
    }
    public static HairDyeingMode[] values(){
       return HairDyeingMode.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != HairDyeingMode.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
