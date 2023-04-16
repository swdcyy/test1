package com.yxcorp.gifshow.performance.monitor.page.NewPageMonitorInitModule$initPageMonitor$8;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.performance.monitor.page.NewPageMonitorInitModule;
import java.lang.String;
import gf7.c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.Iterable;

public final class NewPageMonitorInitModule$initPageMonitor$8 extends Lambda implements l	// class@000eaf
{
    public final NewPageMonitorInitModule this$0;

    public void NewPageMonitorInitModule$initPageMonitor$8(NewPageMonitorInitModule p0){
       this.this$0 = p0;
       super(1);
    }
    public final c invoke(String p0){
       c uoc;
       Object obj = PatchProxy.applyOneRefs(p0, this, NewPageMonitorInitModule$initPageMonitor$8.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "pageName");
       this.this$0.q0(p0);
       Iterator iterator = this.this$0.r.iterator();
       do {
          if (iterator.hasNext()) {
          }else {
             uoc = null;
             break ;
          }
          uoc = iterator.next();
       } while (a.g(uoc.a(), p0));
       return uoc;
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
