package com.kuaishou.bizmonitor.framework.funnel.collector.kwai.c$d;
import mn.d;
import java.lang.String;
import mn.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import mn.c;
import java.lang.StringBuilder;
import com.kuaishou.bizmonitor.framework.funnel.collector.kwai.c;
import java.util.concurrent.atomic.AtomicInteger;
import android.os.Handler;
import com.kuaishou.bizmonitor.framework.funnel.collector.kwai.b;
import android.os.SystemClock;
import java.lang.Integer;
import java.lang.Runnable;
import java.lang.IllegalArgumentException;

public class c$d extends d	// class@00115b
{

    public void c$d(String p0,int p1){
       super(p0, p1);
    }
    public Object a(b p0,Object p1,Object p2){
       String obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, c$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!p1 instanceof c) {
          throw new IllegalArgumentException("delay\(\) not a block: "+p1);
       }
       obj = "__delay_"+c.b.incrementAndGet();
       c.a().postAtTime(new b(p1, p0), obj, (SystemClock.uptimeMillis() + (long)p2.intValue()));
       return obj;
    }
}
