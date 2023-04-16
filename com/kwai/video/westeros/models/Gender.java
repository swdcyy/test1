package com.kwai.video.westeros.models.Gender;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kwai.video.westeros.models.Gender$1;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kwai.video.westeros.models.Gender$GenderVerifier;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class Gender extends Enum implements Internal$EnumLite	// class@000f7c
{
    public final int value;
    public static final Gender[] $VALUES;
    public static final Gender UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;
    public static final Gender kGenderFemale;
    public static final Gender kGenderMale;
    public static final Gender kGenderUnknown;

    static {
       Gender gender = new Gender("kGenderUnknown", 0, 0);
       Gender.kGenderUnknown = gender;
       Gender gender1 = new Gender("kGenderMale", 1, 1);
       Gender.kGenderMale = gender1;
       Gender gender2 = new Gender("kGenderFemale", 2, 2);
       Gender.kGenderFemale = gender2;
       Gender gender3 = new Gender("UNRECOGNIZED", 3, -1);
       Gender.UNRECOGNIZED = gender3;
       Gender[] genderArray = new Gender[]{gender,gender1,gender2,gender3};
       Gender.$VALUES = genderArray;
       Gender.internalValueMap = new Gender$1();
    }
    public void Gender(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static Gender forNumber(int p0){
       if (!p0) {
          return Gender.kGenderUnknown;
       }
       if (p0 == 1) {
          return Gender.kGenderMale;
       }
       if (p0 != 2) {
          return null;
       }
       return Gender.kGenderFemale;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return Gender.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return Gender$GenderVerifier.INSTANCE;
    }
    public static Gender valueOf(int p0){
       return Gender.forNumber(p0);
    }
    public static Gender valueOf(String p0){
       return Enum.valueOf(Gender.class, p0);
    }
    public static Gender[] values(){
       return Gender.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != Gender.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
