package com.kwai.performance.stability.artti.monitor.ArttiMonitor;
import com.kwai.performance.monitor.base.Monitor;
import com.kwai.performance.stability.artti.monitor.ArttiMonitor$a;
import java.util.concurrent.TimeUnit;
import java.lang.Runnable;
import ekd.s1;
import com.kwai.performance.monitor.base.d;
import java.lang.Object;
import kg7.a;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.performance.stability.artti.monitor.JvmtiHelper;

public final class ArttiMonitor extends Monitor	// class@001186
{

    public void ArttiMonitor(){
       super();
    }
    public final void ensureWorkerHandlerLoaded(){
       s1.e(ArttiMonitor$a.b, TimeUnit.MINUTES.toMillis(1));
    }
    public void init(d p0,Object p1){
       this.init(p0, p1);
    }
    public void init(d p0,a p1){
       a.q(p0, "commonConfig");
       a.q(p1, "monitorConfig");
       super.init(p0, p1);
       this.ensureWorkerHandlerLoaded();
       JvmtiHelper.setArttiMonitorConfig(p1);
    }
}
