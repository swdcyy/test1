package com.kwai.video.westeros.models.EffectPerformance;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kwai.video.westeros.models.EffectPerformance$1;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kwai.video.westeros.models.EffectPerformance$EffectPerformanceVerifier;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class EffectPerformance extends Enum implements Internal$EnumLite	// class@000f39
{
    public final int value;
    public static final EffectPerformance[] $VALUES;
    public static final EffectPerformance UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;
    public static final EffectPerformance kEffectPerformanceLow;
    public static final EffectPerformance kEffectPerformanceLow360p;
    public static final EffectPerformance kEffectPerformanceLow540p;
    public static final EffectPerformance kEffectPerformanceNormal;
    public static final EffectPerformance kEffectPerformanceNormal1080p;

    static {
       EffectPerformance uEffectPerfo = new EffectPerformance("kEffectPerformanceNormal", 0, 0);
       EffectPerformance.kEffectPerformanceNormal = uEffectPerfo;
       EffectPerformance uEffectPerfo1 = new EffectPerformance("kEffectPerformanceLow", 1, 1);
       EffectPerformance.kEffectPerformanceLow = uEffectPerfo1;
       EffectPerformance uEffectPerfo2 = new EffectPerformance("kEffectPerformanceLow540p", 2, 2);
       EffectPerformance.kEffectPerformanceLow540p = uEffectPerfo2;
       EffectPerformance uEffectPerfo3 = new EffectPerformance("kEffectPerformanceLow360p", 3, 3);
       EffectPerformance.kEffectPerformanceLow360p = uEffectPerfo3;
       EffectPerformance uEffectPerfo4 = new EffectPerformance("kEffectPerformanceNormal1080p", 4, 4);
       EffectPerformance.kEffectPerformanceNormal1080p = uEffectPerfo4;
       EffectPerformance uEffectPerfo5 = new EffectPerformance("UNRECOGNIZED", 5, -1);
       EffectPerformance.UNRECOGNIZED = uEffectPerfo5;
       EffectPerformance[] uEffectPerfo6 = new EffectPerformance[]{uEffectPerfo,uEffectPerfo1,uEffectPerfo2,uEffectPerfo3,uEffectPerfo4,uEffectPerfo5};
       EffectPerformance.$VALUES = uEffectPerfo6;
       EffectPerformance.internalValueMap = new EffectPerformance$1();
    }
    public void EffectPerformance(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static EffectPerformance forNumber(int p0){
       if (!p0) {
          return EffectPerformance.kEffectPerformanceNormal;
       }
       if (p0 == 1) {
          return EffectPerformance.kEffectPerformanceLow;
       }
       if (p0 == 2) {
          return EffectPerformance.kEffectPerformanceLow540p;
       }
       if (p0 == 3) {
          return EffectPerformance.kEffectPerformanceLow360p;
       }
       if (p0 != 4) {
          return null;
       }
       return EffectPerformance.kEffectPerformanceNormal1080p;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return EffectPerformance.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return EffectPerformance$EffectPerformanceVerifier.INSTANCE;
    }
    public static EffectPerformance valueOf(int p0){
       return EffectPerformance.forNumber(p0);
    }
    public static EffectPerformance valueOf(String p0){
       return Enum.valueOf(EffectPerformance.class, p0);
    }
    public static EffectPerformance[] values(){
       return EffectPerformance.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != EffectPerformance.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
