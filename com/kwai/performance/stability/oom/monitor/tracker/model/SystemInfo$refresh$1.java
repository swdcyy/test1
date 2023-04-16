package com.kwai.performance.stability.oom.monitor.tracker.model.SystemInfo$refresh$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.String;
import qrd.l1;
import kotlin.jvm.internal.a;
import mh7.a;
import mh7.a$d;
import zsd.u;
import kotlin.text.Regex;

public final class SystemInfo$refresh$1 extends Lambda implements l	// class@001279
{
    public static final SystemInfo$refresh$1 INSTANCE;

    static {
       SystemInfo$refresh$1.INSTANCE = new SystemInfo$refresh$1();
    }
    public void SystemInfo$refresh$1(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(String p0){
       a.p(p0, "line");
       if (a.i.c() && (a.i.a() && a.i.b())) {
          return;
       }
       boolean b = false;
       int i = 2;
       if (u.q2(p0, "VmSize", b, i, null)) {
          a.i.b = a.p.b(a.a, p0);
       }else if(u.q2(p0, "VmRSS", b, i, null)){
          a.i.c = a.p.b(a.b, p0);
       }else if(u.q2(p0, "Threads", b, i, null)){
          a.i.a = a.p.b(a.c, p0);
       }
       return;
    }
}
