package com.kuaishou.krn.apm.MemoryMonitor$postMemoryEvent$1$1$doOnGetMemorySuccess$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.krn.apm.MemoryMonitor$postMemoryEvent$1$1;
import java.lang.Object;
import com.kuaishou.krn.apm.MemoryEvent;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.os.SystemClock;
import com.kuaishou.krn.apm.MemoryMonitor$postMemoryEvent$1;
import com.kuaishou.krn.apm.MemoryMonitor;
import java.lang.StringBuilder;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.JsonElement;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import ek0.d;

public final class MemoryMonitor$postMemoryEvent$1$1$doOnGetMemorySuccess$1 extends Lambda implements l	// class@0007d0
{
    public final MemoryMonitor$postMemoryEvent$1$1 this$0;

    public void MemoryMonitor$postMemoryEvent$1$1$doOnGetMemorySuccess$1(MemoryMonitor$postMemoryEvent$1$1 p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(MemoryEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MemoryMonitor$postMemoryEvent$1$1$doOnGetMemorySuccess$1.class, "1")) {
          return;
       }
       a.p(p0, "resultMemoryEvent");
       p0.overheadTime = SystemClock.elapsedRealtime() - this.this$0.this$0.f;
       if (MemoryMonitor.m.e()) {
          StringBuilder str = "MemoryEvent: ";
          JsonElement jsonElement = PatchProxy.apply(null, p0, MemoryEvent.class, "11");
          if (jsonElement != PatchProxyResult.class) {
          }else {
             Gson gson = new Gson();
             JsonElement jsonElement1 = gson.x(p0);
             a.o(jsonElement1, "rootJson");
             jsonElement1.r().G("javaHeapStat", gson.x(p0.b));
             jsonElement1.r().G("nativeHeapStat", gson.x(p0.c));
             jsonElement1.r().G("codeSizeStat", gson.x(p0.d));
             jsonElement1.r().G("stackStat", gson.x(p0.e));
             jsonElement1.r().G("graphicsStat", gson.x(p0.f));
             jsonElement1.r().G("privateOtherStat", gson.x(p0.g));
             jsonElement1.r().G("systemStat", gson.x(p0.h));
             jsonElement1.r().G("coreMemoryInfo", gson.x(p0.coreMemoryInfo));
             jsonElement = jsonElement1;
          }
          d.e(str+jsonElement.toString());
       }
       this.this$0.this$0.g.invoke(p0);
       return;
    }
}
