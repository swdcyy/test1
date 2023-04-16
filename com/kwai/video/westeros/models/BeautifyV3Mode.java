package com.kwai.video.westeros.models.BeautifyV3Mode;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kwai.video.westeros.models.BeautifyV3Mode$1;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kwai.video.westeros.models.BeautifyV3Mode$BeautifyV3ModeVerifier;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class BeautifyV3Mode extends Enum implements Internal$EnumLite	// class@000eb3
{
    public final int value;
    public static final BeautifyV3Mode[] $VALUES;
    public static final BeautifyV3Mode UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;
    public static final BeautifyV3Mode kBeautifyV3ModeDowngrade;
    public static final BeautifyV3Mode kBeautifyV3ModeFix2;
    public static final BeautifyV3Mode kBeautifyV3ModeNormal;

    static {
       BeautifyV3Mode uBeautifyV3M = new BeautifyV3Mode("kBeautifyV3ModeNormal", 0, 0);
       BeautifyV3Mode.kBeautifyV3ModeNormal = uBeautifyV3M;
       BeautifyV3Mode uBeautifyV3M1 = new BeautifyV3Mode("kBeautifyV3ModeFix2", 1, 1);
       BeautifyV3Mode.kBeautifyV3ModeFix2 = uBeautifyV3M1;
       BeautifyV3Mode uBeautifyV3M2 = new BeautifyV3Mode("kBeautifyV3ModeDowngrade", 2, 2);
       BeautifyV3Mode.kBeautifyV3ModeDowngrade = uBeautifyV3M2;
       BeautifyV3Mode uBeautifyV3M3 = new BeautifyV3Mode("UNRECOGNIZED", 3, -1);
       BeautifyV3Mode.UNRECOGNIZED = uBeautifyV3M3;
       BeautifyV3Mode[] uBeautifyV3M4 = new BeautifyV3Mode[]{uBeautifyV3M,uBeautifyV3M1,uBeautifyV3M2,uBeautifyV3M3};
       BeautifyV3Mode.$VALUES = uBeautifyV3M4;
       BeautifyV3Mode.internalValueMap = new BeautifyV3Mode$1();
    }
    public void BeautifyV3Mode(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static BeautifyV3Mode forNumber(int p0){
       if (!p0) {
          return BeautifyV3Mode.kBeautifyV3ModeNormal;
       }
       if (p0 == 1) {
          return BeautifyV3Mode.kBeautifyV3ModeFix2;
       }
       if (p0 != 2) {
          return null;
       }
       return BeautifyV3Mode.kBeautifyV3ModeDowngrade;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return BeautifyV3Mode.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return BeautifyV3Mode$BeautifyV3ModeVerifier.INSTANCE;
    }
    public static BeautifyV3Mode valueOf(int p0){
       return BeautifyV3Mode.forNumber(p0);
    }
    public static BeautifyV3Mode valueOf(String p0){
       return Enum.valueOf(BeautifyV3Mode.class, p0);
    }
    public static BeautifyV3Mode[] values(){
       return BeautifyV3Mode.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != BeautifyV3Mode.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
