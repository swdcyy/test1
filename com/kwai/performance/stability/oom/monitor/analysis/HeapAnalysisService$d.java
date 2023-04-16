package com.kwai.performance.stability.oom.monitor.analysis.HeapAnalysisService$d;
import rtd.a0$a;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.System;
import java.io.PrintStream;

public final class HeapAnalysisService$d implements a0$a	// class@00125c
{

    public void HeapAnalysisService$d(){
       super();
    }
    public void a(Throwable p0,String p1){
       a.p(p0, "throwable");
       a.p(p1, "message");
       System.out.println(p1);
    }
    public void d(String p0){
       a.p(p0, "message");
       System.out.println(p0);
    }
}
