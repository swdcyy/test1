package com.kwai.performance.overhead.memory.monitor.MemoryMonitor$stopSectionInternal$$inlined$withLock$lambda$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import eg7.a;
import java.lang.String;
import java.lang.Object;
import qrd.l1;
import android.app.Application;
import yf7.k;
import android.content.Context;
import android.os.Debug$MemoryInfo;
import eg7.c;
import com.kwai.performance.overhead.memory.monitor.MemoryMonitor;
import android.app.ActivityManager$MemoryInfo;
import eg7.b;
import com.google.gson.Gson;
import yf7.i;
import yf7.d;
import yf7.d$a;
import kotlin.jvm.internal.a;
import yf7.h;

public final class MemoryMonitor$stopSectionInternal$$inlined$withLock$lambda$1 extends Lambda implements a	// class@00115d
{
    public final boolean $dumpMemoryInfo$inlined;
    public final boolean $enableAsyncDump$inlined;
    public final boolean $manualCalled$inlined;
    public final a $memoryEvent;
    public final String $section$inlined;

    public void MemoryMonitor$stopSectionInternal$$inlined$withLock$lambda$1(a p0,String p1,boolean p2,boolean p3,boolean p4){
       this.$memoryEvent = p0;
       this.$section$inlined = p1;
       this.$manualCalled$inlined = p2;
       this.$dumpMemoryInfo$inlined = p3;
       this.$enableAsyncDump$inlined = p4;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (this.$dumpMemoryInfo$inlined != null && this.$enableAsyncDump$inlined != null) {
          MemoryMonitor iNSTANCE = MemoryMonitor.INSTANCE;
          b.a(this.$memoryEvent, c.a(k.b()), iNSTANCE.update(MemoryMonitor.access$getMMemoryInfo$p(iNSTANCE)));
       }
       String str = new Gson().q(this.$memoryEvent);
       d$a.c(i.a, "memoryEvent", str, false, 4, null);
       a.h(str, "it");
       h.d("MemoryMonitor", str);
       return;
    }
}
