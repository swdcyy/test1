package com.yxcorp.gifshow.performance.monitor.page.NewPageMonitorInitModule$initPageMonitor$9$a;
import erd.g;
import java.lang.Object;
import y8c.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.performance.fluency.page.monitor.PageMonitor;

public final class NewPageMonitorInitModule$initPageMonitor$9$a implements g	// class@000eb0
{
    public static final NewPageMonitorInitModule$initPageMonitor$9$a b;

    static {
       NewPageMonitorInitModule$initPageMonitor$9$a.b = new NewPageMonitorInitModule$initPageMonitor$9$a();
    }
    public void NewPageMonitorInitModule$initPageMonitor$9$a(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewPageMonitorInitModule$initPageMonitor$9$a.class, "1")) {
       }else if(p0.a == 6){
          PageMonitor.INSTANCE.trackPageRequestStart(p0.c);
       }
       return;
    }
}
