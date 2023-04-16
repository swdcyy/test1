package com.kwai.sdk.eve.proto.PageEvent$SubAction;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kwai.sdk.eve.proto.PageEvent$SubAction$1;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kwai.sdk.eve.proto.PageEvent$SubAction$SubActionVerifier;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class PageEvent$SubAction extends Enum implements Internal$EnumLite	// class@0015f8
{
    public final int value;
    public static final PageEvent$SubAction[] $VALUES;
    public static final PageEvent$SubAction PAGE_ENTER;
    public static final PageEvent$SubAction PAGE_LEAVE;
    public static final PageEvent$SubAction PAGE_PAUSE;
    public static final PageEvent$SubAction PAGE_RESUME;
    public static final PageEvent$SubAction UNKNOWN2;
    public static final PageEvent$SubAction UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;

    static {
       PageEvent$SubAction subAction = new PageEvent$SubAction("UNKNOWN2", 0, 0);
       PageEvent$SubAction.UNKNOWN2 = subAction;
       PageEvent$SubAction subAction1 = new PageEvent$SubAction("PAGE_ENTER", 1, 1);
       PageEvent$SubAction.PAGE_ENTER = subAction1;
       PageEvent$SubAction subAction2 = new PageEvent$SubAction("PAGE_LEAVE", 2, 2);
       PageEvent$SubAction.PAGE_LEAVE = subAction2;
       PageEvent$SubAction subAction3 = new PageEvent$SubAction("PAGE_RESUME", 3, 3);
       PageEvent$SubAction.PAGE_RESUME = subAction3;
       PageEvent$SubAction subAction4 = new PageEvent$SubAction("PAGE_PAUSE", 4, 4);
       PageEvent$SubAction.PAGE_PAUSE = subAction4;
       PageEvent$SubAction subAction5 = new PageEvent$SubAction("UNRECOGNIZED", 5, -1);
       PageEvent$SubAction.UNRECOGNIZED = subAction5;
       PageEvent$SubAction[] subActionArr = new PageEvent$SubAction[]{subAction,subAction1,subAction2,subAction3,subAction4,subAction5};
       PageEvent$SubAction.$VALUES = subActionArr;
       PageEvent$SubAction.internalValueMap = new PageEvent$SubAction$1();
    }
    public void PageEvent$SubAction(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static PageEvent$SubAction forNumber(int p0){
       if (!p0) {
          return PageEvent$SubAction.UNKNOWN2;
       }
       if (p0 == 1) {
          return PageEvent$SubAction.PAGE_ENTER;
       }
       if (p0 == 2) {
          return PageEvent$SubAction.PAGE_LEAVE;
       }
       if (p0 == 3) {
          return PageEvent$SubAction.PAGE_RESUME;
       }
       if (p0 != 4) {
          return null;
       }
       return PageEvent$SubAction.PAGE_PAUSE;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return PageEvent$SubAction.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return PageEvent$SubAction$SubActionVerifier.INSTANCE;
    }
    public static PageEvent$SubAction valueOf(int p0){
       return PageEvent$SubAction.forNumber(p0);
    }
    public static PageEvent$SubAction valueOf(String p0){
       return Enum.valueOf(PageEvent$SubAction.class, p0);
    }
    public static PageEvent$SubAction[] values(){
       return PageEvent$SubAction.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != PageEvent$SubAction.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
