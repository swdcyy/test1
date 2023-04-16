package com.kuaishou.krn.apm.MemoryEventTiming;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MemoryEventTiming extends Enum	// class@0007b6
{
    public static final MemoryEventTiming[] $VALUES;
    public static final MemoryEventTiming BRIDGE_INIT;
    public static final MemoryEventTiming CONTENT_APPEARED;
    public static final MemoryEventTiming DEVTOOLS;
    public static final MemoryEventTiming GENERAL;
    public static final MemoryEventTiming ON_CREATE;
    public static final MemoryEventTiming PAUSE;
    public static final MemoryEventTiming RUN_JS_BUNDLE_END;
    public static final MemoryEventTiming RUN_JS_BUNDLE_START;

    static {
       MemoryEventTiming memoryEventT1;
       MemoryEventTiming[] memoryEventT = new MemoryEventTiming[]{memoryEventT1,memoryEventT1,memoryEventT1,memoryEventT1,memoryEventT1,memoryEventT1,memoryEventT1,memoryEventT1};
       memoryEventT1 = new MemoryEventTiming("ON_CREATE", 0);
       MemoryEventTiming.ON_CREATE = memoryEventT1;
       memoryEventT1 = new MemoryEventTiming("BRIDGE_INIT", 1);
       MemoryEventTiming.BRIDGE_INIT = memoryEventT1;
       memoryEventT1 = new MemoryEventTiming("RUN_JS_BUNDLE_START", 2);
       MemoryEventTiming.RUN_JS_BUNDLE_START = memoryEventT1;
       memoryEventT1 = new MemoryEventTiming("RUN_JS_BUNDLE_END", 3);
       MemoryEventTiming.RUN_JS_BUNDLE_END = memoryEventT1;
       memoryEventT1 = new MemoryEventTiming("CONTENT_APPEARED", 4);
       MemoryEventTiming.CONTENT_APPEARED = memoryEventT1;
       memoryEventT1 = new MemoryEventTiming("PAUSE", 5);
       MemoryEventTiming.PAUSE = memoryEventT1;
       memoryEventT1 = new MemoryEventTiming("GENERAL", 6);
       MemoryEventTiming.GENERAL = memoryEventT1;
       memoryEventT1 = new MemoryEventTiming("DEVTOOLS", 7);
       MemoryEventTiming.DEVTOOLS = memoryEventT1;
       MemoryEventTiming.$VALUES = memoryEventT;
    }
    public void MemoryEventTiming(String p0,int p1){
       super(p0, p1);
    }
    public static MemoryEventTiming valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MemoryEventTiming.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MemoryEventTiming.class, p0);
    }
    public static MemoryEventTiming[] values(){
       Object obj = PatchProxy.apply(null, null, MemoryEventTiming.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MemoryEventTiming.$VALUES.clone();
    }
}
