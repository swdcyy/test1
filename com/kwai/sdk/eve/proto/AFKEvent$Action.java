package com.kwai.sdk.eve.proto.AFKEvent$Action;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kwai.sdk.eve.proto.AFKEvent$Action$1;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kwai.sdk.eve.proto.AFKEvent$Action$ActionVerifier;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class AFKEvent$Action extends Enum implements Internal$EnumLite	// class@0015d7
{
    public final int value;
    public static final AFKEvent$Action[] $VALUES;
    public static final AFKEvent$Action ENTER;
    public static final AFKEvent$Action LEAVE;
    public static final AFKEvent$Action UNKNOWN1;
    public static final AFKEvent$Action UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;

    static {
       AFKEvent$Action uAction = new AFKEvent$Action("UNKNOWN1", 0, 0);
       AFKEvent$Action.UNKNOWN1 = uAction;
       AFKEvent$Action uAction1 = new AFKEvent$Action("ENTER", 1, 1);
       AFKEvent$Action.ENTER = uAction1;
       AFKEvent$Action uAction2 = new AFKEvent$Action("LEAVE", 2, 2);
       AFKEvent$Action.LEAVE = uAction2;
       AFKEvent$Action uAction3 = new AFKEvent$Action("UNRECOGNIZED", 3, -1);
       AFKEvent$Action.UNRECOGNIZED = uAction3;
       AFKEvent$Action[] uActionArray = new AFKEvent$Action[]{uAction,uAction1,uAction2,uAction3};
       AFKEvent$Action.$VALUES = uActionArray;
       AFKEvent$Action.internalValueMap = new AFKEvent$Action$1();
    }
    public void AFKEvent$Action(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static AFKEvent$Action forNumber(int p0){
       if (!p0) {
          return AFKEvent$Action.UNKNOWN1;
       }
       if (p0 == 1) {
          return AFKEvent$Action.ENTER;
       }
       if (p0 != 2) {
          return null;
       }
       return AFKEvent$Action.LEAVE;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return AFKEvent$Action.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return AFKEvent$Action$ActionVerifier.INSTANCE;
    }
    public static AFKEvent$Action valueOf(int p0){
       return AFKEvent$Action.forNumber(p0);
    }
    public static AFKEvent$Action valueOf(String p0){
       return Enum.valueOf(AFKEvent$Action.class, p0);
    }
    public static AFKEvent$Action[] values(){
       return AFKEvent$Action.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != AFKEvent$Action.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
