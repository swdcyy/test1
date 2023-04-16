package com.kuaishou.live.common.core.component.multipk.utils.LiveMultiPkDebugLogKt;
import com.kuaishou.live.common.core.component.multipk.utils.LiveMultiPkDebugLogKt$CORE_TAG$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.live.common.core.component.multipk.utils.LiveMultiPkDebugLogKt$GAME_VC_TAG$2;
import com.kuaishou.live.common.core.component.multipk.utils.LiveMultiPkDebugLogKt$GAME_MODEL_TAG$2;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveMultiPkDebugLogKt	// class@00169f
{
    public static final p a;
    public static final p b;
    public static final p c;

    static {
       LiveMultiPkDebugLogKt.a = s.c(LiveMultiPkDebugLogKt$CORE_TAG$2.INSTANCE);
       LiveMultiPkDebugLogKt.b = s.c(LiveMultiPkDebugLogKt$GAME_VC_TAG$2.INSTANCE);
       LiveMultiPkDebugLogKt.c = s.c(LiveMultiPkDebugLogKt$GAME_MODEL_TAG$2.INSTANCE);
    }
    public static final List a(){
       Object obj = PatchProxy.apply(null, null, LiveMultiPkDebugLogKt.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveMultiPkDebugLogKt.a.getValue();
    }
    public static final List b(){
       Object obj = PatchProxy.apply(null, null, LiveMultiPkDebugLogKt.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveMultiPkDebugLogKt.c.getValue();
    }
    public static final List c(){
       Object obj = PatchProxy.apply(null, null, LiveMultiPkDebugLogKt.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveMultiPkDebugLogKt.b.getValue();
    }
}
