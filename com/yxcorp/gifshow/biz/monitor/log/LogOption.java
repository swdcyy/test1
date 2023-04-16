package com.yxcorp.gifshow.biz.monitor.log.LogOption;
import java.lang.Object;
import com.yxcorp.gifshow.biz.monitor.log.LogOption$LogPlatform;
import java.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class LogOption	// class@001c5c
{
    public String a;
    public LogOption$LogPlatform b;
    public int c;
    public double d;
    public final ConcurrentHashMap e;
    public final HashMap f;

    public void LogOption(){
       super();
       this.b = LogOption$LogPlatform.CLIENT;
       this.c = -1;
       this.d = 0x3ff0000000000000;
       this.e = new ConcurrentHashMap();
       this.f = new HashMap();
    }
    public final ConcurrentHashMap a(){
       return this.e;
    }
    public final HashMap b(){
       return this.f;
    }
    public final void c(int p0){
       this.c = p0;
    }
    public final void d(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LogOption.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.a = p0;
       return;
    }
    public final void e(double p0){
       this.d = p0;
    }
}
