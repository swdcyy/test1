package com.kwai.performance.overhead.gpu.monitor.GpuMonitor$b;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import com.kwai.performance.overhead.gpu.monitor.GpuMonitor;
import com.kwai.performance.overhead.gpu.monitor.GpuInfo;
import java.util.ArrayList;
import java.lang.StringBuilder;
import yf7.h;

public final class GpuMonitor$b implements Runnable	// class@001149
{
    public final String b;

    public void GpuMonitor$b(String p0){
       this.b = p0;
       super();
    }
    public final void run(){
       GpuMonitor iNSTANCE = GpuMonitor.INSTANCE;
       GpuInfo gpuInfo = GpuMonitor.access$getMGpuInfo$p(iNSTANCE);
       gpuInfo.f = "";
       gpuInfo.e = null;
       gpuInfo.i = null;
       int i = 0;
       gpuInfo.k = i;
       gpuInfo.j.clear();
       gpuInfo.d = 0;
       gpuInfo.g = 0;
       gpuInfo.h = 0;
       gpuInfo.c = i;
       GpuMonitor.access$getMGpuInfo$p(iNSTANCE).f = this.b;
       iNSTANCE.clearStackTraceList();
       GpuInfo gpuInfo1 = GpuMonitor.access$getMGpuInfo$p(iNSTANCE);
       if (gpuInfo1.c != null) {
          h.g("GpuUploadData", "data status error ## beginSample ## current status : "+gpuInfo1.c);
          gpuInfo1.c = 4;
       }else {
          gpuInfo1.c = 1;
          gpuInfo1.k = i;
       }
       return;
    }
}
