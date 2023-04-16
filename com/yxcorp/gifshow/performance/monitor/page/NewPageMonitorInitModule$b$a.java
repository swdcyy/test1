package com.yxcorp.gifshow.performance.monitor.page.NewPageMonitorInitModule$b$a;
import k2b.s1;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.performance.fluency.page.monitor.PageMonitor;

public final class NewPageMonitorInitModule$b$a implements s1	// class@000ea0
{
    public static final NewPageMonitorInitModule$b$a b;

    static {
       NewPageMonitorInitModule$b$a.b = new NewPageMonitorInitModule$b$a();
    }
    public void NewPageMonitorInitModule$b$a(){
       super();
    }
    public final void d(String p0,int p1,String p2){
       if (PatchProxy.isSupport(NewPageMonitorInitModule$b$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, NewPageMonitorInitModule$b$a.class, "1")) {
          return;
       }
       if (p1 == 4) {
          PageMonitor.INSTANCE.recordRecentPageSource(p0);
       }
       return;
    }
}
