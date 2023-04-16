package com.kuaishou.krn.apm.MemoryMonitor$getCoreMemoryInfo$2;
import brd.e0;
import com.facebook.react.bridge.CatalystInstance;
import com.kuaishou.krn.apm.CoreMemoryInfo;
import com.kuaishou.krn.apm.MemoryEventTiming;
import java.lang.Object;
import brd.d0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.uimanager.f;
import com.facebook.react.uimanager.e;
import com.kuaishou.krn.apm.CoreUIViewInfo;
import gf.i;
import com.kuaishou.krn.apm.MemoryMonitor$getCoreMemoryInfo$2$2;
import com.facebook.react.bridge.MemoryStatsCallback;
import com.facebook.react.bridge.MemoryStatsProvider;
import qrd.l1;

public final class MemoryMonitor$getCoreMemoryInfo$2 implements e0	// class@0007bf
{
    public final CatalystInstance b;
    public final CoreMemoryInfo c;
    public final MemoryEventTiming d;

    public void MemoryMonitor$getCoreMemoryInfo$2(CatalystInstance p0,CoreMemoryInfo p1,MemoryEventTiming p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void b(d0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MemoryMonitor$getCoreMemoryInfo$2.class, "1")) {
          return;
       }
       a.p(p0, "it");
       UIManagerModule nativeModule = this.b.getNativeModule(UIManagerModule.class);
       if (nativeModule != null) {
          f uIImplementa = nativeModule.getUIImplementation();
          if (uIImplementa != null) {
             e uoe = uIImplementa.j();
             if (uoe != null) {
                uoe = uoe.a;
                if (uoe != null) {
                   this.c.uiViewInfo = new CoreUIViewInfo(uoe.a, uoe.b, uoe.d, uoe.c);
                }
             }
          }
       }
       if (this.d == MemoryEventTiming.PAUSE) {
          this.b.getUIMemoryStats(new MemoryMonitor$getCoreMemoryInfo$2$2(this, p0));
       }else {
          p0.onSuccess(l1.a);
       }
       return;
    }
}
