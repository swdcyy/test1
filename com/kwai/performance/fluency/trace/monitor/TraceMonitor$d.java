package com.kwai.performance.fluency.trace.monitor.TraceMonitor$d;
import erd.g;
import java.io.File;
import java.lang.Object;
import java.lang.Throwable;
import kotlin.io.FilesKt__UtilsKt;
import java.lang.StringBuilder;
import java.lang.String;
import yf7.h;

public final class TraceMonitor$d implements g	// class@0010f8
{
    public final File b;
    public final File c;

    public void TraceMonitor$d(File p0,File p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       FilesKt__UtilsKt.V(this.b);
       this.c.delete();
       h.b("TraceMonitor", "upload error "+p0);
    }
}
