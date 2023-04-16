package com.kwai.performance.fluency.fps.monitor.FpsMonitor$b;
import qe7.b;
import java.lang.Object;
import java.util.List;
import we7.b;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.performance.fluency.fps.monitor.FpsMonitor;
import java.util.concurrent.ConcurrentHashMap;
import qe7.a;
import we7.d;
import qe7.c;

public final class FpsMonitor$b implements b	// class@001064
{

    public void FpsMonitor$b(){
       super();
    }
    public void a(List p0,b p1){
       a.p(p0, "scenes");
       a.p(p1, "jank");
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          a uoa = FpsMonitor.mCallbacksMap.get(iterator.next());
          if (uoa == null) {
             continue ;
          }else {
             uoa = uoa.a;
             if (uoa == null) {
                continue ;
             }else {
                uoa.a(d.a(p1, true));
             }
          }
       }
       return;
    }
}
