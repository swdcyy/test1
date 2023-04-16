package com.facebook.react.modules.core.ReactChoreographer$CallbackType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ReactChoreographer$CallbackType extends Enum	// class@001291
{
    public final int mOrder;
    public static final ReactChoreographer$CallbackType[] $VALUES;
    public static final ReactChoreographer$CallbackType DISPATCH_UI;
    public static final ReactChoreographer$CallbackType IDLE_EVENT;
    public static final ReactChoreographer$CallbackType NATIVE_ANIMATED_MODULE;
    public static final ReactChoreographer$CallbackType PERF_MARKERS;
    public static final ReactChoreographer$CallbackType TIMERS_EVENTS;

    static {
       ReactChoreographer$CallbackType uCallbackTyp = new ReactChoreographer$CallbackType("PERF_MARKERS", 0, 0);
       ReactChoreographer$CallbackType.PERF_MARKERS = uCallbackTyp;
       ReactChoreographer$CallbackType uCallbackTyp1 = new ReactChoreographer$CallbackType("DISPATCH_UI", 1, 1);
       ReactChoreographer$CallbackType.DISPATCH_UI = uCallbackTyp1;
       ReactChoreographer$CallbackType uCallbackTyp2 = new ReactChoreographer$CallbackType("NATIVE_ANIMATED_MODULE", 2, 2);
       ReactChoreographer$CallbackType.NATIVE_ANIMATED_MODULE = uCallbackTyp2;
       ReactChoreographer$CallbackType uCallbackTyp3 = new ReactChoreographer$CallbackType("TIMERS_EVENTS", 3, 3);
       ReactChoreographer$CallbackType.TIMERS_EVENTS = uCallbackTyp3;
       ReactChoreographer$CallbackType uCallbackTyp4 = new ReactChoreographer$CallbackType("IDLE_EVENT", 4, 4);
       ReactChoreographer$CallbackType.IDLE_EVENT = uCallbackTyp4;
       ReactChoreographer$CallbackType[] uCallbackTyp5 = new ReactChoreographer$CallbackType[]{uCallbackTyp,uCallbackTyp1,uCallbackTyp2,uCallbackTyp3,uCallbackTyp4};
       ReactChoreographer$CallbackType.$VALUES = uCallbackTyp5;
    }
    public void ReactChoreographer$CallbackType(String p0,int p1,int p2){
       super(p0, p1);
       this.mOrder = p2;
    }
    public static ReactChoreographer$CallbackType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ReactChoreographer$CallbackType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ReactChoreographer$CallbackType.class, p0);
    }
    public static ReactChoreographer$CallbackType[] values(){
       Object obj = PatchProxy.apply(null, null, ReactChoreographer$CallbackType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ReactChoreographer$CallbackType.$VALUES.clone();
    }
    public int getOrder(){
       return this.mOrder;
    }
}
