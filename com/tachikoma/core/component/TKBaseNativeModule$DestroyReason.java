package com.tachikoma.core.component.TKBaseNativeModule$DestroyReason;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class TKBaseNativeModule$DestroyReason extends Enum	// class@000d4c
{
    public static final TKBaseNativeModule$DestroyReason[] $VALUES;
    public static final TKBaseNativeModule$DestroyReason GC;
    public static final TKBaseNativeModule$DestroyReason RELEASE;

    static {
       TKBaseNativeModule$DestroyReason uDestroyReas = new TKBaseNativeModule$DestroyReason("GC", 0);
       TKBaseNativeModule$DestroyReason.GC = uDestroyReas;
       TKBaseNativeModule$DestroyReason uDestroyReas1 = new TKBaseNativeModule$DestroyReason("RELEASE", 1);
       TKBaseNativeModule$DestroyReason.RELEASE = uDestroyReas1;
       TKBaseNativeModule$DestroyReason[] uDestroyReas2 = new TKBaseNativeModule$DestroyReason[]{uDestroyReas,uDestroyReas1};
       TKBaseNativeModule$DestroyReason.$VALUES = uDestroyReas2;
    }
    public void TKBaseNativeModule$DestroyReason(String p0,int p1){
       super(p0, p1);
    }
    public static TKBaseNativeModule$DestroyReason valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TKBaseNativeModule$DestroyReason.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(TKBaseNativeModule$DestroyReason.class, p0);
    }
    public static TKBaseNativeModule$DestroyReason[] values(){
       Object obj = PatchProxy.apply(null, null, TKBaseNativeModule$DestroyReason.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TKBaseNativeModule$DestroyReason.$VALUES.clone();
    }
}
