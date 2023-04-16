package com.yxcorp.experiment.proto.AbEntranceEventProto$AbEntranceEvent$Source;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.yxcorp.experiment.proto.AbEntranceEventProto$AbEntranceEvent$Source$a;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.yxcorp.experiment.proto.AbEntranceEventProto$AbEntranceEvent$Source$b;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class AbEntranceEventProto$AbEntranceEvent$Source extends Enum implements Internal$EnumLite	// class@0011f1
{
    public final int value;
    public static final AbEntranceEventProto$AbEntranceEvent$Source[] $VALUES;
    public static final AbEntranceEventProto$AbEntranceEvent$Source APP;
    public static final AbEntranceEventProto$AbEntranceEvent$Source SDK;
    public static final AbEntranceEventProto$AbEntranceEvent$Source UNKNOWN_SOURCE;
    public static final AbEntranceEventProto$AbEntranceEvent$Source UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;

    static {
       AbEntranceEventProto$AbEntranceEvent$Source uAbEntranceE = new AbEntranceEventProto$AbEntranceEvent$Source("UNKNOWN_SOURCE", 0, 0);
       AbEntranceEventProto$AbEntranceEvent$Source.UNKNOWN_SOURCE = uAbEntranceE;
       AbEntranceEventProto$AbEntranceEvent$Source uAbEntranceE1 = new AbEntranceEventProto$AbEntranceEvent$Source("SDK", 1, 1);
       AbEntranceEventProto$AbEntranceEvent$Source.SDK = uAbEntranceE1;
       AbEntranceEventProto$AbEntranceEvent$Source uAbEntranceE2 = new AbEntranceEventProto$AbEntranceEvent$Source("APP", 2, 2);
       AbEntranceEventProto$AbEntranceEvent$Source.APP = uAbEntranceE2;
       AbEntranceEventProto$AbEntranceEvent$Source uAbEntranceE3 = new AbEntranceEventProto$AbEntranceEvent$Source("UNRECOGNIZED", 3, -1);
       AbEntranceEventProto$AbEntranceEvent$Source.UNRECOGNIZED = uAbEntranceE3;
       AbEntranceEventProto$AbEntranceEvent$Source[] uAbEntranceE4 = new AbEntranceEventProto$AbEntranceEvent$Source[]{uAbEntranceE,uAbEntranceE1,uAbEntranceE2,uAbEntranceE3};
       AbEntranceEventProto$AbEntranceEvent$Source.$VALUES = uAbEntranceE4;
       AbEntranceEventProto$AbEntranceEvent$Source.internalValueMap = new AbEntranceEventProto$AbEntranceEvent$Source$a();
    }
    public void AbEntranceEventProto$AbEntranceEvent$Source(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static AbEntranceEventProto$AbEntranceEvent$Source forNumber(int p0){
       if (!p0) {
          return AbEntranceEventProto$AbEntranceEvent$Source.UNKNOWN_SOURCE;
       }
       if (p0 == 1) {
          return AbEntranceEventProto$AbEntranceEvent$Source.SDK;
       }
       if (p0 != 2) {
          return null;
       }
       return AbEntranceEventProto$AbEntranceEvent$Source.APP;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return AbEntranceEventProto$AbEntranceEvent$Source.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return AbEntranceEventProto$AbEntranceEvent$Source$b.a;
    }
    public static AbEntranceEventProto$AbEntranceEvent$Source valueOf(int p0){
       return AbEntranceEventProto$AbEntranceEvent$Source.forNumber(p0);
    }
    public static AbEntranceEventProto$AbEntranceEvent$Source valueOf(String p0){
       return Enum.valueOf(AbEntranceEventProto$AbEntranceEvent$Source.class, p0);
    }
    public static AbEntranceEventProto$AbEntranceEvent$Source[] values(){
       return AbEntranceEventProto$AbEntranceEvent$Source.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != AbEntranceEventProto$AbEntranceEvent$Source.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
