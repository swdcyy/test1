package com.kwai.performance.fluency.trace.monitor.TraceMonitor$stopSectionInternal$$inlined$runCatching$lambda$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.performance.fluency.trace.monitor.TraceMonitor;
import java.lang.String;
import java.lang.Object;
import qrd.l1;
import java.lang.System;
import yf7.h;
import java.io.File;
import com.kwai.performance.fluency.trace.monitor.TraceFileManager;
import kotlin.io.FilesKt__UtilsKt;

public final class TraceMonitor$stopSectionInternal$$inlined$runCatching$lambda$1 extends Lambda implements a	// class@0010f9
{
    public final boolean $needUpload$inlined;
    public final String $reason$inlined;
    public final String $section$inlined;
    public final TraceMonitor $this_runCatching;

    public void TraceMonitor$stopSectionInternal$$inlined$runCatching$lambda$1(TraceMonitor p0,String p1,String p2,boolean p3){
       this.$this_runCatching = p0;
       this.$section$inlined = p1;
       this.$reason$inlined = p2;
       this.$needUpload$inlined = p3;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (this.$needUpload$inlined != null) {
          this.$this_runCatching.uploadTraceFile(this.$section$inlined, this.$reason$inlined, (System.currentTimeMillis() - TraceMonitor.access$getMTraceBeginTime$p(this.$this_runCatching)));
          h.d("TraceMonitor", "execute upload trace");
       }else {
          FilesKt__UtilsKt.V(new File(TraceFileManager.a(), this.$section$inlined));
          h.d("TraceMonitor", "clear scene files");
       }
       return;
    }
}
