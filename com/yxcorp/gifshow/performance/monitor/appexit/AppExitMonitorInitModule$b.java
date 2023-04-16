package com.yxcorp.gifshow.performance.monitor.appexit.AppExitMonitorInitModule$b;
import k2b.s1;
import com.yxcorp.gifshow.performance.monitor.appexit.AppExitMonitorInitModule;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;

public final class AppExitMonitorInitModule$b implements s1	// class@000e4d
{
    public final AppExitMonitorInitModule b;

    public void AppExitMonitorInitModule$b(AppExitMonitorInitModule p0){
       this.b = p0;
       super();
    }
    public final void d(String p0,int p1,String p2){
       if (PatchProxy.isSupport(AppExitMonitorInitModule$b.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, AppExitMonitorInitModule$b.class, "1")) {
          return;
       }
       if (p1 != 1) {
          if (p1 == 2) {
             this.b.o0(null);
          }
       }else {
          this.b.o0(p0);
       }
       return;
    }
}
