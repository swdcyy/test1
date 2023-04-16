package com.kuaishou.krn.apm.fps.FpsMonitor$b;
import com.facebook.react.bridge.ScrollEventListener;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.krn.apm.fps.FpsMonitor;
import com.kuaishou.krn.apm.fps.FpsMonitor$FpsType;

public final class FpsMonitor$b implements ScrollEventListener	// class@0007d9
{
    public final String a;

    public void FpsMonitor$b(String p0){
       this.a = p0;
       super();
    }
    public void onScrollBegin(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FpsMonitor$b.class, "1")) {
          return;
       }
       FpsMonitor.c.e(this.a, FpsMonitor$FpsType.SCROLL);
       return;
    }
    public void onScrollEnd(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FpsMonitor$b.class, "2")) {
          return;
       }
       FpsMonitor.c.f(this.a, FpsMonitor$FpsType.SCROLL);
       return;
    }
}
