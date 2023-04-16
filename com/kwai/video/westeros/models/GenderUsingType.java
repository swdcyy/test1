package com.kwai.video.westeros.models.GenderUsingType;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kwai.video.westeros.models.GenderUsingType$1;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kwai.video.westeros.models.GenderUsingType$GenderUsingTypeVerifier;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class GenderUsingType extends Enum implements Internal$EnumLite	// class@000f7f
{
    public final int value;
    public static final GenderUsingType[] $VALUES;
    public static final GenderUsingType UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;
    public static final GenderUsingType kBoth;
    public static final GenderUsingType kBoysOnly;
    public static final GenderUsingType kGirlsOnly;
    public static final GenderUsingType kNone;

    static {
       GenderUsingType genderUsingT = new GenderUsingType("kBoth", 0, 0);
       GenderUsingType.kBoth = genderUsingT;
       GenderUsingType genderUsingT1 = new GenderUsingType("kNone", 1, 1);
       GenderUsingType.kNone = genderUsingT1;
       GenderUsingType genderUsingT2 = new GenderUsingType("kGirlsOnly", 2, 2);
       GenderUsingType.kGirlsOnly = genderUsingT2;
       GenderUsingType genderUsingT3 = new GenderUsingType("kBoysOnly", 3, 3);
       GenderUsingType.kBoysOnly = genderUsingT3;
       GenderUsingType genderUsingT4 = new GenderUsingType("UNRECOGNIZED", 4, -1);
       GenderUsingType.UNRECOGNIZED = genderUsingT4;
       GenderUsingType[] genderUsingT5 = new GenderUsingType[]{genderUsingT,genderUsingT1,genderUsingT2,genderUsingT3,genderUsingT4};
       GenderUsingType.$VALUES = genderUsingT5;
       GenderUsingType.internalValueMap = new GenderUsingType$1();
    }
    public void GenderUsingType(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static GenderUsingType forNumber(int p0){
       if (!p0) {
          return GenderUsingType.kBoth;
       }
       if (p0 == 1) {
          return GenderUsingType.kNone;
       }
       if (p0 == 2) {
          return GenderUsingType.kGirlsOnly;
       }
       if (p0 != 3) {
          return null;
       }
       return GenderUsingType.kBoysOnly;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return GenderUsingType.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return GenderUsingType$GenderUsingTypeVerifier.INSTANCE;
    }
    public static GenderUsingType valueOf(int p0){
       return GenderUsingType.forNumber(p0);
    }
    public static GenderUsingType valueOf(String p0){
       return Enum.valueOf(GenderUsingType.class, p0);
    }
    public static GenderUsingType[] values(){
       return GenderUsingType.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != GenderUsingType.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
