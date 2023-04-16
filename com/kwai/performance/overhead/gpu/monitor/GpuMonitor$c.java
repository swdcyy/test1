package com.kwai.performance.overhead.gpu.monitor.GpuMonitor$c;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import com.kwai.performance.overhead.gpu.monitor.GpuMonitor;
import com.kwai.performance.overhead.gpu.monitor.GpuInfo;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import yf7.h;
import com.kwai.performance.monitor.base.Monitor;
import cg7.a;
import msd.l;
import java.util.Map;

public final class GpuMonitor$c implements Runnable	// class@00114a
{
    public final String b;

    public void GpuMonitor$c(String p0){
       this.b = p0;
       super();
    }
    public final void run(){
       GpuMonitor iNSTANCE = GpuMonitor.INSTANCE;
       int i = 1;
       if (a.g(GpuMonitor.access$getMGpuInfo$p(iNSTANCE).f, this.b) ^ i) {
          h.b("GpuMonitor", "stopGPUMonitor ## scene doesn\'t match ## sessionKey:"+this.b+" ## "+"sampleDataScene:"+GpuMonitor.access$getMGpuInfo$p(iNSTANCE).f);
          return;
       }else {
          GpuInfo gpuInfo = GpuMonitor.access$getMGpuInfo$p(iNSTANCE);
          GpuInfo c = gpuInfo.c;
          if (c != i && c != 2) {
             h.g("GpuUploadData", "data status error ## endSample ## current status : "+gpuInfo.c);
             gpuInfo.c = 4;
          }else {
             gpuInfo.c = 2;
          }
          a b = iNSTANCE.getMonitorConfig().b;
          Map map = (b != null)? b.invoke(this.b): null;
          iNSTANCE.uploadGpuInfo(map);
          return;
       }
    }
}
