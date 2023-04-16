package com.kwai.video.westeros.models.MmuFeatureType;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kwai.video.westeros.models.MmuFeatureType$1;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kwai.video.westeros.models.MmuFeatureType$MmuFeatureTypeVerifier;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class MmuFeatureType extends Enum implements Internal$EnumLite	// class@000fd7
{
    public final int value;
    public static final MmuFeatureType[] $VALUES;
    public static final MmuFeatureType UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;
    public static final MmuFeatureType kMmuFaceProp;
    public static final MmuFeatureType kMmuMemoji;

    static {
       MmuFeatureType mmuFeatureTy = new MmuFeatureType("kMmuMemoji", 0, 0);
       MmuFeatureType.kMmuMemoji = mmuFeatureTy;
       MmuFeatureType mmuFeatureTy1 = new MmuFeatureType("kMmuFaceProp", 1, 1);
       MmuFeatureType.kMmuFaceProp = mmuFeatureTy1;
       MmuFeatureType mmuFeatureTy2 = new MmuFeatureType("UNRECOGNIZED", 2, -1);
       MmuFeatureType.UNRECOGNIZED = mmuFeatureTy2;
       MmuFeatureType[] mmuFeatureTy3 = new MmuFeatureType[]{mmuFeatureTy,mmuFeatureTy1,mmuFeatureTy2};
       MmuFeatureType.$VALUES = mmuFeatureTy3;
       MmuFeatureType.internalValueMap = new MmuFeatureType$1();
    }
    public void MmuFeatureType(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static MmuFeatureType forNumber(int p0){
       if (!p0) {
          return MmuFeatureType.kMmuMemoji;
       }
       if (p0 != 1) {
          return null;
       }
       return MmuFeatureType.kMmuFaceProp;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return MmuFeatureType.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return MmuFeatureType$MmuFeatureTypeVerifier.INSTANCE;
    }
    public static MmuFeatureType valueOf(int p0){
       return MmuFeatureType.forNumber(p0);
    }
    public static MmuFeatureType valueOf(String p0){
       return Enum.valueOf(MmuFeatureType.class, p0);
    }
    public static MmuFeatureType[] values(){
       return MmuFeatureType.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != MmuFeatureType.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
