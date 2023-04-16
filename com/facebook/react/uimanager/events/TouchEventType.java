package com.facebook.react.uimanager.events.TouchEventType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.uimanager.events.TouchEventType$a;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;

public final class TouchEventType extends Enum	// class@001344
{
    public static final TouchEventType[] $VALUES;
    public static final TouchEventType CANCEL;
    public static final TouchEventType END;
    public static final TouchEventType MOVE;
    public static final TouchEventType START;

    static {
       TouchEventType touchEventTy = new TouchEventType("START", 0);
       TouchEventType.START = touchEventTy;
       TouchEventType touchEventTy1 = new TouchEventType("END", 1);
       TouchEventType.END = touchEventTy1;
       TouchEventType touchEventTy2 = new TouchEventType("MOVE", 2);
       TouchEventType.MOVE = touchEventTy2;
       TouchEventType touchEventTy3 = new TouchEventType("CANCEL", 3);
       TouchEventType.CANCEL = touchEventTy3;
       TouchEventType[] touchEventTy4 = new TouchEventType[]{touchEventTy,touchEventTy1,touchEventTy2,touchEventTy3};
       TouchEventType.$VALUES = touchEventTy4;
    }
    public void TouchEventType(String p0,int p1){
       super(p0, p1);
    }
    public static String getJSEventName(TouchEventType p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TouchEventType.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = TouchEventType$a.a[p0.ordinal()];
       if (i == 1) {
          return "topTouchStart";
       }
       if (i == 2) {
          return "topTouchEnd";
       }
       if (i == 3) {
          return "topTouchMove";
       }
       if (i == 4) {
          return "topTouchCancel";
       }
       throw new IllegalArgumentException("Unexpected type "+p0);
    }
    public static TouchEventType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TouchEventType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(TouchEventType.class, p0);
    }
    public static TouchEventType[] values(){
       Object obj = PatchProxy.apply(null, null, TouchEventType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TouchEventType.$VALUES.clone();
    }
}
