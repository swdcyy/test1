package com.kwai.performance.stability.oom.monitor.tracker.model.SystemInfo$refresh$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.String;
import qrd.l1;
import kotlin.jvm.internal.a;
import zsd.u;
import mh7.a;
import kotlin.text.Regex;
import mh7.a$c;

public final class SystemInfo$refresh$2 extends Lambda implements l	// class@00127a
{
    public static final SystemInfo$refresh$2 INSTANCE;

    static {
       SystemInfo$refresh$2.INSTANCE = new SystemInfo$refresh$2();
    }
    public void SystemInfo$refresh$2(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(String p0){
       a.p(p0, "line");
       boolean b = false;
       int i = 2;
       if (u.q2(p0, "MemTotal", b, i, null)) {
          a.l.a = a.p.b(a.d, p0);
       }else if(u.q2(p0, "MemFree", b, i, null)){
          a.l.b = a.p.b(a.e, p0);
       }else if(u.q2(p0, "MemAvailable", b, i, null)){
          a.l.c = a.p.b(a.f, p0);
       }else if(u.q2(p0, "CmaTotal", b, i, null)){
          a.l.e = a.p.b(a.g, p0);
       }else if(u.q2(p0, "ION_heap", b, i, null)){
          a.l.d = a.p.b(a.h, p0);
       }
       return;
    }
}
