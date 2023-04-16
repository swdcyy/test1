package com.kuaishou.live.common.core.component.multipk.utils.LiveMultiPkDebugLogKt$CORE_TAG$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import pp.c;

public final class LiveMultiPkDebugLogKt$CORE_TAG$2 extends Lambda implements a	// class@00169c
{
    public static final LiveMultiPkDebugLogKt$CORE_TAG$2 INSTANCE;

    static {
       LiveMultiPkDebugLogKt$CORE_TAG$2.INSTANCE = new LiveMultiPkDebugLogKt$CORE_TAG$2();
    }
    public void LiveMultiPkDebugLogKt$CORE_TAG$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final List invoke(){
       Object obj = PatchProxy.apply(null, this, LiveMultiPkDebugLogKt$CORE_TAG$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveCommonLogTag.MULTI_PK.appendTag("Core");
    }
}
