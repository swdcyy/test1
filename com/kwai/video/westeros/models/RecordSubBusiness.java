package com.kwai.video.westeros.models.RecordSubBusiness;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kwai.video.westeros.models.RecordSubBusiness$1;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kwai.video.westeros.models.RecordSubBusiness$RecordSubBusinessVerifier;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class RecordSubBusiness extends Enum implements Internal$EnumLite	// class@001021
{
    public final int value;
    public static final RecordSubBusiness[] $VALUES;
    public static final RecordSubBusiness KDuet;
    public static final RecordSubBusiness KNormal;
    public static final RecordSubBusiness KSubBusinessUnkown;
    public static final RecordSubBusiness UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;

    static {
       RecordSubBusiness recordSubBus = new RecordSubBusiness("KSubBusinessUnkown", 0, 0);
       RecordSubBusiness.KSubBusinessUnkown = recordSubBus;
       RecordSubBusiness recordSubBus1 = new RecordSubBusiness("KNormal", 1, 1);
       RecordSubBusiness.KNormal = recordSubBus1;
       RecordSubBusiness recordSubBus2 = new RecordSubBusiness("KDuet", 2, 2);
       RecordSubBusiness.KDuet = recordSubBus2;
       RecordSubBusiness recordSubBus3 = new RecordSubBusiness("UNRECOGNIZED", 3, -1);
       RecordSubBusiness.UNRECOGNIZED = recordSubBus3;
       RecordSubBusiness[] recordSubBus4 = new RecordSubBusiness[]{recordSubBus,recordSubBus1,recordSubBus2,recordSubBus3};
       RecordSubBusiness.$VALUES = recordSubBus4;
       RecordSubBusiness.internalValueMap = new RecordSubBusiness$1();
    }
    public void RecordSubBusiness(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static RecordSubBusiness forNumber(int p0){
       if (!p0) {
          return RecordSubBusiness.KSubBusinessUnkown;
       }
       if (p0 == 1) {
          return RecordSubBusiness.KNormal;
       }
       if (p0 != 2) {
          return null;
       }
       return RecordSubBusiness.KDuet;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return RecordSubBusiness.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return RecordSubBusiness$RecordSubBusinessVerifier.INSTANCE;
    }
    public static RecordSubBusiness valueOf(int p0){
       return RecordSubBusiness.forNumber(p0);
    }
    public static RecordSubBusiness valueOf(String p0){
       return Enum.valueOf(RecordSubBusiness.class, p0);
    }
    public static RecordSubBusiness[] values(){
       return RecordSubBusiness.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != RecordSubBusiness.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
