package com.facebook.react.bridge.MemoryPressure;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MemoryPressure extends Enum	// class@001201
{
    public static final MemoryPressure[] $VALUES;
    public static final MemoryPressure CRITICAL;
    public static final MemoryPressure MODERATE;
    public static final MemoryPressure NONE;
    public static final MemoryPressure UI_HIDDEN;

    static {
       MemoryPressure memoryPressu = new MemoryPressure("NONE", 0);
       MemoryPressure.NONE = memoryPressu;
       MemoryPressure memoryPressu1 = new MemoryPressure("UI_HIDDEN", 1);
       MemoryPressure.UI_HIDDEN = memoryPressu1;
       MemoryPressure memoryPressu2 = new MemoryPressure("MODERATE", 2);
       MemoryPressure.MODERATE = memoryPressu2;
       MemoryPressure memoryPressu3 = new MemoryPressure("CRITICAL", 3);
       MemoryPressure.CRITICAL = memoryPressu3;
       MemoryPressure[] memoryPressu4 = new MemoryPressure[]{memoryPressu,memoryPressu1,memoryPressu2,memoryPressu3};
       MemoryPressure.$VALUES = memoryPressu4;
    }
    public void MemoryPressure(String p0,int p1){
       super(p0, p1);
    }
    public static MemoryPressure valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MemoryPressure.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MemoryPressure.class, p0);
    }
    public static MemoryPressure[] values(){
       Object obj = PatchProxy.apply(null, null, MemoryPressure.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MemoryPressure.$VALUES.clone();
    }
}
