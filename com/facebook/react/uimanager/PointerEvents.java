package com.facebook.react.uimanager.PointerEvents;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PointerEvents extends Enum	// class@00131d
{
    public static final PointerEvents[] $VALUES;
    public static final PointerEvents AUTO;
    public static final PointerEvents BOX_NONE;
    public static final PointerEvents BOX_ONLY;
    public static final PointerEvents NONE;

    static {
       PointerEvents pointerEvent = new PointerEvents("NONE", 0);
       PointerEvents.NONE = pointerEvent;
       PointerEvents pointerEvent1 = new PointerEvents("BOX_NONE", 1);
       PointerEvents.BOX_NONE = pointerEvent1;
       PointerEvents pointerEvent2 = new PointerEvents("BOX_ONLY", 2);
       PointerEvents.BOX_ONLY = pointerEvent2;
       PointerEvents pointerEvent3 = new PointerEvents("AUTO", 3);
       PointerEvents.AUTO = pointerEvent3;
       PointerEvents[] pointerEvent4 = new PointerEvents[]{pointerEvent,pointerEvent1,pointerEvent2,pointerEvent3};
       PointerEvents.$VALUES = pointerEvent4;
    }
    public void PointerEvents(String p0,int p1){
       super(p0, p1);
    }
    public static PointerEvents valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PointerEvents.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PointerEvents.class, p0);
    }
    public static PointerEvents[] values(){
       Object obj = PatchProxy.apply(null, null, PointerEvents.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PointerEvents.$VALUES.clone();
    }
}
