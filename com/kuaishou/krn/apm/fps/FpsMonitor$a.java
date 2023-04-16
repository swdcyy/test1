package com.kuaishou.krn.apm.fps.FpsMonitor$a;
import com.facebook.react.bridge.LifecycleEventListener;
import com.kuaishou.krn.apm.fps.FpsMonitor$FpsType;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.krn.apm.fps.FpsMonitor;

public final class FpsMonitor$a implements LifecycleEventListener	// class@0007d8
{
    public final FpsMonitor$FpsType b;
    public final String c;

    public void FpsMonitor$a(FpsMonitor$FpsType p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onHostDestroy(){
       if (PatchProxy.applyVoid(null, this, FpsMonitor$a.class, "3")) {
          return;
       }
       FpsMonitor c = FpsMonitor.c;
       c.f(this.c, this.b);
       c.c(this.c, this.b);
       return;
    }
    public void onHostPause(){
       if (PatchProxy.applyVoid(null, this, FpsMonitor$a.class, "2")) {
          return;
       }
       FpsMonitor.c.f(this.c, this.b);
       return;
    }
    public void onHostResume(){
       if (PatchProxy.applyVoid(null, this, FpsMonitor$a.class, "1")) {
          return;
       }
       FpsMonitor$FpsType pAGE_ACTIVIT = FpsMonitor$FpsType.PAGE_ACTIVITY;
       if (this.b == pAGE_ACTIVIT) {
          FpsMonitor.c.e(this.c, pAGE_ACTIVIT);
       }
       return;
    }
}
