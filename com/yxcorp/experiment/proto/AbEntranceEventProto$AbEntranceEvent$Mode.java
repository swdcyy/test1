package com.yxcorp.experiment.proto.AbEntranceEventProto$AbEntranceEvent$Mode;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.yxcorp.experiment.proto.AbEntranceEventProto$AbEntranceEvent$Mode$a;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.yxcorp.experiment.proto.AbEntranceEventProto$AbEntranceEvent$Mode$b;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class AbEntranceEventProto$AbEntranceEvent$Mode extends Enum implements Internal$EnumLite	// class@0011ee
{
    public final int value;
    public static final AbEntranceEventProto$AbEntranceEvent$Mode[] $VALUES;
    public static final AbEntranceEventProto$AbEntranceEvent$Mode BACKSTAGE;
    public static final AbEntranceEventProto$AbEntranceEvent$Mode NORMAL;
    public static final AbEntranceEventProto$AbEntranceEvent$Mode SWITCH;
    public static final AbEntranceEventProto$AbEntranceEvent$Mode UNKNOWN;
    public static final AbEntranceEventProto$AbEntranceEvent$Mode UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;

    static {
       AbEntranceEventProto$AbEntranceEvent$Mode uAbEntranceE = new AbEntranceEventProto$AbEntranceEvent$Mode("UNKNOWN", 0, 0);
       AbEntranceEventProto$AbEntranceEvent$Mode.UNKNOWN = uAbEntranceE;
       AbEntranceEventProto$AbEntranceEvent$Mode uAbEntranceE1 = new AbEntranceEventProto$AbEntranceEvent$Mode("NORMAL", 1, 1);
       AbEntranceEventProto$AbEntranceEvent$Mode.NORMAL = uAbEntranceE1;
       AbEntranceEventProto$AbEntranceEvent$Mode uAbEntranceE2 = new AbEntranceEventProto$AbEntranceEvent$Mode("SWITCH", 2, 2);
       AbEntranceEventProto$AbEntranceEvent$Mode.SWITCH = uAbEntranceE2;
       AbEntranceEventProto$AbEntranceEvent$Mode uAbEntranceE3 = new AbEntranceEventProto$AbEntranceEvent$Mode("BACKSTAGE", 3, 3);
       AbEntranceEventProto$AbEntranceEvent$Mode.BACKSTAGE = uAbEntranceE3;
       AbEntranceEventProto$AbEntranceEvent$Mode uAbEntranceE4 = new AbEntranceEventProto$AbEntranceEvent$Mode("UNRECOGNIZED", 4, -1);
       AbEntranceEventProto$AbEntranceEvent$Mode.UNRECOGNIZED = uAbEntranceE4;
       AbEntranceEventProto$AbEntranceEvent$Mode[] uAbEntranceE5 = new AbEntranceEventProto$AbEntranceEvent$Mode[]{uAbEntranceE,uAbEntranceE1,uAbEntranceE2,uAbEntranceE3,uAbEntranceE4};
       AbEntranceEventProto$AbEntranceEvent$Mode.$VALUES = uAbEntranceE5;
       AbEntranceEventProto$AbEntranceEvent$Mode.internalValueMap = new AbEntranceEventProto$AbEntranceEvent$Mode$a();
    }
    public void AbEntranceEventProto$AbEntranceEvent$Mode(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static AbEntranceEventProto$AbEntranceEvent$Mode forNumber(int p0){
       if (!p0) {
          return AbEntranceEventProto$AbEntranceEvent$Mode.UNKNOWN;
       }
       if (p0 == 1) {
          return AbEntranceEventProto$AbEntranceEvent$Mode.NORMAL;
       }
       if (p0 == 2) {
          return AbEntranceEventProto$AbEntranceEvent$Mode.SWITCH;
       }
       if (p0 != 3) {
          return null;
       }
       return AbEntranceEventProto$AbEntranceEvent$Mode.BACKSTAGE;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return AbEntranceEventProto$AbEntranceEvent$Mode.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return AbEntranceEventProto$AbEntranceEvent$Mode$b.a;
    }
    public static AbEntranceEventProto$AbEntranceEvent$Mode valueOf(int p0){
       return AbEntranceEventProto$AbEntranceEvent$Mode.forNumber(p0);
    }
    public static AbEntranceEventProto$AbEntranceEvent$Mode valueOf(String p0){
       return Enum.valueOf(AbEntranceEventProto$AbEntranceEvent$Mode.class, p0);
    }
    public static AbEntranceEventProto$AbEntranceEvent$Mode[] values(){
       return AbEntranceEventProto$AbEntranceEvent$Mode.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != AbEntranceEventProto$AbEntranceEvent$Mode.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
