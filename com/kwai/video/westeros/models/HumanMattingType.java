package com.kwai.video.westeros.models.HumanMattingType;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kwai.video.westeros.models.HumanMattingType$1;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kwai.video.westeros.models.HumanMattingType$HumanMattingTypeVerifier;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class HumanMattingType extends Enum implements Internal$EnumLite	// class@000f8d
{
    public final int value;
    public static final HumanMattingType[] $VALUES;
    public static final HumanMattingType UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;
    public static final HumanMattingType kMattingOutTypeNorm;
    public static final HumanMattingType kMattingOutTypePost;
    public static final HumanMattingType kMattingOutTypeRaw;
    public static final HumanMattingType kMattingOutTypeSmooth;
    public static final HumanMattingType kMattingOutTypeSource;

    static {
       HumanMattingType humanMatting = new HumanMattingType("kMattingOutTypeNorm", 0, 0);
       HumanMattingType.kMattingOutTypeNorm = humanMatting;
       HumanMattingType humanMatting1 = new HumanMattingType("kMattingOutTypeSource", 1, 1);
       HumanMattingType.kMattingOutTypeSource = humanMatting1;
       HumanMattingType humanMatting2 = new HumanMattingType("kMattingOutTypeRaw", 2, 2);
       HumanMattingType.kMattingOutTypeRaw = humanMatting2;
       HumanMattingType humanMatting3 = new HumanMattingType("kMattingOutTypeSmooth", 3, 3);
       HumanMattingType.kMattingOutTypeSmooth = humanMatting3;
       HumanMattingType humanMatting4 = new HumanMattingType("kMattingOutTypePost", 4, 4);
       HumanMattingType.kMattingOutTypePost = humanMatting4;
       HumanMattingType humanMatting5 = new HumanMattingType("UNRECOGNIZED", 5, -1);
       HumanMattingType.UNRECOGNIZED = humanMatting5;
       HumanMattingType[] humanMatting6 = new HumanMattingType[]{humanMatting,humanMatting1,humanMatting2,humanMatting3,humanMatting4,humanMatting5};
       HumanMattingType.$VALUES = humanMatting6;
       HumanMattingType.internalValueMap = new HumanMattingType$1();
    }
    public void HumanMattingType(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static HumanMattingType forNumber(int p0){
       if (!p0) {
          return HumanMattingType.kMattingOutTypeNorm;
       }
       if (p0 == 1) {
          return HumanMattingType.kMattingOutTypeSource;
       }
       if (p0 == 2) {
          return HumanMattingType.kMattingOutTypeRaw;
       }
       if (p0 == 3) {
          return HumanMattingType.kMattingOutTypeSmooth;
       }
       if (p0 != 4) {
          return null;
       }
       return HumanMattingType.kMattingOutTypePost;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return HumanMattingType.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return HumanMattingType$HumanMattingTypeVerifier.INSTANCE;
    }
    public static HumanMattingType valueOf(int p0){
       return HumanMattingType.forNumber(p0);
    }
    public static HumanMattingType valueOf(String p0){
       return Enum.valueOf(HumanMattingType.class, p0);
    }
    public static HumanMattingType[] values(){
       return HumanMattingType.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != HumanMattingType.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
