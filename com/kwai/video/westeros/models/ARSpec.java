package com.kwai.video.westeros.models.ARSpec;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kwai.video.westeros.models.ARSpec$1;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kwai.video.westeros.models.ARSpec$ARSpecVerifier;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class ARSpec extends Enum implements Internal$EnumLite	// class@000e93
{
    public final int value;
    public static final ARSpec[] $VALUES;
    public static final ARSpec UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;
    public static final ARSpec kARSpecTARP;
    public static final ARSpec kARSpecTARS;
    public static final ARSpec kARSpecYARP;
    public static final ARSpec kARSpecYARS;

    static {
       ARSpec uARSpec = new ARSpec("kARSpecYARP", 0, 0);
       ARSpec.kARSpecYARP = uARSpec;
       ARSpec uARSpec1 = new ARSpec("kARSpecYARS", 1, 1);
       ARSpec.kARSpecYARS = uARSpec1;
       ARSpec uARSpec2 = new ARSpec("kARSpecTARP", 2, 2);
       ARSpec.kARSpecTARP = uARSpec2;
       ARSpec uARSpec3 = new ARSpec("kARSpecTARS", 3, 3);
       ARSpec.kARSpecTARS = uARSpec3;
       ARSpec uARSpec4 = new ARSpec("UNRECOGNIZED", 4, -1);
       ARSpec.UNRECOGNIZED = uARSpec4;
       ARSpec[] uARSpecArray = new ARSpec[]{uARSpec,uARSpec1,uARSpec2,uARSpec3,uARSpec4};
       ARSpec.$VALUES = uARSpecArray;
       ARSpec.internalValueMap = new ARSpec$1();
    }
    public void ARSpec(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static ARSpec forNumber(int p0){
       if (!p0) {
          return ARSpec.kARSpecYARP;
       }
       if (p0 == 1) {
          return ARSpec.kARSpecYARS;
       }
       if (p0 == 2) {
          return ARSpec.kARSpecTARP;
       }
       if (p0 != 3) {
          return null;
       }
       return ARSpec.kARSpecTARS;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return ARSpec.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return ARSpec$ARSpecVerifier.INSTANCE;
    }
    public static ARSpec valueOf(int p0){
       return ARSpec.forNumber(p0);
    }
    public static ARSpec valueOf(String p0){
       return Enum.valueOf(ARSpec.class, p0);
    }
    public static ARSpec[] values(){
       return ARSpec.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != ARSpec.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
