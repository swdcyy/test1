package com.kwai.video.westeros.models.BokehQuality;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kwai.video.westeros.models.BokehQuality$1;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kwai.video.westeros.models.BokehQuality$BokehQualityVerifier;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class BokehQuality extends Enum implements Internal$EnumLite	// class@000ecb
{
    public final int value;
    public static final BokehQuality[] $VALUES;
    public static final BokehQuality ExtremeLow;
    public static final BokehQuality High;
    public static final BokehQuality Low;
    public static final BokehQuality Medium;
    public static final BokehQuality UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;

    static {
       BokehQuality uBokehQualit = new BokehQuality("High", 0, 0);
       BokehQuality.High = uBokehQualit;
       BokehQuality uBokehQualit1 = new BokehQuality("Medium", 1, 1);
       BokehQuality.Medium = uBokehQualit1;
       BokehQuality uBokehQualit2 = new BokehQuality("Low", 2, 2);
       BokehQuality.Low = uBokehQualit2;
       BokehQuality uBokehQualit3 = new BokehQuality("ExtremeLow", 3, 3);
       BokehQuality.ExtremeLow = uBokehQualit3;
       BokehQuality uBokehQualit4 = new BokehQuality("UNRECOGNIZED", 4, -1);
       BokehQuality.UNRECOGNIZED = uBokehQualit4;
       BokehQuality[] uBokehQualit5 = new BokehQuality[]{uBokehQualit,uBokehQualit1,uBokehQualit2,uBokehQualit3,uBokehQualit4};
       BokehQuality.$VALUES = uBokehQualit5;
       BokehQuality.internalValueMap = new BokehQuality$1();
    }
    public void BokehQuality(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static BokehQuality forNumber(int p0){
       if (!p0) {
          return BokehQuality.High;
       }
       if (p0 == 1) {
          return BokehQuality.Medium;
       }
       if (p0 == 2) {
          return BokehQuality.Low;
       }
       if (p0 != 3) {
          return null;
       }
       return BokehQuality.ExtremeLow;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return BokehQuality.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return BokehQuality$BokehQualityVerifier.INSTANCE;
    }
    public static BokehQuality valueOf(int p0){
       return BokehQuality.forNumber(p0);
    }
    public static BokehQuality valueOf(String p0){
       return Enum.valueOf(BokehQuality.class, p0);
    }
    public static BokehQuality[] values(){
       return BokehQuality.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != BokehQuality.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
