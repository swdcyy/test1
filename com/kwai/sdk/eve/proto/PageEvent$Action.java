package com.kwai.sdk.eve.proto.PageEvent$Action;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kwai.sdk.eve.proto.PageEvent$Action$1;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kwai.sdk.eve.proto.PageEvent$Action$ActionVerifier;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class PageEvent$Action extends Enum implements Internal$EnumLite	// class@0015f4
{
    public final int value;
    public static final PageEvent$Action[] $VALUES;
    public static final PageEvent$Action ENTER;
    public static final PageEvent$Action LEAVE;
    public static final PageEvent$Action UNKNOWN1;
    public static final PageEvent$Action UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;

    static {
       PageEvent$Action uAction = new PageEvent$Action("UNKNOWN1", 0, 0);
       PageEvent$Action.UNKNOWN1 = uAction;
       PageEvent$Action uAction1 = new PageEvent$Action("ENTER", 1, 1);
       PageEvent$Action.ENTER = uAction1;
       PageEvent$Action uAction2 = new PageEvent$Action("LEAVE", 2, 2);
       PageEvent$Action.LEAVE = uAction2;
       PageEvent$Action uAction3 = new PageEvent$Action("UNRECOGNIZED", 3, -1);
       PageEvent$Action.UNRECOGNIZED = uAction3;
       PageEvent$Action[] uActionArray = new PageEvent$Action[]{uAction,uAction1,uAction2,uAction3};
       PageEvent$Action.$VALUES = uActionArray;
       PageEvent$Action.internalValueMap = new PageEvent$Action$1();
    }
    public void PageEvent$Action(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static PageEvent$Action forNumber(int p0){
       if (!p0) {
          return PageEvent$Action.UNKNOWN1;
       }
       if (p0 == 1) {
          return PageEvent$Action.ENTER;
       }
       if (p0 != 2) {
          return null;
       }
       return PageEvent$Action.LEAVE;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return PageEvent$Action.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return PageEvent$Action$ActionVerifier.INSTANCE;
    }
    public static PageEvent$Action valueOf(int p0){
       return PageEvent$Action.forNumber(p0);
    }
    public static PageEvent$Action valueOf(String p0){
       return Enum.valueOf(PageEvent$Action.class, p0);
    }
    public static PageEvent$Action[] values(){
       return PageEvent$Action.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != PageEvent$Action.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
