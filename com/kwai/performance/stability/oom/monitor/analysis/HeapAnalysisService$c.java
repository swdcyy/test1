package com.kwai.performance.stability.oom.monitor.analysis.HeapAnalysisService$c;
import kshark.lite.OnAnalysisProgressListener;
import com.kwai.performance.stability.oom.monitor.analysis.HeapAnalysisService;
import java.lang.Object;
import kshark.lite.OnAnalysisProgressListener$Step;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import java.lang.Enum;
import java.util.Set;
import yf7.h;

public final class HeapAnalysisService$c implements OnAnalysisProgressListener	// class@00125b
{
    public final HeapAnalysisService b;

    public void HeapAnalysisService$c(HeapAnalysisService p0){
       this.b = p0;
       super();
    }
    public final void a(OnAnalysisProgressListener$Step p0){
       a.p(p0, "step");
       h.d("HeapAnalysisService", "step:"+p0.name()+", leaking obj size:"+this.b.d.size());
    }
}
