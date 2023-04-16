package com.kwai.performance.stability.oom.monitor.OOMMonitor$b;
import com.kwai.performance.stability.oom.monitor.analysis.AnalysisReceiver$b;
import java.io.File;
import java.lang.Object;
import java.lang.String;
import yf7.h;
import yf7.i;
import java.nio.charset.Charset;
import kotlin.io.FilesKt__FileReadWriteKt;
import com.kwai.performance.stability.oom.monitor.OOMMonitor;
import com.kwai.performance.monitor.base.Monitor;
import com.kwai.performance.stability.oom.monitor.OOMMonitorConfig;
import com.kwai.performance.stability.oom.monitor.OOMHprofUploader$HprofType;
import com.kwai.performance.stability.oom.monitor.OOMHprofUploader;

public final class OOMMonitor$b implements AnalysisReceiver$b	// class@00124a
{
    public final File a;
    public final File b;

    public void OOMMonitor$b(File p0,File p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void onError(){
       h.c("OOMMonitor", "heap analysis error, do file delete", true);
       this.a.delete();
       this.b.delete();
    }
    public void onSuccess(){
       h.e("OOMMonitor", "heap analysis success, do upload", true);
       i.a.f(FilesKt__FileReadWriteKt.z(this.b, null, true, null), 7);
       OOMMonitorConfig u = OOMMonitor.INSTANCE.getMonitorConfig().u;
       if (u != null) {
          u.a(this.a, OOMHprofUploader$HprofType.ORIGIN);
       }
       return;
    }
}
