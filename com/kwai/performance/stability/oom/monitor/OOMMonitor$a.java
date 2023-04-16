package com.kwai.performance.stability.oom.monitor.OOMMonitor$a;
import java.lang.Runnable;
import java.io.File;
import java.lang.String;
import java.lang.Object;
import com.kwai.performance.stability.oom.monitor.OOMMonitor;

public final class OOMMonitor$a implements Runnable	// class@001249
{
    public final File b;
    public final File c;
    public final File d;
    public final String e;
    public final String f;

    public void OOMMonitor$a(File p0,File p1,File p2,String p3,String p4){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       super();
    }
    public final void run(){
       OOMMonitor.INSTANCE.startAnalysisService(this.b, this.c, this.d, this.e, this.f);
    }
}
